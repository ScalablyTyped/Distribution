package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRetentionConfigurationRequest extends StObject {
  
  /**
    * The name of the retention configuration to delete.
    */
  var RetentionConfigurationName: typings.awsSdk.configserviceMod.RetentionConfigurationName
}
object DeleteRetentionConfigurationRequest {
  
  @scala.inline
  def apply(RetentionConfigurationName: RetentionConfigurationName): DeleteRetentionConfigurationRequest = {
    val __obj = js.Dynamic.literal(RetentionConfigurationName = RetentionConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRetentionConfigurationRequest]
  }
  
  @scala.inline
  implicit class DeleteRetentionConfigurationRequestMutableBuilder[Self <: DeleteRetentionConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetentionConfigurationName(value: RetentionConfigurationName): Self = StObject.set(x, "RetentionConfigurationName", value.asInstanceOf[js.Any])
  }
}
