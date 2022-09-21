package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCandidate extends StObject {
  
  /**
    * The name of the component.
    */
  var componentName: js.UndefOr[ComponentNameString] = js.undefined
  
  /**
    * The version of the component.
    */
  var componentVersion: js.UndefOr[ComponentVersionString] = js.undefined
  
  /**
    * The version requirements for the component's dependencies. Greengrass core devices get the version requirements from component recipes. IoT Greengrass V2 uses semantic version constraints. For more information, see Semantic Versioning.
    */
  var versionRequirements: js.UndefOr[ComponentVersionRequirementMap] = js.undefined
}
object ComponentCandidate {
  
  inline def apply(): ComponentCandidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentCandidate]
  }
  
  extension [Self <: ComponentCandidate](x: Self) {
    
    inline def setComponentName(value: ComponentNameString): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setComponentVersion(value: ComponentVersionString): Self = StObject.set(x, "componentVersion", value.asInstanceOf[js.Any])
    
    inline def setComponentVersionUndefined: Self = StObject.set(x, "componentVersion", js.undefined)
    
    inline def setVersionRequirements(value: ComponentVersionRequirementMap): Self = StObject.set(x, "versionRequirements", value.asInstanceOf[js.Any])
    
    inline def setVersionRequirementsUndefined: Self = StObject.set(x, "versionRequirements", js.undefined)
  }
}
