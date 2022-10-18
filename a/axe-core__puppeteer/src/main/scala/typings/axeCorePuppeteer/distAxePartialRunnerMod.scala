package typings.axeCorePuppeteer

import typings.axeCore.mod.PartialResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAxePartialRunnerMod {
  
  @JSImport("@axe-core/puppeteer/dist/axePartialRunner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@axe-core/puppeteer/dist/axePartialRunner", "AxePartialRunner")
  @js.native
  open class AxePartialRunner protected () extends StObject {
    def this(partialPromise: js.Promise[PartialResult]) = this()
    def this(partialPromise: js.Promise[PartialResult], initiator: Boolean) = this()
    
    def addChildResults(): Unit = js.native
    def addChildResults(childResultRunner: AxePartialRunner): Unit = js.native
    
    /* private */ var childRunners: Any = js.native
    
    def getPartials(): js.Promise[PartialResults] = js.native
    
    /* private */ var initiator: Any = js.native
    
    /* private */ var partialPromise: Any = js.native
  }
  
  inline def caught[T](p: js.Promise[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("caught")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  type PartialResults = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(partialResults : axe-core.axe-core.PartialResults, options : axe-core.axe-core.RunOptions): std.Promise<axe-core.axe-core.AxeResults>>[0] */ js.Any
}
