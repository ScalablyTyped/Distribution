package typings.datadogSketchesJs

import typings.datadogSketchesJs.keyMappingMod.KeyMapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logarithmicMappingMod {
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/mapping/LogarithmicMapping", "LogarithmicMapping")
  @js.native
  open class LogarithmicMapping protected () extends KeyMapping {
    def this(relativeAccuracy: Double) = this()
    def this(relativeAccuracy: Double, offset: Double) = this()
  }
}
