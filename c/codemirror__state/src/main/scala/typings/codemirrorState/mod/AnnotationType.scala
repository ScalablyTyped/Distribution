package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Marker that identifies a type of [annotation](https://codemirror.net/6/docs/ref/#state.Annotation).
*/
@JSImport("@codemirror/state", "AnnotationType")
@js.native
open class AnnotationType[T] () extends StObject {
  
  /**
    Create an instance of this annotation.
    */
  def of(value: T): Annotation[T] = js.native
}
