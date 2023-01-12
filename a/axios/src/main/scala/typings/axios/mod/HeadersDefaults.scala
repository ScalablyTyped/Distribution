package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersDefaults extends StObject {
  
  var common: RawAxiosRequestHeaders
  
  var delete: RawAxiosRequestHeaders
  
  var get: RawAxiosRequestHeaders
  
  var head: RawAxiosRequestHeaders
  
  var link: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
  
  var options: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
  
  var patch: RawAxiosRequestHeaders
  
  var post: RawAxiosRequestHeaders
  
  var purge: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
  
  var put: RawAxiosRequestHeaders
  
  var unlink: js.UndefOr[RawAxiosRequestHeaders] = js.undefined
}
object HeadersDefaults {
  
  inline def apply(
    common: RawAxiosRequestHeaders,
    delete: RawAxiosRequestHeaders,
    get: RawAxiosRequestHeaders,
    head: RawAxiosRequestHeaders,
    patch: RawAxiosRequestHeaders,
    post: RawAxiosRequestHeaders,
    put: RawAxiosRequestHeaders
  ): HeadersDefaults = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersDefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeadersDefaults] (val x: Self) extends AnyVal {
    
    inline def setCommon(value: RawAxiosRequestHeaders): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: RawAxiosRequestHeaders): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: RawAxiosRequestHeaders): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setHead(value: RawAxiosRequestHeaders): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setLink(value: RawAxiosRequestHeaders): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setOptions(value: RawAxiosRequestHeaders): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPatch(value: RawAxiosRequestHeaders): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPost(value: RawAxiosRequestHeaders): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPurge(value: RawAxiosRequestHeaders): Self = StObject.set(x, "purge", value.asInstanceOf[js.Any])
    
    inline def setPurgeUndefined: Self = StObject.set(x, "purge", js.undefined)
    
    inline def setPut(value: RawAxiosRequestHeaders): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
    
    inline def setUnlink(value: RawAxiosRequestHeaders): Self = StObject.set(x, "unlink", value.asInstanceOf[js.Any])
    
    inline def setUnlinkUndefined: Self = StObject.set(x, "unlink", js.undefined)
  }
}
