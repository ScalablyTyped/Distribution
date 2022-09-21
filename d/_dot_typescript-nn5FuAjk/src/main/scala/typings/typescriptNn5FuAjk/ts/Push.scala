package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Array that is only intended to be pushed to, never read. */
trait Push[T] extends StObject {
  
  def push(values: T*): Unit
}
object Push {
  
  inline def apply[T](push: /* repeated */ T => Unit): Push[T] = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[Push[T]]
  }
  
  extension [Self <: Push[?], T](x: Self & Push[T]) {
    
    inline def setPush(value: /* repeated */ T => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
  }
}
