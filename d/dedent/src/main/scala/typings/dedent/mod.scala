package typings.dedent

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(literals: String): String = ^.asInstanceOf[js.Dynamic].apply(literals.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(literals: TemplateStringsArray, placeholders: Any*): String = ^.asInstanceOf[js.Dynamic].apply(scala.List(literals.asInstanceOf[js.Any]).`++`(placeholders.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  @JSImport("dedent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
