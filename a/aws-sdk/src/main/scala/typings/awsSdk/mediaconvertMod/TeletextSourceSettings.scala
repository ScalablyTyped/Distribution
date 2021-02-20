package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeletextSourceSettings extends StObject {
  
  /**
    * Use Page Number (PageNumber) to specify the three-digit hexadecimal page number that will be used for Teletext captions. Do not use this setting if you are passing through teletext from the input source to output.
    */
  var PageNumber: js.UndefOr[stringMin3Max3Pattern1809aFAF09aEAE] = js.native
}
object TeletextSourceSettings {
  
  @scala.inline
  def apply(): TeletextSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeletextSourceSettings]
  }
  
  @scala.inline
  implicit class TeletextSourceSettingsMutableBuilder[Self <: TeletextSourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageNumber(value: stringMin3Max3Pattern1809aFAF09aEAE): Self = StObject.set(x, "PageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberUndefined: Self = StObject.set(x, "PageNumber", js.undefined)
  }
}
