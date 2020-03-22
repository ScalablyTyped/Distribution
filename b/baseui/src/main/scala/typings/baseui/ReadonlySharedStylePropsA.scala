package typings.baseui

import typings.baseui.baseuiStrings.`inline`
import typings.baseui.baseuiStrings.info
import typings.baseui.baseuiStrings.negative
import typings.baseui.baseuiStrings.positive
import typings.baseui.baseuiStrings.toast
import typings.baseui.baseuiStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<baseui.baseui/toast.SharedStylePropsArg> */
@js.native
trait ReadonlySharedStylePropsA extends js.Object {
  @JSName("$closeable")
  val $closeable: js.UndefOr[Boolean] = js.native
  @JSName("$isRendered")
  val $isRendered: js.UndefOr[Boolean] = js.native
  @JSName("$isVisible")
  val $isVisible: js.UndefOr[Boolean] = js.native
  @JSName("$kind")
  val $kind: js.UndefOr[info | positive | warning | negative] = js.native
  @JSName("$type")
  val $type: js.UndefOr[`inline` | toast] = js.native
}

