package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeletextSourceSettings extends StObject {
  
  /**
    * Specifies the teletext page number within the data stream from which to extract captions. Range of 0x100 (256) to 0x8FF (2303). Unused for passthrough. Should be specified as a hexadecimal string with no "0x" prefix.
    */
  var PageNumber: js.UndefOr[string] = js.undefined
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
    def setPageNumber(value: string): Self = StObject.set(x, "PageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberUndefined: Self = StObject.set(x, "PageNumber", js.undefined)
  }
}
