package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throttleRequestByServer {
  
  inline def apply(url: String, requestFunction: RequestFunction): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], requestFunction.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @JSImport("cesium", "throttleRequestByServer")
  @js.native
  val ^ : js.Any = js.native
  
  type RequestFunction = js.Function1[/* url */ String, js.Promise[js.Any]]
}
