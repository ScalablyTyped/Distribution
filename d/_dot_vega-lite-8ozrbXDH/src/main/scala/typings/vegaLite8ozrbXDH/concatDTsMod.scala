package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.concatDotDTsMod.NormalizedConcatSpec
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/concat.d.ts", "ConcatModel")
  @js.native
  open class ConcatModel protected () extends Model {
    def this(spec: NormalizedConcatSpec, parent: Model, parentGivenName: String, config: Config[SignalRef]) = this()
    
    /* private */ var getChildren: Any = js.native
    
    def parseAxisGroup(): Unit = js.native
  }
}
