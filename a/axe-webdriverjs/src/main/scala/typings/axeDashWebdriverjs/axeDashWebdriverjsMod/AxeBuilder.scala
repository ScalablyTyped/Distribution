package typings.axeDashWebdriverjs.axeDashWebdriverjsMod

import org.scalablytyped.runtime.Instantiable1
import typings.axeDashCore.axeDashCoreMod.RunOptions
import typings.axeDashCore.axeDashCoreMod.Spec
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxeBuilder extends js.Object {
  /**
    * Perform analysis and retrieve results.
    * @param callback   Function to execute when analysis completes.
    */
  def analyze(): js.Promise[AxeAnalysis] = js.native
  def analyze(callback: AnalyzeCallback): js.Promise[AxeAnalysis] = js.native
  def analyze(callback: DeprecatedAnalyzeCallback): js.Promise[AxeAnalysis] = js.native
  /**
    * Configures aXe before running analyze.
    *
    * @param config   aXe Configuration spec to use in analysis.
    */
  def configure(config: Spec): this.type = js.native
  /**
    * Set the list of rules to skip when running an analysis
    *
    * @param rules   Array of rule IDs, or a single rule ID as a string.
    */
  def disableRules(rules: String): this.type = js.native
  def disableRules(rules: js.Array[String]): this.type = js.native
  /**
    * Excludes a selector from analysis.
    *
    * @param selector   CSS selector of the element to exclude.
    */
  def exclude(selector: String): this.type = js.native
  /**
    * Includes a selector in analysis.
    *
    * @param selector   CSS selector of the element to include.
    */
  def include(selector: String): this.type = js.native
  /**
    * Options to directly pass to `axe.run`.
    *
    * @param options   aXe options object.
    * @remarks Will override any other configured options, including calls to `withRules` and `withTags`.
    * @see https://github.com/dequelabs/axe-core/issues/937
    */
  def options(options: RunOptions): this.type = js.native
  /**
    * Limits analysis to only the specified rules.
    *
    * @param rules   Array of rule IDs, or a single rule ID as a string.
    * @remarks Cannot be used with `withTags`.
    */
  def withRules(rules: String): this.type = js.native
  def withRules(rules: js.Array[String]): this.type = js.native
  /**
    * Limist analysis to only the specified tags.
    *
    * @param rules   Array of tags, or a single tag as a string.
    * @remarks Cannot be used with `withRules`.
    */
  def withTags(tags: String): this.type = js.native
  def withTags(tags: js.Array[String]): this.type = js.native
}

@JSImport("axe-webdriverjs", "AxeBuilder")
@js.native
object AxeBuilder extends Instantiable1[/* driver */ WebDriver, AxeBuilder] {
  def apply(driver: WebDriver): AxeBuilder = js.native
}

