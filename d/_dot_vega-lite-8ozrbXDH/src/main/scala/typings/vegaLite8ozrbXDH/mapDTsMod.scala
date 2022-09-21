package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.channeldefDTsMod.Field
import typings.vegaLite8ozrbXDH.concatDotDTsMod.GenericConcatSpec
import typings.vegaLite8ozrbXDH.concatDotDTsMod.GenericHConcatSpec
import typings.vegaLite8ozrbXDH.concatDotDTsMod.GenericVConcatSpec
import typings.vegaLite8ozrbXDH.facetDDotTsMod.GenericFacetSpec
import typings.vegaLite8ozrbXDH.layerDotDTsMod.GenericLayerSpec
import typings.vegaLite8ozrbXDH.repeatDTsMod.RepeatSpec
import typings.vegaLite8ozrbXDH.specIndexDTsMod.GenericSpec
import typings.vegaLite8ozrbXDH.unitDotDTsMod.GenericUnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/spec/map.d.ts", "SpecMapper")
  @js.native
  abstract class SpecMapper[P, UI /* <: GenericUnitSpec[Any, Any] */, LI /* <: GenericLayerSpec[Any] */, UO /* <: GenericUnitSpec[Any, Any] */, RO /* <: RepeatSpec */, FO /* <: Field */] () extends StObject {
    
    def map(spec: GenericSpec[UI, LI, RepeatSpec, Field], params: P): GenericSpec[UO, GenericLayerSpec[UO], RO, FO] = js.native
    
    /* protected */ def mapConcat(spec: GenericConcatSpec[GenericSpec[UI, LI, RepeatSpec, Field]], params: P): GenericConcatSpec[GenericSpec[UO, GenericLayerSpec[UO], RO, FO]] = js.native
    
    /* protected */ def mapFacet(spec: GenericFacetSpec[UI, LI, Field], params: P): GenericFacetSpec[UO, GenericLayerSpec[UO], FO] = js.native
    
    /* protected */ def mapHConcat(spec: GenericHConcatSpec[GenericSpec[UI, LI, RepeatSpec, Field]], params: P): GenericHConcatSpec[GenericSpec[UO, GenericLayerSpec[UO], RO, FO]] = js.native
    
    /* protected */ def mapLayer(spec: LI, params: P): GenericLayerSpec[UO] = js.native
    
    def mapLayerOrUnit(spec: LI | UI, params: P): UO | GenericLayerSpec[UO] = js.native
    
    /* protected */ def mapRepeat(spec: RepeatSpec, params: P): GenericSpec[UO, Any, RO, FO] = js.native
    
    def mapUnit(spec: UI, params: P): UO | GenericLayerSpec[UO] = js.native
    
    /* protected */ def mapVConcat(spec: GenericVConcatSpec[GenericSpec[UI, LI, RepeatSpec, Field]], params: P): GenericVConcatSpec[GenericSpec[UO, GenericLayerSpec[UO], RO, FO]] = js.native
  }
}
