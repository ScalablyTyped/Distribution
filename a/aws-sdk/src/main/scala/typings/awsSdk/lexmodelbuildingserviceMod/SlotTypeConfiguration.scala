package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotTypeConfiguration extends StObject {
  
  /**
    * A regular expression used to validate the value of a slot.
    */
  var regexConfiguration: js.UndefOr[SlotTypeRegexConfiguration] = js.native
}
object SlotTypeConfiguration {
  
  @scala.inline
  def apply(): SlotTypeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotTypeConfiguration]
  }
  
  @scala.inline
  implicit class SlotTypeConfigurationMutableBuilder[Self <: SlotTypeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegexConfiguration(value: SlotTypeRegexConfiguration): Self = StObject.set(x, "regexConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexConfigurationUndefined: Self = StObject.set(x, "regexConfiguration", js.undefined)
  }
}
