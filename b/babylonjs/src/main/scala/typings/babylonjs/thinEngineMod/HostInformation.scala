package typings.babylonjs.thinEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostInformation extends js.Object {
  
  /**
    * Defines if the current host is a mobile
    */
  var isMobile: Boolean = js.native
}
object HostInformation {
  
  @scala.inline
  def apply(isMobile: Boolean): HostInformation = {
    val __obj = js.Dynamic.literal(isMobile = isMobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostInformation]
  }
  
  @scala.inline
  implicit class HostInformationOps[Self <: HostInformation] (val x: Self) extends AnyVal {
    
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
    def setIsMobile(value: Boolean): Self = this.set("isMobile", value.asInstanceOf[js.Any])
  }
}
