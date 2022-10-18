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
trait Annotation[T] extends StObject {
  
  /* private */ var _isAnnotation: Any
  
  /**
    The annotation type.
    */
  val `type`: AnnotationType[T]
  
  /**
    The value of this annotation.
    */
  val value: T
}
object Annotation {
  
  inline def apply[T](_isAnnotation: Any, `type`: AnnotationType[T], value: T): Annotation[T] = {
    val __obj = js.Dynamic.literal(_isAnnotation = _isAnnotation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation[T]]
  }
  
  extension [Self <: Annotation[?], T](x: Self & Annotation[T]) {
    
    inline def setType(value: AnnotationType[T]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_isAnnotation(value: Any): Self = StObject.set(x, "_isAnnotation", value.asInstanceOf[js.Any])
  }
}
