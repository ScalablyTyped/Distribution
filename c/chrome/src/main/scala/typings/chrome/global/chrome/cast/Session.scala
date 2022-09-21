package typings.chrome.global.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.Session")
@js.native
open class Session protected ()
  extends StObject
     with typings.chrome.chrome.cast.Session {
  /**
    * @param sessionId
    * @param appId
    * @param displayName
    * @param appImages
    * @param receiver
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Session
    */
  def this(
    sessionId: String,
    appId: String,
    displayName: String,
    appImages: js.Array[typings.chrome.chrome.cast.Image],
    receiver: typings.chrome.chrome.cast.Receiver
  ) = this()
}
