package typings.baseui

import org.scalablytyped.runtime.Shortcut
import typings.baseui.anon.CountrySelectDropdownProp
import typings.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object countrySelectDropdownMod extends Shortcut {
  
  @JSImport("baseui/phone-input/country-select-dropdown", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[CountrySelectDropdownProp] = js.native
  
  type _To = ForwardRefExoticComponent[CountrySelectDropdownProp]
  
  /* This means you don't have to write `default`, but can instead just say `countrySelectDropdownMod.foo` */
  override def _to: ForwardRefExoticComponent[CountrySelectDropdownProp] = default
}
