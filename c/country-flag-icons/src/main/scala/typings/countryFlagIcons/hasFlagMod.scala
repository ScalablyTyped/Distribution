package typings.countryFlagIcons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hasFlagMod {
  
  @JSImport("country-flag-icons/commonjs/hasFlag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(country: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(country.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
