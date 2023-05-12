package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson", "BSONSymbol")
@js.native
open class BSONSymbol protected () extends BSONValue {
  /**
    * @param value - the string representing the symbol.
    */
  def this(value: String) = this()
  
  def toJSON(): String = js.native
  
  var value: String = js.native
}
