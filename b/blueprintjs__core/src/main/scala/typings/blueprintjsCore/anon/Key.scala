package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key[T /* <: js.Object */] extends StObject {
  
  var key: /* keyof T */ String = js.native
  
  var valueA: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any = js.native
  
  var valueB: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any = js.native
}
object Key {
  
  @scala.inline
  def apply[T /* <: js.Object */](
    key: /* keyof T */ String,
    valueA: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any,
    valueB: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ): Key[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], valueA = valueA.asInstanceOf[js.Any], valueB = valueB.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key[T]]
  }
  
  @scala.inline
  implicit class KeyMutableBuilder[Self <: Key[_], T /* <: js.Object */] (val x: Self with Key[T]) extends AnyVal {
    
    @scala.inline
    def setKey(value: /* keyof T */ String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueA(value: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any): Self = StObject.set(x, "valueA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueB(value: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any): Self = StObject.set(x, "valueB", value.asInstanceOf[js.Any])
  }
}
