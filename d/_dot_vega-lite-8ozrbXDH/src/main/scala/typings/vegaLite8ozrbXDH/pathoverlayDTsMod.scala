package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.baseDotdDottsMod.ExtraNormalizer
import typings.vegaLite8ozrbXDH.baseDotdDottsMod.Normalize
import typings.vegaLite8ozrbXDH.baseDotdDottsMod.NormalizerParams
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.encodingDTsMod.Encoding
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.layerDotDTsMod.GenericLayerSpec
import typings.vegaLite8ozrbXDH.layerDotDTsMod.NormalizedLayerSpec
import typings.vegaLite8ozrbXDH.markDotDTsMod.Mark
import typings.vegaLite8ozrbXDH.markDotDTsMod.MarkDef
import typings.vegaLite8ozrbXDH.specIndexDTsMod.GenericSpec
import typings.vegaLite8ozrbXDH.unitDotDTsMod.GenericUnitSpec
import typings.vegaLite8ozrbXDH.unitDotDTsMod.NormalizedUnitSpec
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.area
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.line
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.rule
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.trail
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathoverlayDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/normalize/pathoverlay.d.ts", "PathOverlayNormalizer")
  @js.native
  open class PathOverlayNormalizer ()
    extends StObject
       with ExtraNormalizer[
          UnitSpecWithPathOverlay, 
          NormalizedUnitSpec | NormalizedLayerSpec, 
          (GenericUnitSpec[Any, Any]) | GenericLayerSpec[Any]
        ] {
    
    /* CompleteClass */
    override def hasMatchingType(spec: GenericSpec[Any, Any, Any, Any], config: Config[ExprRef | SignalRef]): /* is S */ Boolean = js.native
    def hasMatchingType(
      spec: GenericUnitSpec[Any, Mark | (MarkDef[Mark, ExprRef | SignalRef])],
      config: Config[ExprRef | SignalRef]
    ): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/normalize/pathoverlay.d.ts.UnitSpecWithPathOverlay */ Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def run(
      spec: UnitSpecWithPathOverlay,
      params: NormalizerParams,
      normalize: Normalize[
          (GenericUnitSpec[Any, Any]) | GenericLayerSpec[Any], 
          NormalizedUnitSpec | NormalizedLayerSpec
        ]
    ): NormalizedUnitSpec | NormalizedLayerSpec = js.native
  }
  
  type UnitSpecWithPathOverlay = GenericUnitSpec[
    Encoding[String], 
    Mark | (MarkDef[line | area | rule | trail, ExprRef | SignalRef])
  ]
}
