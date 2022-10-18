package typings.axeCorePuppeteer

import typings.axeCore.mod.AxeResults
import typings.axeCore.mod.RunOptions
import typings.axeCore.mod.Spec
import typings.axeCorePuppeteer.distTypesMod.AnalyzeCB
import typings.puppeteer.mod.Frame
import typings.puppeteer.mod.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAxePuppeteerMod {
  
  @JSImport("@axe-core/puppeteer/dist/axePuppeteer", "AxePuppeteer")
  @js.native
  open class AxePuppeteer protected () extends StObject {
    def this(pageFrame: Frame) = this()
    def this(pageFrame: Page) = this()
    def this(pageFrame: Frame, source: String) = this()
    def this(pageFrame: Page, source: String) = this()
    
    def analyze(): js.Promise[AxeResults] = js.native
    def analyze[T /* <: AnalyzeCB */](callback: T): js.Promise[AxeResults | Null] = js.native
    
    /* private */ var analyzePromise: Any = js.native
    
    @JSName("analyze")
    def analyze_T[T /* <: AnalyzeCB */](): js.Promise[AxeResults | Null] = js.native
    
    /* private */ var axeOptions: Any = js.native
    
    /* private */ var axeSource: Any = js.native
    
    /* private */ var config: Any = js.native
    
    def configure(config: Spec): this.type = js.native
    
    def disableFrame(selector: String): this.type = js.native
    
    def disableRules(rules: String): this.type = js.native
    def disableRules(rules: js.Array[String]): this.type = js.native
    
    /* private */ var disabledFrameSelectors: Any = js.native
    
    def exclude(selector: String): this.type = js.native
    def exclude(selector: js.Array[String]): this.type = js.native
    
    /* private */ var excludes: Any = js.native
    
    /* private */ var finishRun: Any = js.native
    
    /* private */ var frame: Any = js.native
    
    def include(selector: String): this.type = js.native
    def include(selector: js.Array[String]): this.type = js.native
    
    /* private */ var includes: Any = js.native
    
    /* private */ var legacyMode: Any = js.native
    
    def options(options: RunOptions): this.type = js.native
    
    /* private */ var page: Any = js.native
    
    /* private */ var runLegacy: Any = js.native
    
    /* private */ var runPartialRecursive: Any = js.native
    
    def setLegacyMode(): this.type = js.native
    def setLegacyMode(legacyMode: Boolean): this.type = js.native
    
    def withRules(rules: String): this.type = js.native
    def withRules(rules: js.Array[String]): this.type = js.native
    
    def withTags(tags: String): this.type = js.native
    def withTags(tags: js.Array[String]): this.type = js.native
  }
}
