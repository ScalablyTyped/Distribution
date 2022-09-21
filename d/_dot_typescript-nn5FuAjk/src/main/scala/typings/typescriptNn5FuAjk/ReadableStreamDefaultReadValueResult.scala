package typings.typescriptNn5FuAjk

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamDefaultReadValueResult[T]
  extends StObject
     with ReadableStreamDefaultReadResult[T] {
  
  var done: `false`
  
  var value: T
}
object ReadableStreamDefaultReadValueResult {
  
  inline def apply[T](value: T): ReadableStreamDefaultReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamDefaultReadValueResult[T]]
  }
  
  extension [Self <: ReadableStreamDefaultReadValueResult[?], T](x: Self & ReadableStreamDefaultReadValueResult[T]) {
    
    inline def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
