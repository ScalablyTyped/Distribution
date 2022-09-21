package typings.codemirrorView.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Represents a contiguous range of text that has a single direction
(as in left-to-right or right-to-left).
*/
@JSImport("@codemirror/view", "BidiSpan")
@js.native
open class BidiSpan () extends StObject {
  
  /**
    The direction of this span.
    */
  def dir: Direction = js.native
  
  /**
    The start of the span (relative to the start of the line).
    */
  val from: Double = js.native
  
  /**
    The ["bidi
    level"](https://unicode.org/reports/tr9/#Basic_Display_Algorithm)
    of the span (in this context, 0 means
    left-to-right, 1 means right-to-left, 2 means left-to-right
    number inside right-to-left text).
    */
  val level: Double = js.native
  
  /**
    The end of the span.
    */
  val to: Double = js.native
}
