package typings.chrome.global.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.SenderApplication")
@js.native
open class SenderApplication protected ()
  extends StObject
     with typings.chrome.chrome.cast.SenderApplication {
  /**
    * @param platform
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.SenderApplication
    */
  def this(platform: typings.chrome.chrome.cast.SenderPlatform) = this()
  
  /* CompleteClass */
  var packageId: String | Null = js.native
  
  /* CompleteClass */
  var platform: typings.chrome.chrome.cast.SenderPlatform = js.native
  
  /* CompleteClass */
  var url: String | Null = js.native
}
