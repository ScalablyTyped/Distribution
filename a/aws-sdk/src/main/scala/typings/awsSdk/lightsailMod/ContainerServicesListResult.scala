package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerServicesListResult extends js.Object {
  
  /**
    * An array of objects that describe one or more container services.
    */
  var containerServices: js.UndefOr[ContainerServiceList] = js.native
}
object ContainerServicesListResult {
  
  @scala.inline
  def apply(): ContainerServicesListResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServicesListResult]
  }
  
  @scala.inline
  implicit class ContainerServicesListResultOps[Self <: ContainerServicesListResult] (val x: Self) extends AnyVal {
    
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
    def setContainerServicesVarargs(value: ContainerService*): Self = this.set("containerServices", js.Array(value :_*))
    
    @scala.inline
    def setContainerServices(value: ContainerServiceList): Self = this.set("containerServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerServices: Self = this.set("containerServices", js.undefined)
  }
}
