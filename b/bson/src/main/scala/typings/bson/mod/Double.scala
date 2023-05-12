package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson", "Double")
@js.native
open class Double protected () extends BSONValue {
  /**
    * Create a Double type
    *
    * @param value - the number we want to represent as a double.
    */
  def this(value: scala.Double) = this()
  
  def toJSON(): scala.Double = js.native
  
  def toString(radix: scala.Double): String = js.native
  
  var value: scala.Double = js.native
}
