package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
A range associates a value with a range of positions.
*/
@JSImport("@codemirror/state", "Range")
@js.native
/* private */ open class Range[T /* <: RangeValue */] () extends StObject {
  
  /**
    The range's start position.
    */
  val from: Double = js.native
  
  /**
    Its end position.
    */
  val to: Double = js.native
  
  /**
    The value associated with this range.
    */
  val value: T = js.native
}
