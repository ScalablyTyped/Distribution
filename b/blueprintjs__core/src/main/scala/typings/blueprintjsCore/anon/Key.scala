package typings.blueprintjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key[T /* <: js.Object */] extends js.Object {
  
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
  implicit class KeyOps[Self <: Key[_], T /* <: js.Object */] (val x: Self with Key[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: /* keyof T */ String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueA(value: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any): Self = this.set("valueA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueB(value: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any): Self = this.set("valueB", value.asInstanceOf[js.Any])
  }
}
