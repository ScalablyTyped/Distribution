package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeletextDestinationSettings extends js.Object {
  
  /**
    * Set pageNumber to the Teletext page number for the destination captions for this output. This value must be a three-digit hexadecimal string; strings ending in -FF are invalid. If you are passing through the entire set of Teletext data, do not use this field.
    */
  var PageNumber: js.UndefOr[stringMin3Max3Pattern1809aFAF09aEAE] = js.native
  
  /**
    * Specify the page types for this Teletext page. If you don't specify a value here, the service sets the page type to the default value Subtitle (PAGE_TYPE_SUBTITLE). If you pass through the entire set of Teletext data, don't use this field. When you pass through a set of Teletext pages, your output has the same page types as your input.
    */
  var PageTypes: js.UndefOr[listOfTeletextPageType] = js.native
}
object TeletextDestinationSettings {
  
  @scala.inline
  def apply(): TeletextDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeletextDestinationSettings]
  }
  
  @scala.inline
  implicit class TeletextDestinationSettingsOps[Self <: TeletextDestinationSettings] (val x: Self) extends AnyVal {
    
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
    def setPageNumber(value: stringMin3Max3Pattern1809aFAF09aEAE): Self = this.set("PageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageNumber: Self = this.set("PageNumber", js.undefined)
    
    @scala.inline
    def setPageTypesVarargs(value: TeletextPageType*): Self = this.set("PageTypes", js.Array(value :_*))
    
    @scala.inline
    def setPageTypes(value: listOfTeletextPageType): Self = this.set("PageTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageTypes: Self = this.set("PageTypes", js.undefined)
  }
}
