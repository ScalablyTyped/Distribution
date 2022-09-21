package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.baseDotdDottsMod.NormalizerParams
import typings.vegaLite8ozrbXDH.channeldefDTsMod.Field
import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import typings.vegaLite8ozrbXDH.layerDotDTsMod.GenericLayerSpec
import typings.vegaLite8ozrbXDH.layerDotDTsMod.LayerSpec
import typings.vegaLite8ozrbXDH.mapDTsMod.SpecMapper
import typings.vegaLite8ozrbXDH.unitDotDTsMod.FacetedUnitSpec
import typings.vegaLite8ozrbXDH.unitDotDTsMod.UnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectioncompatDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/normalize/selectioncompat.d.ts", "SelectionCompatibilityNormalizer")
  @js.native
  open class SelectionCompatibilityNormalizer ()
    extends SpecMapper[
          NormalizerParams, 
          FacetedUnitSpec[Field], 
          LayerSpec[Field], 
          UnitSpec[Field], 
          scala.Nothing, 
          FieldName
        ] {
    
    def mapLayerOrUnit(spec: LayerSpec[Field], normParams: NormalizerParams): UnitSpec[Field] | GenericLayerSpec[UnitSpec[Field]] = js.native
    def mapLayerOrUnit(spec: FacetedUnitSpec[Field], normParams: NormalizerParams): UnitSpec[Field] | GenericLayerSpec[UnitSpec[Field]] = js.native
    
    def mapUnit(spec: UnitSpec[Field], normParams: NormalizerParams): Any = js.native
  }
}
