package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.IgnoreRange
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleParseDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/parse.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseScaleCore(model: Model): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseScaleCore")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseScales(model: Model): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseScales")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def parseScales(model: Model, hasIgnoreRange: IgnoreRange): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseScales")(model.asInstanceOf[js.Any], hasIgnoreRange.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
