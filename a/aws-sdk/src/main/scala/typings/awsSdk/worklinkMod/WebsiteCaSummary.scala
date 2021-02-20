package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebsiteCaSummary extends StObject {
  
  /**
    * The time when the CA was added.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.worklinkMod.DisplayName] = js.native
  
  /**
    * A unique identifier for the CA.
    */
  var WebsiteCaId: js.UndefOr[Id] = js.native
}
object WebsiteCaSummary {
  
  @scala.inline
  def apply(): WebsiteCaSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebsiteCaSummary]
  }
  
  @scala.inline
  implicit class WebsiteCaSummaryMutableBuilder[Self <: WebsiteCaSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTime(value: DateTime): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setWebsiteCaId(value: Id): Self = StObject.set(x, "WebsiteCaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteCaIdUndefined: Self = StObject.set(x, "WebsiteCaId", js.undefined)
  }
}
