package typings.codemirrorView.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlockType extends StObject
/**
The different types of blocks that can occur in an editor view.
*/
@JSImport("@codemirror/view", "BlockType")
@js.native
object BlockType extends StObject {
  
  /**
    A line of text.
    */
  @js.native
  sealed trait Text
    extends StObject
       with BlockType
  
  /**
    A block widget associated with the position before it.
    */
  @js.native
  sealed trait WidgetAfter
    extends StObject
       with BlockType
  
  /**
    A block widget associated with the position after it.
    */
  @js.native
  sealed trait WidgetBefore
    extends StObject
       with BlockType
  
  /**
    A block widget [replacing](https://codemirror.net/6/docs/ref/#view.Decoration^replace) a range of content.
    */
  @js.native
  sealed trait WidgetRange
    extends StObject
       with BlockType
}
