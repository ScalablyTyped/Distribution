package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkPathComponent extends StObject {
  
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
  implicit class NetworkPathComponentMutableBuilder[Self <: NetworkPathComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentId(value: NonEmptyString): Self = StObject.set(x, "ComponentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentIdUndefined: Self = StObject.set(x, "ComponentId", js.undefined)
    
    @scala.inline
    def setComponentType(value: NonEmptyString): Self = StObject.set(x, "ComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentTypeUndefined: Self = StObject.set(x, "ComponentType", js.undefined)
    
    @scala.inline
    def setEgress(value: NetworkHeader): Self = StObject.set(x, "Egress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressUndefined: Self = StObject.set(x, "Egress", js.undefined)
    
    @scala.inline
    def setIngress(value: NetworkHeader): Self = StObject.set(x, "Ingress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngressUndefined: Self = StObject.set(x, "Ingress", js.undefined)
  }
}
