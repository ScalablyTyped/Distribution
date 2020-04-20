package typings.baseui.fileUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleProps extends js.Object {
  @JSName("$afterFileDrop")
  var $afterFileDrop: Boolean
  @JSName("$isDisabled")
  var $isDisabled: Boolean
  @JSName("$isDragAccept")
  var $isDragAccept: Boolean
  @JSName("$isDragActive")
  var $isDragActive: Boolean
  @JSName("$isDragReject")
  var $isDragReject: Boolean
  @JSName("$isFocused")
  var $isFocused: Boolean
}

object StyleProps {
  @scala.inline
  def apply(
    $afterFileDrop: Boolean,
    $isDisabled: Boolean,
    $isDragAccept: Boolean,
    $isDragActive: Boolean,
    $isDragReject: Boolean,
    $isFocused: Boolean
  ): StyleProps = {
    val __obj = js.Dynamic.literal($afterFileDrop = $afterFileDrop.asInstanceOf[js.Any], $isDisabled = $isDisabled.asInstanceOf[js.Any], $isDragAccept = $isDragAccept.asInstanceOf[js.Any], $isDragActive = $isDragActive.asInstanceOf[js.Any], $isDragReject = $isDragReject.asInstanceOf[js.Any], $isFocused = $isFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleProps]
  }
}

