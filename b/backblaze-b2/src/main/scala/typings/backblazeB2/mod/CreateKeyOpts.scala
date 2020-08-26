package typings.backblazeB2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateKeyOpts extends CommonArgs {
  var bucketId: js.UndefOr[String] = js.native
  var capabilities: js.Array[String] = js.native
  var keyName: String = js.native
  var namePrefix: js.UndefOr[String] = js.native
  var validDurationInSeconds: js.UndefOr[Double] = js.native
}

object CreateKeyOpts {
  @scala.inline
  def apply(capabilities: js.Array[String], keyName: String): CreateKeyOpts = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyOpts]
  }
  @scala.inline
  implicit class CreateKeyOptsOps[Self <: CreateKeyOpts] (val x: Self) extends AnyVal {
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
    def setCapabilitiesVarargs(value: String*): Self = this.set("capabilities", js.Array(value :_*))
    @scala.inline
    def setCapabilities(value: js.Array[String]): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyName(value: String): Self = this.set("keyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setBucketId(value: String): Self = this.set("bucketId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBucketId: Self = this.set("bucketId", js.undefined)
    @scala.inline
    def setNamePrefix(value: String): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    @scala.inline
    def setValidDurationInSeconds(value: Double): Self = this.set("validDurationInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidDurationInSeconds: Self = this.set("validDurationInSeconds", js.undefined)
  }
  
}

