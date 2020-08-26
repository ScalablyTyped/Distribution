package typings.baseui.anon

import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.search
import typings.baseui.baseuiStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clearable extends js.Object {
  @JSName("$clearable")
  var $clearable: Boolean = js.native
  @JSName("$creatable")
  var $creatable: Boolean = js.native
  @JSName("$disabled")
  var $disabled: Boolean = js.native
  @JSName("$error")
  var $error: Boolean = js.native
  @JSName("$isFocused")
  var $isFocused: Boolean = js.native
  @JSName("$isLoading")
  var $isLoading: Boolean = js.native
  @JSName("$isOpen")
  var $isOpen: Boolean = js.native
  @JSName("$isPseudoFocused")
  var $isPseudoFocused: Boolean = js.native
  @JSName("$multi")
  var $multi: Boolean = js.native
  @JSName("$positive")
  var $positive: Boolean = js.native
  @JSName("$required")
  var $required: Boolean = js.native
  @JSName("$searchable")
  var $searchable: Boolean = js.native
  @JSName("$size")
  var $size: mini | default_ | compact | large_ = js.native
  @JSName("$type")
  var $type: select | search = js.native
}

object Clearable {
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
  ): Clearable = {
    val __obj = js.Dynamic.literal($clearable = $clearable.asInstanceOf[js.Any], $creatable = $creatable.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $error = $error.asInstanceOf[js.Any], $isFocused = $isFocused.asInstanceOf[js.Any], $isLoading = $isLoading.asInstanceOf[js.Any], $isOpen = $isOpen.asInstanceOf[js.Any], $isPseudoFocused = $isPseudoFocused.asInstanceOf[js.Any], $multi = $multi.asInstanceOf[js.Any], $positive = $positive.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $searchable = $searchable.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clearable]
  }
  @scala.inline
  implicit class ClearableOps[Self <: Clearable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$clearable(value: Boolean): Self = this.set("$clearable", value.asInstanceOf[js.Any])
    @scala.inline
    def set$creatable(value: Boolean): Self = this.set("$creatable", value.asInstanceOf[js.Any])
    @scala.inline
    def set$disabled(value: Boolean): Self = this.set("$disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def set$error(value: Boolean): Self = this.set("$error", value.asInstanceOf[js.Any])
    @scala.inline
    def set$isFocused(value: Boolean): Self = this.set("$isFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def set$isLoading(value: Boolean): Self = this.set("$isLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def set$isOpen(value: Boolean): Self = this.set("$isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def set$isPseudoFocused(value: Boolean): Self = this.set("$isPseudoFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def set$multi(value: Boolean): Self = this.set("$multi", value.asInstanceOf[js.Any])
    @scala.inline
    def set$positive(value: Boolean): Self = this.set("$positive", value.asInstanceOf[js.Any])
    @scala.inline
    def set$required(value: Boolean): Self = this.set("$required", value.asInstanceOf[js.Any])
    @scala.inline
    def set$searchable(value: Boolean): Self = this.set("$searchable", value.asInstanceOf[js.Any])
    @scala.inline
    def set$size(value: mini | default_ | compact | large_): Self = this.set("$size", value.asInstanceOf[js.Any])
    @scala.inline
    def set$type(value: select | search): Self = this.set("$type", value.asInstanceOf[js.Any])
  }
  
}

