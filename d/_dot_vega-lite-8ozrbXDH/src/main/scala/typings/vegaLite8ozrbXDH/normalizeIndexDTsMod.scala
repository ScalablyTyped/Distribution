package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.autosizeAutosizeTypeAutoS
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.specBaseDTsMod.LayoutSizeMixins
import typings.vegaLite8ozrbXDH.specIndexDTsMod.NormalizedSpec
import typings.vegaLite8ozrbXDH.specIndexDTsMod.TopLevelSpec
import typings.vegaLite8ozrbXDH.toplevelDTsMod.AutoSizeParams
import typings.vegaLite8ozrbXDH.toplevelDTsMod.TopLevel
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizeIndexDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/normalize/index.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalize(spec: TopLevelSpec & LayoutSizeMixins): TopLevel[NormalizedSpec] & LayoutSizeMixins = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(spec.asInstanceOf[js.Any]).asInstanceOf[TopLevel[NormalizedSpec] & LayoutSizeMixins]
  inline def normalize(spec: TopLevelSpec & LayoutSizeMixins, config: Config[SignalRef]): TopLevel[NormalizedSpec] & LayoutSizeMixins = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(spec.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[TopLevel[NormalizedSpec] & LayoutSizeMixins]
  
  inline def normalizeAutoSize(spec: TopLevel[NormalizedSpec], sizeInfo: autosizeAutosizeTypeAutoS): AutoSizeParams = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAutoSize")(spec.asInstanceOf[js.Any], sizeInfo.asInstanceOf[js.Any])).asInstanceOf[AutoSizeParams]
  inline def normalizeAutoSize(
    spec: TopLevel[NormalizedSpec],
    sizeInfo: autosizeAutosizeTypeAutoS,
    config: Config[ExprRef | SignalRef]
  ): AutoSizeParams = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAutoSize")(spec.asInstanceOf[js.Any], sizeInfo.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[AutoSizeParams]
}
