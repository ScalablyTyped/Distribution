package typings.cheerio

import org.scalablytyped.runtime.StringDictionary
import typings.cheerio.libEsmLoadMod.CheerioAPI
import typings.cheerio.libEsmOptionsMod.CheerioOptions
import typings.cheerio.libOptionsMod.InternalOptions
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

object libSlimMod {
  
  @JSImport("cheerio/lib/slim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("cheerio/lib/slim", "Cheerio")
  @js.native
  open class Cheerio[T] protected ()
    extends typings.cheerio.libCheerioMod.Cheerio[T] {
    def this(elements: Unit, root: Null, options: InternalOptions) = this()
    def this(
      elements: Unit,
      root: typings.cheerio.libCheerioMod.Cheerio[typings.domhandler.mod.Document],
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
      root: typings.cheerio.libCheerioMod.Cheerio[typings.domhandler.mod.Document],
      options: InternalOptions
    ) = this()
  }
  
  @JSImport("cheerio/lib/slim", "Document")
  @js.native
  open class Document protected ()
    extends typings.cheerio.mod.Document {
    /**
      * @param children Children of the node. Only certain node types can have children.
      */
    def this(children: js.Array[ChildNode]) = this()
  }
  
  @JSImport("cheerio/lib/slim", "Element")
  @js.native
  open class Element protected ()
    extends typings.cheerio.mod.Element {
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
  
  /* note: abstract class */ @JSImport("cheerio/lib/slim", "Node")
  @js.native
  open class Node ()
    extends typings.cheerio.mod.Node
  
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
}
