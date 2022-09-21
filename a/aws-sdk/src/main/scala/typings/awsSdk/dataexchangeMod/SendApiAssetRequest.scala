package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendApiAssetRequest extends StObject {
  
  /**
    * Asset ID value for the API request.
    */
  var AssetId: string
  
  /**
    * The request body.
    */
  var Body: js.UndefOr[string] = js.undefined
  
  /**
    * Data set ID value for the API request.
    */
  var DataSetId: string
  
  /**
    * HTTP method value for the API request. Alternatively, you can use the appropriate verb in your request.
    */
  var Method: js.UndefOr[string] = js.undefined
  
  /**
    * URI path value for the API request. Alternatively, you can set the URI path directly by invoking /v1/{pathValue}.
    */
  var Path: js.UndefOr[string] = js.undefined
  
  /**
    * Attach query string parameters to the end of the URI (for example, /v1/examplePath?exampleParam=exampleValue).
    */
  var QueryStringParameters: js.UndefOr[MapOfString] = js.undefined
  
  /**
    * Any header value prefixed with x-amzn-dataexchange-header- will have that stripped before sending the Asset API request. Use this when you want to override a header that AWS Data Exchange uses. Alternatively, you can use the header without a prefix to the HTTP request.
    */
  var RequestHeaders: js.UndefOr[MapOfString] = js.undefined
  
  /**
    * Revision ID value for the API request.
    */
  var RevisionId: string
}
object SendApiAssetRequest {
  
  inline def apply(AssetId: string, DataSetId: string, RevisionId: string): SendApiAssetRequest = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendApiAssetRequest]
  }
  
  extension [Self <: SendApiAssetRequest](x: Self) {
    
    inline def setAssetId(value: string): Self = StObject.set(x, "AssetId", value.asInstanceOf[js.Any])
    
    inline def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setDataSetId(value: string): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: string): Self = StObject.set(x, "Method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "Method", js.undefined)
    
    inline def setPath(value: string): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    inline def setQueryStringParameters(value: MapOfString): Self = StObject.set(x, "QueryStringParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryStringParametersUndefined: Self = StObject.set(x, "QueryStringParameters", js.undefined)
    
    inline def setRequestHeaders(value: MapOfString): Self = StObject.set(x, "RequestHeaders", value.asInstanceOf[js.Any])
    
    inline def setRequestHeadersUndefined: Self = StObject.set(x, "RequestHeaders", js.undefined)
    
    inline def setRevisionId(value: string): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
  }
}
