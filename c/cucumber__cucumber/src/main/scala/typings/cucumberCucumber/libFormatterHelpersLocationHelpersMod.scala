package typings.cucumberCucumber

import typings.cucumberCucumber.libTypesMod.ILineAndUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatterHelpersLocationHelpersMod {
  
  @JSImport("@cucumber/cucumber/lib/formatter/helpers/location_helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatLocation(obj: ILineAndUri): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLocation")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatLocation(obj: ILineAndUri, cwd: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatLocation")(obj.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[String]
}
