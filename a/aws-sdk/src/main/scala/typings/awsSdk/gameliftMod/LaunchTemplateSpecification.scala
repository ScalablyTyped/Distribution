package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateSpecification extends StObject {
  
  /**
    * A unique identifier for an existing EC2 launch template.
    */
  var LaunchTemplateId: js.UndefOr[typings.awsSdk.gameliftMod.LaunchTemplateId] = js.undefined
  
  /**
    * A readable identifier for an existing EC2 launch template. 
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.gameliftMod.LaunchTemplateName] = js.undefined
  
  /**
    * The version of the EC2 launch template to use. If no version is specified, the default version will be used. With Amazon EC2, you can specify a default version for a launch template. If none is set, the default is the first version created.
    */
  var Version: js.UndefOr[LaunchTemplateVersion] = js.undefined
}
object LaunchTemplateSpecification {
  
  inline def apply(): LaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateSpecification]
  }
  
  extension [Self <: LaunchTemplateSpecification](x: Self) {
    
    inline def setLaunchTemplateId(value: LaunchTemplateId): Self = StObject.set(x, "LaunchTemplateId", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateIdUndefined: Self = StObject.set(x, "LaunchTemplateId", js.undefined)
    
    inline def setLaunchTemplateName(value: LaunchTemplateName): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateNameUndefined: Self = StObject.set(x, "LaunchTemplateName", js.undefined)
    
    inline def setVersion(value: LaunchTemplateVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
