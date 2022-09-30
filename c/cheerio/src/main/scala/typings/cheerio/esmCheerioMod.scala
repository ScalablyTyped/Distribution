package typings.cheerio

import org.scalablytyped.runtime.StringDictionary
import typings.cheerio.anon.FnCall
import typings.cheerio.anon.FnCallNameAttribsChildrenType
import typings.cheerio.anon.FnCallStartEnd
import typings.cheerio.apiAttributesMod.StyleProp
import typings.cheerio.apiFormsMod.SerializedField
import typings.cheerio.cheerioStrings.`[cheerio object]`
import typings.cheerio.cheerioStrings.`type`
import typings.cheerio.cheerioStrings.`x-attribsNamespace`
import typings.cheerio.cheerioStrings.`x-attribsPrefix`
import typings.cheerio.cheerioStrings.attribs
import typings.cheerio.cheerioStrings.children
import typings.cheerio.cheerioStrings.endIndex
import typings.cheerio.cheerioStrings.href
import typings.cheerio.cheerioStrings.innerHTML
import typings.cheerio.cheerioStrings.innerText
import typings.cheerio.cheerioStrings.name
import typings.cheerio.cheerioStrings.namespace
import typings.cheerio.cheerioStrings.next
import typings.cheerio.cheerioStrings.nodeName
import typings.cheerio.cheerioStrings.nodeType
import typings.cheerio.cheerioStrings.outerHTML
import typings.cheerio.cheerioStrings.parent
import typings.cheerio.cheerioStrings.prev
import typings.cheerio.cheerioStrings.sourceCodeLocation
import typings.cheerio.cheerioStrings.src
import typings.cheerio.cheerioStrings.startIndex
import typings.cheerio.cheerioStrings.style
import typings.cheerio.cheerioStrings.tagName
import typings.cheerio.cheerioStrings.textContent
import typings.cheerio.optionsMod.InternalOptions
import typings.cheerio.typesMod.AcceptedElems
import typings.cheerio.typesMod.AcceptedFilters
import typings.cheerio.typesMod.BasicAcceptedElems
import typings.domelementtype.mod.ElementType.Script
import typings.domelementtype.mod.ElementType.Style
import typings.domelementtype.mod.ElementType.Tag
import typings.domhandler.libNodeMod.AnyNode
import typings.domhandler.libNodeMod.ChildNode
import typings.domhandler.libNodeMod.ParentNode
import typings.domhandler.libNodeMod.TagSourceCodeLocation
import typings.domhandler.mod.Document
import typings.domhandler.mod.Element
import typings.node.bufferMod.global.Buffer
import typings.std.ArrayLike
import typings.std.Iterable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCheerioMod {
  
  @JSImport("cheerio/lib/esm/cheerio", "Cheerio")
  @js.native
  abstract class Cheerio[T] protected ()
    extends StObject
       with ArrayLike[T]
       with AttributesType
       with TraversingType
       with ManipulationType
       with CssType
       with FormsType
       with Iterable[T] {
    def this(elements: Unit, root: Null, options: InternalOptions) = this()
    def this(elements: Unit, root: Cheerio[Document], options: InternalOptions) = this()
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
    def this(elements: ArrayLike[T], root: Cheerio[Document], options: InternalOptions) = this()
    
    def _make[T](dom: T): Cheerio[T] = js.native
    def _make[T](dom: T, context: BasicAcceptedElems[AnyNode]): Cheerio[T] = js.native
    def _make[T](dom: String): Cheerio[T] = js.native
    def _make[T](dom: String, context: BasicAcceptedElems[AnyNode]): Cheerio[T] = js.native
    /**
      * Make a cheerio object.
      *
      * @private
      * @param dom - The contents of the new object.
      * @param context - The context of the new object.
      * @returns The new cheerio object.
      */
    def _make[T](dom: ArrayLike[T]): Cheerio[T] = js.native
    def _make[T](dom: ArrayLike[T], context: BasicAcceptedElems[AnyNode]): Cheerio[T] = js.native
    
    /**
      * Parses some content.
      *
      * @private
      * @param content - Content to parse.
      * @param options - Options for parsing.
      * @param isDocument - Allows parser to be switched to fragment mode.
      * @returns A document containing the `content`.
      */
    def _parse(content: String, options: InternalOptions, isDocument: Boolean): Document = js.native
    def _parse(content: String, options: InternalOptions, isDocument: Boolean, context: ParentNode): Document = js.native
    def _parse(content: js.Array[AnyNode], options: InternalOptions, isDocument: Boolean): Document = js.native
    def _parse(content: js.Array[AnyNode], options: InternalOptions, isDocument: Boolean, context: ParentNode): Document = js.native
    def _parse(content: AnyNode, options: InternalOptions, isDocument: Boolean): Document = js.native
    def _parse(content: AnyNode, options: InternalOptions, isDocument: Boolean, context: ParentNode): Document = js.native
    def _parse(content: Document, options: InternalOptions, isDocument: Boolean): Document = js.native
    def _parse(content: Document, options: InternalOptions, isDocument: Boolean, context: ParentNode): Document = js.native
    def _parse(content: Buffer, options: InternalOptions, isDocument: Boolean): Document = js.native
    def _parse(content: Buffer, options: InternalOptions, isDocument: Boolean, context: ParentNode): Document = js.native
    
    /**
      * Render an element or a set of elements.
      *
      * @private
      * @param dom - DOM to render.
      * @returns The rendered DOM.
      */
    def _render(dom: AnyNode): String = js.native
    def _render(dom: ArrayLike[AnyNode]): String = js.native
    
    /**
      * The root of the document. Can be set by using the `root` argument of the constructor.
      *
      * @private
      */
    var _root: Cheerio[Document] | Null = js.native
    
    var cheerio: `[cheerio object]` = js.native
    
    /* standard es5 */
    /* CompleteClass */
    override val length: Double = js.native
    
    var options: InternalOptions = js.native
    
    var prevObject: js.UndefOr[Cheerio[Any]] = js.native
    
    /* CompleteClass */
    override def serialize[T /* <: AnyNode */](): String = js.native
    
    /* CompleteClass */
    override def serializeArray[T /* <: AnyNode */](): js.Array[SerializedField] = js.native
    
    def splice(): js.Array[T] = js.native
    def splice(start: Double): js.Array[T] = js.native
    def splice(start: Double, end: Double): js.Array[T] = js.native
    def splice(start: Unit, end: Double): js.Array[T] = js.native
    @JSName("splice")
    var splice_Original: FnCallStartEnd[T] = js.native
  }
  
  @js.native
  trait AttributesType extends StObject {
    
    def addClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](): R = js.native
    def addClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](value: String): R = js.native
    def addClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](
      value: js.ThisFunction2[/* this */ Element, /* i */ Double, /* className */ String, js.UndefOr[String]]
    ): R = js.native
    
    def attr[T /* <: AnyNode */](): js.UndefOr[Record[String, String]] = js.native
    def attr[T /* <: AnyNode */](name: String): Cheerio[T] = js.native
    def attr[T /* <: AnyNode */](name: String, value: String): Cheerio[T] = js.native
    def attr[T /* <: AnyNode */](
      name: String,
      value: js.ThisFunction2[/* this */ Element, /* i */ Double, /* attrib */ String, String | Null]
    ): Cheerio[T] = js.native
    def attr[T /* <: AnyNode */](values: Record[String, String | Null]): Cheerio[T] = js.native
    @JSName("attr")
    def attr_T_Union[T /* <: AnyNode */](name: String): js.UndefOr[String] = js.native
    
    def data[T /* <: AnyNode */](): Record[String, Any] = js.native
    def data[T /* <: AnyNode */](name: String): js.UndefOr[Any] = js.native
    def data[T /* <: AnyNode */](name: String, value: Any): Cheerio[T] = js.native
    def data[T /* <: AnyNode */](values: Record[String, Any]): Cheerio[T] = js.native
    
    def hasClass[T /* <: AnyNode */](className: String): Boolean = js.native
    
    def prop[T /* <: AnyNode */](name: href | innerHTML | innerText | nodeName | outerHTML | src | tagName | textContent): js.UndefOr[String] = js.native
    def prop[T /* <: AnyNode */](name: String): Cheerio[T] = js.native
    def prop[T /* <: AnyNode */](name: String, value: String): Cheerio[T] = js.native
    def prop[T /* <: AnyNode */](
      name: String,
      value: js.ThisFunction2[/* this */ Element, /* i */ Double, /* prop */ String, String | Boolean]
    ): Cheerio[T] = js.native
    def prop[T /* <: AnyNode */](name: String, value: Boolean): Cheerio[T] = js.native
    def prop[T /* <: AnyNode */](
      name: Record[
          String, 
          js.UndefOr[
            String | FnCall | FnCallNameAttribsChildrenType | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String] | Boolean
          ]
        ]
    ): Cheerio[T] = js.native
    @JSName("prop")
    def prop_T_String[T /* <: AnyNode */](name: String): String = js.native
    @JSName("prop")
    def prop_attribs[T /* <: AnyNode */](name: attribs): StringDictionary[String] = js.native
    @JSName("prop")
    def prop_attribs[T /* <: AnyNode */](
      name: attribs,
      value: js.ThisFunction2[
          /* this */ Element, 
          /* i */ Double, 
          attribs, 
          js.UndefOr[
            FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
          ]
        ]
    ): Cheerio[T] = js.native
    @JSName("prop")
    def prop_attribs[T /* <: AnyNode */](name: attribs, value: StringDictionary[String]): Cheerio[T] = js.native
    @JSName("prop")
    def prop_children[T /* <: AnyNode */](name: children): js.Array[ChildNode] = js.native
    @JSName("prop")
    def prop_children[T /* <: AnyNode */](name: children, value: js.Array[ChildNode]): Cheerio[T] = js.native
    @JSName("prop")
    def prop_children[T /* <: AnyNode */](
      name: children,
      value: js.ThisFunction2[
          /* this */ Element, 
          /* i */ Double, 
          children, 
          js.UndefOr[
            FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
          ]
        ]
    ): Cheerio[T] = js.native
    @JSName("prop")
    def prop_endIndex[T /* <: AnyNode */](name: endIndex): Double | Null = js.native
    @JSName("prop")
    def prop_endIndex[T /* <: AnyNode */](name: endIndex, value: Double | Null): Cheerio[T] = js.native
    @JSName("prop")
    def prop_endIndex[T /* <: AnyNode */](
      name: endIndex,
      value: js.ThisFunction2[
          /* this */ Element, 
          /* i */ Double, 
          endIndex, 
          js.UndefOr[
            FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
          ]
        ]
    ): Cheerio[T] = js.native
    @JSName("prop")
    def prop_name[T /* <: AnyNode */](name: name): String = js.native
    @JSName("prop")
    def prop_name[T /* <: AnyNode */](name: name, value: String): Cheerio[T] = js.native
    @JSName("prop")
    def prop_name[T /* <: AnyNode */](
      name: name,
      value: js.ThisFunction2[
          /* this */ Element, 
          /* i */ Double, 
          name, 
          js.UndefOr[
            FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
          ]
        ]
    ): Cheerio[T] = js.native
    @JSName("prop")
    def prop_namespace[T /* <: AnyNode */](name: namespace): js.UndefOr[String] = js.native
    @JSName("prop")
    def prop_namespace[T /* <: AnyNode */](name: namespace, value: js.UndefOr[String]): Cheerio[T] = js.native
    @JSName("prop")
    def prop_namespace[T /* <: AnyNode */](
      name: namespace,
      value: js.ThisFunction2[
          /* this */ Element, 
          /* i */ Double, 
          namespace, 
          js.UndefOr[
            FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
          ]
        ]
    ): Cheerio[T] = js.native
    @JSName("prop")
    def prop_next[T /* <: AnyNode */](name: next): ChildNode | Null = js.native
    @JSName("prop")
    def prop_next[T /* <: AnyNode */](name: next, value: ChildNode | Null): Cheerio[T] = js.native
    @JSName("prop")
    def prop_next[T /* <: AnyNode */](
      name: next,
      value: js.ThisFunction2[
          /* this */ Element, 
          /* i */ Double, 
          next, 
          js.UndefOr[
            FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
          ]
        ]
    ): Cheerio[T] = js.native
    @JSName("prop")
    def prop_nodeType[T /* <: AnyNode */](name: nodeType): Double = js.native
    @JSName("prop")
    def prop_nodeType[T /* <: AnyNode */](
      name: nodeType,
      value: js.ThisFunction2[
          /* this */ Element, 
          /* i */ Double, 
          nodeType, 
          js.UndefOr[
            FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
          ]
        ]
    ): Cheerio[T] = js.native
    @JSName("prop")
    def prop_nodeType[T /* <: AnyNode */](name: nodeType, value: Double): Cheerio[T] = js.native
    @JSName("prop")
    def prop_parent[T /* <: AnyNode */](name: parent): ParentNode | Null = js.native
    @JSName("prop")
    def prop_parent[T /* <: AnyNode */](name: parent, value: ParentNode | Null): Cheerio[T] = js.native
    @JSName("prop")
    def prop_parent[T /* <: AnyNode */](
      name: parent,
      value: js.ThisFunction2[
          /* this */ Element, 
          /* i */ Double, 
          parent, 
          js.UndefOr[
            FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
          ]
        ]
    ): Cheerio[T] = js.native
    @JSName("prop")
    def prop_prev[T /* <: AnyNode */](name: prev): ChildNode | Null = js.native
    @JSName("prop")
    def prop_prev[T /* <: AnyNode */](name: prev, value: ChildNode | Null): Cheerio[T] = js.native
    @JSName("prop")
    def prop_prev[T /* <: AnyNode */](
      name: prev,
      value: js.ThisFunction2[
          /* this */ Element, 
          /* i */ Double, 
          prev, 
          js.UndefOr[
            FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
          ]
        ]
    ): Cheerio[T] = js.native
    @JSName("prop")
    def prop_sourceCodeLocation[T /* <: AnyNode */](name: sourceCodeLocation): js.UndefOr[TagSourceCodeLocation | Null] = js.native
    @JSName("prop")
    def prop_sourceCodeLocation[T /* <: AnyNode */](name: sourceCodeLocation, value: js.UndefOr[TagSourceCodeLocation | Null]): Cheerio[T] = js.native
    @JSName("prop")
    def prop_sourceCodeLocation[T /* <: AnyNode */](
      name: sourceCodeLocation,
      value: js.ThisFunction2[
          /* this */ Element, 
          /* i */ Double, 
          sourceCodeLocation, 
          js.UndefOr[
            FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
          ]
        ]
    ): Cheerio[T] = js.native
    @JSName("prop")
    def prop_startIndex[T /* <: AnyNode */](name: startIndex): Double | Null = js.native
    @JSName("prop")
    def prop_startIndex[T /* <: AnyNode */](name: startIndex, value: Double | Null): Cheerio[T] = js.native
    @JSName("prop")
    def prop_startIndex[T /* <: AnyNode */](
      name: startIndex,
      value: js.ThisFunction2[
          /* this */ Element, 
          /* i */ Double, 
          startIndex, 
          js.UndefOr[
            FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
          ]
        ]
    ): Cheerio[T] = js.native
    @JSName("prop")
    def prop_style[T /* <: AnyNode */](name: style): js.UndefOr[StyleProp] = js.native
    @JSName("prop")
    def prop_type[T /* <: AnyNode */](name: `type`): Tag | Script | Style = js.native
    @JSName("prop")
    def prop_type[T /* <: AnyNode */](name: `type`, value: Tag | Script | Style): Cheerio[T] = js.native
    @JSName("prop")
    def prop_type[T /* <: AnyNode */](
      name: `type`,
      value: js.ThisFunction2[
          /* this */ Element, 
          /* i */ Double, 
          `type`, 
          js.UndefOr[
            FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
          ]
        ]
    ): Cheerio[T] = js.native
    @JSName("prop")
    def prop_xattribsNamespace[T /* <: AnyNode */](name: `x-attribsNamespace`): js.UndefOr[Record[String, String]] = js.native
    @JSName("prop")
    def prop_xattribsNamespace[T /* <: AnyNode */](name: `x-attribsNamespace`, value: js.UndefOr[Record[String, String]]): Cheerio[T] = js.native
    @JSName("prop")
    def prop_xattribsNamespace[T /* <: AnyNode */](
      name: `x-attribsNamespace`,
      value: js.ThisFunction2[
          /* this */ Element, 
          /* i */ Double, 
          `x-attribsNamespace`, 
          js.UndefOr[
            FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
          ]
        ]
    ): Cheerio[T] = js.native
    @JSName("prop")
    def prop_xattribsPrefix[T /* <: AnyNode */](name: `x-attribsPrefix`): js.UndefOr[Record[String, String]] = js.native
    @JSName("prop")
    def prop_xattribsPrefix[T /* <: AnyNode */](name: `x-attribsPrefix`, value: js.UndefOr[Record[String, String]]): Cheerio[T] = js.native
    @JSName("prop")
    def prop_xattribsPrefix[T /* <: AnyNode */](
      name: `x-attribsPrefix`,
      value: js.ThisFunction2[
          /* this */ Element, 
          /* i */ Double, 
          `x-attribsPrefix`, 
          js.UndefOr[
            FnCall | FnCallNameAttribsChildrenType | String | ParentNode | Null | TagSourceCodeLocation | Tag | Script | Style | ChildNode | Double | js.Array[ChildNode] | (Record[String, String]) | StringDictionary[String]
          ]
        ]
    ): Cheerio[T] = js.native
    
    def removeAttr[T /* <: AnyNode */](name: String): Cheerio[T] = js.native
    
    def removeClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](): R = js.native
    def removeClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](name: String): R = js.native
    def removeClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](
      name: js.ThisFunction2[/* this */ Element, /* i */ Double, /* className */ String, js.UndefOr[String]]
    ): R = js.native
    
    def toggleClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](): R = js.native
    def toggleClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](value: String): R = js.native
    def toggleClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](value: String, stateVal: Boolean): R = js.native
    def toggleClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](
      value: js.ThisFunction3[
          /* this */ Element, 
          /* i */ Double, 
          /* className */ String, 
          /* stateVal */ js.UndefOr[Boolean], 
          String
        ]
    ): R = js.native
    def toggleClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](
      value: js.ThisFunction3[
          /* this */ Element, 
          /* i */ Double, 
          /* className */ String, 
          /* stateVal */ js.UndefOr[Boolean], 
          String
        ],
      stateVal: Boolean
    ): R = js.native
    def toggleClass[T /* <: AnyNode */, R /* <: ArrayLike[T] */](value: Unit, stateVal: Boolean): R = js.native
    
    def `val`[T /* <: AnyNode */](): js.UndefOr[String | js.Array[String]] = js.native
    def `val`[T /* <: AnyNode */](value: String): Cheerio[T] = js.native
    def `val`[T /* <: AnyNode */](value: js.Array[String]): Cheerio[T] = js.native
  }
  
  @js.native
  trait CssType extends StObject {
    
    def css[T /* <: AnyNode */](): js.UndefOr[Record[String, String]] = js.native
    def css[T /* <: AnyNode */](map: Record[String, String]): Cheerio[T] = js.native
    def css[T /* <: AnyNode */](name: String): js.UndefOr[String] = js.native
    def css[T /* <: AnyNode */](names: js.Array[String]): js.UndefOr[Record[String, String]] = js.native
    def css[T /* <: AnyNode */](prop: String, `val`: String): Cheerio[T] = js.native
    def css[T /* <: AnyNode */](
      prop: String,
      `val`: js.ThisFunction2[/* this */ Element, /* i */ Double, /* style */ String, js.UndefOr[String]]
    ): Cheerio[T] = js.native
  }
  
  trait FormsType extends StObject {
    
    def serialize[T /* <: AnyNode */](): String
    
    def serializeArray[T /* <: AnyNode */](): js.Array[SerializedField]
  }
  object FormsType {
    
    inline def apply(serialize: () => String, serializeArray: () => js.Array[SerializedField]): FormsType = {
      val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction0(serialize), serializeArray = js.Any.fromFunction0(serializeArray))
      __obj.asInstanceOf[FormsType]
    }
    
    extension [Self <: FormsType](x: Self) {
      
      inline def setSerialize(value: () => String): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
      
      inline def setSerializeArray(value: () => js.Array[SerializedField]): Self = StObject.set(x, "serializeArray", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ManipulationType extends StObject {
    
    def _makeDomArray[T /* <: AnyNode */](): js.Array[AnyNode] = js.native
    def _makeDomArray[T /* <: AnyNode */](elem: Unit, clone: Boolean): js.Array[AnyNode] = js.native
    def _makeDomArray[T /* <: AnyNode */](elem: BasicAcceptedElems[AnyNode]): js.Array[AnyNode] = js.native
    def _makeDomArray[T /* <: AnyNode */](elem: BasicAcceptedElems[AnyNode], clone: Boolean): js.Array[AnyNode] = js.native
    
    def after[T /* <: AnyNode */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param elems because its type [(this : AnyNode, i : number, html : string): BasicAcceptedElems<AnyNode>] | Array<BasicAcceptedElems<AnyNode>> is not an array type */ elems: js.Array[
          BasicAcceptedElems[AnyNode] | (js.ThisFunction2[/* this */ AnyNode, /* i */ Double, /* html */ String, BasicAcceptedElems[AnyNode]])
        ]
    ): Cheerio[T] = js.native
    
    def append[T /* <: AnyNode */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param elems because its type [(this : AnyNode, i : number, html : string): BasicAcceptedElems<AnyNode>] | Array<BasicAcceptedElems<AnyNode>> is not an array type */ elems: js.Array[
          BasicAcceptedElems[AnyNode] | (js.ThisFunction2[/* this */ AnyNode, /* i */ Double, /* html */ String, BasicAcceptedElems[AnyNode]])
        ]
    ): Cheerio[T] = js.native
    
    def appendTo[T /* <: AnyNode */](target: BasicAcceptedElems[AnyNode]): Cheerio[T] = js.native
    
    def before[T /* <: AnyNode */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param elems because its type [(this : AnyNode, i : number, html : string): BasicAcceptedElems<AnyNode>] | Array<BasicAcceptedElems<AnyNode>> is not an array type */ elems: js.Array[
          BasicAcceptedElems[AnyNode] | (js.ThisFunction2[/* this */ AnyNode, /* i */ Double, /* html */ String, BasicAcceptedElems[AnyNode]])
        ]
    ): Cheerio[T] = js.native
    
    def empty[T /* <: AnyNode */](): Cheerio[T] = js.native
    
    def html[T /* <: AnyNode */](): String | Null = js.native
    def html[T /* <: AnyNode */](str: String): Cheerio[T] = js.native
    def html[T /* <: AnyNode */](str: Cheerio[T]): Cheerio[T] = js.native
    
    def insertAfter[T /* <: AnyNode */](target: BasicAcceptedElems[AnyNode]): Cheerio[T] = js.native
    
    def insertBefore[T /* <: AnyNode */](target: BasicAcceptedElems[AnyNode]): Cheerio[T] = js.native
    
    def prepend[T /* <: AnyNode */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param elems because its type [(this : AnyNode, i : number, html : string): BasicAcceptedElems<AnyNode>] | Array<BasicAcceptedElems<AnyNode>> is not an array type */ elems: js.Array[
          BasicAcceptedElems[AnyNode] | (js.ThisFunction2[/* this */ AnyNode, /* i */ Double, /* html */ String, BasicAcceptedElems[AnyNode]])
        ]
    ): Cheerio[T] = js.native
    
    def prependTo[T /* <: AnyNode */](target: BasicAcceptedElems[AnyNode]): Cheerio[T] = js.native
    
    def remove[T /* <: AnyNode */](): Cheerio[T] = js.native
    def remove[T /* <: AnyNode */](selector: String): Cheerio[T] = js.native
    
    def replaceWith[T /* <: AnyNode */](content: AcceptedElems[AnyNode]): Cheerio[T] = js.native
    
    def text[T /* <: AnyNode */](): String = js.native
    def text[T /* <: AnyNode */](str: String): Cheerio[T] = js.native
    def text[T /* <: AnyNode */](str: js.ThisFunction2[/* this */ AnyNode, /* i */ Double, /* text */ String, String]): Cheerio[T] = js.native
    
    def unwrap[T /* <: AnyNode */](): Cheerio[T] = js.native
    def unwrap[T /* <: AnyNode */](selector: String): Cheerio[T] = js.native
    
    def wrap[T /* <: AnyNode */](wrapper: AcceptedElems[AnyNode]): Cheerio[T] = js.native
    
    def wrapAll[T /* <: AnyNode */](wrapper: AcceptedElems[T]): Cheerio[T] = js.native
    
    def wrapInner[T /* <: AnyNode */](wrapper: AcceptedElems[AnyNode]): Cheerio[T] = js.native
  }
  
  @js.native
  trait TraversingType extends StObject {
    
    def add[S /* <: AnyNode */, T /* <: AnyNode */](other: S): Cheerio[S | T] = js.native
    def add[S /* <: AnyNode */, T /* <: AnyNode */](other: S, context: String): Cheerio[S | T] = js.native
    def add[S /* <: AnyNode */, T /* <: AnyNode */](other: S, context: Cheerio[S]): Cheerio[S | T] = js.native
    def add[S /* <: AnyNode */, T /* <: AnyNode */](other: String): Cheerio[S | T] = js.native
    def add[S /* <: AnyNode */, T /* <: AnyNode */](other: String, context: String): Cheerio[S | T] = js.native
    def add[S /* <: AnyNode */, T /* <: AnyNode */](other: String, context: Cheerio[S]): Cheerio[S | T] = js.native
    def add[S /* <: AnyNode */, T /* <: AnyNode */](other: js.Array[S]): Cheerio[S | T] = js.native
    def add[S /* <: AnyNode */, T /* <: AnyNode */](other: js.Array[S], context: String): Cheerio[S | T] = js.native
    def add[S /* <: AnyNode */, T /* <: AnyNode */](other: js.Array[S], context: Cheerio[S]): Cheerio[S | T] = js.native
    def add[S /* <: AnyNode */, T /* <: AnyNode */](other: Cheerio[S]): Cheerio[S | T] = js.native
    def add[S /* <: AnyNode */, T /* <: AnyNode */](other: Cheerio[S], context: String): Cheerio[S | T] = js.native
    def add[S /* <: AnyNode */, T /* <: AnyNode */](other: Cheerio[S], context: Cheerio[S]): Cheerio[S | T] = js.native
    
    def addBack[T /* <: AnyNode */](): Cheerio[AnyNode] = js.native
    def addBack[T /* <: AnyNode */](selector: String): Cheerio[AnyNode] = js.native
    
    def children[T /* <: AnyNode */](): Cheerio[Element] = js.native
    def children[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    
    def closest[T /* <: AnyNode */](): Cheerio[AnyNode] = js.native
    def closest[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[AnyNode] = js.native
    
    def contents[T /* <: AnyNode */](): Cheerio[AnyNode] = js.native
    
    def each[T](fn: js.ThisFunction2[/* this */ T, /* i */ Double, /* el */ T, Unit | Boolean]): Cheerio[T] = js.native
    
    def end[T](): Cheerio[AnyNode] = js.native
    
    def eq[T](i: Double): Cheerio[T] = js.native
    
    def filter[T](`match`: String): Cheerio[T | Element] = js.native
    def filter[T](`match`: Cheerio[T]): Cheerio[T | Element] = js.native
    def filter[T, S /* <: (js.ThisFunction2[/* this */ T, /* i */ Double, /* el */ T, Boolean]) | T */](`match`: S): Cheerio[T | Element] = js.native
    def filter[T, S /* <: T */](`match`: js.ThisFunction2[/* this */ T, /* index */ Double, /* value */ T, /* is S */ Boolean]): Cheerio[S] = js.native
    
    def filterArray[T](nodes: js.Array[T], `match`: AcceptedFilters[T]): js.Array[Element | T] = js.native
    def filterArray[T](nodes: js.Array[T], `match`: AcceptedFilters[T], xmlMode: Boolean): js.Array[Element | T] = js.native
    def filterArray[T](nodes: js.Array[T], `match`: AcceptedFilters[T], xmlMode: Boolean, root: Document): js.Array[Element | T] = js.native
    def filterArray[T](nodes: js.Array[T], `match`: AcceptedFilters[T], xmlMode: Unit, root: Document): js.Array[Element | T] = js.native
    
    def find[T /* <: AnyNode */](): Cheerio[Element] = js.native
    def find[T /* <: AnyNode */](selectorOrHaystack: String): Cheerio[Element] = js.native
    def find[T /* <: AnyNode */](selectorOrHaystack: Cheerio[Element]): Cheerio[Element] = js.native
    def find[T /* <: AnyNode */](selectorOrHaystack: Element): Cheerio[Element] = js.native
    
    def first[T /* <: AnyNode */](): Cheerio[T] = js.native
    
    def get[T](): js.Array[T] = js.native
    def get[T](i: Double): js.UndefOr[T] = js.native
    
    def has(selectorOrHaystack: String): Cheerio[AnyNode | Element] = js.native
    def has(selectorOrHaystack: Cheerio[Element]): Cheerio[AnyNode | Element] = js.native
    def has(selectorOrHaystack: Element): Cheerio[AnyNode | Element] = js.native
    
    def index[T /* <: AnyNode */](): Double = js.native
    def index[T /* <: AnyNode */](selectorOrNeedle: String): Double = js.native
    def index[T /* <: AnyNode */](selectorOrNeedle: Cheerio[AnyNode]): Double = js.native
    def index[T /* <: AnyNode */](selectorOrNeedle: AnyNode): Double = js.native
    
    def is[T](): Boolean = js.native
    def is[T](selector: AcceptedFilters[T]): Boolean = js.native
    
    def last[T](): Cheerio[T] = js.native
    
    def map[T, M](fn: js.ThisFunction2[/* this */ T, /* i */ Double, /* el */ T, js.UndefOr[js.Array[M] | M | Null]]): Cheerio[M] = js.native
    
    def next[T /* <: AnyNode */](): Cheerio[Element] = js.native
    def next[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    
    def nextAll[T /* <: AnyNode */](): Cheerio[Element] = js.native
    def nextAll[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    
    def nextUntil[T /* <: AnyNode */](): Cheerio[Element] = js.native
    def nextUntil[T /* <: AnyNode */](selector: Null, filterSelector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    def nextUntil[T /* <: AnyNode */](selector: Unit, filterSelector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    def nextUntil[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    def nextUntil[T /* <: AnyNode */](selector: AcceptedFilters[Element], filterSelector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    
    def not[T /* <: AnyNode */](`match`: AcceptedFilters[T]): Cheerio[T] = js.native
    
    def parent[T /* <: AnyNode */](): Cheerio[Element] = js.native
    def parent[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    
    def parents[T /* <: AnyNode */](): Cheerio[Element] = js.native
    def parents[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    
    def parentsUntil[T /* <: AnyNode */](): Cheerio[Element] = js.native
    def parentsUntil[T /* <: AnyNode */](selector: Null, filterSelector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    def parentsUntil[T /* <: AnyNode */](selector: Unit, filterSelector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    def parentsUntil[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    def parentsUntil[T /* <: AnyNode */](selector: AcceptedFilters[Element], filterSelector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    
    def prev[T /* <: AnyNode */](): Cheerio[Element] = js.native
    def prev[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    
    def prevAll[T /* <: AnyNode */](): Cheerio[Element] = js.native
    def prevAll[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    
    def prevUntil[T /* <: AnyNode */](): Cheerio[Element] = js.native
    def prevUntil[T /* <: AnyNode */](selector: Null, filterSelector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    def prevUntil[T /* <: AnyNode */](selector: Unit, filterSelector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    def prevUntil[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    def prevUntil[T /* <: AnyNode */](selector: AcceptedFilters[Element], filterSelector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    
    def siblings[T /* <: AnyNode */](): Cheerio[Element] = js.native
    def siblings[T /* <: AnyNode */](selector: AcceptedFilters[Element]): Cheerio[Element] = js.native
    
    def slice[T](): Cheerio[T] = js.native
    def slice[T](start: Double): Cheerio[T] = js.native
    def slice[T](start: Double, end: Double): Cheerio[T] = js.native
    def slice[T](start: Unit, end: Double): Cheerio[T] = js.native
    
    def toArray[T](): js.Array[T] = js.native
  }
}
