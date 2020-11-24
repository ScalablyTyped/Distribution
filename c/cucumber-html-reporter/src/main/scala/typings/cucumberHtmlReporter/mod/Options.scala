package typings.cucumberHtmlReporter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var columnLayout: js.UndefOr[Double] = js.native
  
  var ignoreBadJsonFile: js.UndefOr[Boolean] = js.native
  
  var jsonDir: js.UndefOr[String] = js.native
  
  var jsonFile: String = js.native
  
  var launchReport: Boolean = js.native
  
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var noInlineScreenshots: js.UndefOr[Boolean] = js.native
  
  var output: String = js.native
  
  var reportSuiteAsScenarios: Boolean = js.native
  
  var screenshotsDirectory: js.UndefOr[String] = js.native
  
  var storeScreenshots: js.UndefOr[Boolean] = js.native
  
  var theme: String = js.native
}
object Options {
  
  @scala.inline
  def apply(
    jsonFile: String,
    launchReport: Boolean,
    output: String,
    reportSuiteAsScenarios: Boolean,
    theme: String
  ): Options = {
    val __obj = js.Dynamic.literal(jsonFile = jsonFile.asInstanceOf[js.Any], launchReport = launchReport.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], reportSuiteAsScenarios = reportSuiteAsScenarios.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJsonFile(value: String): Self = this.set("jsonFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchReport(value: Boolean): Self = this.set("launchReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportSuiteAsScenarios(value: Boolean): Self = this.set("reportSuiteAsScenarios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnLayout(value: Double): Self = this.set("columnLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnLayout: Self = this.set("columnLayout", js.undefined)
    
    @scala.inline
    def setIgnoreBadJsonFile(value: Boolean): Self = this.set("ignoreBadJsonFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreBadJsonFile: Self = this.set("ignoreBadJsonFile", js.undefined)
    
    @scala.inline
    def setJsonDir(value: String): Self = this.set("jsonDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonDir: Self = this.set("jsonDir", js.undefined)
    
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNoInlineScreenshots(value: Boolean): Self = this.set("noInlineScreenshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoInlineScreenshots: Self = this.set("noInlineScreenshots", js.undefined)
    
    @scala.inline
    def setScreenshotsDirectory(value: String): Self = this.set("screenshotsDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenshotsDirectory: Self = this.set("screenshotsDirectory", js.undefined)
    
    @scala.inline
    def setStoreScreenshots(value: Boolean): Self = this.set("storeScreenshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreScreenshots: Self = this.set("storeScreenshots", js.undefined)
  }
}
