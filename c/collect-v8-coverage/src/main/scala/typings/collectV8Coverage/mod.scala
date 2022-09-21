package typings.collectV8Coverage

import typings.node.inspectorMod.Profiler.ScriptCoverage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("collect-v8-coverage", "CoverageInstrumenter")
  @js.native
  open class CoverageInstrumenter () extends StObject {
    
    def startInstrumenting(): js.Promise[Unit] = js.native
    
    def stopInstrumenting(): js.Promise[V8Coverage] = js.native
  }
  
  type V8Coverage = js.Array[ScriptCoverage]
}
