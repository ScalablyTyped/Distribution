package typings.cordovaPluginContacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Search options to filter navigator.contacts.  */
@js.native
trait ContactFindOptions extends js.Object {
  
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
  implicit class ContactFindOptionsOps[Self <: ContactFindOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDesiredFieldsVarargs(value: ContactFieldType*): Self = this.set("desiredFields", js.Array(value :_*))
    
    @scala.inline
    def setDesiredFields(value: js.Array[ContactFieldType]): Self = this.set("desiredFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredFields: Self = this.set("desiredFields", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
  }
}
