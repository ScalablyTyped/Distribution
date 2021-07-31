package typings.ckeditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Weight extends StObject {
  
  var weight: js.UndefOr[Double] = js.undefined
}
object Weight {
  
  @scala.inline
  def apply(): Weight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Weight]
  }
  
  @scala.inline
  implicit class WeightMutableBuilder[Self <: Weight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
