package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CharCategory extends StObject
/**
The categories produced by a [character
categorizer](https://codemirror.net/6/docs/ref/#state.EditorState.charCategorizer). These are used
do things like selecting by word.
*/
@JSImport("@codemirror/state", "CharCategory")
@js.native
object CharCategory extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CharCategory & Double] = js.native
  
  /**
    Anything else.
    */
  @js.native
  sealed trait Other
    extends StObject
       with CharCategory
  /* 2 */ val Other: typings.codemirrorState.mod.CharCategory.Other & Double = js.native
  
  /**
    Whitespace.
    */
  @js.native
  sealed trait Space
    extends StObject
       with CharCategory
  /* 1 */ val Space: typings.codemirrorState.mod.CharCategory.Space & Double = js.native
  
  /**
    Word characters.
    */
  @js.native
  sealed trait Word
    extends StObject
       with CharCategory
  /* 0 */ val Word: typings.codemirrorState.mod.CharCategory.Word & Double = js.native
}
