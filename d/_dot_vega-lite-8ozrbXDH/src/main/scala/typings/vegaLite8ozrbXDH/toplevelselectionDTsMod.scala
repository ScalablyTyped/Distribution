package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.baseDotdDottsMod.NormalizerParams
import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import typings.vegaLite8ozrbXDH.layerDotDTsMod.GenericLayerSpec
import typings.vegaLite8ozrbXDH.mapDTsMod.SpecMapper
import typings.vegaLite8ozrbXDH.specIndexDTsMod.NormalizedSpec
import typings.vegaLite8ozrbXDH.toplevelDTsMod.TopLevel
import typings.vegaLite8ozrbXDH.unitDotDTsMod.NormalizedUnitSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toplevelselectionDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/normalize/toplevelselection.d.ts", "TopLevelSelectionsNormalizer")
  @js.native
  open class TopLevelSelectionsNormalizer ()
    extends SpecMapper[
          NormalizerParams, 
          NormalizedUnitSpec, 
          GenericLayerSpec[NormalizedUnitSpec], 
          NormalizedUnitSpec, 
          scala.Nothing, 
          FieldName
        ] {
    
    def map(spec: TopLevel[NormalizedSpec], normParams: NormalizerParams): TopLevel[NormalizedSpec] = js.native
  }
}
