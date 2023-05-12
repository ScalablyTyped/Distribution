package typings.cucumberCucumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCliI18nMod {
  
  @JSImport("@cucumber/cucumber/lib/cli/i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getKeywords(isoCode: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeywords")(isoCode.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getLanguages(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguages")().asInstanceOf[String]
}
