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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlockType & Double] = js.native
  
  /**
    A line of text.
    */
  @js.native
  sealed trait Text
    extends StObject
       with BlockType
  /* 0 */ val Text: typings.codemirrorView.mod.BlockType.Text & Double = js.native
  
  /**
    A block widget associated with the position before it.
    */
  @js.native
  sealed trait WidgetAfter
    extends StObject
       with BlockType
  /* 2 */ val WidgetAfter: typings.codemirrorView.mod.BlockType.WidgetAfter & Double = js.native
  
  /**
    A block widget associated with the position after it.
    */
  @js.native
  sealed trait WidgetBefore
    extends StObject
       with BlockType
  /* 1 */ val WidgetBefore: typings.codemirrorView.mod.BlockType.WidgetBefore & Double = js.native
  
  /**
    A block widget [replacing](https://codemirror.net/6/docs/ref/#view.Decoration^replace) a range of content.
    */
  @js.native
  sealed trait WidgetRange
    extends StObject
       with BlockType
  /* 3 */ val WidgetRange: typings.codemirrorView.mod.BlockType.WidgetRange & Double = js.native
}
