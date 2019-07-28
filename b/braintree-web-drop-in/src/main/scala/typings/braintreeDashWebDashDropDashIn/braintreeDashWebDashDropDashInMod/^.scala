package typings.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree-web-drop-in", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create(options: Options): js.Promise[Dropin] = js.native
  def create(
    options: Options,
    callback: js.Function2[/* error */ js.Object | Null, /* dropin */ js.UndefOr[Dropin], Unit]
  ): Unit = js.native
}

