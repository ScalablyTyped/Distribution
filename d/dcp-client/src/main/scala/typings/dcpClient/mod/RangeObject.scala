package typings.dcpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dcp-client", "RangeObject")
@js.native
open class RangeObject protected () extends StObject {
  def this(startOrObject: js.Object, end: Double) = this()
  /**
    * Returns a tuple of values from the ranges given by this multi range object.
    * @param startOrObject – Beginning of range, or object literal with start and end properties.
    * @param end – End of range
    * @param step – Step size in range
    * @param group – Groups in range
    * @returns Promise<void>
    */
  def this(startOrObject: Double, end: Double) = this()
  def this(startOrObject: js.Object, end: Double, step: Double) = this()
  def this(startOrObject: Double, end: Double, step: Double) = this()
  def this(startOrObject: js.Object, end: Double, step: Double, group: js.Object) = this()
  def this(startOrObject: js.Object, end: Double, step: Double, group: Double) = this()
  def this(startOrObject: js.Object, end: Double, step: Unit, group: js.Object) = this()
  def this(startOrObject: js.Object, end: Double, step: Unit, group: Double) = this()
  def this(startOrObject: Double, end: Double, step: Double, group: js.Object) = this()
  def this(startOrObject: Double, end: Double, step: Double, group: Double) = this()
  def this(startOrObject: Double, end: Double, step: Unit, group: js.Object) = this()
  def this(startOrObject: Double, end: Double, step: Unit, group: Double) = this()
  
  /**
    * See SuperRangeObject.filter()
    * @returns any[]
    */
  def filter(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): js.Array[Any] = js.native
  
  /**
    * Number of elements in range, or number of groups if grouped.
    */
  var length: Double = js.native
  
  /**
    * Returns a tuple of values from the ranges given by this multi range object.
    * @param n – index of multi-range tuple to return
    * @returns Return nth value in range
    */
  def nthValue(n: Double): Any = js.native
  
  /**
    * See SuperRangeObject.slice()
    * @returns any[]
    */
  def slice(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): js.Array[Any] = js.native
  
  /**
    * Create object literal for range with properties: start, end, step, and group.
    * @returns object
    */
  def toObject(): js.Object = js.native
}
