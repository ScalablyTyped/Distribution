package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotTypeConfiguration extends StObject {
  
  /**
    * A regular expression used to validate the value of a slot.
    */
  var regexConfiguration: js.UndefOr[SlotTypeRegexConfiguration] = js.undefined
}
object SlotTypeConfiguration {
  
  inline def apply(): SlotTypeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotTypeConfiguration]
  }
  
  extension [Self <: SlotTypeConfiguration](x: Self) {
    
    inline def setRegexConfiguration(value: SlotTypeRegexConfiguration): Self = StObject.set(x, "regexConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRegexConfigurationUndefined: Self = StObject.set(x, "regexConfiguration", js.undefined)
  }
}
