package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudFormationStackRecord extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the CloudFormation stack record.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The date when the CloudFormation stack record was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * A list of objects describing the destination service, which is AWS CloudFormation, and the Amazon Resource Name (ARN) of the AWS CloudFormation stack.
    */
  var destinationInfo: js.UndefOr[DestinationInfo] = js.native
  
  /**
    * A list of objects describing the Availability Zone and AWS Region of the CloudFormation stack record.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  
  /**
    * The name of the CloudFormation stack record. It starts with CloudFormationStackRecord followed by a GUID.
    */
  var name: js.UndefOr[ResourceName] = js.native
  
  /**
    * The Lightsail resource type (e.g., CloudFormationStackRecord).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * A list of objects describing the source of the CloudFormation stack record.
    */
  var sourceInfo: js.UndefOr[CloudFormationStackRecordSourceInfoList] = js.native
  
  /**
    * The current state of the CloudFormation stack record.
    */
  var state: js.UndefOr[RecordState] = js.native
}
object CloudFormationStackRecord {
  
  @scala.inline
  def apply(): CloudFormationStackRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudFormationStackRecord]
  }
  
  @scala.inline
  implicit class CloudFormationStackRecordOps[Self <: CloudFormationStackRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setDestinationInfo(value: DestinationInfo): Self = this.set("destinationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationInfo: Self = this.set("destinationInfo", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setSourceInfoVarargs(value: CloudFormationStackRecordSourceInfo*): Self = this.set("sourceInfo", js.Array(value :_*))
    
    @scala.inline
    def setSourceInfo(value: CloudFormationStackRecordSourceInfoList): Self = this.set("sourceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceInfo: Self = this.set("sourceInfo", js.undefined)
    
    @scala.inline
    def setState(value: RecordState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
