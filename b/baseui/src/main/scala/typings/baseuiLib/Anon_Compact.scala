package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compact extends js.Object {
  @JSName("$error")
  var $error: scala.Boolean
  @JSName("$isLoading")
  var $isLoading: scala.Boolean
  @JSName("$multi")
  var $multi: scala.Boolean
  @JSName("$required")
  var $required: scala.Boolean
  @JSName("$searchable")
  var $searchable: scala.Boolean
  @JSName("$size")
  var $size: baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.large
  @JSName("$type")
  var $type: baseuiLib.baseuiLibStrings.select | baseuiLib.baseuiLibStrings.search
  @JSName("$width")
  var $width: scala.Double
}

object Anon_Compact {
  @scala.inline
  def apply(
    $error: scala.Boolean,
    $isLoading: scala.Boolean,
    $multi: scala.Boolean,
    $required: scala.Boolean,
    $searchable: scala.Boolean,
    $size: baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.large,
    $type: baseuiLib.baseuiLibStrings.select | baseuiLib.baseuiLibStrings.search,
    $width: scala.Double
  ): Anon_Compact = {
    val __obj = js.Dynamic.literal($error = $error, $isLoading = $isLoading, $multi = $multi, $required = $required, $searchable = $searchable, $size = $size.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], $width = $width)
  
    __obj.asInstanceOf[Anon_Compact]
  }
}

