package typings.bcoeV8Coverage

import typings.bcoeV8Coverage.typesMod.RangeCov
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bcoe/v8-coverage/dist/lib/range-tree", JSImport.Namespace)
@js.native
object rangeTreeMod extends js.Object {
  
  @js.native
  class RangeTree protected () extends js.Object {
    def this(start: Double, end: Double, delta: Double, children: js.Array[RangeTree]) = this()
    
    var children: js.Array[RangeTree] = js.native
    
    var delta: Double = js.native
    
    var end: Double = js.native
    
    def normalize(): Unit = js.native
    
    /**
      * @precondition `tree.start < value && value < tree.end`
      * @return RangeTree Right part
      */
    def split(value: Double): RangeTree = js.native
    
    var start: Double = js.native
    
    /**
      * Get the range coverages corresponding to the tree.
      *
      * The ranges are pre-order sorted.
      */
    def toRanges(): js.Array[RangeCov] = js.native
  }
  /* static members */
  @js.native
  object RangeTree extends js.Object {
    
    /**
      * @precodition `ranges` are well-formed and pre-order sorted
      */
    def fromSortedRanges(ranges: js.Array[RangeCov]): js.UndefOr[RangeTree] = js.native
  }
}
