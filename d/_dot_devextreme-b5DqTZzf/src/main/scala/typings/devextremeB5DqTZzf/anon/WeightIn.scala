package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeightIn extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var weightIn: js.UndefOr[Double] = js.undefined
  
  var weightOut: js.UndefOr[Double] = js.undefined
}
object WeightIn {
  
  inline def apply(): WeightIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeightIn]
  }
  
  extension [Self <: WeightIn](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWeightIn(value: Double): Self = StObject.set(x, "weightIn", value.asInstanceOf[js.Any])
    
    inline def setWeightInUndefined: Self = StObject.set(x, "weightIn", js.undefined)
    
    inline def setWeightOut(value: Double): Self = StObject.set(x, "weightOut", value.asInstanceOf[js.Any])
    
    inline def setWeightOutUndefined: Self = StObject.set(x, "weightOut", js.undefined)
  }
}
