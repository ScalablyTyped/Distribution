package typings.cordovaPluginContacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Search options to filter navigator.contacts.  */
@js.native
trait ContactFindOptions extends StObject {
  
  /* Contact fields to be returned back. If specified, the resulting Contact object only features values for these fields. */
  var desiredFields: js.UndefOr[js.Array[ContactFieldType]] = js.native
  
  /** The search string used to find navigator.contacts. */
  var filter: js.UndefOr[String] = js.native
  
  /** Determines if the find operation returns multiple navigator.contacts. */
  var multiple: js.UndefOr[Boolean] = js.native
}
object ContactFindOptions {
  
  @scala.inline
  def apply(): ContactFindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactFindOptions]
  }
  
  @scala.inline
  implicit class ContactFindOptionsMutableBuilder[Self <: ContactFindOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredFields(value: js.Array[ContactFieldType]): Self = StObject.set(x, "desiredFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredFieldsUndefined: Self = StObject.set(x, "desiredFields", js.undefined)
    
    @scala.inline
    def setDesiredFieldsVarargs(value: ContactFieldType*): Self = StObject.set(x, "desiredFields", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
  }
}
