package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clearable extends js.Object {
  @JSName("$clearable")
  var $clearable: scala.Boolean
  @JSName("$creatable")
  var $creatable: scala.Boolean
  @JSName("$disabled")
  var $disabled: scala.Boolean
  @JSName("$error")
  var $error: scala.Boolean
  @JSName("$isFocused")
  var $isFocused: scala.Boolean
  @JSName("$isLoading")
  var $isLoading: scala.Boolean
  @JSName("$isOpen")
  var $isOpen: scala.Boolean
  @JSName("$isPseudoFocused")
  var $isPseudoFocused: scala.Boolean
  @JSName("$multi")
  var $multi: scala.Boolean
  @JSName("$positive")
  var $positive: scala.Boolean
  @JSName("$required")
  var $required: scala.Boolean
  @JSName("$searchable")
  var $searchable: scala.Boolean
  @JSName("$size")
  var $size: baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.large
  @JSName("$type")
  var $type: baseuiLib.baseuiLibStrings.select | baseuiLib.baseuiLibStrings.search
}

object Anon_Clearable {
  @scala.inline
  def apply(
    $clearable: scala.Boolean,
    $creatable: scala.Boolean,
    $disabled: scala.Boolean,
    $error: scala.Boolean,
    $isFocused: scala.Boolean,
    $isLoading: scala.Boolean,
    $isOpen: scala.Boolean,
    $isPseudoFocused: scala.Boolean,
    $multi: scala.Boolean,
    $positive: scala.Boolean,
    $required: scala.Boolean,
    $searchable: scala.Boolean,
    $size: baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.large,
    $type: baseuiLib.baseuiLibStrings.select | baseuiLib.baseuiLibStrings.search
  ): Anon_Clearable = {
    val __obj = js.Dynamic.literal($clearable = $clearable, $creatable = $creatable, $disabled = $disabled, $error = $error, $isFocused = $isFocused, $isLoading = $isLoading, $isOpen = $isOpen, $isPseudoFocused = $isPseudoFocused, $multi = $multi, $positive = $positive, $required = $required, $searchable = $searchable, $size = $size.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Clearable]
  }
}

