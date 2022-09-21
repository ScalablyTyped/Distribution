package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.timeunitDotDTsMod.TimeUnitParams
import typings.vegaLite8ozrbXDH.typeDotDTsMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeUnit extends StObject {
  
  var timeUnit: typings.vegaLite8ozrbXDH.timeunitDotDTsMod.TimeUnit | TimeUnitParams
  
  var `type`: js.UndefOr[Type] = js.undefined
  
  var undefinedIfExprNotRequired: js.UndefOr[Boolean] = js.undefined
  
  var wrapTime: js.UndefOr[Boolean] = js.undefined
}
object TimeUnit {
  
  inline def apply(timeUnit: typings.vegaLite8ozrbXDH.timeunitDotDTsMod.TimeUnit | TimeUnitParams): TimeUnit = {
    val __obj = js.Dynamic.literal(timeUnit = timeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeUnit]
  }
  
  extension [Self <: TimeUnit](x: Self) {
    
    inline def setTimeUnit(value: typings.vegaLite8ozrbXDH.timeunitDotDTsMod.TimeUnit | TimeUnitParams): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUndefinedIfExprNotRequired(value: Boolean): Self = StObject.set(x, "undefinedIfExprNotRequired", value.asInstanceOf[js.Any])
    
    inline def setUndefinedIfExprNotRequiredUndefined: Self = StObject.set(x, "undefinedIfExprNotRequired", js.undefined)
    
    inline def setWrapTime(value: Boolean): Self = StObject.set(x, "wrapTime", value.asInstanceOf[js.Any])
    
    inline def setWrapTimeUndefined: Self = StObject.set(x, "wrapTime", js.undefined)
  }
}
