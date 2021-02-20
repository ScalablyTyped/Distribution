package typings.backstopjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Args extends StObject {
    
    var args: js.Array[String] = js.native
    
    var chromeFlags: js.UndefOr[js.Array[String]] = js.native
    
    var chromePath: js.UndefOr[String] = js.native
    
    var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.native
    
    var waitTimeout: js.UndefOr[Double] = js.native
  }
  object Args {
    
    @scala.inline
    def apply(args: js.Array[String]): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setChromeFlags(value: js.Array[String]): Self = StObject.set(x, "chromeFlags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromeFlagsUndefined: Self = StObject.set(x, "chromeFlags", js.undefined)
      
      @scala.inline
      def setChromeFlagsVarargs(value: String*): Self = StObject.set(x, "chromeFlags", js.Array(value :_*))
      
      @scala.inline
      def setChromePath(value: String): Self = StObject.set(x, "chromePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromePathUndefined: Self = StObject.set(x, "chromePath", js.undefined)
      
      @scala.inline
      def setIgnoreHTTPSErrors(value: Boolean): Self = StObject.set(x, "ignoreHTTPSErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreHTTPSErrorsUndefined: Self = StObject.set(x, "ignoreHTTPSErrors", js.undefined)
      
      @scala.inline
      def setWaitTimeout(value: Double): Self = StObject.set(x, "waitTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitTimeoutUndefined: Self = StObject.set(x, "waitTimeout", js.undefined)
    }
  }
  
  @js.native
  trait Bitmapsreference extends StObject {
    
    var bitmaps_reference: js.UndefOr[String] = js.native
    
    var bitmaps_test: js.UndefOr[String] = js.native
    
    var ci_report: js.UndefOr[String] = js.native
    
    var engine_scripts: js.UndefOr[String] = js.native
    
    var html_report: js.UndefOr[String] = js.native
    
    var json_report: js.UndefOr[String] = js.native
  }
  object Bitmapsreference {
    
    @scala.inline
    def apply(): Bitmapsreference = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bitmapsreference]
    }
    
    @scala.inline
    implicit class BitmapsreferenceMutableBuilder[Self <: Bitmapsreference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitmaps_reference(value: String): Self = StObject.set(x, "bitmaps_reference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitmaps_referenceUndefined: Self = StObject.set(x, "bitmaps_reference", js.undefined)
      
      @scala.inline
      def setBitmaps_test(value: String): Self = StObject.set(x, "bitmaps_test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitmaps_testUndefined: Self = StObject.set(x, "bitmaps_test", js.undefined)
      
      @scala.inline
      def setCi_report(value: String): Self = StObject.set(x, "ci_report", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCi_reportUndefined: Self = StObject.set(x, "ci_report", js.undefined)
      
      @scala.inline
      def setEngine_scripts(value: String): Self = StObject.set(x, "engine_scripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngine_scriptsUndefined: Self = StObject.set(x, "engine_scripts", js.undefined)
      
      @scala.inline
      def setHtml_report(value: String): Self = StObject.set(x, "html_report", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml_reportUndefined: Self = StObject.set(x, "html_report", js.undefined)
      
      @scala.inline
      def setJson_report(value: String): Self = StObject.set(x, "json_report", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJson_reportUndefined: Self = StObject.set(x, "json_report", js.undefined)
    }
  }
  
  @js.native
  trait Blue extends StObject {
    
    var blue: Double = js.native
    
    var green: Double = js.native
    
    var red: Double = js.native
  }
  object Blue {
    
    @scala.inline
    def apply(blue: Double, green: Double, red: Double): Blue = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blue]
    }
    
    @scala.inline
    implicit class BlueMutableBuilder[Self <: Blue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Config extends StObject {
    
    var config: js.UndefOr[typings.backstopjs.mod.Config | String] = js.native
    
    var filter: js.UndefOr[String] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: typings.backstopjs.mod.Config | String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
  
  @js.native
  trait ErrorColor extends StObject {
    
    // See https://github.com/rsmbl/Resemble.js
    var errorColor: js.UndefOr[Blue] = js.native
    
    var errorType: js.UndefOr[String] = js.native
    
    var ignoreAntialiasing: js.UndefOr[Boolean] = js.native
    
    var transparency: js.UndefOr[Double] = js.native
  }
  object ErrorColor {
    
    @scala.inline
    def apply(): ErrorColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorColor]
    }
    
    @scala.inline
    implicit class ErrorColorMutableBuilder[Self <: ErrorColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorColor(value: Blue): Self = StObject.set(x, "errorColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorColorUndefined: Self = StObject.set(x, "errorColor", js.undefined)
      
      @scala.inline
      def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
      
      @scala.inline
      def setIgnoreAntialiasing(value: Boolean): Self = StObject.set(x, "ignoreAntialiasing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreAntialiasingUndefined: Self = StObject.set(x, "ignoreAntialiasing", js.undefined)
      
      @scala.inline
      def setTransparency(value: Double): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
    }
  }
  
  @js.native
  trait Format extends StObject {
    
    var format: js.UndefOr[String] = js.native
    
    var testReportFileName: js.UndefOr[String] = js.native
    
    var testSuiteName: js.UndefOr[String] = js.native
  }
  object Format {
    
    @scala.inline
    def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setTestReportFileName(value: String): Self = StObject.set(x, "testReportFileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestReportFileNameUndefined: Self = StObject.set(x, "testReportFileName", js.undefined)
      
      @scala.inline
      def setTestSuiteName(value: String): Self = StObject.set(x, "testSuiteName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestSuiteNameUndefined: Self = StObject.set(x, "testSuiteName", js.undefined)
    }
  }
}
