package typings.atBlueprintjsCore.libEsmCommonUtilsMod

import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/common/utils", "throttleReactEventCallback")
@js.native
object throttleReactEventCallback extends js.Object {
  def apply(callback: js.Function2[/* event */ SyntheticEvent[_, Event], /* repeated */ js.Any, _]): js.Function1[/* event2 */ SyntheticEvent[_, Event], Unit] = js.native
  def apply(
    callback: js.Function2[/* event */ SyntheticEvent[_, Event], /* repeated */ js.Any, _],
    options: IThrottledReactEventOptions
  ): js.Function1[/* event2 */ SyntheticEvent[_, Event], Unit] = js.native
}

