package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceExportDetails extends StObject {
  
  /**
    * The ID of the resource being exported.
    */
  var InstanceId: js.UndefOr[String] = js.native
  
  /**
    * The target virtualization environment.
    */
  var TargetEnvironment: js.UndefOr[ExportEnvironment] = js.native
}
object InstanceExportDetails {
  
  @scala.inline
  def apply(): InstanceExportDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceExportDetails]
  }
  
  @scala.inline
  implicit class InstanceExportDetailsMutableBuilder[Self <: InstanceExportDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setTargetEnvironment(value: ExportEnvironment): Self = StObject.set(x, "TargetEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetEnvironmentUndefined: Self = StObject.set(x, "TargetEnvironment", js.undefined)
  }
}
