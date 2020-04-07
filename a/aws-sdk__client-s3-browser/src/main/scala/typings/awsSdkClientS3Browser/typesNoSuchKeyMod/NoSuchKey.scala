package typings.awsSdkClientS3Browser.typesNoSuchKeyMod

import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoSuchKey extends ServiceException[NoSuchKeyDetails] {
  @JSName("name")
  var name_NoSuchKey: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchKey
}

object NoSuchKey {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: NoSuchKeyDetails,
    message: String,
    name: typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.NoSuchKey,
    stack: String = null
  ): NoSuchKey = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSuchKey]
  }
}

