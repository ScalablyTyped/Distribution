package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Annotations are tagged values that are used to add metadata to
transactions in an extensible way. They should be used to model
things that effect the entire transaction (such as its [time
stamp](https://codemirror.net/6/docs/ref/#state.Transaction^time) or information about its
[origin](https://codemirror.net/6/docs/ref/#state.Transaction^userEvent)). For effects that happen
_alongside_ the other changes made by the transaction, [state
effects](https://codemirror.net/6/docs/ref/#state.StateEffect) are more appropriate.
*/
@JSImport("@codemirror/state", "Annotation")
@js.native
open class Annotation[T] () extends StObject {
  
  /* private */ var _isAnnotation: Any = js.native
  
  /**
    The annotation type.
    */
  val `type`: AnnotationType[T] = js.native
  
  /**
    The value of this annotation.
    */
  val value: T = js.native
}
object Annotation {
  
  @JSImport("@codemirror/state", "Annotation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    Define a new type of annotation.
    */
  /* static member */
  inline def define[T](): AnnotationType[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("define")().asInstanceOf[AnnotationType[T]]
}
