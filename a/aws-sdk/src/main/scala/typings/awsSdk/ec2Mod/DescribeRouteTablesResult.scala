package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRouteTablesResult extends js.Object {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about one or more route tables.
    */
  var RouteTables: js.UndefOr[RouteTableList] = js.native
}
object DescribeRouteTablesResult {
  
  @scala.inline
  def apply(): DescribeRouteTablesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRouteTablesResult]
  }
  
  @scala.inline
  implicit class DescribeRouteTablesResultOps[Self <: DescribeRouteTablesResult] (val x: Self) extends AnyVal {
    
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
    def setRouteTablesVarargs(value: RouteTable*): Self = this.set("RouteTables", js.Array(value :_*))
    
    @scala.inline
    def setRouteTables(value: RouteTableList): Self = this.set("RouteTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteTables: Self = this.set("RouteTables", js.undefined)
  }
}
