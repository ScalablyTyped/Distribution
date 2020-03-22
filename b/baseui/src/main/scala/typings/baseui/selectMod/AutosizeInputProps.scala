package typings.baseui.selectMod

import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutosizeInputProps extends js.Object {
  @JSName("$size")
  var $size: js.UndefOr[mini | default_ | compact | large_] = js.native
  var defaultValue: js.UndefOr[String] = js.native
  var inputRef: js.UndefOr[Ref[_]] = js.native
  var overrides: js.UndefOr[AutosizeInputOverrides] = js.native
  var value: js.UndefOr[String] = js.native
}

