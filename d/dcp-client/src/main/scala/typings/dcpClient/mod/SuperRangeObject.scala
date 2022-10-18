package typings.dcpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dcp-client", "SuperRangeObject")
@js.native
open class SuperRangeObject () extends StObject {
  
  /**
    * Converts range to an Array and then calls filter(…args) on it.
    * @returns any[]
    */
  def filter(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): js.Array[Any] = js.native
  
  /**
    * See SuperRangeObject.slice()
    * @param start – index to start slice
    * @param end – index to end slice, return rest of array if not provided.
    * @returns any[]
    */
  def slice(start: Double, end: Double): js.Array[Any] = js.native
}
