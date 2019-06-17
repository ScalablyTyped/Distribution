package typings
package baseuiLib.fileDashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleProps extends js.Object {
  @JSName("$afterFileDrop")
  var $afterFileDrop: scala.Boolean
  @JSName("$isDisabled")
  var $isDisabled: scala.Boolean
  @JSName("$isDragAccept")
  var $isDragAccept: scala.Boolean
  @JSName("$isDragActive")
  var $isDragActive: scala.Boolean
  @JSName("$isDragReject")
  var $isDragReject: scala.Boolean
  @JSName("$isFocused")
  var $isFocused: scala.Boolean
}

object StyleProps {
  @scala.inline
  def apply(
    $afterFileDrop: scala.Boolean,
    $isDisabled: scala.Boolean,
    $isDragAccept: scala.Boolean,
    $isDragActive: scala.Boolean,
    $isDragReject: scala.Boolean,
    $isFocused: scala.Boolean
  ): StyleProps = {
    val __obj = js.Dynamic.literal($afterFileDrop = $afterFileDrop, $isDisabled = $isDisabled, $isDragAccept = $isDragAccept, $isDragActive = $isDragActive, $isDragReject = $isDragReject, $isFocused = $isFocused)
  
    __obj.asInstanceOf[StyleProps]
  }
}

