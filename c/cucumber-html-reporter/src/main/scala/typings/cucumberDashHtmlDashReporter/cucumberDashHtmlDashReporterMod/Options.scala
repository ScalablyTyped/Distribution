package typings.cucumberDashHtmlDashReporter.cucumberDashHtmlDashReporterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var columnLayout: js.UndefOr[Double] = js.undefined
  var ignoreBadJsonFile: js.UndefOr[Boolean] = js.undefined
  var jsonDir: js.UndefOr[String] = js.undefined
  var jsonFile: String
  var launchReport: Boolean
  var metadata: js.UndefOr[StringDictionary[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var noInlineScreenshots: js.UndefOr[Boolean] = js.undefined
  var output: String
  var reportSuiteAsScenarios: Boolean
  var screenshotsDirectory: js.UndefOr[String] = js.undefined
  var storeScreenshots: js.UndefOr[Boolean] = js.undefined
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
    columnLayout: Int | Double = null,
    ignoreBadJsonFile: js.UndefOr[Boolean] = js.undefined,
    jsonDir: String = null,
    metadata: StringDictionary[String] = null,
    name: String = null,
    noInlineScreenshots: js.UndefOr[Boolean] = js.undefined,
    screenshotsDirectory: String = null,
    storeScreenshots: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(jsonFile = jsonFile, launchReport = launchReport, output = output, reportSuiteAsScenarios = reportSuiteAsScenarios, theme = theme)
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

