package typings.baseui.toastMod

import typings.baseui.baseuiStrings.`inline`
import typings.baseui.baseuiStrings.info
import typings.baseui.baseuiStrings.negative
import typings.baseui.baseuiStrings.positive
import typings.baseui.baseuiStrings.toast
import typings.baseui.baseuiStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedStylePropsArg extends js.Object {
  @JSName("$closeable")
  var $closeable: js.UndefOr[Boolean] = js.native
  @JSName("$isRendered")
  var $isRendered: js.UndefOr[Boolean] = js.native
  @JSName("$isVisible")
  var $isVisible: js.UndefOr[Boolean] = js.native
  @JSName("$kind")
  var $kind: js.UndefOr[info | positive | warning | negative] = js.native
  @JSName("$type")
  var $type: js.UndefOr[`inline` | toast] = js.native
}

