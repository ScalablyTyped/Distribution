package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.markDotDTsMod.Mark
import typings.vegaLite8ozrbXDH.markDotDTsMod.MarkDef
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.middle
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.radius
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.theta
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.top
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.x
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.y
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positionAlignDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/mark/encode/position-align.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def vgAlignedPositionChannel(channel: x | y | radius | theta, markDef: MarkDef[Mark, SignalRef], config: Config[SignalRef]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("vgAlignedPositionChannel")(channel.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def vgAlignedPositionChannel(
    channel: x | y | radius | theta,
    markDef: MarkDef[Mark, SignalRef],
    config: Config[SignalRef],
    defaultAlign: top | middle
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("vgAlignedPositionChannel")(channel.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], defaultAlign.asInstanceOf[js.Any])).asInstanceOf[Any]
}
