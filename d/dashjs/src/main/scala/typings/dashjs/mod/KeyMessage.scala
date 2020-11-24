package typings.dashjs.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dashjs", "KeyMessage")
@js.native
class KeyMessage protected () extends js.Object {
  def this(sessionToken: SessionToken, message: ArrayBuffer, defaultURL: String) = this()
  def this(sessionToken: SessionToken, message: ArrayBuffer, defaultURL: String, messageType: String) = this()
  
  var defaultURL: String = js.native
  
  var message: ArrayBuffer = js.native
  
  var messageType: String = js.native
  
  var sessionToken: SessionToken = js.native
}
