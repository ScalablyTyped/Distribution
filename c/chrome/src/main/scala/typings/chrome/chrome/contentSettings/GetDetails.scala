package typings.chrome.chrome.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDetails extends StObject {
  
  /** Optional. Whether to check the content settings for an incognito session. (default false)  */
  var incognito: js.UndefOr[Boolean] = js.native
  
  /** The primary URL for which the content setting should be retrieved. Note that the meaning of a primary URL depends on the content type. */
  var primaryUrl: String = js.native
  
  /** Optional. A more specific identifier of the type of content for which the settings should be retrieved.  */
  var resourceIdentifier: js.UndefOr[ResourceIdentifier] = js.native
  
  /** Optional. The secondary URL for which the content setting should be retrieved. Defaults to the primary URL. Note that the meaning of a secondary URL depends on the content type, and not all content types use secondary URLs.  */
  var secondaryUrl: js.UndefOr[String] = js.native
}
object GetDetails {
  
  @scala.inline
  def apply(primaryUrl: String): GetDetails = {
    val __obj = js.Dynamic.literal(primaryUrl = primaryUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetails]
  }
  
  @scala.inline
  implicit class GetDetailsMutableBuilder[Self <: GetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
    
    @scala.inline
    def setPrimaryUrl(value: String): Self = StObject.set(x, "primaryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "resourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifierUndefined: Self = StObject.set(x, "resourceIdentifier", js.undefined)
    
    @scala.inline
    def setSecondaryUrl(value: String): Self = StObject.set(x, "secondaryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryUrlUndefined: Self = StObject.set(x, "secondaryUrl", js.undefined)
  }
}
