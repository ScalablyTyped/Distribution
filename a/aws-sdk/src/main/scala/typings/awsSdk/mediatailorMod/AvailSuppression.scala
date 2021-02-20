package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailSuppression extends StObject {
  
  /**
    * Sets the mode for avail suppression, also known as ad suppression. By default, ad suppression is off and all ad breaks are filled by MediaTailor with ads or slate.
    */
  var Mode: js.UndefOr[typings.awsSdk.mediatailorMod.Mode] = js.native
  
  /**
    * The avail suppression value is a live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on or behind this time in the manifest lookback window. 
    */
  var Value: js.UndefOr[string] = js.native
}
object AvailSuppression {
  
  @scala.inline
  def apply(): AvailSuppression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailSuppression]
  }
  
  @scala.inline
  implicit class AvailSuppressionMutableBuilder[Self <: AvailSuppression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: Mode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    @scala.inline
    def setValue(value: string): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
