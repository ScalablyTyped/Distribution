package typings.azureCoreClient.mod

import typings.azureCoreRestPipeline.coreRestPipelineMod.Pipeline
import typings.azureCoreRestPipeline.coreRestPipelineMod.PipelineRequest
import typings.azureCoreRestPipeline.coreRestPipelineMod.PipelineResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/core-client", "ServiceClient")
@js.native
/**
  * The ServiceClient constructor
  * @param credential - The credentials used for authentication with the service.
  * @param options - The service client options that govern the behavior of the client.
  */
open class ServiceClient () extends StObject {
  def this(options: ServiceClientOptions) = this()
  
  /**
    * Set to true if the request is sent over HTTP instead of HTTPS
    */
  /* private */ val _allowInsecureConnection: Any = js.native
  
  /**
    * If specified, this is the base URI that requests will be made against for this ServiceClient.
    * If it is not specified, then all OperationSpecs must contain a baseUrl property.
    */
  /* private */ val _endpoint: Any = js.native
  
  /**
    * The HTTP client that will be used to send requests.
    */
  /* private */ val _httpClient: Any = js.native
  
  /**
    * The default request content type for the service.
    * Used if no requestContentType is present on an OperationSpec.
    */
  /* private */ val _requestContentType: Any = js.native
  
  /**
    * The pipeline used by this client to make requests
    */
  val pipeline: Pipeline = js.native
  
  /**
    * Send an HTTP request that is populated using the provided OperationSpec.
    * @typeParam T - The typed result of the request, based on the OperationSpec.
    * @param operationArguments - The arguments that the HTTP request's templated values will be populated from.
    * @param operationSpec - The OperationSpec to use to populate the httpRequest.
    */
  def sendOperationRequest[T](operationArguments: OperationArguments, operationSpec: OperationSpec): js.Promise[T] = js.native
  
  /**
    * Send the provided httpRequest.
    */
  def sendRequest(request: PipelineRequest): js.Promise[PipelineResponse] = js.native
}
