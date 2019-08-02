package typings.cucumberDashHtmlDashReporter.cucumberDashHtmlDashReporterMod

import typings.cucumberDashHtmlDashReporter.cucumberDashHtmlDashReporterNumbers.`1`
import typings.cucumberDashHtmlDashReporter.cucumberDashHtmlDashReporterNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Brand Title of Report E.g: Smoke Test Reports.
    * @default 'Cucumberjs Report'
    */
  var brandTitle: js.UndefOr[String] = js.undefined
  /**
    * The column Layout value.
    * 1 = One Column Layout (col-xx-12).
    * 2 = Two Columns Layout (col-xx-6).
    * @default 2;
    */
  var columnLayout: js.UndefOr[`1` | `2`] = js.undefined
  /**
    * Reports any bad json files found during merging json files from directory.
    * true: Ignores any bad json files found and continue with remaining files to merge.
    * false: Default Option. Fail report generation if any bad json is found.
    */
  var ignoreBadJsonFile: js.UndefOr[Boolean] = js.undefined
  /**
    * If more than one file, Path of JSON directory.
    */
  var jsonDir: js.UndefOr[String] = js.undefined
  /**
    * Path of Cucumber JSON file.
    */
  var jsonFile: String
  /**
    * Automatically launch HTML report at the end of test suite.
    */
  var launchReport: Boolean
  /**
    * Print more data to report, such as Browser info, app info.
    * @default undefined;
    */
  var metadata: js.UndefOr[js.Object] = js.undefined
  /**
    * Custom Project Name.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * For no Inline Screenshots:
    * true: Applicable if storeScreenshots=true. Avoids inlining screenshots,
    * instead use relative path to screenshot.
    * false or undefined: Keeps screenshots inlined.
    * @default undefined;
    */
  var noInlineScreenshots: js.UndefOr[Boolean] = js.undefined
  /**
    * Path of HTML Output.
    */
  var output: String
  /**
    * Bootstrap theme value:
    * true: Reports total # of passed/failed scenarios as HEADER.
    * false: Reports total # of passed/failed features as HEADER.
    */
  var reportSuiteAsScenarios: Boolean
  /**
    * Applicable if storeScreenshots = true.
    * Relative Path for directory where screenshots should be saved.
    */
  var screenshotsDirectory: js.UndefOr[String] = js.undefined
  /**
    * To store screenshots:
    * true: stores screens. It creates a directory 'screenshot' if does not exists.
    * false or undefined: does not store screenshots.
    * @default undefined;
    */
  var storeScreenshots: js.UndefOr[Boolean] = js.undefined
  /**
    * Selects theme for Reporter.
    * @default default
    */
  var theme: String
}

object Options {
  @scala.inline
  def apply(
    jsonFile: String,
    launchReport: Boolean,
    output: String,
    reportSuiteAsScenarios: Boolean,
    theme: String,
    brandTitle: String = null,
    columnLayout: `1` | `2` = null,
    ignoreBadJsonFile: js.UndefOr[Boolean] = js.undefined,
    jsonDir: String = null,
    metadata: js.Object = null,
    name: String = null,
    noInlineScreenshots: js.UndefOr[Boolean] = js.undefined,
    screenshotsDirectory: String = null,
    storeScreenshots: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(jsonFile = jsonFile, launchReport = launchReport, output = output, reportSuiteAsScenarios = reportSuiteAsScenarios, theme = theme)
    if (brandTitle != null) __obj.updateDynamic("brandTitle")(brandTitle)
    if (columnLayout != null) __obj.updateDynamic("columnLayout")(columnLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBadJsonFile)) __obj.updateDynamic("ignoreBadJsonFile")(ignoreBadJsonFile)
    if (jsonDir != null) __obj.updateDynamic("jsonDir")(jsonDir)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(noInlineScreenshots)) __obj.updateDynamic("noInlineScreenshots")(noInlineScreenshots)
    if (screenshotsDirectory != null) __obj.updateDynamic("screenshotsDirectory")(screenshotsDirectory)
    if (!js.isUndefined(storeScreenshots)) __obj.updateDynamic("storeScreenshots")(storeScreenshots)
    __obj.asInstanceOf[Options]
  }
}

