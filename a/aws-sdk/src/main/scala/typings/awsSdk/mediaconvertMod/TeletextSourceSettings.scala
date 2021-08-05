package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeletextSourceSettings extends StObject {
  
  /**
    * Use Page Number (PageNumber) to specify the three-digit hexadecimal page number that will be used for Teletext captions. Do not use this setting if you are passing through teletext from the input source to output.
    */
  var PageNumber: js.UndefOr[stringMin3Max3Pattern1809aFAF09aEAE] = js.undefined
}
object TeletextSourceSettings {
  
  inline def apply(): TeletextSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeletextSourceSettings]
  }
  
  extension [Self <: TeletextSourceSettings](x: Self) {
    
    inline def setPageNumber(value: stringMin3Max3Pattern1809aFAF09aEAE): Self = StObject.set(x, "PageNumber", value.asInstanceOf[js.Any])
    
    inline def setPageNumberUndefined: Self = StObject.set(x, "PageNumber", js.undefined)
  }
}
