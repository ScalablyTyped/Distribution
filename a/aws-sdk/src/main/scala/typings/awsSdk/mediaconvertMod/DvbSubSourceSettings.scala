package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DvbSubSourceSettings extends StObject {
  
  /**
    * When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source content. Unused for DVB-Sub passthrough. All DVB-Sub content is passed through, regardless of selectors.
    */
  var Pid: js.UndefOr[integerMin1Max2147483647] = js.native
}
object DvbSubSourceSettings {
  
  @scala.inline
  def apply(): DvbSubSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DvbSubSourceSettings]
  }
  
  @scala.inline
  implicit class DvbSubSourceSettingsMutableBuilder[Self <: DvbSubSourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPid(value: integerMin1Max2147483647): Self = StObject.set(x, "Pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPidUndefined: Self = StObject.set(x, "Pid", js.undefined)
  }
}
