package typings.datadogSketchesJs

import typings.datadogSketchesJs.distDdsketchDdsketchMod.LogCollapsingSketchConfig
import typings.datadogSketchesJs.distDdsketchDdsketchMod.SketchConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@datadog/sketches-js", "DDSketch")
  @js.native
  /**
    * Initialize a new DDSketch
    *
    * @param relativeAccuracy The accuracy guarantee of the sketch (default 0.01)
    */
  open class DDSketch ()
    extends typings.datadogSketchesJs.distDdsketchMod.DDSketch {
    def this(hasRelativeAccuracy: SketchConfig) = this()
  }
  
  @JSImport("@datadog/sketches-js", "LogCollapsingHighestDenseDDSketch")
  @js.native
  /**
    * Initialize a new LogCollapsingHighestDenseDDSketch
    *
    * @param relativeAccuracy The accuracy guarantee of the sketch (default 0.01)
    * @param binLimit Number of bins before highest indices are collapsed (default 2048)
    */
  open class LogCollapsingHighestDenseDDSketch ()
    extends typings.datadogSketchesJs.distDdsketchMod.LogCollapsingHighestDenseDDSketch {
    def this(hasRelativeAccuracyBinLimit: LogCollapsingSketchConfig) = this()
  }
  
  @JSImport("@datadog/sketches-js", "LogCollapsingLowestDenseDDSketch")
  @js.native
  /**
    * Initialize a new LogCollapsingLowestDenseDDSketch
    *
    * @param relativeAccuracy The accuracy guarantee of the sketch (default 0.01)
    * @param binLimit Number of bins before lowest indices are collapsed (default 2048)
    */
  open class LogCollapsingLowestDenseDDSketch ()
    extends typings.datadogSketchesJs.distDdsketchMod.LogCollapsingLowestDenseDDSketch {
    def this(hasRelativeAccuracyBinLimit: LogCollapsingSketchConfig) = this()
  }
}
