package typings.codemirrorView.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Record used to represent information about a block-level element
in the editor view.
*/
@JSImport("@codemirror/view", "BlockInfo")
@js.native
open class BlockInfo () extends StObject {
  
  /**
    The bottom position of the element.
    */
  def bottom: Double = js.native
  
  /**
    The start of the element in the document.
    */
  val from: Double = js.native
  
  /**
    Its height.
    */
  val height: Double = js.native
  
  /**
    The length of the element.
    */
  val length: Double = js.native
  
  /**
    The end of the element as a document position.
    */
  def to: Double = js.native
  
  /**
    The top position of the element (relative to the top of the
    document).
    */
  val top: Double = js.native
  
  /**
    The type of element this is. When querying lines, this may be
    an array of all the blocks that make up the line.
    */
  val `type`: BlockType | js.Array[BlockInfo] = js.native
}
