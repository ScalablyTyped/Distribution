package typings.chartmogulDashNode.chartmogulDashNodeMod

import typings.chartmogulDashNode.chartmogulDashNodeMod.PlanNs.ListPlansParams
import typings.chartmogulDashNode.chartmogulDashNodeMod.PlanNs.Plan
import typings.chartmogulDashNode.chartmogulDashNodeMod.PlanNs.Plans
import typings.chartmogulDashNode.commonMod.Cursor
import typings.chartmogulDashNode.commonMod.CursorParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chartmogul-node", "Plan")
@js.native
object PlanNs extends js.Object {
  trait ListPlansParams extends CursorParams {
    var data_source_uuid: js.UndefOr[String] = js.undefined
    var external_id: js.UndefOr[String] = js.undefined
    var system: js.UndefOr[String] = js.undefined
  }
  
  trait Plan extends js.Object {
    var data_source_uuid: js.UndefOr[String] = js.undefined
    var external_id: js.UndefOr[String] = js.undefined
    var interval_count: js.UndefOr[Double] = js.undefined
    var interval_unit: js.UndefOr[String] = js.undefined
    var name: js.UndefOr[String] = js.undefined
    var uuid: js.UndefOr[String] = js.undefined
  }
  
  trait Plans extends Cursor {
    var plans: js.Array[Plan]
  }
  
  def all(config: Config): js.Promise[Plans] = js.native
  def all(config: Config, params: ListPlansParams): js.Promise[Plans] = js.native
  def create(config: Config, data: Plan): js.Promise[Plan] = js.native
  def destroy(config: Config, uuid: String): js.Promise[js.Object] = js.native
  def modify(config: Config, uuid: String, data: Plan): js.Promise[Plan] = js.native
  def retrieve(config: Config, uuid: String): js.Promise[Plan] = js.native
}

