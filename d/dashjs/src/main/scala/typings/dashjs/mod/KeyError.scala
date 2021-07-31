package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dashjs", "KeyError")
@js.native
class KeyError protected () extends StObject {
  def this(sessionToken: SessionToken, errorString: String) = this()
  
  var error: String = js.native
  
  var sessionToken: SessionToken = js.native
}
