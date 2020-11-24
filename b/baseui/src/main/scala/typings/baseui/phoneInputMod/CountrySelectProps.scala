package typings.baseui.phoneInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.selectMod.OnChangeParams
import typings.react.mod.Ref
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountrySelectProps extends js.Object {
  
  var countries: StringDictionary[Country] = js.native
  
  var country: js.UndefOr[Country] = js.native
  
  var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.native
  
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ String, String]] = js.native
  
  var maxDropdownHeight: js.UndefOr[String] = js.native
  
  var maxDropdownWidth: js.UndefOr[String] = js.native
  
  var onCountryChange: js.UndefOr[js.Function1[/* event */ OnChangeParams, _]] = js.native
  
  var overrides: js.UndefOr[typings.baseui.anon.CountrySelect] = js.native
  
  var size: js.UndefOr[mini | default_ | compact | large_] = js.native
}
object CountrySelectProps {
  
  @scala.inline
  def apply(countries: StringDictionary[Country]): CountrySelectProps = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountrySelectProps]
  }
  
  @scala.inline
  implicit class CountrySelectPropsOps[Self <: CountrySelectProps] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setCountry(value: Country): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInputRef(value: Ref[HTMLInputElement]): Self = this.set("inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
    
    @scala.inline
    def setInputRefNull: Self = this.set("inputRef", null)
    
    @scala.inline
    def setMapIsoToLabel(value: /* iso */ String => String): Self = this.set("mapIsoToLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMapIsoToLabel: Self = this.set("mapIsoToLabel", js.undefined)
    
    @scala.inline
    def setMaxDropdownHeight(value: String): Self = this.set("maxDropdownHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDropdownHeight: Self = this.set("maxDropdownHeight", js.undefined)
    
    @scala.inline
    def setMaxDropdownWidth(value: String): Self = this.set("maxDropdownWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDropdownWidth: Self = this.set("maxDropdownWidth", js.undefined)
    
    @scala.inline
    def setOnCountryChange(value: /* event */ OnChangeParams => _): Self = this.set("onCountryChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCountryChange: Self = this.set("onCountryChange", js.undefined)
    
    @scala.inline
    def setOverrides(value: typings.baseui.anon.CountrySelect): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setSize(value: mini | default_ | compact | large_): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
