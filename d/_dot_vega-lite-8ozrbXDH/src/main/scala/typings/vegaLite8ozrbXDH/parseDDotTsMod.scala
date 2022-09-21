package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.facetDotDTsMod.FacetModel
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.footer
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.header
import typings.vegaTypings.axisMod.AxisOrient
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseDDotTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/header/parse.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHeaderType(orient: AxisOrient): footer | header = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderType")(orient.asInstanceOf[js.Any]).asInstanceOf[footer | header]
  inline def getHeaderType(orient: SignalRef): footer | header = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderType")(orient.asInstanceOf[js.Any]).asInstanceOf[footer | header]
  
  inline def parseFacetHeaders(model: FacetModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFacetHeaders")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
