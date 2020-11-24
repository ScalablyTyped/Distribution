package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait False extends js.Object {
  
  var `false`: String = js.native
  
  var mixed: String = js.native
  
  var `true`: String = js.native
}
object False {
  
  @scala.inline
  def apply(`false`: String, mixed: String, `true`: String): False = {
    val __obj = js.Dynamic.literal(mixed = mixed.asInstanceOf[js.Any])
    __obj.updateDynamic("false")(`false`.asInstanceOf[js.Any])
    __obj.updateDynamic("true")(`true`.asInstanceOf[js.Any])
    __obj.asInstanceOf[False]
  }
  
  @scala.inline
  implicit class FalseOps[Self <: False] (val x: Self) extends AnyVal {
    
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
    def setFalse(value: String): Self = this.set("false", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixed(value: String): Self = this.set("mixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrue(value: String): Self = this.set("true", value.asInstanceOf[js.Any])
  }
}
