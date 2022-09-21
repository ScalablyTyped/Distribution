package typings.chrome.global.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.SessionRequest")
@js.native
open class SessionRequest protected ()
  extends StObject
     with typings.chrome.chrome.cast.SessionRequest {
  /**
    * @param appId
    * @param opt_capabilities
    * @param opt_timeout
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.SessionRequest
    */
  def this(appId: String) = this()
  def this(appId: String, capabilities: js.Array[typings.chrome.chrome.cast.Capability]) = this()
  def this(appId: String, capabilities: js.Array[typings.chrome.chrome.cast.Capability], timeout: Double) = this()
  def this(appId: String, capabilities: Unit, timeout: Double) = this()
  
  /* CompleteClass */
  var appId: String = js.native
  
  /* CompleteClass */
  var capabilities: js.Array[typings.chrome.chrome.cast.Capability] = js.native
  
  /* CompleteClass */
  var language: String | Null = js.native
  
  /* CompleteClass */
  var requestSessionTimeout: Double = js.native
}
