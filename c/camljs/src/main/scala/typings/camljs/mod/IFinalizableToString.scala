package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFinalizableToString extends js.Object {
  
  /** Get the resulting CAML query as string */
  def ToString(): String = js.native
}
object IFinalizableToString {
  
  @scala.inline
  def apply(ToString: () => String): IFinalizableToString = {
    val __obj = js.Dynamic.literal(ToString = js.Any.fromFunction0(ToString))
    __obj.asInstanceOf[IFinalizableToString]
  }
  
  @scala.inline
  implicit class IFinalizableToStringOps[Self <: IFinalizableToString] (val x: Self) extends AnyVal {
    
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
    def setToString(value: () => String): Self = this.set("ToString", js.Any.fromFunction0(value))
  }
}
