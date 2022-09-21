package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.channeldefDTsMod.StringFieldDef
import typings.vegaLite8ozrbXDH.channeldefDTsMod.StringFieldDefWithCondition
import typings.vegaLite8ozrbXDH.channeldefDTsMod.StringValueDefWithCondition
import typings.vegaLite8ozrbXDH.typeDotDTsMod.StandardType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTooltipWithoutAggregatedField[F /* <: typings.vegaLite8ozrbXDH.channeldefDTsMod.Field */] extends StObject {
  
  var customTooltipWithoutAggregatedField: js.UndefOr[
    StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]]
  ] = js.undefined
  
  var filteredEncoding: typings.vegaLite8ozrbXDH.encodingDTsMod.Encoding[F]
}
object CustomTooltipWithoutAggregatedField {
  
  inline def apply[F /* <: typings.vegaLite8ozrbXDH.channeldefDTsMod.Field */](filteredEncoding: typings.vegaLite8ozrbXDH.encodingDTsMod.Encoding[F]): CustomTooltipWithoutAggregatedField[F] = {
    val __obj = js.Dynamic.literal(filteredEncoding = filteredEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTooltipWithoutAggregatedField[F]]
  }
  
  extension [Self <: CustomTooltipWithoutAggregatedField[?], F /* <: typings.vegaLite8ozrbXDH.channeldefDTsMod.Field */](x: Self & CustomTooltipWithoutAggregatedField[F]) {
    
    inline def setCustomTooltipWithoutAggregatedField(
      value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]]
    ): Self = StObject.set(x, "customTooltipWithoutAggregatedField", value.asInstanceOf[js.Any])
    
    inline def setCustomTooltipWithoutAggregatedFieldUndefined: Self = StObject.set(x, "customTooltipWithoutAggregatedField", js.undefined)
    
    inline def setCustomTooltipWithoutAggregatedFieldVarargs(value: StringFieldDef[F]*): Self = StObject.set(x, "customTooltipWithoutAggregatedField", js.Array(value*))
    
    inline def setFilteredEncoding(value: typings.vegaLite8ozrbXDH.encodingDTsMod.Encoding[F]): Self = StObject.set(x, "filteredEncoding", value.asInstanceOf[js.Any])
  }
}
