package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key[T /* <: js.Object */] extends StObject {
  
  var key: /* keyof T */ String
  
  var valueA: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  
  var valueB: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
object Key {
  
  inline def apply[T /* <: js.Object */](
    key: /* keyof T */ String,
    valueA: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any,
    valueB: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ): Key[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], valueA = valueA.asInstanceOf[js.Any], valueB = valueB.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Key[?], T /* <: js.Object */] (val x: Self & Key[T]) extends AnyVal {
    
    inline def setKey(value: /* keyof T */ String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValueA(value: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any): Self = StObject.set(x, "valueA", value.asInstanceOf[js.Any])
    
    inline def setValueB(value: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any): Self = StObject.set(x, "valueB", value.asInstanceOf[js.Any])
  }
}
