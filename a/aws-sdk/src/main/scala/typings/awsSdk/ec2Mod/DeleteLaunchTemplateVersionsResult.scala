package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLaunchTemplateVersionsResult extends StObject {
  
  /**
    * Information about the launch template versions that were successfully deleted.
    */
  var SuccessfullyDeletedLaunchTemplateVersions: js.UndefOr[DeleteLaunchTemplateVersionsResponseSuccessSet] = js.undefined
  
  /**
    * Information about the launch template versions that could not be deleted.
    */
  var UnsuccessfullyDeletedLaunchTemplateVersions: js.UndefOr[DeleteLaunchTemplateVersionsResponseErrorSet] = js.undefined
}
object DeleteLaunchTemplateVersionsResult {
  
  inline def apply(): DeleteLaunchTemplateVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLaunchTemplateVersionsResult]
  }
  
  extension [Self <: DeleteLaunchTemplateVersionsResult](x: Self) {
    
    inline def setSuccessfullyDeletedLaunchTemplateVersions(value: DeleteLaunchTemplateVersionsResponseSuccessSet): Self = StObject.set(x, "SuccessfullyDeletedLaunchTemplateVersions", value.asInstanceOf[js.Any])
    
    inline def setSuccessfullyDeletedLaunchTemplateVersionsUndefined: Self = StObject.set(x, "SuccessfullyDeletedLaunchTemplateVersions", js.undefined)
    
    inline def setSuccessfullyDeletedLaunchTemplateVersionsVarargs(value: DeleteLaunchTemplateVersionsResponseSuccessItem*): Self = StObject.set(x, "SuccessfullyDeletedLaunchTemplateVersions", js.Array(value :_*))
    
    inline def setUnsuccessfullyDeletedLaunchTemplateVersions(value: DeleteLaunchTemplateVersionsResponseErrorSet): Self = StObject.set(x, "UnsuccessfullyDeletedLaunchTemplateVersions", value.asInstanceOf[js.Any])
    
    inline def setUnsuccessfullyDeletedLaunchTemplateVersionsUndefined: Self = StObject.set(x, "UnsuccessfullyDeletedLaunchTemplateVersions", js.undefined)
    
    inline def setUnsuccessfullyDeletedLaunchTemplateVersionsVarargs(value: DeleteLaunchTemplateVersionsResponseErrorItem*): Self = StObject.set(x, "UnsuccessfullyDeletedLaunchTemplateVersions", js.Array(value :_*))
  }
}
