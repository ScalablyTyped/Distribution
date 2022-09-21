package typings.bson.mod

import typings.bson.bsonStrings.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson", "BSONSymbol")
@js.native
open class BSONSymbol protected () extends StObject {
  /**
    * @param value - the string representing the symbol.
    */
  def this(value: String) = this()
  
  var _bsontype: Symbol = js.native
  
  /* Excluded from this release type: inspect */
  def toJSON(): String = js.native
  
  var value: String = js.native
}
