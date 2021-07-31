package typings.dedent

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(literals: String): String = ^.asInstanceOf[js.Dynamic].apply(literals.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(literals: TemplateStringsArray, placeholders: js.Any*): String = (^.asInstanceOf[js.Dynamic].apply(literals.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("dedent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
