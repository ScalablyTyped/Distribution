package typings.cheerio

import typings.cheerio.cheerioStrings._empty
import typings.cheerio.libCheerioMod.Cheerio
import typings.cheerio.libOptionsMod.CheerioOptions
import typings.cheerio.libTypesMod.BasicAcceptedElems
import typings.domhandler.libNodeMod.AnyNode
import typings.domhandler.mod.Document
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStaticMod {
  
  @JSImport("cheerio/lib/static", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contains(container: AnyNode, contained: AnyNode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(container.asInstanceOf[js.Any], contained.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def html(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("html")().asInstanceOf[String]
  inline def html(dom: Unit, options: CheerioOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(dom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def html(dom: BasicAcceptedElems[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(dom.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def html(dom: BasicAcceptedElems[AnyNode], options: CheerioOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(dom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def html(options: CheerioOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def merge[T](arr1: WritableArrayLike[T], arr2: ArrayLike[T]): js.UndefOr[ArrayLike[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ArrayLike[T]]]
  
  inline def parseHTML(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")().asInstanceOf[Null]
  inline def parseHTML(data: String): js.Array[AnyNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[AnyNode]]
  inline def parseHTML(data: String, context: Any): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def parseHTML(data: String, context: Any, keepScripts: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any], context.asInstanceOf[js.Any], keepScripts.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def parseHTML(data: String, context: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def parseHTML(data: String, context: Boolean, keepScripts: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any], context.asInstanceOf[js.Any], keepScripts.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def parseHTML(data: String, context: Unit, keepScripts: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any], context.asInstanceOf[js.Any], keepScripts.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def parseHTML(data: _empty): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  inline def root(): Cheerio[Document] = ^.asInstanceOf[js.Dynamic].applyDynamic("root")().asInstanceOf[Cheerio[Document]]
  
  inline def text(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("text")().asInstanceOf[String]
  inline def text(elements: ArrayLike[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(elements.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def xml(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xml")().asInstanceOf[String]
  inline def xml(dom: BasicAcceptedElems[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xml")(dom.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait WritableArrayLike[T]
    extends StObject
       with ArrayLike[T]
  object WritableArrayLike {
    
    inline def apply[T](length: Double): WritableArrayLike[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[WritableArrayLike[T]]
    }
  }
}
