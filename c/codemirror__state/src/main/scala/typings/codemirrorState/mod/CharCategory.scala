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
  
  /**
    Anything else.
    */
  @js.native
  sealed trait Other
    extends StObject
       with CharCategory
  
  /**
    Whitespace.
    */
  @js.native
  sealed trait Space
    extends StObject
       with CharCategory
  
  /**
    Word characters.
    */
  @js.native
  sealed trait Word
    extends StObject
       with CharCategory
}
