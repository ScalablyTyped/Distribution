package typings.azureIdentity

import typings.azureLogger.mod.Debugger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @azure/core-rest-pipeline.@azure/core-rest-pipeline.LogPolicyOptions & {  allowLoggingAccountIdentifiers :boolean | undefined} */
  trait LogPolicyOptionsallowLogg extends StObject {
    
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
    
    var allowLoggingAccountIdentifiers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The log function to use for writing pipeline logs.
      * Defaults to core-http's built-in logger.
      * Compatible with the `debug` library.
      */
    var logger: js.UndefOr[Debugger] = js.undefined
  }
  object LogPolicyOptionsallowLogg {
    
    inline def apply(): LogPolicyOptionsallowLogg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogPolicyOptionsallowLogg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogPolicyOptionsallowLogg] (val x: Self) extends AnyVal {
      
      inline def setAdditionalAllowedHeaderNames(value: js.Array[String]): Self = StObject.set(x, "additionalAllowedHeaderNames", value.asInstanceOf[js.Any])
      
      inline def setAdditionalAllowedHeaderNamesUndefined: Self = StObject.set(x, "additionalAllowedHeaderNames", js.undefined)
      
      inline def setAdditionalAllowedHeaderNamesVarargs(value: String*): Self = StObject.set(x, "additionalAllowedHeaderNames", js.Array(value*))
      
      inline def setAdditionalAllowedQueryParameters(value: js.Array[String]): Self = StObject.set(x, "additionalAllowedQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setAdditionalAllowedQueryParametersUndefined: Self = StObject.set(x, "additionalAllowedQueryParameters", js.undefined)
      
      inline def setAdditionalAllowedQueryParametersVarargs(value: String*): Self = StObject.set(x, "additionalAllowedQueryParameters", js.Array(value*))
      
      inline def setAllowLoggingAccountIdentifiers(value: Boolean): Self = StObject.set(x, "allowLoggingAccountIdentifiers", value.asInstanceOf[js.Any])
      
      inline def setAllowLoggingAccountIdentifiersUndefined: Self = StObject.set(x, "allowLoggingAccountIdentifiers", js.undefined)
      
      inline def setLogger(value: Debugger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
