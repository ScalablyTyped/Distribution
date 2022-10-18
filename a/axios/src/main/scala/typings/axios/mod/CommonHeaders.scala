package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonHeaders extends StObject {
  
  var common: AxiosHeaders
}
object CommonHeaders {
  
  inline def apply(common: AxiosHeaders): CommonHeaders = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonHeaders]
  }
  
  extension [Self <: CommonHeaders](x: Self) {
    
    inline def setCommon(value: AxiosHeaders): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
  }
}
