package typings.cheerio

import typings.cheerio.libEsmOptionsMod.InternalOptions
import typings.domhandler.libNodeMod.AnyNode
import typings.domhandler.libNodeMod.ParentNode
import typings.domhandler.mod.Document
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmParsersParse5AdapterMod {
  
  @JSImport("cheerio/lib/esm/parsers/parse5-adapter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseWithParse5(content: String, options: InternalOptions, isDocument: Boolean): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithParse5")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[Document]
  inline def parseWithParse5(content: String, options: InternalOptions, isDocument: Boolean, context: ParentNode): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithParse5")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Document]
  
  inline def renderWithParse5(dom: AnyNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderWithParse5")(dom.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def renderWithParse5(dom: ArrayLike[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderWithParse5")(dom.asInstanceOf[js.Any]).asInstanceOf[String]
}
