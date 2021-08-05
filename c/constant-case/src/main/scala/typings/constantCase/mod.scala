package typings.constantCase

import typings.noCase.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("constant-case", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def constantCase(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("constantCase")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def constantCase(input: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("constantCase")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
