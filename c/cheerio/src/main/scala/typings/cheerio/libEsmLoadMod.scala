package typings.cheerio

import typings.cheerio.cheerioStrings._empty
import typings.cheerio.libEsmCheerioMod.Cheerio
import typings.cheerio.libEsmOptionsMod.CheerioOptions
import typings.cheerio.libEsmOptionsMod.InternalOptions
import typings.cheerio.libEsmStaticMod.WritableArrayLike
import typings.cheerio.libEsmTypesMod.BasicAcceptedElems
import typings.domhandler.libNodeMod.AnyNode
import typings.domhandler.libNodeMod.ParentNode
import typings.domhandler.mod.Document
import typings.node.bufferMod.global.Buffer
import typings.std.ArrayLike
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmLoadMod {
  
  @JSImport("cheerio/lib/esm/load", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLoad(
    parse: js.Function4[
      /* content */ String | Document | AnyNode | js.Array[AnyNode] | Buffer, 
      /* options */ InternalOptions, 
      /* isDocument */ Boolean, 
      /* context */ ParentNode | Null, 
      Document
    ],
    render: js.Function2[/* dom */ AnyNode | ArrayLike[AnyNode], /* options */ InternalOptions, String]
  ): js.Function3[
    /* content */ String | AnyNode | js.Array[AnyNode] | Buffer, 
    /* options */ js.UndefOr[CheerioOptions | Null], 
    /* isDocument */ js.UndefOr[Boolean], 
    CheerioAPI
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoad")(parse.asInstanceOf[js.Any], render.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* content */ String | AnyNode | js.Array[AnyNode] | Buffer, 
    /* options */ js.UndefOr[CheerioOptions | Null], 
    /* isDocument */ js.UndefOr[Boolean], 
    CheerioAPI
  ]]
  
  @js.native
  trait CheerioAPI
    extends StObject
       with StaticType {
    
    /**
      * This selector method is the starting point for traversing and manipulating
      * the document. Like jQuery, it's the primary method for selecting elements
      * in the document.
      *
      * `selector` searches within the `context` scope which searches within the
      * `root` scope.
      *
      * @example
      *
      * ```js
      * $('.apple', '#fruits').text();
      * //=> Apple
      *
      * $('ul .pear').attr('class');
      * //=> pear
      *
      * $('li[class=orange]').html();
      * //=> Orange
      * ```
      *
      * @param selector - Either a selector to look for within the document, or the
      *   contents of a new Cheerio instance.
      * @param context - Either a selector to look for within the root, or the
      *   contents of the document to query.
      * @param root - Optional HTML document string.
      */
    def apply[T /* <: AnyNode */, S /* <: String */](): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](selector: BasicAcceptedElems[T] | S): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](selector: BasicAcceptedElems[T] | S, context: Null, root: Unit, options: CheerioOptions): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](selector: BasicAcceptedElems[T] | S, context: Null, root: BasicAcceptedElems[Document]): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](
      selector: BasicAcceptedElems[T] | S,
      context: Null,
      root: BasicAcceptedElems[Document],
      options: CheerioOptions
    ): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](selector: BasicAcceptedElems[T] | S, context: Unit, root: Unit, options: CheerioOptions): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](selector: BasicAcceptedElems[T] | S, context: Unit, root: BasicAcceptedElems[Document]): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](
      selector: BasicAcceptedElems[T] | S,
      context: Unit,
      root: BasicAcceptedElems[Document],
      options: CheerioOptions
    ): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](selector: BasicAcceptedElems[T] | S, context: BasicAcceptedElems[AnyNode]): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](
      selector: BasicAcceptedElems[T] | S,
      context: BasicAcceptedElems[AnyNode],
      root: Unit,
      options: CheerioOptions
    ): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](
      selector: BasicAcceptedElems[T] | S,
      context: BasicAcceptedElems[AnyNode],
      root: BasicAcceptedElems[Document]
    ): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](
      selector: BasicAcceptedElems[T] | S,
      context: BasicAcceptedElems[AnyNode],
      root: BasicAcceptedElems[Document],
      options: CheerioOptions
    ): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](selector: Unit, context: Null, root: Unit, options: CheerioOptions): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](selector: Unit, context: Null, root: BasicAcceptedElems[Document]): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](selector: Unit, context: Null, root: BasicAcceptedElems[Document], options: CheerioOptions): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](selector: Unit, context: Unit, root: Unit, options: CheerioOptions): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](selector: Unit, context: Unit, root: BasicAcceptedElems[Document]): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](selector: Unit, context: Unit, root: BasicAcceptedElems[Document], options: CheerioOptions): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](selector: Unit, context: BasicAcceptedElems[AnyNode]): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](selector: Unit, context: BasicAcceptedElems[AnyNode], root: Unit, options: CheerioOptions): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](selector: Unit, context: BasicAcceptedElems[AnyNode], root: BasicAcceptedElems[Document]): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    def apply[T /* <: AnyNode */, S /* <: String */](
      selector: Unit,
      context: BasicAcceptedElems[AnyNode],
      root: BasicAcceptedElems[Document],
      options: CheerioOptions
    ): Cheerio[
        /* import warning: importer.ImportType#apply Failed type conversion: S extends cheerio.cheerio/lib/esm/types.SelectorType ? domhandler.domhandler.Element : T */ js.Any
      ] = js.native
    
    /**
      * The options the document was originally loaded with.
      *
      * @private
      */
    var _options: InternalOptions = js.native
    
    /**
      * The root the document was originally loaded with.
      *
      * @private
      */
    var _root: Document = js.native
    
    /** Mimic jQuery's prototype alias for plugin authors. */
    var fn: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Cheerio.prototype */ Any = js.native
    
    var load: ReturnType[
        js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof Cheerio.prototype._parse */ /* parse */ js.Any, 
          /* render */ js.Function2[/* dom */ AnyNode | ArrayLike[AnyNode], /* options */ InternalOptions, String], 
          js.Function3[
            /* content */ String | AnyNode | js.Array[AnyNode] | Buffer, 
            /* options */ js.UndefOr[CheerioOptions | Null], 
            /* isDocument */ js.UndefOr[Boolean], 
            this.type
          ]
        ]
      ] = js.native
  }
  
  @js.native
  trait StaticType extends StObject {
    
    def contains(container: AnyNode, contained: AnyNode): Boolean = js.native
    
    def html(): String = js.native
    def html(dom: Unit, options: CheerioOptions): String = js.native
    def html(dom: BasicAcceptedElems[AnyNode]): String = js.native
    def html(dom: BasicAcceptedElems[AnyNode], options: CheerioOptions): String = js.native
    def html(options: CheerioOptions): String = js.native
    
    def merge[T](arr1: WritableArrayLike[T], arr2: ArrayLike[T]): js.UndefOr[ArrayLike[T]] = js.native
    
    def parseHTML(): Null = js.native
    def parseHTML(data: String): js.Array[AnyNode] = js.native
    def parseHTML(data: String, context: Any): js.Array[AnyNode] = js.native
    def parseHTML(data: String, context: Any, keepScripts: Boolean): js.Array[AnyNode] = js.native
    def parseHTML(data: String, context: Boolean): js.Array[AnyNode] = js.native
    def parseHTML(data: String, context: Boolean, keepScripts: Boolean): js.Array[AnyNode] = js.native
    def parseHTML(data: String, context: Unit, keepScripts: Boolean): js.Array[AnyNode] = js.native
    def parseHTML(data: _empty): Null = js.native
    
    def root(): Cheerio[Document] = js.native
    
    def text(): String = js.native
    def text(elements: ArrayLike[AnyNode]): String = js.native
    
    def xml(): String = js.native
    def xml(dom: BasicAcceptedElems[AnyNode]): String = js.native
  }
}
