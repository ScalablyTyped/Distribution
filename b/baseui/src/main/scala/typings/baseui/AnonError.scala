package typings.baseui

import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.search
import typings.baseui.baseuiStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  @JSName("$error")
  var $error: Boolean
  @JSName("$isLoading")
  var $isLoading: Boolean
  @JSName("$multi")
  var $multi: Boolean
  @JSName("$required")
  var $required: Boolean
  @JSName("$searchable")
  var $searchable: Boolean
  @JSName("$size")
  var $size: mini | default_ | compact | large_
  @JSName("$type")
  var $type: select | search
  @JSName("$width")
  var $width: Double
}

object AnonError {
  @scala.inline
  def apply(
    $error: Boolean,
    $isLoading: Boolean,
    $multi: Boolean,
    $required: Boolean,
    $searchable: Boolean,
    $size: mini | default_ | compact | large_,
    $type: select | search,
    $width: Double
  ): AnonError = {
    val __obj = js.Dynamic.literal($error = $error.asInstanceOf[js.Any], $isLoading = $isLoading.asInstanceOf[js.Any], $multi = $multi.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $searchable = $searchable.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], $width = $width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonError]
  }
}

