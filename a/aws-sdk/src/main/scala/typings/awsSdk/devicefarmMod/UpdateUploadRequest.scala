package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUploadRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the uploaded test spec.
    */
  var arn: AmazonResourceName = js.native
  /**
    * The upload's content type (for example, application/x-yaml).
    */
  var contentType: js.UndefOr[ContentType] = js.native
  /**
    * Set to true if the YAML file has changed and must be updated. Otherwise, set to false.
    */
  var editContent: js.UndefOr[Boolean] = js.native
  /**
    * The upload's test spec file name. The name must not contain any forward slashes (/). The test spec file name must end with the .yaml or .yml file extension.
    */
  var name: js.UndefOr[Name] = js.native
}

object UpdateUploadRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): UpdateUploadRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUploadRequest]
  }
  @scala.inline
  implicit class UpdateUploadRequestOps[Self <: UpdateUploadRequest] (val x: Self) extends AnyVal {
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
    def setArn(value: AmazonResourceName): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: ContentType): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setEditContent(value: Boolean): Self = this.set("editContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditContent: Self = this.set("editContent", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

