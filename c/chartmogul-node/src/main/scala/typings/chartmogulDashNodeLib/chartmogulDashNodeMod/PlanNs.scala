package typings
package chartmogulDashNodeLib.chartmogulDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Plan")
@js.native
object PlanNs extends js.Object {
  trait ListPlansParams
    extends chartmogulDashNodeLib.commonMod.CursorParams {
    var data_source_uuid: js.UndefOr[java.lang.String] = js.undefined
    var external_id: js.UndefOr[java.lang.String] = js.undefined
    var system: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Plan extends js.Object {
    var data_source_uuid: js.UndefOr[java.lang.String] = js.undefined
    var external_id: js.UndefOr[java.lang.String] = js.undefined
    var interval_count: js.UndefOr[scala.Double] = js.undefined
    var interval_unit: js.UndefOr[java.lang.String] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var uuid: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Plans
    extends chartmogulDashNodeLib.commonMod.Cursor {
    var plans: js.Array[Plan]
  }
  
  def all(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config): js.Promise[Plans] = js.native
  def all(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, params: ListPlansParams): js.Promise[Plans] = js.native
  def create(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, data: Plan): js.Promise[Plan] = js.native
  def destroy(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, uuid: java.lang.String): js.Promise[js.Object] = js.native
  def modify(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, uuid: java.lang.String, data: Plan): js.Promise[Plan] = js.native
  def retrieve(config: chartmogulDashNodeLib.chartmogulDashNodeMod.Config, uuid: java.lang.String): js.Promise[Plan] = js.native
}

