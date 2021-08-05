package typings.ckeditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Weight extends StObject {
  
  var weight: js.UndefOr[Double] = js.undefined
}
object Weight {
  
  inline def apply(): Weight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Weight]
  }
  
  extension [Self <: Weight](x: Self) {
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
