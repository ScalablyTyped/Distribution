package typings.bingmaps.Microsoft.Maps.Directions

import typings.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRouteSubLeg extends js.Object {
  
  /** The location of the last waypoint of the sub leg. */
  var actualEnd: Location = js.native
  
  /** The location of the first waypoint of the sub leg. */
  var actualStart: Location = js.native
  
  /** The description of the last waypoint of the sub leg. */
  var endDescription: String = js.native
  
  /** The description of the first waypoint of the sub leg. */
  var startDescription: String = js.native
}
object IRouteSubLeg {
  
  @scala.inline
  def apply(actualEnd: Location, actualStart: Location, endDescription: String, startDescription: String): IRouteSubLeg = {
    val __obj = js.Dynamic.literal(actualEnd = actualEnd.asInstanceOf[js.Any], actualStart = actualStart.asInstanceOf[js.Any], endDescription = endDescription.asInstanceOf[js.Any], startDescription = startDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouteSubLeg]
  }
  
  @scala.inline
  implicit class IRouteSubLegOps[Self <: IRouteSubLeg] (val x: Self) extends AnyVal {
    
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
    def setActualEnd(value: Location): Self = this.set("actualEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualStart(value: Location): Self = this.set("actualStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDescription(value: String): Self = this.set("endDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDescription(value: String): Self = this.set("startDescription", value.asInstanceOf[js.Any])
  }
}
