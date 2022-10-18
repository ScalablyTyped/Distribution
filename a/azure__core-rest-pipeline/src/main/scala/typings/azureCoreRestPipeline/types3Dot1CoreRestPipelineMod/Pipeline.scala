package typings.azureCoreRestPipeline.types3Dot1CoreRestPipelineMod

import typings.azureCoreRestPipeline.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pipeline extends StObject {
  
  /**
    * Add a new policy to the pipeline.
    * @param policy - A policy that manipulates a request.
    * @param options - A set of options for when the policy should run.
    */
  def addPolicy(policy: PipelinePolicy): Unit = js.native
  def addPolicy(policy: PipelinePolicy, options: AddPipelineOptions): Unit = js.native
  
  /**
    * Returns the current set of policies in the pipeline in the order in which
    * they will be applied to the request. Later in the list is closer to when
    * the request is performed.
    */
  def getOrderedPolicies(): js.Array[PipelinePolicy] = js.native
  
  /**
    * Remove a policy from the pipeline.
    * @param options - Options that let you specify which policies to remove.
    */
  def removePolicy(options: Name): js.Array[PipelinePolicy] = js.native
  
  /**
    * Uses the pipeline to make a HTTP request.
    * @param httpClient - The HttpClient that actually performs the request.
    * @param request - The request to be made.
    */
  def sendRequest(httpClient: HttpClient, request: PipelineRequest): js.Promise[PipelineResponse] = js.native
}
