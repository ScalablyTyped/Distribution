package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.channeldefDTsMod.Field
import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import typings.vegaLite8ozrbXDH.encodingDTsMod.Encoding
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.facetDDotTsMod.FacetFieldDef
import typings.vegaLite8ozrbXDH.facetDDotTsMod.FacetMapping
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repeaterDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/normalize/repeater.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def replaceRepeaterInEncoding[E /* <: Encoding[Field] */](encoding: E, repeater: RepeaterValue): Encoding[FieldName] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceRepeaterInEncoding")(encoding.asInstanceOf[js.Any], repeater.asInstanceOf[js.Any])).asInstanceOf[Encoding[FieldName]]
  
  inline def replaceRepeaterInFacet(facet: FacetFieldDef[Field, ExprRef | SignalRef], repeater: RepeaterValue): (FacetFieldDef[FieldName, ExprRef | SignalRef]) | (FacetMapping[FieldName, FacetFieldDef[FieldName, ExprRef | SignalRef]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceRepeaterInFacet")(facet.asInstanceOf[js.Any], repeater.asInstanceOf[js.Any])).asInstanceOf[(FacetFieldDef[FieldName, ExprRef | SignalRef]) | (FacetMapping[FieldName, FacetFieldDef[FieldName, ExprRef | SignalRef]])]
  inline def replaceRepeaterInFacet(facet: FacetMapping[Field, FacetFieldDef[Field, ExprRef | SignalRef]], repeater: RepeaterValue): (FacetFieldDef[FieldName, ExprRef | SignalRef]) | (FacetMapping[FieldName, FacetFieldDef[FieldName, ExprRef | SignalRef]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceRepeaterInFacet")(facet.asInstanceOf[js.Any], repeater.asInstanceOf[js.Any])).asInstanceOf[(FacetFieldDef[FieldName, ExprRef | SignalRef]) | (FacetMapping[FieldName, FacetFieldDef[FieldName, ExprRef | SignalRef]])]
  
  trait RepeaterValue extends StObject {
    
    var column: js.UndefOr[String] = js.undefined
    
    var layer: js.UndefOr[String] = js.undefined
    
    var repeat: js.UndefOr[String] = js.undefined
    
    var row: js.UndefOr[String] = js.undefined
  }
  object RepeaterValue {
    
    inline def apply(): RepeaterValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RepeaterValue]
    }
    
    extension [Self <: RepeaterValue](x: Self) {
      
      inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      inline def setRepeat(value: String): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      inline def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
}
