package typings.c3

import typings.c3.mod.ChartAPI
import typings.c3.mod.ChartConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object c3 {
    
    @JSGlobal("c3")
    @js.native
    val ^ : js.Any = js.native
    
    inline def generate(config: ChartConfiguration): ChartAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(config.asInstanceOf[js.Any]).asInstanceOf[ChartAPI]
    
    @JSGlobal("c3.version")
    @js.native
    val version: String = js.native
  }
}
