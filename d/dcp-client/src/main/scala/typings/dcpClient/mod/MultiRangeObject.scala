package typings.dcpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dcp-client", "MultiRangeObject")
@js.native
open class MultiRangeObject protected () extends StObject {
  def this(arg: js.Array[RangeObject], range: RangeObject) = this()
  def this(arg: js.Object, range: RangeObject) = this()
  /**
    * Returns a tuple of values from the ranges given by this multi range object.
    * @param arg – First range object, or array of range objects, or object with ranges key containing an array of range objects.
    * @param range – If first argument is a RangeObject, subsquent arguments are range objects too.
    * @returns instance of MultiRangeObject
    */
  def this(arg: RangeObject, range: RangeObject) = this()
  
  /**
    * See SuperRangeObject.filter()
    * @returns any[]
    */
  def filter(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): js.Array[Any] = js.native
  
  /**
    * Returns a tuple of values from the ranges given by this multi range object.
    * @param n – index of multi-range tuple to return
    * @returns any
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
    * Create object literal with ranges property containing array of range objects.
    * @returns object
    */
  def toObject(): js.Object = js.native
}
