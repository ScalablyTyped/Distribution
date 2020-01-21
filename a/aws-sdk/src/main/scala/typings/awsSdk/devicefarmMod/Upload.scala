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
  def apply(
    arn: AmazonResourceName = null,
    category: UploadCategory = null,
    contentType: ContentType = null,
    created: DateTime = null,
    message: Message = null,
    metadata: Metadata = null,
    name: Name = null,
    status: UploadStatus = null,
    `type`: UploadType = null,
    url: URL = null
  ): Upload = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Upload]
  }
}

