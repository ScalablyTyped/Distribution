package typings.axePuppeteer

import typings.axeCore.mod.AxeResults
import typings.axeCore.mod.RunOptions
import typings.axeCore.mod.Spec
import typings.axePuppeteer.typesMod.AnalyzeCB
import typings.puppeteer.mod.Frame
import typings.puppeteer.mod.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object axePuppeteerMod {
  
  @JSImport("axe-puppeteer/dist/axePuppeteer", "AxePuppeteer")
  @js.native
  class AxePuppeteer protected () extends StObject {
    def this(pageFrame: Frame) = this()
    def this(pageFrame: Page) = this()
    def this(pageFrame: Frame, source: String) = this()
    def this(pageFrame: Page, source: String) = this()
    
    def analyze(): js.Promise[AxeResults] = js.native
    def analyze[T /* <: AnalyzeCB */](callback: T): js.Promise[AxeResults | Null] = js.native
    @JSName("analyze")
    def analyze_T_AnalyzeCB[T /* <: AnalyzeCB */](): js.Promise[AxeResults | Null] = js.native
    
    /* private */ var axeOptions: js.Any = js.native
    
    /* private */ var config: js.Any = js.native
    
    def configure(config: Spec): this.type = js.native
    
    def disableRules(rules: String): this.type = js.native
    def disableRules(rules: js.Array[String]): this.type = js.native
    
    def exclude(selector: String): this.type = js.native
    def exclude(selector: js.Array[String]): this.type = js.native
    
    /* private */ var excludes: js.Any = js.native
    
    /* private */ var frame: js.Any = js.native
    
    def include(selector: String): this.type = js.native
    def include(selector: js.Array[String]): this.type = js.native
    
    /* private */ var includes: js.Any = js.native
    
    def options(options: RunOptions): this.type = js.native
    
    /* private */ var source: js.Any = js.native
    
    def withRules(rules: String): this.type = js.native
    def withRules(rules: js.Array[String]): this.type = js.native
    
    def withTags(tags: String): this.type = js.native
    def withTags(tags: js.Array[String]): this.type = js.native
  }
}
