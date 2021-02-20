package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateSpecification extends StObject {
  
  /**
    * A unique identifier for an existing EC2 launch template.
    */
  var LaunchTemplateId: js.UndefOr[typings.awsSdk.gameliftMod.LaunchTemplateId] = js.native
  
  /**
    * A readable identifier for an existing EC2 launch template. 
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.gameliftMod.LaunchTemplateName] = js.native
  
  /**
    * The version of the EC2 launch template to use. If no version is specified, the default version will be used. With Amazon EC2, you can specify a default version for a launch template. If none is set, the default is the first version created.
    */
  var Version: js.UndefOr[LaunchTemplateVersion] = js.native
}
object LaunchTemplateSpecification {
  
  @scala.inline
  def apply(): LaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateSpecification]
  }
  
  @scala.inline
  implicit class LaunchTemplateSpecificationMutableBuilder[Self <: LaunchTemplateSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchTemplateId(value: LaunchTemplateId): Self = StObject.set(x, "LaunchTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateIdUndefined: Self = StObject.set(x, "LaunchTemplateId", js.undefined)
    
    @scala.inline
    def setLaunchTemplateName(value: LaunchTemplateName): Self = StObject.set(x, "LaunchTemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateNameUndefined: Self = StObject.set(x, "LaunchTemplateName", js.undefined)
    
    @scala.inline
    def setVersion(value: LaunchTemplateVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
