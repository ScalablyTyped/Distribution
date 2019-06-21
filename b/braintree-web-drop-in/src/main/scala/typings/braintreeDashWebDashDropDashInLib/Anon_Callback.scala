package typings
package braintreeDashWebDashDropDashInLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  def create(options: braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInMod.Options): js.Promise[braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInMod.Dropin] = js.native
  def create(
    options: braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInMod.Options,
    callback: js.Function2[
      /* error */ js.Object | scala.Null, 
      /* dropin */ js.UndefOr[braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInMod.Dropin], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

