package typings.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree-web-drop-in", "create")
@js.native
object create extends js.Object {
  def apply(options: Options): js.Promise[Dropin] = js.native
  def apply(
    options: Options,
    callback: js.Function2[/* error */ js.Object | Null, /* dropin */ js.UndefOr[Dropin], Unit]
  ): Unit = js.native
}

