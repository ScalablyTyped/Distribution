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
  
  /**
    Left-to-right.
    */
  @js.native
  sealed trait LTR
    extends StObject
       with Direction
  
  /**
    Right-to-left.
    */
  @js.native
  sealed trait RTL
    extends StObject
       with Direction
}
