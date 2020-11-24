package typings.baseui.phoneInputMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneInputLiteProps extends PhoneInputProps {
  
  var countries: StringDictionary[Country] = js.native
}
object PhoneInputLiteProps {
  
  @scala.inline
  def apply(countries: StringDictionary[Country]): PhoneInputLiteProps = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneInputLiteProps]
  }
  
  @scala.inline
  implicit class PhoneInputLitePropsOps[Self <: PhoneInputLiteProps] (val x: Self) extends AnyVal {
    
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
    def setCountries(value: StringDictionary[Country]): Self = this.set("countries", value.asInstanceOf[js.Any])
  }
}
