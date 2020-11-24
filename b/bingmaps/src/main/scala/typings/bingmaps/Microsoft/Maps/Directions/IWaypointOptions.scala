package typings.bingmaps.Microsoft.Maps.Directions

import typings.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWaypointOptions extends js.Object {
  
  /** 
    * The address string of the waypoint. For example, the following strings are valid for this parameter: "Seattle", "1 Microsoft Way, Redmond, WA". Either the address or location property must be specified.
    */
  var address: js.UndefOr[String] = js.native
  
  /** 
    * A boolean indicating whether the waypoint is a via point. A via point is a point along the route that is not a stop point. Set this property to
    * true if you just want the route to pass through this location. Default: false
    */
  var isViaPoint: js.UndefOr[Boolean] = js.native
  
  /** The location of the waypoint. Either the address or location property must be specified. */
  var location: js.UndefOr[Location] = js.native
}
object IWaypointOptions {
  
  @scala.inline
  def apply(): IWaypointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWaypointOptions]
  }
  
  @scala.inline
  implicit class IWaypointOptionsOps[Self <: IWaypointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setIsViaPoint(value: Boolean): Self = this.set("isViaPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsViaPoint: Self = this.set("isViaPoint", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
