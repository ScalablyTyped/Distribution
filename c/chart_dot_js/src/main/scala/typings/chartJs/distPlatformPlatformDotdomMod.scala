package typings.chartJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPlatformPlatformDotdomMod {
  
  @JSImport("chart.js/dist/platform/platform.dom", JSImport.Default)
  @js.native
  open class default () extends DomPlatform
  
  type Chart = typings.chartJs.distCoreCoreDotcontrollerMod.default
  
  @js.native
  trait DomPlatform
    extends typings.chartJs.distPlatformPlatformDotbaseMod.default {
    
    /**
      * @param {Chart} chart
      * @param {string} type
      */
    def removeEventListener(chart: Chart, `type`: String): Unit = js.native
  }
}
