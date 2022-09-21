package typings.cheerio

import org.scalablytyped.runtime.StringDictionary
import typings.cheerio.cheerioStrings._empty
import typings.cheerio.libLoadMod.CheerioAPI
import typings.cheerio.libOptionsMod.CheerioOptions
import typings.cheerio.libOptionsMod.InternalOptions
import typings.cheerio.libStaticMod.WritableArrayLike
import typings.cheerio.libTypesMod.BasicAcceptedElems
import typings.domelementtype.mod.ElementType.Script
import typings.domelementtype.mod.ElementType.Style
import typings.domelementtype.mod.ElementType.Tag
import typings.domhandler.libNodeMod.AnyNode
import typings.domhandler.libNodeMod.ChildNode
import typings.node.bufferMod.global.Buffer
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cheerio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The default cheerio instance.
    *
    * @deprecated Use the function returned by `load` instead.
    */
  @JSImport("cheerio", JSImport.Default)
  @js.native
  val default: CheerioAPI = js.native
  
  @JSImport("cheerio", "Cheerio")
  @js.native
  abstract class Cheerio[T] protected ()
    extends typings.cheerio.cheerioMod.Cheerio[T] {
    def this(elements: Unit, root: Null, options: InternalOptions) = this()
    def this(
      elements: Unit,
      root: typings.cheerio.cheerioMod.Cheerio[typings.domhandler.mod.Document],
      options: InternalOptions
    ) = this()
    def this(elements: ArrayLike[T], root: Null, options: InternalOptions) = this()
    /**
      * Instance of cheerio. Methods are specified in the modules. Usage of this
      * constructor is not recommended. Please use `$.load` instead.
      *
      * @private
      * @param elements - The new selection.
      * @param root - Sets the root node.
      * @param options - Options for the instance.
      */
    def this(
      elements: ArrayLike[T],
      root: typings.cheerio.cheerioMod.Cheerio[typings.domhandler.mod.Document],
      options: InternalOptions
    ) = this()
  }
  
  @JSImport("cheerio", "Document")
  @js.native
  open class Document protected ()
    extends typings.domhandler.mod.Document {
    /**
      * @param children Children of the node. Only certain node types can have children.
      */
    def this(children: js.Array[ChildNode]) = this()
  }
  
  @JSImport("cheerio", "Element")
  @js.native
  open class Element protected ()
    extends typings.domhandler.mod.Element {
    /**
      * @param name Name of the tag, eg. `div`, `span`.
      * @param attribs Object mapping attribute names to attribute values.
      * @param children Children of the node.
      */
    def this(name: String, attribs: StringDictionary[String]) = this()
    def this(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode]) = this()
    def this(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode], `type`: Script) = this()
    def this(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode], `type`: Style) = this()
    def this(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode], `type`: Tag) = this()
    def this(name: String, attribs: StringDictionary[String], children: Unit, `type`: Script) = this()
    def this(name: String, attribs: StringDictionary[String], children: Unit, `type`: Style) = this()
    def this(name: String, attribs: StringDictionary[String], children: Unit, `type`: Tag) = this()
  }
  
  @JSImport("cheerio", "Node")
  @js.native
  abstract class Node ()
    extends typings.domhandler.mod.Node
  
  @JSImport("cheerio", "contains")
  @js.native
  val contains: js.Function2[/* container */ AnyNode, /* contained */ AnyNode, Boolean] = js.native
  
  inline def html(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("html")().asInstanceOf[String]
  inline def html(dom: Unit, options: CheerioOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(dom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def html(dom: BasicAcceptedElems[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(dom.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def html(dom: BasicAcceptedElems[AnyNode], options: CheerioOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(dom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def html(options: CheerioOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def load(content: String): CheerioAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any]).asInstanceOf[CheerioAPI]
  inline def load(content: String, options: Null, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: String, options: Unit, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: String, options: CheerioOptions): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: String, options: CheerioOptions, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: js.Array[AnyNode]): CheerioAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any]).asInstanceOf[CheerioAPI]
  inline def load(content: js.Array[AnyNode], options: Null, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: js.Array[AnyNode], options: Unit, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: js.Array[AnyNode], options: CheerioOptions): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: js.Array[AnyNode], options: CheerioOptions, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: AnyNode): CheerioAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any]).asInstanceOf[CheerioAPI]
  inline def load(content: AnyNode, options: Null, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: AnyNode, options: Unit, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: AnyNode, options: CheerioOptions): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: AnyNode, options: CheerioOptions, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: Buffer): CheerioAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any]).asInstanceOf[CheerioAPI]
  inline def load(content: Buffer, options: Null, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: Buffer, options: Unit, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: Buffer, options: CheerioOptions): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: Buffer, options: CheerioOptions, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  
  inline def merge[T](arr1: WritableArrayLike[T], arr2: ArrayLike[T]): js.UndefOr[ArrayLike[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ArrayLike[T]]]
  
  inline def parseHTML(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")().asInstanceOf[Null]
  inline def parseHTML(data: String): js.Array[AnyNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[AnyNode]]
  inline def parseHTML(data: String, context: Any): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def parseHTML(data: String, context: Any, keepScripts: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any], context.asInstanceOf[js.Any], keepScripts.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def parseHTML(data: String, context: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def parseHTML(data: String, context: Boolean, keepScripts: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any], context.asInstanceOf[js.Any], keepScripts.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def parseHTML(data: String, context: Unit, keepScripts: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any], context.asInstanceOf[js.Any], keepScripts.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def parseHTML(data: _empty): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  @JSImport("cheerio", "root")
  @js.native
  val root: js.ThisFunction0[
    /* this */ CheerioAPI, 
    typings.cheerio.cheerioMod.Cheerio[typings.domhandler.mod.Document]
  ] = js.native
  
  inline def text(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("text")().asInstanceOf[String]
  inline def text(elements: ArrayLike[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(elements.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def xml(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xml")().asInstanceOf[String]
  inline def xml(dom: BasicAcceptedElems[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xml")(dom.asInstanceOf[js.Any]).asInstanceOf[String]
}
