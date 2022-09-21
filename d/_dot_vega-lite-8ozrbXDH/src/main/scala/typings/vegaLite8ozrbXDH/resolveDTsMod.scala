package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.channelDTsMod.ScaleChannel
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaLite8ozrbXDH.resolveDotDTsMod.Resolve
import typings.vegaLite8ozrbXDH.resolveDotDTsMod.ResolveMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/resolve.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultScaleResolve(channel: ScaleChannel, model: Model): ResolveMode = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultScaleResolve")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[ResolveMode]
  
  inline def parseGuideResolve(resolve: Resolve, channel: ScaleChannel): ResolveMode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseGuideResolve")(resolve.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[ResolveMode]
}
