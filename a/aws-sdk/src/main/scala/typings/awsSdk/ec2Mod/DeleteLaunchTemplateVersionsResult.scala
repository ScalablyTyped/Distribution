package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLaunchTemplateVersionsResult extends StObject {
  
  /**
    * Information about the launch template versions that were successfully deleted.
    */
  var SuccessfullyDeletedLaunchTemplateVersions: js.UndefOr[DeleteLaunchTemplateVersionsResponseSuccessSet] = js.native
  
  /**
    * Information about the launch template versions that could not be deleted.
    */
  var UnsuccessfullyDeletedLaunchTemplateVersions: js.UndefOr[DeleteLaunchTemplateVersionsResponseErrorSet] = js.native
}
object DeleteLaunchTemplateVersionsResult {
  
  @scala.inline
  def apply(): DeleteLaunchTemplateVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLaunchTemplateVersionsResult]
  }
  
  @scala.inline
  implicit class DeleteLaunchTemplateVersionsResultMutableBuilder[Self <: DeleteLaunchTemplateVersionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccessfullyDeletedLaunchTemplateVersions(value: DeleteLaunchTemplateVersionsResponseSuccessSet): Self = StObject.set(x, "SuccessfullyDeletedLaunchTemplateVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessfullyDeletedLaunchTemplateVersionsUndefined: Self = StObject.set(x, "SuccessfullyDeletedLaunchTemplateVersions", js.undefined)
    
    @scala.inline
    def setSuccessfullyDeletedLaunchTemplateVersionsVarargs(value: DeleteLaunchTemplateVersionsResponseSuccessItem*): Self = StObject.set(x, "SuccessfullyDeletedLaunchTemplateVersions", js.Array(value :_*))
    
    @scala.inline
    def setUnsuccessfullyDeletedLaunchTemplateVersions(value: DeleteLaunchTemplateVersionsResponseErrorSet): Self = StObject.set(x, "UnsuccessfullyDeletedLaunchTemplateVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsuccessfullyDeletedLaunchTemplateVersionsUndefined: Self = StObject.set(x, "UnsuccessfullyDeletedLaunchTemplateVersions", js.undefined)
    
    @scala.inline
    def setUnsuccessfullyDeletedLaunchTemplateVersionsVarargs(value: DeleteLaunchTemplateVersionsResponseErrorItem*): Self = StObject.set(x, "UnsuccessfullyDeletedLaunchTemplateVersions", js.Array(value :_*))
  }
}
