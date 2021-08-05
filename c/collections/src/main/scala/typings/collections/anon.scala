package typings.collections

import typings.collections.collectionsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Done[T] extends StObject {
    
    var done: `true`
    
    var value: js.UndefOr[T | Null] = js.undefined
  }
  object Done {
    
    inline def apply[T](): Done[T] = {
      val __obj = js.Dynamic.literal(done = true)
      __obj.asInstanceOf[Done[T]]
    }
    
    extension [Self <: Done[?], T](x: Self & Done[T]) {
      
      inline def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
