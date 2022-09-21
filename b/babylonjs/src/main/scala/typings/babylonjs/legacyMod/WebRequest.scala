package typings.babylonjs.legacyMod

import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "WebRequest")
@js.native
open class WebRequest ()
  extends typings.babylonjs.indexMod.WebRequest
/* static members */
object WebRequest {
  
  @JSImport("babylonjs/Legacy/legacy", "WebRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Custom HTTP Request Headers to be sent with XMLHttpRequests
    * i.e. when loading files, where the server/service expects an Authorization header
    */
  @JSImport("babylonjs/Legacy/legacy", "WebRequest.CustomRequestHeaders")
  @js.native
  def CustomRequestHeaders: org.scalablytyped.runtime.StringDictionary[String] = js.native
  inline def CustomRequestHeaders_=(x: org.scalablytyped.runtime.StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomRequestHeaders")(x.asInstanceOf[js.Any])
  
  /**
    * Add callback functions in this array to update all the requests before they get sent to the network
    */
  @JSImport("babylonjs/Legacy/legacy", "WebRequest.CustomRequestModifiers")
  @js.native
  def CustomRequestModifiers: js.Array[js.Function2[/* request */ XMLHttpRequest, /* url */ String, Unit]] = js.native
  inline def CustomRequestModifiers_=(x: js.Array[js.Function2[/* request */ XMLHttpRequest, /* url */ String, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomRequestModifiers")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "WebRequest.SkipRequestModificationForBabylonCDN")
  @js.native
  def SkipRequestModificationForBabylonCDN: Boolean = js.native
  inline def SkipRequestModificationForBabylonCDN_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SkipRequestModificationForBabylonCDN")(x.asInstanceOf[js.Any])
}
