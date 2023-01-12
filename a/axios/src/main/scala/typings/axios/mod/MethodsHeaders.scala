package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ Key in axios.axios.Method as std.Lowercase<Key> ]: axios.axios.AxiosHeaders} */
trait MethodsHeaders extends StObject {
  
  var DELETE: AxiosHeaders
  
  var GET: AxiosHeaders
  
  var HEAD: AxiosHeaders
  
  var LINK: AxiosHeaders
  
  var OPTIONS: AxiosHeaders
  
  var PATCH: AxiosHeaders
  
  var POST: AxiosHeaders
  
  var PURGE: AxiosHeaders
  
  var PUT: AxiosHeaders
  
  var UNLINK: AxiosHeaders
  
  var delete: AxiosHeaders
  
  var get: AxiosHeaders
  
  var head: AxiosHeaders
  
  var link: AxiosHeaders
  
  var options: AxiosHeaders
  
  var patch: AxiosHeaders
  
  var post: AxiosHeaders
  
  var purge: AxiosHeaders
  
  var put: AxiosHeaders
  
  var unlink: AxiosHeaders
}
object MethodsHeaders {
  
  inline def apply(
    DELETE: AxiosHeaders,
    GET: AxiosHeaders,
    HEAD: AxiosHeaders,
    LINK: AxiosHeaders,
    OPTIONS: AxiosHeaders,
    PATCH: AxiosHeaders,
    POST: AxiosHeaders,
    PURGE: AxiosHeaders,
    PUT: AxiosHeaders,
    UNLINK: AxiosHeaders,
    delete: AxiosHeaders,
    get: AxiosHeaders,
    head: AxiosHeaders,
    link: AxiosHeaders,
    options: AxiosHeaders,
    patch: AxiosHeaders,
    post: AxiosHeaders,
    purge: AxiosHeaders,
    put: AxiosHeaders,
    unlink: AxiosHeaders
  ): MethodsHeaders = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], HEAD = HEAD.asInstanceOf[js.Any], LINK = LINK.asInstanceOf[js.Any], OPTIONS = OPTIONS.asInstanceOf[js.Any], PATCH = PATCH.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any], PURGE = PURGE.asInstanceOf[js.Any], PUT = PUT.asInstanceOf[js.Any], UNLINK = UNLINK.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], purge = purge.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any], unlink = unlink.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodsHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MethodsHeaders] (val x: Self) extends AnyVal {
    
    inline def setDELETE(value: AxiosHeaders): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setGET(value: AxiosHeaders): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
    
    inline def setHEAD(value: AxiosHeaders): Self = StObject.set(x, "HEAD", value.asInstanceOf[js.Any])
    
    inline def setLINK(value: AxiosHeaders): Self = StObject.set(x, "LINK", value.asInstanceOf[js.Any])
    
    inline def setOPTIONS(value: AxiosHeaders): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
    
    inline def setPATCH(value: AxiosHeaders): Self = StObject.set(x, "PATCH", value.asInstanceOf[js.Any])
    
    inline def setPOST(value: AxiosHeaders): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
    
    inline def setPURGE(value: AxiosHeaders): Self = StObject.set(x, "PURGE", value.asInstanceOf[js.Any])
    
    inline def setPUT(value: AxiosHeaders): Self = StObject.set(x, "PUT", value.asInstanceOf[js.Any])
    
    inline def setUNLINK(value: AxiosHeaders): Self = StObject.set(x, "UNLINK", value.asInstanceOf[js.Any])
  }
}
