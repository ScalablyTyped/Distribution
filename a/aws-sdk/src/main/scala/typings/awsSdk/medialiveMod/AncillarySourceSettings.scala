package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AncillarySourceSettings extends StObject {
  
  /**
    * Specifies the number (1 to 4) of the captions channel you want to extract from the ancillary captions. If you plan to convert the ancillary captions to another format, complete this field. If you plan to choose Embedded as the captions destination in the output (to pass through all the channels in the ancillary captions), leave this field blank because MediaLive ignores the field.
    */
  var SourceAncillaryChannelNumber: js.UndefOr[integerMin1Max4] = js.native
}
object AncillarySourceSettings {
  
  @scala.inline
  def apply(): AncillarySourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AncillarySourceSettings]
  }
  
  @scala.inline
  implicit class AncillarySourceSettingsMutableBuilder[Self <: AncillarySourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceAncillaryChannelNumber(value: integerMin1Max4): Self = StObject.set(x, "SourceAncillaryChannelNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAncillaryChannelNumberUndefined: Self = StObject.set(x, "SourceAncillaryChannelNumber", js.undefined)
  }
}
