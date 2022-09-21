package typings.cesium.mod

import typings.cesium.anon.CancelFunction
import typings.cesium.mod.Request.CancelCallback
import typings.cesium.mod.Request.PriorityCallback
import typings.cesium.mod.Request.RequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Request")
@js.native
open class Request () extends StObject {
  def this(options: CancelFunction) = this()
  
  /**
    * The function that is called when the request is cancelled.
    */
  def cancelFunction(): Unit = js.native
  /**
    * The function that is called when the request is cancelled.
    */
  @JSName("cancelFunction")
  var cancelFunction_Original: CancelCallback = js.native
  
  def clone(result: Request): Request = js.native
  
  /**
    * Priority is a unit-less value where lower values represent higher priority.
    * For world-based objects, this is usually the distance from the camera.
    * A request that does not have a priority function defaults to a priority of 0.
    *
    * If priorityFunction is defined, this value is updated every frame with the result of that call.
    */
  var priority: Double = js.native
  
  /**
    * The function that is called to update the request's priority, which occurs once per frame.
    */
  def priorityFunction(): Double = js.native
  /**
    * The function that is called to update the request's priority, which occurs once per frame.
    */
  @JSName("priorityFunction")
  var priorityFunction_Original: PriorityCallback = js.native
  
  /**
    * The function that makes the actual data request.
    */
  def requestFunction(): js.Promise[Unit] = js.native
  /**
    * The function that makes the actual data request.
    */
  @JSName("requestFunction")
  var requestFunction_Original: RequestCallback = js.native
  
  /**
    * The current state of the request.
    */
  val state: RequestState = js.native
  
  /**
    * Whether to throttle and prioritize the request. If false, the request will be sent immediately. If true, the
    * request will be throttled and sent based on priority.
    */
  val throttle: Boolean = js.native
  
  /**
    * Whether to throttle the request by server. Browsers typically support about 6-8 parallel connections
    * for HTTP/1 servers, and an unlimited amount of connections for HTTP/2 servers. Setting this value
    * to <code>true</code> is preferable for requests going through HTTP/1 servers.
    */
  val throttleByServer: Boolean = js.native
  
  /**
    * Type of request.
    */
  val `type`: RequestType = js.native
  
  /**
    * The URL to request.
    */
  var url: String = js.native
}
object Request {
  
  /**
    * The function that is called when the request is cancelled.
    */
  type CancelCallback = js.Function0[Unit]
  
  /**
    * The function that is called to update the request's priority, which occurs once per frame.
    */
  type PriorityCallback = js.Function0[Double]
  
  /**
    * The function that makes the actual data request.
    */
  type RequestCallback = js.Function0[js.Promise[Unit]]
}
