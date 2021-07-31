package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRaycastVehicleOptions extends StObject {
  
  var chassisBody: js.UndefOr[Body] = js.undefined
  
  var indexLeftAxis: js.UndefOr[Double] = js.undefined
  
  var indexRightAxis: js.UndefOr[Double] = js.undefined
  
  var indexUpAxis: js.UndefOr[Double] = js.undefined
}
object IRaycastVehicleOptions {
  
  @scala.inline
  def apply(): IRaycastVehicleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRaycastVehicleOptions]
  }
  
  @scala.inline
  implicit class IRaycastVehicleOptionsMutableBuilder[Self <: IRaycastVehicleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChassisBody(value: Body): Self = StObject.set(x, "chassisBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChassisBodyUndefined: Self = StObject.set(x, "chassisBody", js.undefined)
    
    @scala.inline
    def setIndexLeftAxis(value: Double): Self = StObject.set(x, "indexLeftAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexLeftAxisUndefined: Self = StObject.set(x, "indexLeftAxis", js.undefined)
    
    @scala.inline
    def setIndexRightAxis(value: Double): Self = StObject.set(x, "indexRightAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexRightAxisUndefined: Self = StObject.set(x, "indexRightAxis", js.undefined)
    
    @scala.inline
    def setIndexUpAxis(value: Double): Self = StObject.set(x, "indexUpAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUpAxisUndefined: Self = StObject.set(x, "indexUpAxis", js.undefined)
  }
}
