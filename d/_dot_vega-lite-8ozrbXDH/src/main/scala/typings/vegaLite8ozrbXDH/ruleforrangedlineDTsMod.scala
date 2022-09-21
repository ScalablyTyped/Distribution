package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.Mark
import typings.vegaLite8ozrbXDH.baseDotdDottsMod.ExtraNormalizer
import typings.vegaLite8ozrbXDH.baseDotdDottsMod.Normalize
import typings.vegaLite8ozrbXDH.baseDotdDottsMod.NormalizerParams
import typings.vegaLite8ozrbXDH.channeldefDTsMod.Field
import typings.vegaLite8ozrbXDH.channeldefDTsMod.Position2Def
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.encodingDTsMod.Encoding
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.layerDotDTsMod.GenericLayerSpec
import typings.vegaLite8ozrbXDH.layerDotDTsMod.NormalizedLayerSpec
import typings.vegaLite8ozrbXDH.specIndexDTsMod.GenericSpec
import typings.vegaLite8ozrbXDH.unitDotDTsMod.GenericUnitSpec
import typings.vegaLite8ozrbXDH.unitDotDTsMod.NormalizedUnitSpec
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.line
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ruleforrangedlineDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/normalize/ruleforrangedline.d.ts", "RuleForRangedLineNormalizer")
  @js.native
  open class RuleForRangedLineNormalizer ()
    extends StObject
       with ExtraNormalizer[
          RangedLineSpec, 
          NormalizedUnitSpec | NormalizedLayerSpec, 
          (GenericUnitSpec[Any, Any]) | GenericLayerSpec[Any]
        ] {
    
    def hasMatchingType(spec: GenericSpec[Any, Any, Any, Any]): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/normalize/ruleforrangedline.d.ts.RangedLineSpec */ Boolean = js.native
    /* CompleteClass */
    override def hasMatchingType(spec: GenericSpec[Any, Any, Any, Any], config: Config[ExprRef | SignalRef]): /* is S */ Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def run(
      spec: RangedLineSpec,
      params: NormalizerParams,
      normalize: Normalize[
          (GenericUnitSpec[Any, Any]) | GenericLayerSpec[Any], 
          NormalizedUnitSpec | NormalizedLayerSpec
        ]
    ): NormalizedUnitSpec | NormalizedLayerSpec = js.native
  }
  
  trait EncodingX2Mixins extends StObject {
    
    var x2: js.UndefOr[Position2Def[Field]] = js.undefined
  }
  object EncodingX2Mixins {
    
    inline def apply(): EncodingX2Mixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingX2Mixins]
    }
    
    extension [Self <: EncodingX2Mixins](x: Self) {
      
      inline def setX2(value: Position2Def[Field]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    }
  }
  
  trait EncodingY2Mixins extends StObject {
    
    var y2: js.UndefOr[Position2Def[Field]] = js.undefined
  }
  object EncodingY2Mixins {
    
    inline def apply(): EncodingY2Mixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingY2Mixins]
    }
    
    extension [Self <: EncodingY2Mixins](x: Self) {
      
      inline def setY2(value: Position2Def[Field]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    }
  }
  
  type RangedLineSpec = GenericUnitSpec[
    (EncodingX2Mixins & Encoding[Field]) | (EncodingY2Mixins & Encoding[Field]), 
    line | Mark
  ]
}
