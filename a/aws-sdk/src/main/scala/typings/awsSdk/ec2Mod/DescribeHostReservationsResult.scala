package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeHostReservationsResult extends js.Object {
  
  /**
    * Details about the reservation's configuration.
    */
  var HostReservationSet: js.UndefOr[typings.awsSdk.ec2Mod.HostReservationSet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeHostReservationsResult {
  
  @scala.inline
  def apply(): DescribeHostReservationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHostReservationsResult]
  }
  
  @scala.inline
  implicit class DescribeHostReservationsResultOps[Self <: DescribeHostReservationsResult] (val x: Self) extends AnyVal {
    
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
    def setHostReservationSetVarargs(value: HostReservation*): Self = this.set("HostReservationSet", js.Array(value :_*))
    
    @scala.inline
    def setHostReservationSet(value: HostReservationSet): Self = this.set("HostReservationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostReservationSet: Self = this.set("HostReservationSet", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
