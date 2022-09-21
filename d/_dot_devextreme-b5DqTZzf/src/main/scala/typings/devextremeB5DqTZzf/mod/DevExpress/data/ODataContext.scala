package typings.devextremeB5DqTZzf.mod.DevExpress.data

import typings.devextremeB5DqTZzf.mod.DevExpress.core.utils.DxPromise
import typings.devextremeB5DqTZzf.mod.DevExpress.data.ODataContext.HttpMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODataContext extends StObject {
  
  /**
    * Invokes an OData operation that returns a value.
    */
  def get(operationName: String, params: Any): DxPromise[Any] = js.native
  
  /**
    * Invokes an OData operation that returns nothing.
    */
  def invoke(operationName: String, params: Any, httpMethod: HttpMethod): DxPromise[Unit] = js.native
  
  def objectLink(entityAlias: String, key: String): Any = js.native
  /**
    * Gets a link to an entity with a specific key.
    */
  def objectLink(entityAlias: String, key: Any): Any = js.native
  def objectLink(entityAlias: String, key: Double): Any = js.native
}
object ODataContext {
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please describe your scenario in the following GitHub Issue, and we will suggest a public alternative: {@link https://github.com/DevExpress/DevExtreme/issues/17885|Internal Types}.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.GET
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.POST
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.PATCH
    - typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.MERGE
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def GET: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.GET = "GET".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.GET]
    
    inline def MERGE: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.MERGE = "MERGE".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.MERGE]
    
    inline def PATCH: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.PATCH = "PATCH".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.PATCH]
    
    inline def POST: typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.POST = "POST".asInstanceOf[typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.POST]
  }
  
  trait ODataRequestOptions extends StObject {
    
    var accepts: Any
    
    var async: Boolean
    
    var contentType: String | Boolean
    
    var data: Any
    
    var dataType: String
    
    var headers: Any
    
    var jsonp: js.UndefOr[Boolean] = js.undefined
    
    var method: String
    
    var timeout: Double
    
    var url: String
    
    var xhrFields: Any
  }
  object ODataRequestOptions {
    
    inline def apply(
      accepts: Any,
      async: Boolean,
      contentType: String | Boolean,
      data: Any,
      dataType: String,
      headers: Any,
      method: String,
      timeout: Double,
      url: String,
      xhrFields: Any
    ): ODataRequestOptions = {
      val __obj = js.Dynamic.literal(accepts = accepts.asInstanceOf[js.Any], async = async.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhrFields = xhrFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[ODataRequestOptions]
    }
    
    extension [Self <: ODataRequestOptions](x: Self) {
      
      inline def setAccepts(value: Any): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String | Boolean): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setJsonp(value: Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
      
      inline def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setXhrFields(value: Any): Self = StObject.set(x, "xhrFields", value.asInstanceOf[js.Any])
    }
  }
}
