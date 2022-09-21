package typings.ckeditor4.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor4.CKEDITOR.htmlParser.filterRulesDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlParser {
  
  @JSGlobal("CKEDITOR.htmlParser.basicWriter")
  @js.native
  open class basicWriter ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.htmlParser.basicWriter {
    
    /* CompleteClass */
    override def attribute(attName: String, attValue: String): Unit = js.native
    
    /* CompleteClass */
    override def closeTag(tagName: String): Unit = js.native
    
    /* CompleteClass */
    override def comment(comment: String): Unit = js.native
    
    /* CompleteClass */
    override def getHtml(reset: Boolean): String = js.native
    
    /* CompleteClass */
    override def openTag(tagName: String, attributes: StringDictionary[String]): Unit = js.native
    
    /* CompleteClass */
    override def openTagClose(tagName: String, isSelfClose: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def text(text: String): Unit = js.native
    
    /* CompleteClass */
    override def write(data: String): Unit = js.native
  }
  
  @JSGlobal("CKEDITOR.htmlParser.cdata")
  @js.native
  open class cdata protected ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.htmlParser.cdata {
    def this(value: String) = this()
  }
  
  @JSGlobal("CKEDITOR.htmlParser.comment")
  @js.native
  open class comment protected ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.htmlParser.comment {
    def this(value: String) = this()
  }
  
  @JSGlobal("CKEDITOR.htmlParser.cssStyle")
  @js.native
  open class cssStyle protected ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.htmlParser.cssStyle {
    def this(elementOrStyleText: String) = this()
    def this(elementOrStyleText: typings.ckeditor4.CKEDITOR.htmlParser.element) = this()
  }
  
  @JSGlobal("CKEDITOR.htmlParser.element")
  @js.native
  open class element protected ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.htmlParser.element {
    def this(name: String) = this()
    def this(name: String, attributes: StringDictionary[String]) = this()
  }
  
  @JSGlobal("CKEDITOR.htmlParser.filter")
  @js.native
  open class filter ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.htmlParser.filter {
    def this(rules: filterRulesDefinition) = this()
  }
  
  @JSGlobal("CKEDITOR.htmlParser.filterRulesGroup")
  @js.native
  open class filterRulesGroup ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.htmlParser.filterRulesGroup
  
  @JSGlobal("CKEDITOR.htmlParser.fragment")
  @js.native
  open class fragment ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.htmlParser.fragment
  object fragment {
    
    @JSGlobal("CKEDITOR.htmlParser.fragment")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromBBCode(source: String): typings.ckeditor4.CKEDITOR.htmlParser.fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBBCode")(source.asInstanceOf[js.Any]).asInstanceOf[typings.ckeditor4.CKEDITOR.htmlParser.fragment]
    
    /* static member */
    inline def fromHtml(fragmentHtml: String): typings.ckeditor4.CKEDITOR.htmlParser.fragment | typings.ckeditor4.CKEDITOR.htmlParser.element = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHtml")(fragmentHtml.asInstanceOf[js.Any]).asInstanceOf[typings.ckeditor4.CKEDITOR.htmlParser.fragment | typings.ckeditor4.CKEDITOR.htmlParser.element]
    inline def fromHtml(fragmentHtml: String, parent: String): typings.ckeditor4.CKEDITOR.htmlParser.fragment | typings.ckeditor4.CKEDITOR.htmlParser.element = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHtml")(fragmentHtml.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor4.CKEDITOR.htmlParser.fragment | typings.ckeditor4.CKEDITOR.htmlParser.element]
    inline def fromHtml(fragmentHtml: String, parent: String, fixingBlock: String): typings.ckeditor4.CKEDITOR.htmlParser.fragment | typings.ckeditor4.CKEDITOR.htmlParser.element = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHtml")(fragmentHtml.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], fixingBlock.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor4.CKEDITOR.htmlParser.fragment | typings.ckeditor4.CKEDITOR.htmlParser.element]
    inline def fromHtml(fragmentHtml: String, parent: String, fixingBlock: Boolean): typings.ckeditor4.CKEDITOR.htmlParser.fragment | typings.ckeditor4.CKEDITOR.htmlParser.element = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHtml")(fragmentHtml.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], fixingBlock.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor4.CKEDITOR.htmlParser.fragment | typings.ckeditor4.CKEDITOR.htmlParser.element]
    inline def fromHtml(fragmentHtml: String, parent: Unit, fixingBlock: String): typings.ckeditor4.CKEDITOR.htmlParser.fragment | typings.ckeditor4.CKEDITOR.htmlParser.element = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHtml")(fragmentHtml.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], fixingBlock.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor4.CKEDITOR.htmlParser.fragment | typings.ckeditor4.CKEDITOR.htmlParser.element]
    inline def fromHtml(fragmentHtml: String, parent: Unit, fixingBlock: Boolean): typings.ckeditor4.CKEDITOR.htmlParser.fragment | typings.ckeditor4.CKEDITOR.htmlParser.element = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHtml")(fragmentHtml.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], fixingBlock.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor4.CKEDITOR.htmlParser.fragment | typings.ckeditor4.CKEDITOR.htmlParser.element]
    inline def fromHtml(fragmentHtml: String, parent: typings.ckeditor4.CKEDITOR.htmlParser.element): typings.ckeditor4.CKEDITOR.htmlParser.fragment | typings.ckeditor4.CKEDITOR.htmlParser.element = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHtml")(fragmentHtml.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor4.CKEDITOR.htmlParser.fragment | typings.ckeditor4.CKEDITOR.htmlParser.element]
    inline def fromHtml(fragmentHtml: String, parent: typings.ckeditor4.CKEDITOR.htmlParser.element, fixingBlock: String): typings.ckeditor4.CKEDITOR.htmlParser.fragment | typings.ckeditor4.CKEDITOR.htmlParser.element = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHtml")(fragmentHtml.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], fixingBlock.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor4.CKEDITOR.htmlParser.fragment | typings.ckeditor4.CKEDITOR.htmlParser.element]
    inline def fromHtml(fragmentHtml: String, parent: typings.ckeditor4.CKEDITOR.htmlParser.element, fixingBlock: Boolean): typings.ckeditor4.CKEDITOR.htmlParser.fragment | typings.ckeditor4.CKEDITOR.htmlParser.element = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHtml")(fragmentHtml.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], fixingBlock.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor4.CKEDITOR.htmlParser.fragment | typings.ckeditor4.CKEDITOR.htmlParser.element]
  }
  
  @JSGlobal("CKEDITOR.htmlParser.node")
  @js.native
  open class node ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.htmlParser.node
  
  @JSGlobal("CKEDITOR.htmlParser.text")
  @js.native
  open class text protected ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.htmlParser.text {
    def this(value: String) = this()
  }
}
