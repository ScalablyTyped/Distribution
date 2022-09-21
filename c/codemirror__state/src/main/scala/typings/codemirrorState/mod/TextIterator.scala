package typings.codemirrorState.mod

import typings.std.Iterable
import typings.std.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextIterator
  extends StObject
     with Iterator[String, Any, Unit]
     with Iterable[String] {
  
  /**
    Whether the end of the iteration has been reached. You should
    probably check this right after calling `next`.
    */
  var done: Boolean = js.native
  
  /**
    Whether the current string represents a line break.
    */
  var lineBreak: Boolean = js.native
  
  /**
    Retrieve the next string. Optionally skip a given number of
    positions after the current position. Always returns the object
    itself.
    */
  def next(): this.type = js.native
  def next(skip: Double): this.type = js.native
  
  /**
    The current string. Will be the empty string when the cursor is
    at its end or `next` hasn't been called on it yet.
    */
  var value: String = js.native
}
