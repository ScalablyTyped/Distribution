package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkPathComponent extends js.Object {
  
  /**
    * The identifier of a component in the network path.
    */
  var ComponentId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of component.
    */
  var ComponentType: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Information about the component that comes after the current component in the network path.
    */
  var Egress: js.UndefOr[NetworkHeader] = js.native
  
  /**
    * Information about the component that comes before the current node in the network path.
    */
  var Ingress: js.UndefOr[NetworkHeader] = js.native
}
object NetworkPathComponent {
  
  @scala.inline
  def apply(): NetworkPathComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPathComponent]
  }
  
  @scala.inline
  implicit class NetworkPathComponentOps[Self <: NetworkPathComponent] (val x: Self) extends AnyVal {
    
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
    def setComponentId(value: NonEmptyString): Self = this.set("ComponentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentId: Self = this.set("ComponentId", js.undefined)
    
    @scala.inline
    def setComponentType(value: NonEmptyString): Self = this.set("ComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentType: Self = this.set("ComponentType", js.undefined)
    
    @scala.inline
    def setEgress(value: NetworkHeader): Self = this.set("Egress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEgress: Self = this.set("Egress", js.undefined)
    
    @scala.inline
    def setIngress(value: NetworkHeader): Self = this.set("Ingress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngress: Self = this.set("Ingress", js.undefined)
  }
}
