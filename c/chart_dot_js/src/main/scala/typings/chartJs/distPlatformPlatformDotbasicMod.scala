package typings.chartJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPlatformPlatformDotbasicMod {
  
  @JSImport("chart.js/dist/platform/platform.basic", JSImport.Default)
  @js.native
  open class default () extends BasicPlatform
  
  @js.native
  trait BasicPlatform
    extends typings.chartJs.distPlatformPlatformDotbaseMod.default {
    
    def acquireContext(item: Any): Any = js.native
    
    def updateConfig(config: Any): Unit = js.native
  }
}
