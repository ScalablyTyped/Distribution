package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{[ Key in axios.axios.Method as std.Lowercase<Key> ]: axios.axios.AxiosHeaders} & {  common :axios.axios.AxiosHeaders}> */
trait MethodsHeaders extends StObject {
  
  var DELETE: js.UndefOr[AxiosHeaders] = js.undefined
  
  var GET: js.UndefOr[AxiosHeaders] = js.undefined
  
  var HEAD: js.UndefOr[AxiosHeaders] = js.undefined
  
  var LINK: js.UndefOr[AxiosHeaders] = js.undefined
  
  var OPTIONS: js.UndefOr[AxiosHeaders] = js.undefined
  
  var PATCH: js.UndefOr[AxiosHeaders] = js.undefined
  
  var POST: js.UndefOr[AxiosHeaders] = js.undefined
  
  var PURGE: js.UndefOr[AxiosHeaders] = js.undefined
  
  var PUT: js.UndefOr[AxiosHeaders] = js.undefined
  
  var UNLINK: js.UndefOr[AxiosHeaders] = js.undefined
  
  var common: js.UndefOr[AxiosHeaders] = js.undefined
  
  var delete: js.UndefOr[AxiosHeaders] = js.undefined
  
  var get: js.UndefOr[AxiosHeaders] = js.undefined
  
  var head: js.UndefOr[AxiosHeaders] = js.undefined
  
  var link: js.UndefOr[AxiosHeaders] = js.undefined
  
  var options: js.UndefOr[AxiosHeaders] = js.undefined
  
  var patch: js.UndefOr[AxiosHeaders] = js.undefined
  
  var post: js.UndefOr[AxiosHeaders] = js.undefined
  
  var purge: js.UndefOr[AxiosHeaders] = js.undefined
  
  var put: js.UndefOr[AxiosHeaders] = js.undefined
  
  var unlink: js.UndefOr[AxiosHeaders] = js.undefined
}
object MethodsHeaders {
  
  inline def apply(): MethodsHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodsHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MethodsHeaders] (val x: Self) extends AnyVal {
    
    inline def setCommon(value: AxiosHeaders): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    inline def setDELETE(value: AxiosHeaders): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setDELETEUndefined: Self = StObject.set(x, "DELETE", js.undefined)
    
    inline def setGET(value: AxiosHeaders): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
    
    inline def setGETUndefined: Self = StObject.set(x, "GET", js.undefined)
    
    inline def setHEAD(value: AxiosHeaders): Self = StObject.set(x, "HEAD", value.asInstanceOf[js.Any])
    
    inline def setHEADUndefined: Self = StObject.set(x, "HEAD", js.undefined)
    
    inline def setLINK(value: AxiosHeaders): Self = StObject.set(x, "LINK", value.asInstanceOf[js.Any])
    
    inline def setLINKUndefined: Self = StObject.set(x, "LINK", js.undefined)
    
    inline def setOPTIONS(value: AxiosHeaders): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
    
    inline def setOPTIONSUndefined: Self = StObject.set(x, "OPTIONS", js.undefined)
    
    inline def setPATCH(value: AxiosHeaders): Self = StObject.set(x, "PATCH", value.asInstanceOf[js.Any])
    
    inline def setPATCHUndefined: Self = StObject.set(x, "PATCH", js.undefined)
    
    inline def setPOST(value: AxiosHeaders): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
    
    inline def setPOSTUndefined: Self = StObject.set(x, "POST", js.undefined)
    
    inline def setPURGE(value: AxiosHeaders): Self = StObject.set(x, "PURGE", value.asInstanceOf[js.Any])
    
    inline def setPURGEUndefined: Self = StObject.set(x, "PURGE", js.undefined)
    
    inline def setPUT(value: AxiosHeaders): Self = StObject.set(x, "PUT", value.asInstanceOf[js.Any])
    
    inline def setPUTUndefined: Self = StObject.set(x, "PUT", js.undefined)
    
    inline def setUNLINK(value: AxiosHeaders): Self = StObject.set(x, "UNLINK", value.asInstanceOf[js.Any])
    
    inline def setUNLINKUndefined: Self = StObject.set(x, "UNLINK", js.undefined)
  }
}
