package typings.coreJs

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnStringRawMod {
  
  /* was `typeof core.String.raw` */
  inline def apply(template: TemplateStringsArray, substitutions: Any*): java.lang.String = ^.asInstanceOf[js.Dynamic].apply(scala.List(template.asInstanceOf[js.Any]).`++`(substitutions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[java.lang.String]
  
  @JSImport("core-js/fn/string/raw", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
