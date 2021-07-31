package typings.awsSdk

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.anon.Dictkey
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.configBaseMod.ConfigurationOptions
import typings.awsSdk.endpointMod.Endpoint
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceMod {
  
  @JSImport("aws-sdk/lib/service", "Service")
  @js.native
  /**
    * Creates a new service object with a configuration object.
    */
  class Service () extends StObject {
    def this(config: ServiceConfigurationOptions) = this()
    
    /**
      * The list of API versions supported by this service.
      */
    var apiVersions: js.Array[String] = js.native
    
    var config: ConfigBase & ServiceConfigurationOptions = js.native
    
    /**
      * Defines a new Service class using a service identifier and list of versions including an optional set of features (functions) to apply to the class prototype.
      * 
      * @param {string} serviceIdentifier - the identifier for the service.
      * @param {string[]} versions - a list of versions that work with this service.
      * @param {Object} features - an object to attach to the prototype.
      */
    def defineService(serviceIdentifier: String, versions: js.Array[String]): Instantiable1[/* config */ js.UndefOr[ServiceConfigurationOptions], Service] = js.native
    def defineService(serviceIdentifier: String, versions: js.Array[String], features: js.Any): Instantiable1[/* config */ js.UndefOr[ServiceConfigurationOptions], Service] = js.native
    
    /**
      * An Endpoint object representing the endpoint URL for service requests.
      */
    var endpoint: Endpoint = js.native
    
    /**
      * Calls an operation on a service with the given input parameters.
      * 
      * @param {string} operation - the name of the operation to call on the service.
      * @param {map} params - a map of input options for the operation. 
      */
    def makeRequest(operation: String): Request[js.Any, AWSError] = js.native
    def makeRequest(operation: String, params: StringDictionary[js.Any]): Request[js.Any, AWSError] = js.native
    def makeRequest(
      operation: String,
      params: StringDictionary[js.Any],
      callback: js.Function2[/* err */ AWSError, /* data */ js.Any, Unit]
    ): Request[js.Any, AWSError] = js.native
    def makeRequest(
      operation: String,
      params: Unit,
      callback: js.Function2[/* err */ AWSError, /* data */ js.Any, Unit]
    ): Request[js.Any, AWSError] = js.native
    
    /**
      * Calls an operation on a service with the given input parameters, without any authentication data.
      * 
      * @param {string} operation - the name of the operation to call on the service.
      * @param {map} params - a map of input options for the operation. 
      */
    def makeUnauthenticatedRequest(operation: String): Request[js.Any, AWSError] = js.native
    def makeUnauthenticatedRequest(operation: String, params: StringDictionary[js.Any]): Request[js.Any, AWSError] = js.native
    def makeUnauthenticatedRequest(
      operation: String,
      params: StringDictionary[js.Any],
      callback: js.Function2[/* err */ AWSError, /* data */ js.Any, Unit]
    ): Request[js.Any, AWSError] = js.native
    def makeUnauthenticatedRequest(
      operation: String,
      params: Unit,
      callback: js.Function2[/* err */ AWSError, /* data */ js.Any, Unit]
    ): Request[js.Any, AWSError] = js.native
    
    /**
      * Override this method to setup any custom request listeners for each new request to the service.
      */
    def setupRequestListeners(request: Request[js.Any, AWSError]): Unit = js.native
    
    /**
      * Waits for a given state.
      */
    def waitFor(state: String): Request[js.Any, AWSError] = js.native
    def waitFor(state: String, callback: js.Function2[/* err */ AWSError, /* data */ js.Any, Unit]): Request[js.Any, AWSError] = js.native
    def waitFor(state: String, params: Unit, callback: js.Function2[/* err */ AWSError, /* data */ js.Any, Unit]): Request[js.Any, AWSError] = js.native
    def waitFor(state: String, params: Dictkey): Request[js.Any, AWSError] = js.native
    def waitFor(
      state: String,
      params: Dictkey,
      callback: js.Function2[/* err */ AWSError, /* data */ js.Any, Unit]
    ): Request[js.Any, AWSError] = js.native
  }
  
  @js.native
  trait ServiceConfigurationOptions extends ConfigurationOptions {
    
    /**
      * The endpoint URI to send requests to. The default endpoint is built from the configured region. 
      * The endpoint should be a string like 'https://{service}.{region}.amazonaws.com' or an Endpoint object.
      */
    var endpoint: js.UndefOr[String | Endpoint] = js.native
    
    /**
      * An optional map of parameters to bind to every request sent by this service object. 
      * For more information on bound parameters, see "Working with Services" in the Getting Started Guide.
      */
    var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  
  trait WaiterConfiguration extends StObject {
    
    /**
      * The number of seconds to wait between requests
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of requests to send while waiting
      */
    var maxAttempts: js.UndefOr[Double] = js.undefined
  }
  object WaiterConfiguration {
    
    @scala.inline
    def apply(): WaiterConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WaiterConfiguration]
    }
    
    @scala.inline
    implicit class WaiterConfigurationMutableBuilder[Self <: WaiterConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
    }
  }
}
