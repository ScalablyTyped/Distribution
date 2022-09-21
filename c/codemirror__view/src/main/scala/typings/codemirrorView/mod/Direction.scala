package typings.codemirrorView.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Direction extends StObject
/**
Used to indicate [text direction](https://codemirror.net/6/docs/ref/#view.EditorView.textDirection).
*/
@JSImport("@codemirror/view", "Direction")
@js.native
object Direction extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Direction & Double] = js.native
  
  /**
    Left-to-right.
    */
  @js.native
  sealed trait LTR
    extends StObject
       with Direction
  /* 0 */ val LTR: typings.codemirrorView.mod.Direction.LTR & Double = js.native
  
  /**
    Right-to-left.
    */
  @js.native
  sealed trait RTL
    extends StObject
       with Direction
  /* 1 */ val RTL: typings.codemirrorView.mod.Direction.RTL & Double = js.native
}
