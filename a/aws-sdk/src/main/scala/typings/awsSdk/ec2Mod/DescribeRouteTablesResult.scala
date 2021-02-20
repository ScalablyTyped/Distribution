package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRouteTablesResult extends StObject {
  
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
  implicit class DescribeRouteTablesResultMutableBuilder[Self <: DescribeRouteTablesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRouteTables(value: RouteTableList): Self = StObject.set(x, "RouteTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteTablesUndefined: Self = StObject.set(x, "RouteTables", js.undefined)
    
    @scala.inline
    def setRouteTablesVarargs(value: RouteTable*): Self = StObject.set(x, "RouteTables", js.Array(value :_*))
  }
}
