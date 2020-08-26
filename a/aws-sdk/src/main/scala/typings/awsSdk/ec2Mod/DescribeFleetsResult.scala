package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFleetsResult extends js.Object {
  /**
    * Information about the EC2 Fleets.
    */
  var Fleets: js.UndefOr[FleetSet] = js.native
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeFleetsResult {
  @scala.inline
  def apply(): DescribeFleetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetsResult]
  }
  @scala.inline
  implicit class DescribeFleetsResultOps[Self <: DescribeFleetsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFleetsVarargs(value: FleetData*): Self = this.set("Fleets", js.Array(value :_*))
    @scala.inline
    def setFleets(value: FleetSet): Self = this.set("Fleets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFleets: Self = this.set("Fleets", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

