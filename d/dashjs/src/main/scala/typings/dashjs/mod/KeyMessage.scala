package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dashjs", "KeyMessage")
@js.native
open class KeyMessage protected () extends StObject {
  def this(sessionToken: SessionToken, message: js.typedarray.ArrayBuffer, defaultURL: String) = this()
  def this(
    sessionToken: SessionToken,
    message: js.typedarray.ArrayBuffer,
    defaultURL: String,
    messageType: String
  ) = this()
  
  var defaultURL: String = js.native
  
  var message: js.typedarray.ArrayBuffer = js.native
  
  var messageType: String = js.native
  
  var sessionToken: SessionToken = js.native
}
