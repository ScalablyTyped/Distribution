package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson", "Code")
@js.native
open class Code protected () extends BSONValue {
  /**
    * @param code - a string or function.
    * @param scope - an optional scope for the function.
    */
  def this(code: String) = this()
  def this(code: js.Function) = this()
  def this(code: String, scope: Document) = this()
  def this(code: js.Function, scope: Document) = this()
  
  var code: String = js.native
  
  var scope: Document | Null = js.native
  
  def toJSON(): typings.bson.anon.Code = js.native
}
