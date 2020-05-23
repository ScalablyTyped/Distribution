package typings.awsSdkTypes.exceptionMod

import typings.awsSdkTypes.awsSdkTypesStrings.Error
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnkownServiceException
  extends ServiceException[js.UndefOr[scala.Nothing]] {
  @JSName("name")
  var name_UnkownServiceException: Error
}

object UnkownServiceException {
  @scala.inline
  def apply($metadata: ResponseMetadata, message: String, name: Error, stack: String = null): UnkownServiceException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnkownServiceException]
  }
}

