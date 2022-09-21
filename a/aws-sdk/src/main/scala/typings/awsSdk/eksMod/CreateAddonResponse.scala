package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAddonResponse extends StObject {
  
  var addon: js.UndefOr[Addon] = js.undefined
}
object CreateAddonResponse {
  
  inline def apply(): CreateAddonResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAddonResponse]
  }
  
  extension [Self <: CreateAddonResponse](x: Self) {
    
    inline def setAddon(value: Addon): Self = StObject.set(x, "addon", value.asInstanceOf[js.Any])
    
    inline def setAddonUndefined: Self = StObject.set(x, "addon", js.undefined)
  }
}
