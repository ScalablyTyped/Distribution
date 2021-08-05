package typings.couchbase.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The virtual class thrown for all Couchnode errors.
  */
trait CouchbaseError
  extends StObject
     with Error {
  
  /**
    * The error code for this error.
    */
  var code: js.UndefOr[errors] = js.undefined
  
  /**
    * Possible inner error for this error.
    */
  var innerError: js.UndefOr[CouchbaseError] = js.undefined
  
  /**
    * Possible response body included with the error.
    */
  var responseBody: js.UndefOr[js.Any] = js.undefined
}
object CouchbaseError {
  
  inline def apply(message: String, name: String): CouchbaseError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CouchbaseError]
  }
  
  extension [Self <: CouchbaseError](x: Self) {
    
    inline def setCode(value: errors): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setInnerError(value: CouchbaseError): Self = StObject.set(x, "innerError", value.asInstanceOf[js.Any])
    
    inline def setInnerErrorUndefined: Self = StObject.set(x, "innerError", js.undefined)
    
    inline def setResponseBody(value: js.Any): Self = StObject.set(x, "responseBody", value.asInstanceOf[js.Any])
    
    inline def setResponseBodyUndefined: Self = StObject.set(x, "responseBody", js.undefined)
  }
}
