package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeletextDestinationSettings extends StObject {
  
  /**
    * Set pageNumber to the Teletext page number for the destination captions for this output. This value must be a three-digit hexadecimal string; strings ending in -FF are invalid. If you are passing through the entire set of Teletext data, do not use this field.
    */
  var PageNumber: js.UndefOr[stringMin3Max3Pattern1809aFAF09aEAE] = js.undefined
  
  /**
    * Specify the page types for this Teletext page. If you don't specify a value here, the service sets the page type to the default value Subtitle (PAGE_TYPE_SUBTITLE). If you pass through the entire set of Teletext data, don't use this field. When you pass through a set of Teletext pages, your output has the same page types as your input.
    */
  var PageTypes: js.UndefOr[listOfTeletextPageType] = js.undefined
}
object TeletextDestinationSettings {
  
  inline def apply(): TeletextDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeletextDestinationSettings]
  }
  
  extension [Self <: TeletextDestinationSettings](x: Self) {
    
    inline def setPageNumber(value: stringMin3Max3Pattern1809aFAF09aEAE): Self = StObject.set(x, "PageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "PageNumber", js.undefined)
    
    inline def setPageTypes(value: listOfTeletextPageType): Self = StObject.set(x, "PageTypes", value.asInstanceOf[js.Any])
    
    inline def setPageTypesUndefined: Self = StObject.set(x, "PageTypes", js.undefined)
    
    inline def setPageTypesVarargs(value: TeletextPageType*): Self = StObject.set(x, "PageTypes", js.Array(value*))
  }
}
