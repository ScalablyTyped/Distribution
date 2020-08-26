package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockPublicAccessConfigurationMetadata extends js.Object {
  /**
    * The Amazon Resource Name that created or last modified the configuration.
    */
  var CreatedByArn: ArnType = js.native
  /**
    * The date and time that the configuration was created.
    */
  var CreationDateTime: Date = js.native
}

object BlockPublicAccessConfigurationMetadata {
  @scala.inline
  def apply(CreatedByArn: ArnType, CreationDateTime: Date): BlockPublicAccessConfigurationMetadata = {
    val __obj = js.Dynamic.literal(CreatedByArn = CreatedByArn.asInstanceOf[js.Any], CreationDateTime = CreationDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockPublicAccessConfigurationMetadata]
  }
  @scala.inline
  implicit class BlockPublicAccessConfigurationMetadataOps[Self <: BlockPublicAccessConfigurationMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreatedByArn(value: ArnType): Self = this.set("CreatedByArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationDateTime(value: Date): Self = this.set("CreationDateTime", value.asInstanceOf[js.Any])
  }
  
}

