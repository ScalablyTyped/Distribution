package typings.cucumberCucumber

import typings.cucumberCucumber.libFormatterMod.FormatOptions
import typings.cucumberCucumber.libModelsPickleOrderMod.PickleOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigurationTypesMod {
  
  trait IConfiguration extends StObject {
    
    var backtrace: Boolean
    
    var dryRun: Boolean
    
    var failFast: Boolean
    
    var forceExit: Boolean
    
    var format: js.Array[String]
    
    var formatOptions: FormatOptions
    
    var `import`: js.Array[String]
    
    var language: String
    
    var name: js.Array[String]
    
    var order: PickleOrder
    
    var parallel: Double
    
    var paths: js.Array[String]
    
    var publish: Boolean
    
    var publishQuiet: Boolean
    
    var require: js.Array[String]
    
    var requireModule: js.Array[String]
    
    var retry: Double
    
    var retryTagFilter: String
    
    var strict: Boolean
    
    var tags: String
    
    var worldParameters: Any
  }
  object IConfiguration {
    
    inline def apply(
      backtrace: Boolean,
      dryRun: Boolean,
      failFast: Boolean,
      forceExit: Boolean,
      format: js.Array[String],
      formatOptions: FormatOptions,
      `import`: js.Array[String],
      language: String,
      name: js.Array[String],
      order: PickleOrder,
      parallel: Double,
      paths: js.Array[String],
      publish: Boolean,
      publishQuiet: Boolean,
      require: js.Array[String],
      requireModule: js.Array[String],
      retry: Double,
      retryTagFilter: String,
      strict: Boolean,
      tags: String,
      worldParameters: Any
    ): IConfiguration = {
      val __obj = js.Dynamic.literal(backtrace = backtrace.asInstanceOf[js.Any], dryRun = dryRun.asInstanceOf[js.Any], failFast = failFast.asInstanceOf[js.Any], forceExit = forceExit.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], formatOptions = formatOptions.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parallel = parallel.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], publish = publish.asInstanceOf[js.Any], publishQuiet = publishQuiet.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any], requireModule = requireModule.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], retryTagFilter = retryTagFilter.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], worldParameters = worldParameters.asInstanceOf[js.Any])
      __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IConfiguration] (val x: Self) extends AnyVal {
      
      inline def setBacktrace(value: Boolean): Self = StObject.set(x, "backtrace", value.asInstanceOf[js.Any])
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setFailFast(value: Boolean): Self = StObject.set(x, "failFast", value.asInstanceOf[js.Any])
      
      inline def setForceExit(value: Boolean): Self = StObject.set(x, "forceExit", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: js.Array[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatOptions(value: FormatOptions): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
      
      inline def setFormatVarargs(value: String*): Self = StObject.set(x, "format", js.Array(value*))
      
      inline def setImport(value: js.Array[String]): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
      
      inline def setImportVarargs(value: String*): Self = StObject.set(x, "import", js.Array(value*))
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setName(value: js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value*))
      
      inline def setOrder(value: PickleOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setParallel(value: Double): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
      
      inline def setPublish(value: Boolean): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
      
      inline def setPublishQuiet(value: Boolean): Self = StObject.set(x, "publishQuiet", value.asInstanceOf[js.Any])
      
      inline def setRequire(value: js.Array[String]): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def setRequireModule(value: js.Array[String]): Self = StObject.set(x, "requireModule", value.asInstanceOf[js.Any])
      
      inline def setRequireModuleVarargs(value: String*): Self = StObject.set(x, "requireModule", js.Array(value*))
      
      inline def setRequireVarargs(value: String*): Self = StObject.set(x, "require", js.Array(value*))
      
      inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryTagFilter(value: String): Self = StObject.set(x, "retryTagFilter", value.asInstanceOf[js.Any])
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setWorldParameters(value: Any): Self = StObject.set(x, "worldParameters", value.asInstanceOf[js.Any])
    }
  }
}
