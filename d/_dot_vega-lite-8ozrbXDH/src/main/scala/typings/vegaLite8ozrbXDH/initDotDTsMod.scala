package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.Graticule
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.encodingDTsMod.Encoding
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.markDotDTsMod.Mark
import typings.vegaLite8ozrbXDH.markDotDTsMod.MarkDef
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.arc
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.area
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.bar
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.circle
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.geoshape
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.image
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.line
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.point
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.rect
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.rule
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.square
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.text
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.tick
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.trail
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initDotDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/mark/init.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultFilled(markDef: MarkDef[Mark, ExprRef | SignalRef], config: Config[SignalRef], hasGraticule: Graticule): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultFilled")(markDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], hasGraticule.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def initMarkdef(
    originalMarkDef: MarkDef[Mark, ExprRef | SignalRef],
    encoding: Encoding[String],
    config: Config[SignalRef]
  ): MarkDef[
    square | area | circle | image | line | rect | text | point | arc | rule | trail | geoshape | bar | tick, 
    SignalRef
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("initMarkdef")(originalMarkDef.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[MarkDef[
    square | area | circle | image | line | rect | text | point | arc | rule | trail | geoshape | bar | tick, 
    SignalRef
  ]]
}
