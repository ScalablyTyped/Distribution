package typings.dcpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dcp-client", "ResultHandle")
@js.native
open class ResultHandle () extends StObject {
  
  /**
    * Returns an array of [input, output] pairs, in the order of the slice numbers.
    * Each input is paired with its associated output produced from the slice it was used in.
    * Return value is undefined if the input is not an ES5 primitive.
    * @returns void
    */
  def entries(): js.Array[Any] = js.native
  
  /**
    * Returns an array of [input, output] pairs, in the order of the slice numbers.
    * Each input is paired with its associated output produced from the slice it was used in.
    * Return value is undefined if the input is not an ES5 primitive.
    * @param rangeObject – Not implemented, leave as undefined - should be a RangeObject() to query results, however.
    * @param emitEvents - If set to ‘all’, emits a results for each result as they’re added to the ResultHandle() object.
    * @returns any[]
    */
  def fetch(rangeObject: RangeObject, emitEvents: String): js.Array[Any] = js.native
  
  /**
    * Returns the nth input value in the input set.
    * @param n – index of the desired input value in the input set.
    * @returns any
    */
  def key(n: Double): Any = js.native
  
  /**
    * Returns an array of all input values that have a completed result available.
    * @returns any[]
    */
  def keys(): js.Array[Any] = js.native
  
  /**
    * The length of the array of available results.
    */
  var length: Double = js.native
  
  /**
    * Returns an array of all input values that have a completed result available.
    * @param key – Corresponds to a value in the job’s input set.
    * @returns any
    */
  def lookupValue(key: Any): Any = js.native
  
  /**
    * Results an array of all results received from the scheduler.
    * @returns any[]
    */
  def values(): js.Array[Any] = js.native
}
