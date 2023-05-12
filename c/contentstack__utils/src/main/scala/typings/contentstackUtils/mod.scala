package typings.contentstackUtils

import typings.contentstackUtils.anon.Entry
import typings.contentstackUtils.anon.Paths
import typings.contentstackUtils.anon.RenderOption
import typings.contentstackUtils.distTypesModelsEmbeddedObjectMod.EmbeddedItem
import typings.contentstackUtils.distTypesModelsMetadataModelMod.Attributes
import typings.contentstackUtils.distTypesNodesDocumentMod.default
import typings.contentstackUtils.distTypesOptionsMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@contentstack/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@contentstack/utils", "Document")
  @js.native
  open class Document () extends default
  
  object GQL {
    
    @JSImport("@contentstack/utils", "GQL")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@contentstack/utils", "GQL.jsonToHTML")
    @js.native
    def jsonToHTML: js.Function1[/* option */ Entry, Unit] = js.native
    inline def jsonToHTML(option: Entry): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonToHTML")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def jsonToHTML_=(x: js.Function1[/* option */ Entry, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jsonToHTML")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@contentstack/utils", "MarkType")
  @js.native
  object MarkType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.contentstackUtils.distTypesNodesMarkTypeMod.MarkType & String] = js.native
    
    /* "bold" */ val BOLD: typings.contentstackUtils.distTypesNodesMarkTypeMod.MarkType.BOLD & String = js.native
    
    /* "break" */ val BREAK: typings.contentstackUtils.distTypesNodesMarkTypeMod.MarkType.BREAK & String = js.native
    
    /* "inlineCode" */ val INLINE_CODE: typings.contentstackUtils.distTypesNodesMarkTypeMod.MarkType.INLINE_CODE & String = js.native
    
    /* "italic" */ val ITALIC: typings.contentstackUtils.distTypesNodesMarkTypeMod.MarkType.ITALIC & String = js.native
    
    /* "strikethrough" */ val STRIKE_THROUGH: typings.contentstackUtils.distTypesNodesMarkTypeMod.MarkType.STRIKE_THROUGH & String = js.native
    
    /* "subscript" */ val SUBSCRIPT: typings.contentstackUtils.distTypesNodesMarkTypeMod.MarkType.SUBSCRIPT & String = js.native
    
    /* "superscript" */ val SUPERSCRIPT: typings.contentstackUtils.distTypesNodesMarkTypeMod.MarkType.SUPERSCRIPT & String = js.native
    
    /* "underline" */ val UNDERLINE: typings.contentstackUtils.distTypesNodesMarkTypeMod.MarkType.UNDERLINE & String = js.native
  }
  
  @JSImport("@contentstack/utils", "Node")
  @js.native
  open class Node ()
    extends typings.contentstackUtils.distTypesNodesNodeMod.default
  
  @JSImport("@contentstack/utils", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType & String] = js.native
    
    /* "blockquote" */ val BLOCK_QUOTE: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.BLOCK_QUOTE & String = js.native
    
    /* "code" */ val CODE: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.CODE & String = js.native
    
    /* "doc" */ val DOCUMENT: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.DOCUMENT & String = js.native
    
    /* "embed" */ val EMBED: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.EMBED & String = js.native
    
    /* "h1" */ val HEADING_1: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HEADING_1 & String = js.native
    
    /* "h2" */ val HEADING_2: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HEADING_2 & String = js.native
    
    /* "h3" */ val HEADING_3: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HEADING_3 & String = js.native
    
    /* "h4" */ val HEADING_4: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HEADING_4 & String = js.native
    
    /* "h5" */ val HEADING_5: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HEADING_5 & String = js.native
    
    /* "h6" */ val HEADING_6: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HEADING_6 & String = js.native
    
    /* "hr" */ val HR: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HR & String = js.native
    
    /* "img" */ val IMAGE: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.IMAGE & String = js.native
    
    /* "a" */ val LINK: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.LINK & String = js.native
    
    /* "li" */ val LIST_ITEM: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.LIST_ITEM & String = js.native
    
    /* "ol" */ val ORDER_LIST: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.ORDER_LIST & String = js.native
    
    /* "p" */ val PARAGRAPH: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.PARAGRAPH & String = js.native
    
    /* "reference" */ val REFERENCE: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.REFERENCE & String = js.native
    
    /* "table" */ val TABLE: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE & String = js.native
    
    /* "tbody" */ val TABLE_BODY: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE_BODY & String = js.native
    
    /* "td" */ val TABLE_DATA: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE_DATA & String = js.native
    
    /* "tfoot" */ val TABLE_FOOTER: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE_FOOTER & String = js.native
    
    /* "th" */ val TABLE_HEAD: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE_HEAD & String = js.native
    
    /* "thead" */ val TABLE_HEADER: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE_HEADER & String = js.native
    
    /* "tr" */ val TABLE_ROW: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE_ROW & String = js.native
    
    /* "text" */ val TEXT: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TEXT & String = js.native
    
    /* "ul" */ val UNORDER_LIST: typings.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.UNORDER_LIST & String = js.native
  }
  
  @JSImport("@contentstack/utils", "StyleType")
  @js.native
  object StyleType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.contentstackUtils.distTypesEmbeddedTypesStyleTypeMod.StyleType & String] = js.native
    
    /* "block" */ val BLOCK: typings.contentstackUtils.distTypesEmbeddedTypesStyleTypeMod.StyleType.BLOCK & String = js.native
    
    /* "display" */ val DISPLAY: typings.contentstackUtils.distTypesEmbeddedTypesStyleTypeMod.StyleType.DISPLAY & String = js.native
    
    /* "download" */ val DOWNLOAD: typings.contentstackUtils.distTypesEmbeddedTypesStyleTypeMod.StyleType.DOWNLOAD & String = js.native
    
    /* "inline" */ val INLINE: typings.contentstackUtils.distTypesEmbeddedTypesStyleTypeMod.StyleType.INLINE & String = js.native
    
    /* "link" */ val LINK: typings.contentstackUtils.distTypesEmbeddedTypesStyleTypeMod.StyleType.LINK & String = js.native
  }
  
  @JSImport("@contentstack/utils", "TextNode")
  @js.native
  open class TextNode protected ()
    extends typings.contentstackUtils.distTypesNodesTextNodeMod.default {
    def this(text: String) = this()
  }
  
  inline def addEditableTags(entry: EmbeddedItem, contentTypeUid: String, tagsAsObject: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEditableTags")(entry.asInstanceOf[js.Any], contentTypeUid.asInstanceOf[js.Any], tagsAsObject.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEditableTags(entry: EmbeddedItem, contentTypeUid: String, tagsAsObject: Boolean, locale: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEditableTags")(entry.asInstanceOf[js.Any], contentTypeUid.asInstanceOf[js.Any], tagsAsObject.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def attributeToString(attributes: Attributes): String = ^.asInstanceOf[js.Dynamic].applyDynamic("attributeToString")(attributes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def jsonToHTML(option: RenderOption): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonToHTML")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def render(option: Paths): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(option.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def renderContent(content: String, option: Option): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderContent")(content.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
  inline def renderContent(content: js.Array[String], option: Option): String | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderContent")(content.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[String]]
}
