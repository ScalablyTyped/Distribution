package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
This type describes a line in the document. It is created
on-demand when lines are [queried](https://codemirror.net/6/docs/ref/#state.Text.lineAt).
*/
@JSImport("@codemirror/state", "Line")
@js.native
open class Line () extends StObject {
  
  /**
    The position of the start of the line.
    */
  val from: Double = js.native
  
  /**
    The length of the line (not including any line break after it).
    */
  def length: Double = js.native
  
  /**
    This line's line number (1-based).
    */
  val number: Double = js.native
  
  /**
    The line's content.
    */
  val text: String = js.native
  
  /**
    The position at the end of the line (_before_ the line break,
    or at the end of document for the last line).
    */
  val to: Double = js.native
}
