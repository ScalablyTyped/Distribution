package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaLite8ozrbXDH.specBaseDTsMod.LayoutSizeMixins
import typings.vegaLite8ozrbXDH.specIndexDTsMod.NormalizedSpec
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildmodelDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/buildmodel.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildModel(
    spec: NormalizedSpec,
    parent: Model,
    parentGivenName: String,
    unitSize: LayoutSizeMixins,
    config: Config[SignalRef]
  ): Model = (^.asInstanceOf[js.Dynamic].applyDynamic("buildModel")(spec.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], parentGivenName.asInstanceOf[js.Any], unitSize.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Model]
}
