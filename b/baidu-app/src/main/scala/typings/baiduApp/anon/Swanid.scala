package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Swanid extends js.Object {
  
  var swanid: String = js.native
}
object Swanid {
  
  @scala.inline
  def apply(swanid: String): Swanid = {
    val __obj = js.Dynamic.literal(swanid = swanid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Swanid]
  }
  
  @scala.inline
  implicit class SwanidOps[Self <: Swanid] (val x: Self) extends AnyVal {
    
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
    def setSwanid(value: String): Self = this.set("swanid", value.asInstanceOf[js.Any])
  }
}
