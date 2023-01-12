package typings.azureCoreHttp

import typings.azureCoreHttp.typesLatestSrcSerializerMod.Mapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcOperationResponseMod {
  
  trait OperationResponse extends StObject {
    
    /**
      * The mapper that will be used to deserialize the response body.
      */
    var bodyMapper: js.UndefOr[Mapper] = js.undefined
    
    /**
      * The mapper that will be used to deserialize the response headers.
      */
    var headersMapper: js.UndefOr[Mapper] = js.undefined
    
    /**
      * Indicates if this is an error response
      */
    var isError: js.UndefOr[Boolean] = js.undefined
  }
  object OperationResponse {
    
    inline def apply(): OperationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperationResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OperationResponse] (val x: Self) extends AnyVal {
      
      inline def setBodyMapper(value: Mapper): Self = StObject.set(x, "bodyMapper", value.asInstanceOf[js.Any])
      
      inline def setBodyMapperUndefined: Self = StObject.set(x, "bodyMapper", js.undefined)
      
      inline def setHeadersMapper(value: Mapper): Self = StObject.set(x, "headersMapper", value.asInstanceOf[js.Any])
      
      inline def setHeadersMapperUndefined: Self = StObject.set(x, "headersMapper", js.undefined)
      
      inline def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
      
      inline def setIsErrorUndefined: Self = StObject.set(x, "isError", js.undefined)
    }
  }
}
