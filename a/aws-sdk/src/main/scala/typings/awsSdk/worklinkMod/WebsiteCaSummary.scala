package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebsiteCaSummary extends StObject {
  
  /**
    * The time when the CA was added.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.worklinkMod.DisplayName] = js.undefined
  
  /**
    * A unique identifier for the CA.
    */
  var WebsiteCaId: js.UndefOr[Id] = js.undefined
}
object WebsiteCaSummary {
  
  inline def apply(): WebsiteCaSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebsiteCaSummary]
  }
  
  extension [Self <: WebsiteCaSummary](x: Self) {
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setWebsiteCaId(value: Id): Self = StObject.set(x, "WebsiteCaId", value.asInstanceOf[js.Any])
    
    inline def setWebsiteCaIdUndefined: Self = StObject.set(x, "WebsiteCaId", js.undefined)
  }
}
