package typings.cucumberCucumber.anon

import typings.cucumberCucumber.libFormatterMod.FormatOptions
import typings.cucumberCucumber.libModelsPickleOrderMod.PickleOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@cucumber/cucumber.@cucumber/cucumber/lib/configuration/types.IConfiguration> */
trait PartialIConfiguration extends StObject {
  
  var backtrace: js.UndefOr[Boolean] = js.undefined
  
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  var failFast: js.UndefOr[Boolean] = js.undefined
  
  var forceExit: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[js.Array[String]] = js.undefined
  
  var formatOptions: js.UndefOr[FormatOptions] = js.undefined
  
  var `import`: js.UndefOr[js.Array[String]] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[js.Array[String]] = js.undefined
  
  var order: js.UndefOr[PickleOrder] = js.undefined
  
  var parallel: js.UndefOr[Double] = js.undefined
  
  var paths: js.UndefOr[js.Array[String]] = js.undefined
  
  var publish: js.UndefOr[Boolean] = js.undefined
  
  var publishQuiet: js.UndefOr[Boolean] = js.undefined
  
  var require: js.UndefOr[js.Array[String]] = js.undefined
  
  var requireModule: js.UndefOr[js.Array[String]] = js.undefined
  
  var retry: js.UndefOr[Double] = js.undefined
  
  var retryTagFilter: js.UndefOr[String] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
  
  var tags: js.UndefOr[String] = js.undefined
  
  var worldParameters: js.UndefOr[Any] = js.undefined
}
object PartialIConfiguration {
  
  inline def apply(): PartialIConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialIConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBacktrace(value: Boolean): Self = StObject.set(x, "backtrace", value.asInstanceOf[js.Any])
    
    inline def setBacktraceUndefined: Self = StObject.set(x, "backtrace", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setFailFast(value: Boolean): Self = StObject.set(x, "failFast", value.asInstanceOf[js.Any])
    
    inline def setFailFastUndefined: Self = StObject.set(x, "failFast", js.undefined)
    
    inline def setForceExit(value: Boolean): Self = StObject.set(x, "forceExit", value.asInstanceOf[js.Any])
    
    inline def setForceExitUndefined: Self = StObject.set(x, "forceExit", js.undefined)
    
    inline def setFormat(value: js.Array[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatOptions(value: FormatOptions): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
    
    inline def setFormatOptionsUndefined: Self = StObject.set(x, "formatOptions", js.undefined)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormatVarargs(value: String*): Self = StObject.set(x, "format", js.Array(value*))
    
    inline def setImport(value: js.Array[String]): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
    
    inline def setImportVarargs(value: String*): Self = StObject.set(x, "import", js.Array(value*))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setOrder(value: PickleOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
    
    inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setPublish(value: Boolean): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
    
    inline def setPublishQuiet(value: Boolean): Self = StObject.set(x, "publishQuiet", value.asInstanceOf[js.Any])
    
    inline def setPublishQuietUndefined: Self = StObject.set(x, "publishQuiet", js.undefined)
    
    inline def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
    
    inline def setRequire(value: js.Array[String]): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    inline def setRequireModule(value: js.Array[String]): Self = StObject.set(x, "requireModule", value.asInstanceOf[js.Any])
    
    inline def setRequireModuleUndefined: Self = StObject.set(x, "requireModule", js.undefined)
    
    inline def setRequireModuleVarargs(value: String*): Self = StObject.set(x, "requireModule", js.Array(value*))
    
    inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    inline def setRequireVarargs(value: String*): Self = StObject.set(x, "require", js.Array(value*))
    
    inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryTagFilter(value: String): Self = StObject.set(x, "retryTagFilter", value.asInstanceOf[js.Any])
    
    inline def setRetryTagFilterUndefined: Self = StObject.set(x, "retryTagFilter", js.undefined)
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setWorldParameters(value: Any): Self = StObject.set(x, "worldParameters", value.asInstanceOf[js.Any])
    
    inline def setWorldParametersUndefined: Self = StObject.set(x, "worldParameters", js.undefined)
  }
}
