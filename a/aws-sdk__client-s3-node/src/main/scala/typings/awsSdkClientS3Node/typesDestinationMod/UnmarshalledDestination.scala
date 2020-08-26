package typings.awsSdkClientS3Node.typesDestinationMod

import typings.awsSdkClientS3Node.typesAccessControlTranslationMod.UnmarshalledAccessControlTranslation
import typings.awsSdkClientS3Node.typesEncryptionConfigurationMod.UnmarshalledEncryptionConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledDestination extends Destination {
  /**
    * <p> Container for information regarding the access control for replicas. </p> <p> Use only in a cross-account scenario, where source and destination bucket owners are not the same, when you want to change replica ownership to the AWS account that owns the destination bucket. If you don't add this element to the replication configuration, the replicas are owned by same AWS account that owns the source object. </p>
    */
  @JSName("AccessControlTranslation")
  var AccessControlTranslation_UnmarshalledDestination: js.UndefOr[UnmarshalledAccessControlTranslation] = js.native
  /**
    * <p> Container that provides encryption-related information. You must specify this element if the <code>SourceSelectionCriteria</code> is specified. </p>
    */
  @JSName("EncryptionConfiguration")
  var EncryptionConfiguration_UnmarshalledDestination: js.UndefOr[UnmarshalledEncryptionConfiguration] = js.native
}

object UnmarshalledDestination {
  @scala.inline
  def apply(Bucket: String): UnmarshalledDestination = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledDestination]
  }
  @scala.inline
  implicit class UnmarshalledDestinationOps[Self <: UnmarshalledDestination] (val x: Self) extends AnyVal {
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
    def setAccessControlTranslation(value: UnmarshalledAccessControlTranslation): Self = this.set("AccessControlTranslation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessControlTranslation: Self = this.set("AccessControlTranslation", js.undefined)
    @scala.inline
    def setEncryptionConfiguration(value: UnmarshalledEncryptionConfiguration): Self = this.set("EncryptionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionConfiguration: Self = this.set("EncryptionConfiguration", js.undefined)
  }
  
}

