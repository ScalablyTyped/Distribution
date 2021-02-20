package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.htmlParser.filterRulesDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlParser {
  
  @JSGlobal("CKEDITOR.htmlParser.basicWriter")
  @js.native
  class basicWriter ()
    extends typings.ckeditor.CKEDITOR.htmlParser.basicWriter
  
  @JSGlobal("CKEDITOR.htmlParser.cdata")
  @js.native
  class cdata protected ()
    extends typings.ckeditor.CKEDITOR.htmlParser.cdata {
    def this(value: String) = this()
  }
  
  @JSGlobal("CKEDITOR.htmlParser.comment")
  @js.native
  class comment protected ()
    extends typings.ckeditor.CKEDITOR.htmlParser.comment {
    def this(value: String) = this()
  }
  
  @JSGlobal("CKEDITOR.htmlParser.cssStyle")
  @js.native
  class cssStyle protected ()
    extends typings.ckeditor.CKEDITOR.htmlParser.cssStyle {
    def this(elementOrStyleText: String) = this()
    def this(elementOrStyleText: typings.ckeditor.CKEDITOR.htmlParser.element) = this()
  }
  
  @JSGlobal("CKEDITOR.htmlParser.element")
  @js.native
  class element protected ()
    extends typings.ckeditor.CKEDITOR.htmlParser.element {
    def this(name: String, attributes: StringDictionary[String]) = this()
  }
  
  @JSGlobal("CKEDITOR.htmlParser.filter")
  @js.native
  class filter ()
    extends typings.ckeditor.CKEDITOR.htmlParser.filter {
    def this(rules: filterRulesDefinition) = this()
  }
  
  @JSGlobal("CKEDITOR.htmlParser.filterRulesGroup")
  @js.native
  class filterRulesGroup ()
    extends typings.ckeditor.CKEDITOR.htmlParser.filterRulesGroup
  
  @JSGlobal("CKEDITOR.htmlParser.fragment")
  @js.native
  class fragment ()
    extends typings.ckeditor.CKEDITOR.htmlParser.fragment
  object fragment {
    
    /* static member */
    @JSGlobal("CKEDITOR.htmlParser.fragment.fromBBCode")
    @js.native
    def fromBBCode(source: String): typings.ckeditor.CKEDITOR.htmlParser.fragment = js.native
    
    /* static member */
    @JSGlobal("CKEDITOR.htmlParser.fragment.fromHtml")
    @js.native
    def fromHtml(fragmentHtml: String): typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element = js.native
    @JSGlobal("CKEDITOR.htmlParser.fragment.fromHtml")
    @js.native
    def fromHtml(fragmentHtml: String, parent: js.UndefOr[scala.Nothing], fixingBlock: String): typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element = js.native
    @JSGlobal("CKEDITOR.htmlParser.fragment.fromHtml")
    @js.native
    def fromHtml(fragmentHtml: String, parent: js.UndefOr[scala.Nothing], fixingBlock: Boolean): typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element = js.native
    @JSGlobal("CKEDITOR.htmlParser.fragment.fromHtml")
    @js.native
    def fromHtml(fragmentHtml: String, parent: String): typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element = js.native
    @JSGlobal("CKEDITOR.htmlParser.fragment.fromHtml")
    @js.native
    def fromHtml(fragmentHtml: String, parent: String, fixingBlock: String): typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element = js.native
    @JSGlobal("CKEDITOR.htmlParser.fragment.fromHtml")
    @js.native
    def fromHtml(fragmentHtml: String, parent: String, fixingBlock: Boolean): typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element = js.native
    @JSGlobal("CKEDITOR.htmlParser.fragment.fromHtml")
    @js.native
    def fromHtml(fragmentHtml: String, parent: typings.ckeditor.CKEDITOR.htmlParser.element): typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element = js.native
    @JSGlobal("CKEDITOR.htmlParser.fragment.fromHtml")
    @js.native
    def fromHtml(fragmentHtml: String, parent: typings.ckeditor.CKEDITOR.htmlParser.element, fixingBlock: String): typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element = js.native
    @JSGlobal("CKEDITOR.htmlParser.fragment.fromHtml")
    @js.native
    def fromHtml(fragmentHtml: String, parent: typings.ckeditor.CKEDITOR.htmlParser.element, fixingBlock: Boolean): typings.ckeditor.CKEDITOR.htmlParser.fragment | typings.ckeditor.CKEDITOR.htmlParser.element = js.native
  }
  
  @JSGlobal("CKEDITOR.htmlParser.node")
  @js.native
  class node ()
    extends typings.ckeditor.CKEDITOR.htmlParser.node
  
  @JSGlobal("CKEDITOR.htmlParser.text")
  @js.native
  class text protected ()
    extends typings.ckeditor.CKEDITOR.htmlParser.text {
    def this(value: String) = this()
  }
}
