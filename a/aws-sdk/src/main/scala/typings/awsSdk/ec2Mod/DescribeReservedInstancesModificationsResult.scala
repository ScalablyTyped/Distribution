package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservedInstancesModificationsResult extends js.Object {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The Reserved Instance modification information.
    */
  var ReservedInstancesModifications: js.UndefOr[ReservedInstancesModificationList] = js.native
}
object DescribeReservedInstancesModificationsResult {
  
  @scala.inline
  def apply(): DescribeReservedInstancesModificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesModificationsResult]
  }
  
  @scala.inline
  implicit class DescribeReservedInstancesModificationsResultOps[Self <: DescribeReservedInstancesModificationsResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setReservedInstancesModificationsVarargs(value: ReservedInstancesModification*): Self = this.set("ReservedInstancesModifications", js.Array(value :_*))
    
    @scala.inline
    def setReservedInstancesModifications(value: ReservedInstancesModificationList): Self = this.set("ReservedInstancesModifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedInstancesModifications: Self = this.set("ReservedInstancesModifications", js.undefined)
  }
}
