package typings.contentstackUtils

import typings.contentstackUtils.anon.Entry
import typings.contentstackUtils.anon.Paths
import typings.contentstackUtils.anon.RenderOption
import typings.contentstackUtils.documentMod.default
import typings.contentstackUtils.embeddedObjectMod.EmbeddedItem
import typings.contentstackUtils.metadataModelMod.Attributes
import typings.contentstackUtils.optionsMod.Option
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
    def apply(value: String): js.UndefOr[typings.contentstackUtils.markTypeMod.MarkType & String] = js.native
    
    /* "bold" */ val BOLD: typings.contentstackUtils.markTypeMod.MarkType.BOLD & String = js.native
    
    /* "inlineCode" */ val INLINE_CODE: typings.contentstackUtils.markTypeMod.MarkType.INLINE_CODE & String = js.native
    
    /* "italic" */ val ITALIC: typings.contentstackUtils.markTypeMod.MarkType.ITALIC & String = js.native
    
    /* "strikethrough" */ val STRIKE_THROUGH: typings.contentstackUtils.markTypeMod.MarkType.STRIKE_THROUGH & String = js.native
    
    /* "subscript" */ val SUBSCRIPT: typings.contentstackUtils.markTypeMod.MarkType.SUBSCRIPT & String = js.native
    
    /* "superscript" */ val SUPERSCRIPT: typings.contentstackUtils.markTypeMod.MarkType.SUPERSCRIPT & String = js.native
    
    /* "underline" */ val UNDERLINE: typings.contentstackUtils.markTypeMod.MarkType.UNDERLINE & String = js.native
  }
  
  @JSImport("@contentstack/utils", "Node")
  @js.native
  open class Node ()
    extends typings.contentstackUtils.nodeMod.default
  
  @JSImport("@contentstack/utils", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.contentstackUtils.nodeTypeMod.NodeType & String] = js.native
    
    /* "blockquote" */ val BLOCK_QUOTE: typings.contentstackUtils.nodeTypeMod.NodeType.BLOCK_QUOTE & String = js.native
    
    /* "code" */ val CODE: typings.contentstackUtils.nodeTypeMod.NodeType.CODE & String = js.native
    
    /* "doc" */ val DOCUMENT: typings.contentstackUtils.nodeTypeMod.NodeType.DOCUMENT & String = js.native
    
    /* "embed" */ val EMBED: typings.contentstackUtils.nodeTypeMod.NodeType.EMBED & String = js.native
    
    /* "h1" */ val HEADING_1: typings.contentstackUtils.nodeTypeMod.NodeType.HEADING_1 & String = js.native
    
    /* "h2" */ val HEADING_2: typings.contentstackUtils.nodeTypeMod.NodeType.HEADING_2 & String = js.native
    
    /* "h3" */ val HEADING_3: typings.contentstackUtils.nodeTypeMod.NodeType.HEADING_3 & String = js.native
    
    /* "h4" */ val HEADING_4: typings.contentstackUtils.nodeTypeMod.NodeType.HEADING_4 & String = js.native
    
    /* "h5" */ val HEADING_5: typings.contentstackUtils.nodeTypeMod.NodeType.HEADING_5 & String = js.native
    
    /* "h6" */ val HEADING_6: typings.contentstackUtils.nodeTypeMod.NodeType.HEADING_6 & String = js.native
    
    /* "hr" */ val HR: typings.contentstackUtils.nodeTypeMod.NodeType.HR & String = js.native
    
    /* "img" */ val IMAGE: typings.contentstackUtils.nodeTypeMod.NodeType.IMAGE & String = js.native
    
    /* "a" */ val LINK: typings.contentstackUtils.nodeTypeMod.NodeType.LINK & String = js.native
    
    /* "li" */ val LIST_ITEM: typings.contentstackUtils.nodeTypeMod.NodeType.LIST_ITEM & String = js.native
    
    /* "ol" */ val ORDER_LIST: typings.contentstackUtils.nodeTypeMod.NodeType.ORDER_LIST & String = js.native
    
    /* "p" */ val PARAGRAPH: typings.contentstackUtils.nodeTypeMod.NodeType.PARAGRAPH & String = js.native
    
    /* "reference" */ val REFERENCE: typings.contentstackUtils.nodeTypeMod.NodeType.REFERENCE & String = js.native
    
    /* "table" */ val TABLE: typings.contentstackUtils.nodeTypeMod.NodeType.TABLE & String = js.native
    
    /* "tbody" */ val TABLE_BODY: typings.contentstackUtils.nodeTypeMod.NodeType.TABLE_BODY & String = js.native
    
    /* "td" */ val TABLE_DATA: typings.contentstackUtils.nodeTypeMod.NodeType.TABLE_DATA & String = js.native
    
    /* "tfoot" */ val TABLE_FOOTER: typings.contentstackUtils.nodeTypeMod.NodeType.TABLE_FOOTER & String = js.native
    
    /* "th" */ val TABLE_HEAD: typings.contentstackUtils.nodeTypeMod.NodeType.TABLE_HEAD & String = js.native
    
    /* "thead" */ val TABLE_HEADER: typings.contentstackUtils.nodeTypeMod.NodeType.TABLE_HEADER & String = js.native
    
    /* "tr" */ val TABLE_ROW: typings.contentstackUtils.nodeTypeMod.NodeType.TABLE_ROW & String = js.native
    
    /* "text" */ val TEXT: typings.contentstackUtils.nodeTypeMod.NodeType.TEXT & String = js.native
    
    /* "ul" */ val UNORDER_LIST: typings.contentstackUtils.nodeTypeMod.NodeType.UNORDER_LIST & String = js.native
  }
  
  @JSImport("@contentstack/utils", "StyleType")
  @js.native
  object StyleType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.contentstackUtils.styleTypeMod.StyleType & String] = js.native
    
    /* "block" */ val BLOCK: typings.contentstackUtils.styleTypeMod.StyleType.BLOCK & String = js.native
    
    /* "display" */ val DISPLAY: typings.contentstackUtils.styleTypeMod.StyleType.DISPLAY & String = js.native
    
    /* "download" */ val DOWNLOAD: typings.contentstackUtils.styleTypeMod.StyleType.DOWNLOAD & String = js.native
    
    /* "inline" */ val INLINE: typings.contentstackUtils.styleTypeMod.StyleType.INLINE & String = js.native
    
    /* "link" */ val LINK: typings.contentstackUtils.styleTypeMod.StyleType.LINK & String = js.native
  }
  
  @JSImport("@contentstack/utils", "TextNode")
  @js.native
  open class TextNode protected ()
    extends typings.contentstackUtils.textNodeMod.default {
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
