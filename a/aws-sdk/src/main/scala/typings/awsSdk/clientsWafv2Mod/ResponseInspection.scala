package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseInspection extends StObject {
  
  /**
    * Configures inspection of the response body. WAF can inspect the first 65,536 bytes (64 KB) of the response body. 
    */
  var BodyContains: js.UndefOr[ResponseInspectionBodyContains] = js.undefined
  
  /**
    * Configures inspection of the response header. 
    */
  var Header: js.UndefOr[ResponseInspectionHeader] = js.undefined
  
  /**
    * Configures inspection of the response JSON. WAF can inspect the first 65,536 bytes (64 KB) of the response JSON. 
    */
  var Json: js.UndefOr[ResponseInspectionJson] = js.undefined
  
  /**
    * Configures inspection of the response status code. 
    */
  var StatusCode: js.UndefOr[ResponseInspectionStatusCode] = js.undefined
}
object ResponseInspection {
  
  inline def apply(): ResponseInspection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseInspection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseInspection] (val x: Self) extends AnyVal {
    
    inline def setBodyContains(value: ResponseInspectionBodyContains): Self = StObject.set(x, "BodyContains", value.asInstanceOf[js.Any])
    
    inline def setBodyContainsUndefined: Self = StObject.set(x, "BodyContains", js.undefined)
    
    inline def setHeader(value: ResponseInspectionHeader): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
    
    inline def setJson(value: ResponseInspectionJson): Self = StObject.set(x, "Json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "Json", js.undefined)
    
    inline def setStatusCode(value: ResponseInspectionStatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
  }
}
