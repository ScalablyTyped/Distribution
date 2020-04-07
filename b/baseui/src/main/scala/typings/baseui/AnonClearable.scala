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

trait AnonClearable extends js.Object {
  @JSName("$clearable")
  var $clearable: Boolean
  @JSName("$creatable")
  var $creatable: Boolean
  @JSName("$disabled")
  var $disabled: Boolean
  @JSName("$error")
  var $error: Boolean
  @JSName("$isFocused")
  var $isFocused: Boolean
  @JSName("$isLoading")
  var $isLoading: Boolean
  @JSName("$isOpen")
  var $isOpen: Boolean
  @JSName("$isPseudoFocused")
  var $isPseudoFocused: Boolean
  @JSName("$multi")
  var $multi: Boolean
  @JSName("$positive")
  var $positive: Boolean
  @JSName("$required")
  var $required: Boolean
  @JSName("$searchable")
  var $searchable: Boolean
  @JSName("$size")
  var $size: mini | default_ | compact | large_
  @JSName("$type")
  var $type: select | search
}

object AnonClearable {
  @scala.inline
  def apply(
    $clearable: Boolean,
    $creatable: Boolean,
    $disabled: Boolean,
    $error: Boolean,
    $isFocused: Boolean,
    $isLoading: Boolean,
    $isOpen: Boolean,
    $isPseudoFocused: Boolean,
    $multi: Boolean,
    $positive: Boolean,
    $required: Boolean,
    $searchable: Boolean,
    $size: mini | default_ | compact | large_,
    $type: select | search
  ): AnonClearable = {
    val __obj = js.Dynamic.literal($clearable = $clearable.asInstanceOf[js.Any], $creatable = $creatable.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $error = $error.asInstanceOf[js.Any], $isFocused = $isFocused.asInstanceOf[js.Any], $isLoading = $isLoading.asInstanceOf[js.Any], $isOpen = $isOpen.asInstanceOf[js.Any], $isPseudoFocused = $isPseudoFocused.asInstanceOf[js.Any], $multi = $multi.asInstanceOf[js.Any], $positive = $positive.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $searchable = $searchable.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonClearable]
  }
}

