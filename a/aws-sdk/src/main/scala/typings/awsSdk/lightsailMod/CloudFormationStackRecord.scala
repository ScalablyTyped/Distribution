package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudFormationStackRecord extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the CloudFormation stack record.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The date when the CloudFormation stack record was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  
  /**
    * A list of objects describing the destination service, which is AWS CloudFormation, and the Amazon Resource Name (ARN) of the AWS CloudFormation stack.
    */
  var destinationInfo: js.UndefOr[DestinationInfo] = js.undefined
  
  /**
    * A list of objects describing the Availability Zone and AWS Region of the CloudFormation stack record.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  
  /**
    * The name of the CloudFormation stack record. It starts with CloudFormationStackRecord followed by a GUID.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The Lightsail resource type (e.g., CloudFormationStackRecord).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * A list of objects describing the source of the CloudFormation stack record.
    */
  var sourceInfo: js.UndefOr[CloudFormationStackRecordSourceInfoList] = js.undefined
  
  /**
    * The current state of the CloudFormation stack record.
    */
  var state: js.UndefOr[RecordState] = js.undefined
}
object CloudFormationStackRecord {
  
  @scala.inline
  def apply(): CloudFormationStackRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudFormationStackRecord]
  }
  
  @scala.inline
  implicit class CloudFormationStackRecordMutableBuilder[Self <: CloudFormationStackRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setDestinationInfo(value: DestinationInfo): Self = StObject.set(x, "destinationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationInfoUndefined: Self = StObject.set(x, "destinationInfo", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setSourceInfo(value: CloudFormationStackRecordSourceInfoList): Self = StObject.set(x, "sourceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceInfoUndefined: Self = StObject.set(x, "sourceInfo", js.undefined)
    
    @scala.inline
    def setSourceInfoVarargs(value: CloudFormationStackRecordSourceInfo*): Self = StObject.set(x, "sourceInfo", js.Array(value :_*))
    
    @scala.inline
    def setState(value: RecordState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
