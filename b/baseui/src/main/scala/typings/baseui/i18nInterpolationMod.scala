package typings.baseui

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18nInterpolationMod {
  
  @JSImport("baseui/helpers/i18n-interpolation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(translation: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(translation.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(translation: String, interpolations: StringDictionary[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(translation.asInstanceOf[js.Any], interpolations.asInstanceOf[js.Any])).asInstanceOf[String]
}
