package typings.cesiumEngine.anon

import typings.cesiumEngine.mod.Label
import typings.cesiumEngine.mod.PointPrimitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Billboard extends StObject {
  
  var billboard: typings.cesiumEngine.mod.Billboard
  
  var label: Label
  
  var point: PointPrimitive
}
object Billboard {
  
  inline def apply(billboard: typings.cesiumEngine.mod.Billboard, label: Label, point: PointPrimitive): Billboard = {
    val __obj = js.Dynamic.literal(billboard = billboard.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[Billboard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Billboard] (val x: Self) extends AnyVal {
    
    inline def setBillboard(value: typings.cesiumEngine.mod.Billboard): Self = StObject.set(x, "billboard", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: PointPrimitive): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
