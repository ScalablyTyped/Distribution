package typings.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyableQuery[T] extends js.Object {
  
  def keys(): KeysQuery[T] = js.native
}
object KeyableQuery {
  
  @scala.inline
  def apply[T](keys: () => KeysQuery[T]): KeyableQuery[T] = {
    val __obj = js.Dynamic.literal(keys = js.Any.fromFunction0(keys))
    __obj.asInstanceOf[KeyableQuery[T]]
  }
  
  @scala.inline
  implicit class KeyableQueryOps[Self <: KeyableQuery[_], T] (val x: Self with KeyableQuery[T]) extends AnyVal {
    
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
    def setKeys(value: () => KeysQuery[T]): Self = this.set("keys", js.Any.fromFunction0(value))
  }
}
