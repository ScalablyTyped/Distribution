package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RequestScheduler {
  
  @JSImport("cesium", "RequestScheduler")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The maximum number of simultaneous active requests. Un-throttled requests do not observe this limit.
    */
  @JSImport("cesium", "RequestScheduler.maximumRequests")
  @js.native
  def maximumRequests: Double = js.native
  
  /**
    * The maximum number of simultaneous active requests per server. Un-throttled requests or servers specifically
    * listed in {@link requestsByServer} do not observe this limit.
    */
  @JSImport("cesium", "RequestScheduler.maximumRequestsPerServer")
  @js.native
  def maximumRequestsPerServer: Double = js.native
  inline def maximumRequestsPerServer_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maximumRequestsPerServer")(x.asInstanceOf[js.Any])
  
  inline def maximumRequests_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maximumRequests")(x.asInstanceOf[js.Any])
  
  /**
    * A per server key list of overrides to use for throttling instead of <code>maximumRequestsPerServer</code>.
    * Useful when streaming data from a known HTTP/2 or HTTP/3 server.
    * @example
    * RequestScheduler.requestsByServer["myserver.com:443"] = 18;
    * @example
    * RequestScheduler.requestsByServer = {
    *   "api.cesium.com:443": 18,
    *   "assets.cesium.com:443": 18,
    * };
    */
  @JSImport("cesium", "RequestScheduler.requestsByServer")
  @js.native
  def requestsByServer: Any = js.native
  inline def requestsByServer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestsByServer")(x.asInstanceOf[js.Any])
  
  /**
    * Specifies if the request scheduler should throttle incoming requests, or let the browser queue requests under its control.
    */
  @JSImport("cesium", "RequestScheduler.throttleRequests")
  @js.native
  def throttleRequests: Boolean = js.native
  inline def throttleRequests_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("throttleRequests")(x.asInstanceOf[js.Any])
}
