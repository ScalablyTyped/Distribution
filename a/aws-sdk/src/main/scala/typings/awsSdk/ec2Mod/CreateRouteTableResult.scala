package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRouteTableResult extends js.Object {
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
  implicit class CreateRouteTableResultOps[Self <: CreateRouteTableResult] (val x: Self) extends AnyVal {
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
    def setRouteTable(value: RouteTable): Self = this.set("RouteTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteTable: Self = this.set("RouteTable", js.undefined)
  }
  
}

