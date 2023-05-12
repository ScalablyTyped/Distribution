package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson", "Int32")
@js.native
open class Int32 protected () extends BSONValue {
  def this(value: String) = this()
  /**
    * Create an Int32 type
    *
    * @param value - the number we want to represent as an int32.
    */
  def this(value: scala.Double) = this()
  
  def toJSON(): scala.Double = js.native
  
  def toString(radix: scala.Double): String = js.native
  
  var value: scala.Double = js.native
}
