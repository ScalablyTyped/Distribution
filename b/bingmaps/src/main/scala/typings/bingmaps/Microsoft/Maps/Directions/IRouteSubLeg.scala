package typings.bingmaps.Microsoft.Maps.Directions

import typings.bingmaps.Microsoft.Maps.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRouteSubLeg extends StObject {
  
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
  implicit class IRouteSubLegMutableBuilder[Self <: IRouteSubLeg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualEnd(value: Location): Self = StObject.set(x, "actualEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualStart(value: Location): Self = StObject.set(x, "actualStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDescription(value: String): Self = StObject.set(x, "endDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDescription(value: String): Self = StObject.set(x, "startDescription", value.asInstanceOf[js.Any])
  }
}
