package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.baseDotdDottsMod.ExtraNormalizer
import typings.vegaLite8ozrbXDH.baseDotdDottsMod.Normalize
import typings.vegaLite8ozrbXDH.baseDotdDottsMod.NormalizerParams
import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.encodingDTsMod.Encoding
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.layerDotDTsMod.GenericLayerSpec
import typings.vegaLite8ozrbXDH.layerDotDTsMod.NormalizedLayerSpec
import typings.vegaLite8ozrbXDH.markDotDTsMod.GenericMarkDef
import typings.vegaLite8ozrbXDH.specIndexDTsMod.GenericSpec
import typings.vegaLite8ozrbXDH.unitDotDTsMod.GenericUnitSpec
import typings.vegaLite8ozrbXDH.unitDotDTsMod.NormalizedUnitSpec
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseDDotTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compositemark/base.d.ts", "CompositeMarkNormalizer")
  @js.native
  open class CompositeMarkNormalizer[M /* <: String */] protected ()
    extends StObject
       with ExtraNormalizer[
          CompositeMarkUnitSpec[M], 
          NormalizedUnitSpec | NormalizedLayerSpec, 
          (GenericUnitSpec[Any, Any]) | GenericLayerSpec[Any]
        ] {
    def this(
      name: String,
      run: js.Function3[
            /* spec */ CompositeMarkUnitSpec[M], 
            /* params */ NormalizerParams, 
            /* normalize */ Normalize[
              (GenericUnitSpec[Encoding[FieldName], M]) | GenericLayerSpec[Any], 
              NormalizedLayerSpec | NormalizedUnitSpec
            ], 
            NormalizedLayerSpec | NormalizedUnitSpec
          ]
    ) = this()
    
    def hasMatchingType(spec: GenericSpec[Any, Any, Any, Any]): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/compositemark/base.d.ts.CompositeMarkUnitSpec<M> */ Boolean = js.native
    /* CompleteClass */
    override def hasMatchingType(spec: GenericSpec[Any, Any, Any, Any], config: Config[ExprRef | SignalRef]): /* is S */ Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def run(
      spec: CompositeMarkUnitSpec[M],
      params: NormalizerParams,
      normalize: Normalize[
          (GenericUnitSpec[Any, Any]) | GenericLayerSpec[Any], 
          NormalizedUnitSpec | NormalizedLayerSpec
        ]
    ): NormalizedUnitSpec | NormalizedLayerSpec = js.native
  }
  
  type CompositeMarkUnitSpec[M /* <: String */] = GenericUnitSpec[Any, M | GenericMarkDef[M]]
}
