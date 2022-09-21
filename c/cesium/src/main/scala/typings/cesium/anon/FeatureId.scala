package typings.cesium.anon

import typings.cesium.mod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureId extends StObject {
  
  var featureId: Double
  
  var model: Model
}
object FeatureId {
  
  inline def apply(featureId: Double, model: Model): FeatureId = {
    val __obj = js.Dynamic.literal(featureId = featureId.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureId]
  }
  
  extension [Self <: FeatureId](x: Self) {
    
    inline def setFeatureId(value: Double): Self = StObject.set(x, "featureId", value.asInstanceOf[js.Any])
    
    inline def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
