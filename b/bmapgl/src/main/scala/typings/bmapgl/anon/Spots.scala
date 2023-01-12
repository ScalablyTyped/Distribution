package typings.bmapgl.anon

import typings.bmapgl.BMapGL.HotspotOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spots extends StObject {
  
  var spots: HotspotOptions
  
  var target: Any
  
  var `type`: String
}
object Spots {
  
  inline def apply(spots: HotspotOptions, target: Any, `type`: String): Spots = {
    val __obj = js.Dynamic.literal(spots = spots.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Spots] (val x: Self) extends AnyVal {
    
    inline def setSpots(value: HotspotOptions): Self = StObject.set(x, "spots", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
