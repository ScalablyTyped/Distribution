package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationProperties extends js.Object {
  /**
    * The ARN of the resource to publish to.
    */
  var DestinationArn: js.UndefOr[String] = js.native
  /**
    * The ARN of the KMS key to use for encryption.
    */
  var KmsKeyArn: js.UndefOr[String] = js.native
}

object DestinationProperties {
  @scala.inline
  def apply(): DestinationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationProperties]
  }
  @scala.inline
  implicit class DestinationPropertiesOps[Self <: DestinationProperties] (val x: Self) extends AnyVal {
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
    def setDestinationArn(value: String): Self = this.set("DestinationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationArn: Self = this.set("DestinationArn", js.undefined)
    @scala.inline
    def setKmsKeyArn(value: String): Self = this.set("KmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("KmsKeyArn", js.undefined)
  }
  
}

