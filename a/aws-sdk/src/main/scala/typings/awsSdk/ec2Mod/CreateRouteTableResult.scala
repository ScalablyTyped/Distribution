package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRouteTableResult extends StObject {
  
  /**
    * Information about the route table.
    */
  var RouteTable: js.UndefOr[typings.awsSdk.ec2Mod.RouteTable] = js.native
}
object CreateRouteTableResult {
  
  @scala.inline
  def apply(): CreateRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRouteTableResult]
  }
  
  @scala.inline
  implicit class CreateRouteTableResultMutableBuilder[Self <: CreateRouteTableResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRouteTable(value: RouteTable): Self = StObject.set(x, "RouteTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteTableUndefined: Self = StObject.set(x, "RouteTable", js.undefined)
  }
}
