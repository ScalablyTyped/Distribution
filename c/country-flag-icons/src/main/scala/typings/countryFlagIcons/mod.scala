package typings.countryFlagIcons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("country-flag-icons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("country-flag-icons", "countries")
  @js.native
  val countries: js.Array[String] = js.native
  
  @scala.inline
  def hasFlag(country: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasFlag")(country.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
