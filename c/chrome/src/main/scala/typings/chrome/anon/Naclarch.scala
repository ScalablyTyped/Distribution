package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Naclarch extends js.Object {
  
  var nacl_arch: js.UndefOr[String] = js.native
  
  var sub_package_path: String = js.native
}
object Naclarch {
  
  @scala.inline
  def apply(sub_package_path: String): Naclarch = {
    val __obj = js.Dynamic.literal(sub_package_path = sub_package_path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Naclarch]
  }
  
  @scala.inline
  implicit class NaclarchOps[Self <: Naclarch] (val x: Self) extends AnyVal {
    
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
    def setSub_package_path(value: String): Self = this.set("sub_package_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNacl_arch(value: String): Self = this.set("nacl_arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNacl_arch: Self = this.set("nacl_arch", js.undefined)
  }
}
