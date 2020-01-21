package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseKpiResult extends js.Object {
  /**
    * An array of objects that provides the results of a query that retrieved the data for a standard metric that applies to an application, campaign, or journey.
    */
  var Rows: ListOfResultRow = js.native
}

object BaseKpiResult {
  @scala.inline
  def apply(Rows: ListOfResultRow): BaseKpiResult = {
    val __obj = js.Dynamic.literal(Rows = Rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseKpiResult]
  }
}

