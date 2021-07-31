package typings.chrome.global.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.ReceiverDisplayStatus")
@js.native
class ReceiverDisplayStatus protected ()
  extends StObject
     with typings.chrome.chrome.cast.ReceiverDisplayStatus {
  /**
    * @param {string} statusText
    * @param {!Array<chrome.cast.Image>} appImages
    * @constructor
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.ReceiverDisplayStatus
    */
  def this(statusText: String, appImages: js.Array[typings.chrome.chrome.cast.Image]) = this()
  
  /* CompleteClass */
  var appImages: js.Array[typings.chrome.chrome.cast.Image] = js.native
  
  /* CompleteClass */
  var statusText: String = js.native
}
