package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudFormationStackRecordSourceInfo extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the export snapshot record.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the record.
    */
  var name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Lightsail resource type (e.g., ExportSnapshotRecord).
    */
  var resourceType: js.UndefOr[CloudFormationStackRecordSourceType] = js.undefined
}
object CloudFormationStackRecordSourceInfo {
  
  @scala.inline
  def apply(): CloudFormationStackRecordSourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudFormationStackRecordSourceInfo]
  }
  
  @scala.inline
  implicit class CloudFormationStackRecordSourceInfoMutableBuilder[Self <: CloudFormationStackRecordSourceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResourceType(value: CloudFormationStackRecordSourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
