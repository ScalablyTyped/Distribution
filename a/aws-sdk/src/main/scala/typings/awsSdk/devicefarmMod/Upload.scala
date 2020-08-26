package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Upload extends js.Object {
  /**
    * The upload's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.native
  /**
    * The upload's category. Allowed values include:   CURATED: An upload managed by AWS Device Farm.   PRIVATE: An upload managed by the AWS Device Farm customer.  
    */
  var category: js.UndefOr[UploadCategory] = js.native
  /**
    * The upload's content type (for example, application/octet-stream).
    */
  var contentType: js.UndefOr[ContentType] = js.native
  /**
    * When the upload was created.
    */
  var created: js.UndefOr[DateTime] = js.native
  /**
    * A message about the upload's result.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * The upload's metadata. For example, for Android, this contains information that is parsed from the manifest and is displayed in the AWS Device Farm console after the associated app is uploaded.
    */
  var metadata: js.UndefOr[Metadata] = js.native
  /**
    * The upload's file name.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The upload's status. Must be one of the following values:   FAILED   INITIALIZED   PROCESSING   SUCCEEDED  
    */
  var status: js.UndefOr[UploadStatus] = js.native
  /**
    * The upload's type. Must be one of the following values:   ANDROID_APP   IOS_APP   WEB_APP   EXTERNAL_DATA   APPIUM_JAVA_JUNIT_TEST_PACKAGE   APPIUM_JAVA_TESTNG_TEST_PACKAGE   APPIUM_PYTHON_TEST_PACKAGE   APPIUM_NODE_TEST_PACKAGE   APPIUM_RUBY_TEST_PACKAGE   APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE   APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE   APPIUM_WEB_PYTHON_TEST_PACKAGE   APPIUM_WEB_NODE_TEST_PACKAGE   APPIUM_WEB_RUBY_TEST_PACKAGE   CALABASH_TEST_PACKAGE   INSTRUMENTATION_TEST_PACKAGE   UIAUTOMATION_TEST_PACKAGE   UIAUTOMATOR_TEST_PACKAGE   XCTEST_TEST_PACKAGE   XCTEST_UI_TEST_PACKAGE   APPIUM_JAVA_JUNIT_TEST_SPEC   APPIUM_JAVA_TESTNG_TEST_SPEC   APPIUM_PYTHON_TEST_SPEC   APPIUM_NODE_TEST_SPEC   APPIUM_RUBY_TEST_SPEC   APPIUM_WEB_JAVA_JUNIT_TEST_SPEC   APPIUM_WEB_JAVA_TESTNG_TEST_SPEC   APPIUM_WEB_PYTHON_TEST_SPEC   APPIUM_WEB_NODE_TEST_SPEC   APPIUM_WEB_RUBY_TEST_SPEC   INSTRUMENTATION_TEST_SPEC   XCTEST_UI_TEST_SPEC  
    */
  var `type`: js.UndefOr[UploadType] = js.native
  /**
    * The presigned Amazon S3 URL that was used to store a file using a PUT request.
    */
  var url: js.UndefOr[URL] = js.native
}

object Upload {
  @scala.inline
  def apply(): Upload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Upload]
  }
  @scala.inline
  implicit class UploadOps[Self <: Upload] (val x: Self) extends AnyVal {
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
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCategory(value: UploadCategory): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setContentType(value: ContentType): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setCreated(value: DateTime): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStatus(value: UploadStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setType(value: UploadType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUrl(value: URL): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

