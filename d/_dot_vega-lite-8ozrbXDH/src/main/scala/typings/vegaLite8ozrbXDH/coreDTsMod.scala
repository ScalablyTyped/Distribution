package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.baseDotdDottsMod.NormalizerParams
import typings.vegaLite8ozrbXDH.channeldefDTsMod.Field
import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import typings.vegaLite8ozrbXDH.layerDotDTsMod.LayerSpec
import typings.vegaLite8ozrbXDH.layerDotDTsMod.NormalizedLayerSpec
import typings.vegaLite8ozrbXDH.mapDTsMod.SpecMapper
import typings.vegaLite8ozrbXDH.unitDotDTsMod.FacetedUnitSpec
import typings.vegaLite8ozrbXDH.unitDotDTsMod.NormalizedUnitSpec
import typings.vegaLite8ozrbXDH.unitDotDTsMod.UnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/normalize/core.d.ts", "CoreNormalizer")
  @js.native
  open class CoreNormalizer ()
    extends SpecMapper[
          NormalizerParams, 
          FacetedUnitSpec[Field], 
          LayerSpec[Field], 
          NormalizedUnitSpec, 
          scala.Nothing, 
          FieldName
        ] {
    
    /* private */ var getFacetMappingAndLayout: Any = js.native
    
    /* private */ var mapFacetedUnit: Any = js.native
    
    /* private */ var mapLayerRepeat: Any = js.native
    
    /* private */ var mapNonLayerRepeat: Any = js.native
    
    def mapUnit(spec: UnitSpec[Field], params: NormalizerParams): NormalizedUnitSpec | NormalizedLayerSpec = js.native
    
    /* private */ var mapUnitWithParentEncodingOrProjection: Any = js.native
    
    /* private */ var nonFacetUnitNormalizers: Any = js.native
  }
}
