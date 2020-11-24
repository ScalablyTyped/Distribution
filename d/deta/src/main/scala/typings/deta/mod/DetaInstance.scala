package typings.deta.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetaInstance extends js.Object {
  
  def Base(db: String): DetaBase = js.native
}
object DetaInstance {
  
  @scala.inline
  def apply(Base: String => DetaBase): DetaInstance = {
    val __obj = js.Dynamic.literal(Base = js.Any.fromFunction1(Base))
    __obj.asInstanceOf[DetaInstance]
  }
  
  @scala.inline
  implicit class DetaInstanceOps[Self <: DetaInstance] (val x: Self) extends AnyVal {
    
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
    def setBase(value: String => DetaBase): Self = this.set("Base", js.Any.fromFunction1(value))
  }
}
