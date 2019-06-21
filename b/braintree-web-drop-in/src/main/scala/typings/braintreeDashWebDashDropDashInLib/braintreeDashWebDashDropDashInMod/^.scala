package typings
package braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("braintree-web-drop-in", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create(options: Options): js.Promise[Dropin] = js.native
  def create(
    options: Options,
    callback: js.Function2[/* error */ js.Object | scala.Null, /* dropin */ js.UndefOr[Dropin], scala.Unit]
  ): scala.Unit = js.native
}

