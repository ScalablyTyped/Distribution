package typings.azureCoreRestPipeline.coreRestPipelineMod

import typings.azureLogger.mod.Debugger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogPolicyOptions extends StObject {
  
  /**
    * Header names whose values will be logged when logging is enabled.
    * Defaults include a list of well-known safe headers. Any headers
    * specified in this field will be added to that list.  Any other values will
    * be written to logs as "REDACTED".
    */
  var additionalAllowedHeaderNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Query string names whose values will be logged when logging is enabled. By default no
    * query string values are logged.
    */
  var additionalAllowedQueryParameters: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The log function to use for writing pipeline logs.
    * Defaults to core-http's built-in logger.
    * Compatible with the `debug` library.
    */
  var logger: js.UndefOr[Debugger] = js.undefined
}
object LogPolicyOptions {
  
  inline def apply(): LogPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPolicyOptions]
  }
  
  extension [Self <: LogPolicyOptions](x: Self) {
    
    inline def setAdditionalAllowedHeaderNames(value: js.Array[String]): Self = StObject.set(x, "additionalAllowedHeaderNames", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAllowedHeaderNamesUndefined: Self = StObject.set(x, "additionalAllowedHeaderNames", js.undefined)
    
    inline def setAdditionalAllowedHeaderNamesVarargs(value: String*): Self = StObject.set(x, "additionalAllowedHeaderNames", js.Array(value*))
    
    inline def setAdditionalAllowedQueryParameters(value: js.Array[String]): Self = StObject.set(x, "additionalAllowedQueryParameters", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAllowedQueryParametersUndefined: Self = StObject.set(x, "additionalAllowedQueryParameters", js.undefined)
    
    inline def setAdditionalAllowedQueryParametersVarargs(value: String*): Self = StObject.set(x, "additionalAllowedQueryParameters", js.Array(value*))
    
    inline def setLogger(value: Debugger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
  }
}
