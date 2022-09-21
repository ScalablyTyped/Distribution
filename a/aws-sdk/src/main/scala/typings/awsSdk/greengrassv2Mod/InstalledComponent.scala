package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstalledComponent extends StObject {
  
  /**
    * The name of the component.
    */
  var componentName: js.UndefOr[ComponentNameString] = js.undefined
  
  /**
    * The version of the component.
    */
  var componentVersion: js.UndefOr[ComponentVersionString] = js.undefined
  
  /**
    * Whether or not the component is a root component.
    */
  var isRoot: js.UndefOr[IsRoot] = js.undefined
  
  /**
    * The status of how current the data is. This response is based off of component state changes. The status reflects component disruptions and deployments. If a component only sees a configuration update during a deployment, it might not undergo a state change and this status would not be updated.
    */
  var lastStatusChangeTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The lifecycle state of the component.
    */
  var lifecycleState: js.UndefOr[InstalledComponentLifecycleState] = js.undefined
  
  /**
    * The details about the lifecycle state of the component.
    */
  var lifecycleStateDetails: js.UndefOr[LifecycleStateDetails] = js.undefined
}
object InstalledComponent {
  
  inline def apply(): InstalledComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstalledComponent]
  }
  
  extension [Self <: InstalledComponent](x: Self) {
    
    inline def setComponentName(value: ComponentNameString): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setComponentVersion(value: ComponentVersionString): Self = StObject.set(x, "componentVersion", value.asInstanceOf[js.Any])
    
    inline def setComponentVersionUndefined: Self = StObject.set(x, "componentVersion", js.undefined)
    
    inline def setIsRoot(value: IsRoot): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
    
    inline def setIsRootUndefined: Self = StObject.set(x, "isRoot", js.undefined)
    
    inline def setLastStatusChangeTimestamp(value: js.Date): Self = StObject.set(x, "lastStatusChangeTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastStatusChangeTimestampUndefined: Self = StObject.set(x, "lastStatusChangeTimestamp", js.undefined)
    
    inline def setLifecycleState(value: InstalledComponentLifecycleState): Self = StObject.set(x, "lifecycleState", value.asInstanceOf[js.Any])
    
    inline def setLifecycleStateDetails(value: LifecycleStateDetails): Self = StObject.set(x, "lifecycleStateDetails", value.asInstanceOf[js.Any])
    
    inline def setLifecycleStateDetailsUndefined: Self = StObject.set(x, "lifecycleStateDetails", js.undefined)
    
    inline def setLifecycleStateUndefined: Self = StObject.set(x, "lifecycleState", js.undefined)
  }
}
