package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.htmlParser.filterRulesDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlParser {
  
  @JSGlobal("CKEDITOR.htmlParser.basicWriter")
  @js.native
  class basicWriter ()
    extends StObject
       with typings.ckeditor.CKEDITOR.htmlParser.basicWriter {
    
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
  class cdata protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.htmlParser.cdata {
    def this(value: String) = this()
  }
  
  @JSGlobal("CKEDITOR.htmlParser.comment")
  @js.native
  class comment protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.htmlParser.comment {
    def this(value: String) = this()
  }
  
  @JSGlobal("CKEDITOR.htmlParser.cssStyle")
  @js.native
  class cssStyle protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.htmlParser.cssStyle {
    def this(elementOrStyleText: String) = this()
    def this(elementOrStyleText: typings.ckeditor.CKEDITOR.htmlParser.element) = this()
  }
  
  @JSGlobal("CKEDITOR.htmlParser.element")
  @js.native
  class element protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.htmlParser.element {
    def this(name: String, attributes: StringDictionary[String]) = this()
  }
  
  @JSGlobal("CKEDITOR.htmlParser.filter")
  @js.native
  class filter ()
    extends StObject
       with typings.ckeditor.CKEDITOR.htmlParser.filter {
    def this(rules: filterRulesDefinition) = this()
  }
  
  @JSGlobal("CKEDITOR.htmlParser.filterRulesGroup")
  @js.native
  class filterRulesGroup ()
    extends StObject
       with typings.ckeditor.CKEDITOR.htmlParser.filterRulesGroup
  
  @JSGlobal("CKEDITOR.htmlParser.fragment")
  @js.native
  class fragment ()
    extends StObject
       with typings.ckeditor.CKEDITOR.htmlParser.fragment
  object fragment {
    
    @JSGlobal("CKEDITOR.htmlParser.fragment")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromBBCode(source: String): typings.ckeditor.CKEDITOR.htmlParser.fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBBCode")(source.asInstanceOf[js.Any]).asInstanceOf[typings.ckeditor.CKEDITOR.htmlParser.fragment]
    
    /* static member */
    inline def fromHtml(fragmentHtml: String): typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHtml")(fragmentHtml.asInstanceOf[js.Any]).asInstanceOf[typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element]
    inline def fromHtml(fragmentHtml: String, parent: String): typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHtml")(fragmentHtml.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element]
    inline def fromHtml(fragmentHtml: String, parent: String, fixingBlock: String): typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHtml")(fragmentHtml.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], fixingBlock.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element]
    inline def fromHtml(fragmentHtml: String, parent: String, fixingBlock: Boolean): typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHtml")(fragmentHtml.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], fixingBlock.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element]
    inline def fromHtml(fragmentHtml: String, parent: Unit, fixingBlock: String): typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHtml")(fragmentHtml.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], fixingBlock.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element]
    inline def fromHtml(fragmentHtml: String, parent: Unit, fixingBlock: Boolean): typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHtml")(fragmentHtml.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], fixingBlock.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element]
    inline def fromHtml(fragmentHtml: String, parent: typings.ckeditor.CKEDITOR.htmlParser.element): typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHtml")(fragmentHtml.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element]
    inline def fromHtml(fragmentHtml: String, parent: typings.ckeditor.CKEDITOR.htmlParser.element, fixingBlock: String): typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHtml")(fragmentHtml.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], fixingBlock.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element]
    inline def fromHtml(fragmentHtml: String, parent: typings.ckeditor.CKEDITOR.htmlParser.element, fixingBlock: Boolean): typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHtml")(fragmentHtml.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], fixingBlock.asInstanceOf[js.Any])).asInstanceOf[typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element]
  }
  
  @JSGlobal("CKEDITOR.htmlParser.node")
  @js.native
  class node ()
    extends StObject
       with typings.ckeditor.CKEDITOR.htmlParser.node
  
  @JSGlobal("CKEDITOR.htmlParser.text")
  @js.native
  class text protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.htmlParser.text {
    def this(value: String) = this()
  }
}
