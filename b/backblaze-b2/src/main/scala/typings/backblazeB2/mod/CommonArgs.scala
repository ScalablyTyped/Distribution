package typings.backblazeB2.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonArgs extends StObject {
  
  var axios: js.UndefOr[Record[String, Any]] = js.undefined
  
  var axiosOverride: js.UndefOr[Record[String, Any]] = js.undefined
}
object CommonArgs {
  
  inline def apply(): CommonArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonArgs]
  }
  
  extension [Self <: CommonArgs](x: Self) {
    
    inline def setAxios(value: Record[String, Any]): Self = StObject.set(x, "axios", value.asInstanceOf[js.Any])
    
    inline def setAxiosOverride(value: Record[String, Any]): Self = StObject.set(x, "axiosOverride", value.asInstanceOf[js.Any])
    
    inline def setAxiosOverrideUndefined: Self = StObject.set(x, "axiosOverride", js.undefined)
    
    inline def setAxiosUndefined: Self = StObject.set(x, "axios", js.undefined)
  }
}
