package typings.azureCoreHttp

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcUtilSanitizerMod {
  
  @JSImport("@azure/core-http/types/latest/src/util/sanitizer", "Sanitizer")
  @js.native
  open class Sanitizer () extends StObject {
    def this(param0: SanitizerOptions) = this()
    
    var allowedHeaderNames: Set[String] = js.native
    
    var allowedQueryParameters: Set[String] = js.native
    
    def sanitize(obj: Any): String = js.native
    
    /* private */ var sanitizeHeaders: Any = js.native
    
    /* private */ var sanitizeObject: Any = js.native
    
    /* private */ var sanitizeQuery: Any = js.native
    
    /* private */ var sanitizeUrl: Any = js.native
  }
  
  trait SanitizerOptions extends StObject {
    
    /**
      * Header names whose values will be logged when logging is enabled. Defaults to
      * Date, traceparent, x-ms-client-request-id, and x-ms-request id.  Any headers
      * specified in this field will be added to that list.  Any other values will
      * be written to logs as "REDACTED".
      */
    var allowedHeaderNames: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Query string names whose values will be logged when logging is enabled. By default no
      * query string values are logged.
      */
    var allowedQueryParameters: js.UndefOr[js.Array[String]] = js.undefined
  }
  object SanitizerOptions {
    
    inline def apply(): SanitizerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SanitizerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SanitizerOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowedHeaderNames(value: js.Array[String]): Self = StObject.set(x, "allowedHeaderNames", value.asInstanceOf[js.Any])
      
      inline def setAllowedHeaderNamesUndefined: Self = StObject.set(x, "allowedHeaderNames", js.undefined)
      
      inline def setAllowedHeaderNamesVarargs(value: String*): Self = StObject.set(x, "allowedHeaderNames", js.Array(value*))
      
      inline def setAllowedQueryParameters(value: js.Array[String]): Self = StObject.set(x, "allowedQueryParameters", value.asInstanceOf[js.Any])
      
      inline def setAllowedQueryParametersUndefined: Self = StObject.set(x, "allowedQueryParameters", js.undefined)
      
      inline def setAllowedQueryParametersVarargs(value: String*): Self = StObject.set(x, "allowedQueryParameters", js.Array(value*))
    }
  }
}
