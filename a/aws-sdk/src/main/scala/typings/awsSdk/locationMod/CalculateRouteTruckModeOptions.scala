package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculateRouteTruckModeOptions extends StObject {
  
  /**
    * Avoids ferries when calculating routes. Default Value: false  Valid Values: false | true 
    */
  var AvoidFerries: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Avoids tolls when calculating routes. Default Value: false  Valid Values: false | true 
    */
  var AvoidTolls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the truck's dimension specifications including length, height, width, and unit of measurement. Used to avoid roads that can't support the truck's dimensions.
    */
  var Dimensions: js.UndefOr[TruckDimensions] = js.undefined
  
  /**
    * Specifies the truck's weight specifications including total weight and unit of measurement. Used to avoid roads that can't support the truck's weight.
    */
  var Weight: js.UndefOr[TruckWeight] = js.undefined
}
object CalculateRouteTruckModeOptions {
  
  inline def apply(): CalculateRouteTruckModeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculateRouteTruckModeOptions]
  }
  
  extension [Self <: CalculateRouteTruckModeOptions](x: Self) {
    
    inline def setAvoidFerries(value: Boolean): Self = StObject.set(x, "AvoidFerries", value.asInstanceOf[js.Any])
    
    inline def setAvoidFerriesUndefined: Self = StObject.set(x, "AvoidFerries", js.undefined)
    
    inline def setAvoidTolls(value: Boolean): Self = StObject.set(x, "AvoidTolls", value.asInstanceOf[js.Any])
    
    inline def setAvoidTollsUndefined: Self = StObject.set(x, "AvoidTolls", js.undefined)
    
    inline def setDimensions(value: TruckDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setWeight(value: TruckWeight): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "Weight", js.undefined)
  }
}
