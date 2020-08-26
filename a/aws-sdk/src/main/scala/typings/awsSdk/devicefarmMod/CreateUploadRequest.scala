package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUploadRequest extends js.Object {
  /**
    * The upload's content type (for example, application/octet-stream).
    */
  var contentType: js.UndefOr[ContentType] = js.native
  /**
    * The upload's file name. The name should not contain any forward slashes (/). If you are uploading an iOS app, the file name must end with the .ipa extension. If you are uploading an Android app, the file name must end with the .apk extension. For all others, the file name must end with the .zip file extension.
    */
  var name: Name = js.native
  /**
    * The ARN of the project for the upload.
    */
  var projectArn: AmazonResourceName = js.native
  /**
    * The upload's upload type. Must be one of the following values:   ANDROID_APP   IOS_APP   WEB_APP   EXTERNAL_DATA   APPIUM_JAVA_JUNIT_TEST_PACKAGE   APPIUM_JAVA_TESTNG_TEST_PACKAGE   APPIUM_PYTHON_TEST_PACKAGE   APPIUM_NODE_TEST_PACKAGE   APPIUM_RUBY_TEST_PACKAGE   APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE   APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE   APPIUM_WEB_PYTHON_TEST_PACKAGE   APPIUM_WEB_NODE_TEST_PACKAGE   APPIUM_WEB_RUBY_TEST_PACKAGE   CALABASH_TEST_PACKAGE   INSTRUMENTATION_TEST_PACKAGE   UIAUTOMATION_TEST_PACKAGE   UIAUTOMATOR_TEST_PACKAGE   XCTEST_TEST_PACKAGE   XCTEST_UI_TEST_PACKAGE   APPIUM_JAVA_JUNIT_TEST_SPEC   APPIUM_JAVA_TESTNG_TEST_SPEC   APPIUM_PYTHON_TEST_SPEC   APPIUM_NODE_TEST_SPEC   APPIUM_RUBY_TEST_SPEC   APPIUM_WEB_JAVA_JUNIT_TEST_SPEC   APPIUM_WEB_JAVA_TESTNG_TEST_SPEC   APPIUM_WEB_PYTHON_TEST_SPEC   APPIUM_WEB_NODE_TEST_SPEC   APPIUM_WEB_RUBY_TEST_SPEC   INSTRUMENTATION_TEST_SPEC   XCTEST_UI_TEST_SPEC    If you call CreateUpload with WEB_APP specified, AWS Device Farm throws an ArgumentException error.
    */
  var `type`: UploadType = js.native
}

object CreateUploadRequest {
  @scala.inline
  def apply(name: Name, projectArn: AmazonResourceName, `type`: UploadType): CreateUploadRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectArn = projectArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUploadRequest]
  }
  @scala.inline
  implicit class CreateUploadRequestOps[Self <: CreateUploadRequest] (val x: Self) extends AnyVal {
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
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectArn(value: AmazonResourceName): Self = this.set("projectArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: UploadType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: ContentType): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
  }
  
}

