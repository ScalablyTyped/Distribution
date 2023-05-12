package typings.chalkTemplate

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chalk-template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(text: TemplateStringsArray, placeholders: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(text.asInstanceOf[js.Any]).`++`(placeholders.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def chalkTemplateStderr(text: TemplateStringsArray, placeholders: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("chalkTemplateStderr")(scala.List(text.asInstanceOf[js.Any]).`++`(placeholders.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def template(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def templateStderr(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("templateStderr")(text.asInstanceOf[js.Any]).asInstanceOf[String]
}
