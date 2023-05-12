package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azdata", "nb.CellRange")
@js.native
open class CellRange protected () extends StObject {
  /**
    * Create a new range from two positions. If `start` is not
    * before or equal to `end`, the values will be swapped.
    *
    * @param start A number.
    * @param end A number.
    */
  def this(start: Double, end: Double) = this()
  
  /**
    * The end index. It is after or equal to {@link CellRange.start}.
    */
  val end: Double = js.native
  
  /**
    * The start index. It is before or equal to {@link CellRange.end}.
    */
  val start: Double = js.native
}
