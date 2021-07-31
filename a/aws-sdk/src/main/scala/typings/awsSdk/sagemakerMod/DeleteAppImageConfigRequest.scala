package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppImageConfigRequest extends StObject {
  
  /**
    * The name of the AppImageConfig to delete.
    */
  var AppImageConfigName: typings.awsSdk.sagemakerMod.AppImageConfigName
}
object DeleteAppImageConfigRequest {
  
  @scala.inline
  def apply(AppImageConfigName: AppImageConfigName): DeleteAppImageConfigRequest = {
    val __obj = js.Dynamic.literal(AppImageConfigName = AppImageConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppImageConfigRequest]
  }
  
  @scala.inline
  implicit class DeleteAppImageConfigRequestMutableBuilder[Self <: DeleteAppImageConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppImageConfigName(value: AppImageConfigName): Self = StObject.set(x, "AppImageConfigName", value.asInstanceOf[js.Any])
  }
}
