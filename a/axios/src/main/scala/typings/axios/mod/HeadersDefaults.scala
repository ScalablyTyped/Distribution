package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersDefaults extends StObject {
  
  var common: AxiosRequestHeaders
  
  var delete: AxiosRequestHeaders
  
  var get: AxiosRequestHeaders
  
  var head: AxiosRequestHeaders
  
  var link: js.UndefOr[AxiosRequestHeaders] = js.undefined
  
  var options: js.UndefOr[AxiosRequestHeaders] = js.undefined
  
  var patch: AxiosRequestHeaders
  
  var post: AxiosRequestHeaders
  
  var purge: js.UndefOr[AxiosRequestHeaders] = js.undefined
  
  var put: AxiosRequestHeaders
  
  var unlink: js.UndefOr[AxiosRequestHeaders] = js.undefined
}
object HeadersDefaults {
  
  inline def apply(
    common: AxiosRequestHeaders,
    delete: AxiosRequestHeaders,
    get: AxiosRequestHeaders,
    head: AxiosRequestHeaders,
    patch: AxiosRequestHeaders,
    post: AxiosRequestHeaders,
    put: AxiosRequestHeaders
  ): HeadersDefaults = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersDefaults]
  }
  
  extension [Self <: HeadersDefaults](x: Self) {
    
    inline def setCommon(value: AxiosRequestHeaders): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: AxiosRequestHeaders): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: AxiosRequestHeaders): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setHead(value: AxiosRequestHeaders): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setLink(value: AxiosRequestHeaders): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setOptions(value: AxiosRequestHeaders): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPatch(value: AxiosRequestHeaders): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPost(value: AxiosRequestHeaders): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPurge(value: AxiosRequestHeaders): Self = StObject.set(x, "purge", value.asInstanceOf[js.Any])
    
    inline def setPurgeUndefined: Self = StObject.set(x, "purge", js.undefined)
    
    inline def setPut(value: AxiosRequestHeaders): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
    
    inline def setUnlink(value: AxiosRequestHeaders): Self = StObject.set(x, "unlink", value.asInstanceOf[js.Any])
    
    inline def setUnlinkUndefined: Self = StObject.set(x, "unlink", js.undefined)
  }
}
