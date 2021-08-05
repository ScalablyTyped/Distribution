package typings.backstopjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args extends StObject {
    
    var args: js.Array[String]
    
    var chromeFlags: js.UndefOr[js.Array[String]] = js.undefined
    
    var chromePath: js.UndefOr[String] = js.undefined
    
    var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.undefined
    
    var waitTimeout: js.UndefOr[Double] = js.undefined
  }
  object Args {
    
    inline def apply(args: js.Array[String]): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    extension [Self <: Args](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setChromeFlags(value: js.Array[String]): Self = StObject.set(x, "chromeFlags", value.asInstanceOf[js.Any])
      
      inline def setChromeFlagsUndefined: Self = StObject.set(x, "chromeFlags", js.undefined)
      
      inline def setChromeFlagsVarargs(value: String*): Self = StObject.set(x, "chromeFlags", js.Array(value :_*))
      
      inline def setChromePath(value: String): Self = StObject.set(x, "chromePath", value.asInstanceOf[js.Any])
      
      inline def setChromePathUndefined: Self = StObject.set(x, "chromePath", js.undefined)
      
      inline def setIgnoreHTTPSErrors(value: Boolean): Self = StObject.set(x, "ignoreHTTPSErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreHTTPSErrorsUndefined: Self = StObject.set(x, "ignoreHTTPSErrors", js.undefined)
      
      inline def setWaitTimeout(value: Double): Self = StObject.set(x, "waitTimeout", value.asInstanceOf[js.Any])
      
      inline def setWaitTimeoutUndefined: Self = StObject.set(x, "waitTimeout", js.undefined)
    }
  }
  
  trait Bitmapsreference extends StObject {
    
    var bitmaps_reference: js.UndefOr[String] = js.undefined
    
    var bitmaps_test: js.UndefOr[String] = js.undefined
    
    var ci_report: js.UndefOr[String] = js.undefined
    
    var engine_scripts: js.UndefOr[String] = js.undefined
    
    var html_report: js.UndefOr[String] = js.undefined
    
    var json_report: js.UndefOr[String] = js.undefined
  }
  object Bitmapsreference {
    
    inline def apply(): Bitmapsreference = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bitmapsreference]
    }
    
    extension [Self <: Bitmapsreference](x: Self) {
      
      inline def setBitmaps_reference(value: String): Self = StObject.set(x, "bitmaps_reference", value.asInstanceOf[js.Any])
      
      inline def setBitmaps_referenceUndefined: Self = StObject.set(x, "bitmaps_reference", js.undefined)
      
      inline def setBitmaps_test(value: String): Self = StObject.set(x, "bitmaps_test", value.asInstanceOf[js.Any])
      
      inline def setBitmaps_testUndefined: Self = StObject.set(x, "bitmaps_test", js.undefined)
      
      inline def setCi_report(value: String): Self = StObject.set(x, "ci_report", value.asInstanceOf[js.Any])
      
      inline def setCi_reportUndefined: Self = StObject.set(x, "ci_report", js.undefined)
      
      inline def setEngine_scripts(value: String): Self = StObject.set(x, "engine_scripts", value.asInstanceOf[js.Any])
      
      inline def setEngine_scriptsUndefined: Self = StObject.set(x, "engine_scripts", js.undefined)
      
      inline def setHtml_report(value: String): Self = StObject.set(x, "html_report", value.asInstanceOf[js.Any])
      
      inline def setHtml_reportUndefined: Self = StObject.set(x, "html_report", js.undefined)
      
      inline def setJson_report(value: String): Self = StObject.set(x, "json_report", value.asInstanceOf[js.Any])
      
      inline def setJson_reportUndefined: Self = StObject.set(x, "json_report", js.undefined)
    }
  }
  
  trait Blue extends StObject {
    
    var blue: Double
    
    var green: Double
    
    var red: Double
  }
  object Blue {
    
    inline def apply(blue: Double, green: Double, red: Double): Blue = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blue]
    }
    
    extension [Self <: Blue](x: Self) {
      
      inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  trait Config extends StObject {
    
    var config: js.UndefOr[typings.backstopjs.mod.Config | String] = js.undefined
    
    var filter: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setConfig(value: typings.backstopjs.mod.Config | String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  trait ErrorColor extends StObject {
    
    // See https://github.com/rsmbl/Resemble.js
    var errorColor: js.UndefOr[Blue] = js.undefined
    
    var errorType: js.UndefOr[String] = js.undefined
    
    var ignoreAntialiasing: js.UndefOr[Boolean] = js.undefined
    
    var transparency: js.UndefOr[Double] = js.undefined
  }
  object ErrorColor {
    
    inline def apply(): ErrorColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorColor]
    }
    
    extension [Self <: ErrorColor](x: Self) {
      
      inline def setErrorColor(value: Blue): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
      
      inline def setErrorColorUndefined: Self = StObject.set(x, "errorColor", js.undefined)
      
      inline def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
      
      inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
      
      inline def setIgnoreAntialiasing(value: Boolean): Self = StObject.set(x, "ignoreAntialiasing", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAntialiasingUndefined: Self = StObject.set(x, "ignoreAntialiasing", js.undefined)
      
      inline def setTransparency(value: Double): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
      
      inline def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
    }
  }
  
  trait Format extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var testReportFileName: js.UndefOr[String] = js.undefined
    
    var testSuiteName: js.UndefOr[String] = js.undefined
  }
  object Format {
    
    inline def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setTestReportFileName(value: String): Self = StObject.set(x, "testReportFileName", value.asInstanceOf[js.Any])
      
      inline def setTestReportFileNameUndefined: Self = StObject.set(x, "testReportFileName", js.undefined)
      
      inline def setTestSuiteName(value: String): Self = StObject.set(x, "testSuiteName", value.asInstanceOf[js.Any])
      
      inline def setTestSuiteNameUndefined: Self = StObject.set(x, "testSuiteName", js.undefined)
    }
  }
}
