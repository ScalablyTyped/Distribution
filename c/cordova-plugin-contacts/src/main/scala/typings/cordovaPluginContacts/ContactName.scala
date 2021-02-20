package typings.cordovaPluginContacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains different kinds of information about a Contact object's name. */
@js.native
trait ContactName extends StObject {
  
  /** The contact's family name. */
  var familyName: js.UndefOr[String] = js.native
  
  /** The complete name of the contact. */
  var formatted: js.UndefOr[String] = js.native
  
  /** The contact's given name. */
  var givenName: js.UndefOr[String] = js.native
  
  /** The contact's prefix (example Mr. or Dr.) */
  var honorificPrefix: js.UndefOr[String] = js.native
  
  /** The contact's suffix (example Esq.). */
  var honorificSuffix: js.UndefOr[String] = js.native
  
  /** The contact's middle name. */
  var middleName: js.UndefOr[String] = js.native
}
object ContactName {
  
  @scala.inline
  def apply(): ContactName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactName]
  }
  
  @scala.inline
  implicit class ContactNameMutableBuilder[Self <: ContactName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    @scala.inline
    def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedUndefined: Self = StObject.set(x, "formatted", js.undefined)
    
    @scala.inline
    def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
    
    @scala.inline
    def setHonorificPrefix(value: String): Self = StObject.set(x, "honorificPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHonorificPrefixUndefined: Self = StObject.set(x, "honorificPrefix", js.undefined)
    
    @scala.inline
    def setHonorificSuffix(value: String): Self = StObject.set(x, "honorificSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHonorificSuffixUndefined: Self = StObject.set(x, "honorificSuffix", js.undefined)
    
    @scala.inline
    def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
  }
}
