package typings.cucumberHtmlReporter

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberHtmlReporter.cucumberHtmlReporterStrings.bootstrap
import typings.cucumberHtmlReporter.cucumberHtmlReporterStrings.foundation
import typings.cucumberHtmlReporter.cucumberHtmlReporterStrings.hierarchy
import typings.cucumberHtmlReporter.cucumberHtmlReporterStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cucumber-html-reporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def generate(options: Options, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var brandTitle: js.UndefOr[String] = js.undefined
    
    var columnLayout: js.UndefOr[Double] = js.undefined
    
    var ignoreBadJsonFile: js.UndefOr[Boolean] = js.undefined
    
    var jsonDir: js.UndefOr[String] = js.undefined
    
    var jsonFile: js.UndefOr[String] = js.undefined
    
    var launchReport: Boolean
    
    var metadata: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var noInlineScreenshots: js.UndefOr[Boolean] = js.undefined
    
    var output: String
    
    var reportSuiteAsScenarios: Boolean
    
    var scenarioTimestamp: js.UndefOr[Boolean] = js.undefined
    
    var screenshotsDirectory: js.UndefOr[String] = js.undefined
    
    var storeScreenshots: js.UndefOr[Boolean] = js.undefined
    
    var theme: bootstrap | hierarchy | foundation | simple
  }
  object Options {
    
    inline def apply(
      launchReport: Boolean,
      output: String,
      reportSuiteAsScenarios: Boolean,
      theme: bootstrap | hierarchy | foundation | simple
    ): Options = {
      val __obj = js.Dynamic.literal(launchReport = launchReport.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], reportSuiteAsScenarios = reportSuiteAsScenarios.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBrandTitle(value: String): Self = StObject.set(x, "brandTitle", value.asInstanceOf[js.Any])
      
      inline def setBrandTitleUndefined: Self = StObject.set(x, "brandTitle", js.undefined)
      
      inline def setColumnLayout(value: Double): Self = StObject.set(x, "columnLayout", value.asInstanceOf[js.Any])
      
      inline def setColumnLayoutUndefined: Self = StObject.set(x, "columnLayout", js.undefined)
      
      inline def setIgnoreBadJsonFile(value: Boolean): Self = StObject.set(x, "ignoreBadJsonFile", value.asInstanceOf[js.Any])
      
      inline def setIgnoreBadJsonFileUndefined: Self = StObject.set(x, "ignoreBadJsonFile", js.undefined)
      
      inline def setJsonDir(value: String): Self = StObject.set(x, "jsonDir", value.asInstanceOf[js.Any])
      
      inline def setJsonDirUndefined: Self = StObject.set(x, "jsonDir", js.undefined)
      
      inline def setJsonFile(value: String): Self = StObject.set(x, "jsonFile", value.asInstanceOf[js.Any])
      
      inline def setJsonFileUndefined: Self = StObject.set(x, "jsonFile", js.undefined)
      
      inline def setLaunchReport(value: Boolean): Self = StObject.set(x, "launchReport", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNoInlineScreenshots(value: Boolean): Self = StObject.set(x, "noInlineScreenshots", value.asInstanceOf[js.Any])
      
      inline def setNoInlineScreenshotsUndefined: Self = StObject.set(x, "noInlineScreenshots", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setReportSuiteAsScenarios(value: Boolean): Self = StObject.set(x, "reportSuiteAsScenarios", value.asInstanceOf[js.Any])
      
      inline def setScenarioTimestamp(value: Boolean): Self = StObject.set(x, "scenarioTimestamp", value.asInstanceOf[js.Any])
      
      inline def setScenarioTimestampUndefined: Self = StObject.set(x, "scenarioTimestamp", js.undefined)
      
      inline def setScreenshotsDirectory(value: String): Self = StObject.set(x, "screenshotsDirectory", value.asInstanceOf[js.Any])
      
      inline def setScreenshotsDirectoryUndefined: Self = StObject.set(x, "screenshotsDirectory", js.undefined)
      
      inline def setStoreScreenshots(value: Boolean): Self = StObject.set(x, "storeScreenshots", value.asInstanceOf[js.Any])
      
      inline def setStoreScreenshotsUndefined: Self = StObject.set(x, "storeScreenshots", js.undefined)
      
      inline def setTheme(value: bootstrap | hierarchy | foundation | simple): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
