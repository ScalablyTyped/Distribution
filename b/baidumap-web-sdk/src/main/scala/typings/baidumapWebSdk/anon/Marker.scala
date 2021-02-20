package typings.baidumapWebSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Marker extends StObject {
  
  var marker: typings.baidumapWebSdk.BMap.Marker = js.native
  
  var target: js.Any = js.native
  
  var `type`: String = js.native
}
object Marker {
  
  @scala.inline
  def apply(marker: typings.baidumapWebSdk.BMap.Marker, target: js.Any, `type`: String): Marker = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marker]
  }
  
  @scala.inline
  implicit class MarkerMutableBuilder[Self <: Marker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: typings.baidumapWebSdk.BMap.Marker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
