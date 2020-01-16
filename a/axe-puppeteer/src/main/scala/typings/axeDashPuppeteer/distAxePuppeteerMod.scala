package typings.axeDashPuppeteer

import typings.axeDashCore.axeDashCoreMod.AxeResults
import typings.axeDashCore.axeDashCoreMod.RunOptions
import typings.axeDashCore.axeDashCoreMod.Spec
import typings.axeDashPuppeteer.distTypesMod.AnalyzeCB
import typings.puppeteer.puppeteerMod.Frame
import typings.puppeteer.puppeteerMod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("axe-puppeteer/dist/axePuppeteer", JSImport.Namespace)
@js.native
object distAxePuppeteerMod extends js.Object {
  @js.native
  class AxePuppeteer protected () extends js.Object {
    def this(pageFrame: Frame) = this()
    def this(pageFrame: Page) = this()
    def this(pageFrame: Frame, source: String) = this()
    def this(pageFrame: Page, source: String) = this()
    var axeOptions: js.Any = js.native
    var config: js.Any = js.native
    var excludes: js.Any = js.native
    var frame: js.Any = js.native
    var includes: js.Any = js.native
    var source: js.UndefOr[js.Any] = js.native
    def analyze(): js.Promise[AxeResults] = js.native
    def analyze[T /* <: AnalyzeCB */](callback: T): js.Promise[AxeResults | Null] = js.native
    @JSName("analyze")
    def analyze_T_AnalyzeCB[T /* <: AnalyzeCB */](): js.Promise[AxeResults | Null] = js.native
    def configure(config: Spec): this.type = js.native
    def disableRules(rules: String): this.type = js.native
    def disableRules(rules: js.Array[String]): this.type = js.native
    def exclude(selector: String): this.type = js.native
    def exclude(selector: js.Array[String]): this.type = js.native
    def include(selector: String): this.type = js.native
    def include(selector: js.Array[String]): this.type = js.native
    def options(options: RunOptions): this.type = js.native
    def withRules(rules: String): this.type = js.native
    def withRules(rules: js.Array[String]): this.type = js.native
    def withTags(tags: String): this.type = js.native
    def withTags(tags: js.Array[String]): this.type = js.native
  }
  
}

