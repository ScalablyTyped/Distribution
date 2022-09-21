package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Each range is associated with a value, which must inherit from
this class.
*/
@JSImport("@codemirror/state", "RangeValue")
@js.native
abstract class RangeValue () extends StObject {
  
  /**
    The bias value at the end of the range. Defaults to 0.
    */
  var endSide: Double = js.native
  
  /**
    Compare this value with another value. Used when comparing
    rangesets. The default implementation compares by identity.
    Unless you are only creating a fixed number of unique instances
    of your value type, it is a good idea to implement this
    properly.
    */
  def eq(other: RangeValue): Boolean = js.native
  
  /**
    The mode with which the location of the range should be mapped
    when its `from` and `to` are the same, to decide whether a
    change deletes the range. Defaults to `MapMode.TrackDel`.
    */
  var mapMode: MapMode = js.native
  
  /**
    Determines whether this value marks a point range. Regular
    ranges affect the part of the document they cover, and are
    meaningless when empty. Point ranges have a meaning on their
    own. When non-empty, a point range is treated as atomic and
    shadows any ranges contained in it.
    */
  var point: Boolean = js.native
  
  /**
    Create a [range](https://codemirror.net/6/docs/ref/#state.Range) with this value.
    */
  def range(from: Double): Range[this.type] = js.native
  def range(from: Double, to: Double): Range[this.type] = js.native
  
  /**
    The bias value at the start of the range. Determines how the
    range is positioned relative to other ranges starting at this
    position. Defaults to 0.
    */
  var startSide: Double = js.native
}
