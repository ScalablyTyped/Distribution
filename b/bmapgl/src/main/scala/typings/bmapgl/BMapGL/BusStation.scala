package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusStation extends StObject {
  
  var name: String
  
  var position: Point
}
object BusStation {
  
  @scala.inline
  def apply(name: String, position: Point): BusStation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusStation]
  }
  
  @scala.inline
  implicit class BusStationMutableBuilder[Self <: BusStation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
