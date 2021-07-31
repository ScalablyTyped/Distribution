package typings.commonmark

import typings.commonmark.commonmarkStrings.Dot
import typings.commonmark.commonmarkStrings.Rightparenthesis
import typings.commonmark.commonmarkStrings.bullet
import typings.commonmark.commonmarkStrings.ordered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("commonmark", "HtmlRenderer")
  @js.native
  class HtmlRenderer () extends StObject {
    def this(options: HtmlRenderingOptions) = this()
    
    /**
      * Override the function that will be used to escape (sanitize) the html output. Return value is used to add to the html output
      * @param input the input to escape
      * @param isAttributeValue indicates wheter or not the input value will be used as value of an html attribute.
      */
    def escape(input: String, isAttributeValue: Boolean): String = js.native
    
    def render(root: Node): String = js.native
    
    /**
      * Let's you override the softbreak properties of a renderer. So, to make soft breaks render as hard breaks in HTML:
      * writer.softbreak = "<br />";
      */
    var softbreak: String = js.native
  }
  
  @JSImport("commonmark", "Node")
  @js.native
  class Node protected () extends StObject {
    def this(nodeType: NodeType) = this()
    def this(nodeType: NodeType, sourcepos: Position) = this()
    
    /**
      * Setting the backing object of listType, listTight, listStat and listDelimiter directly.
      * Not needed unless creating list nodes directly. Should be fixed from v>0.22.1
      * https://github.com/jgm/commonmark.js/issues/74
      */
    var _listData: ListData = js.native
    
    /**
      * Append a Node child to the end of the Node's children.
      */
    def appendChild(child: Node): Unit = js.native
    
    /**
      * link or image destination (String) or null.
      */
    var destination: String | Null = js.native
    
    /**
      * (read-only): a Node or null.
      */
    val firstChild: Node | Null = js.native
    
    /**
      * fenced code block info string (String) or null.
      */
    var info: String | Null = js.native
    
    /**
      * Insert a Node sibling after the Node.
      */
    def insertAfter(sibling: Node): Unit = js.native
    
    /**
      * Insert a Node sibling before the Node.
      */
    def insertBefore(sibling: Node): Unit = js.native
    
    /**
      * (read-only): true if the Node can contain other Nodes as children.
      */
    val isContainer: Boolean = js.native
    
    /**
      * (read-only): a Node or null.
      */
    val lastChild: Node | Null = js.native
    
    /**
      * heading level (Number).
      */
    var level: Double = js.native
    
    /**
      * a String, either ) or . for an ordered list.
      */
    var listDelimiter: Rightparenthesis | Dot = js.native
    
    /**
      * a Number, the starting number of an ordered list.
      */
    var listStart: Double = js.native
    
    /**
      * true if list is tight
      */
    var listTight: Boolean = js.native
    
    /**
      * either Bullet or Ordered (or undefined).
      */
    var listType: bullet | ordered = js.native
    
    /**
      *  the literal String content of the node or null.
      */
    var literal: String | Null = js.native
    
    /**
      * (read-only): a Node or null.
      */
    val next: Node | Null = js.native
    
    /**
      * used only for CustomBlock or CustomInline.
      */
    var onEnter: String = js.native
    
    /**
      * used only for CustomBlock or CustomInline.
      */
    var onExit: String = js.native
    
    /**
      * (read-only): a Node or null.
      */
    val parent: Node | Null = js.native
    
    /**
      *  Prepend a Node child to the beginning of the Node's children.
      */
    def prependChild(child: Node): Unit = js.native
    
    /**
      * (read-only): a Node or null.
      */
    val prev: Node | Null = js.native
    
    /**
      * (read-only): an Array with the following form: [[startline, startcolumn], [endline, endcolumn]]
      */
    val sourcepos: Position = js.native
    
    /**
      *  link or image title (String) or null.
      */
    var title: String | Null = js.native
    
    /**
      * (read-only): a String, one of text, softbreak, linebreak, emph, strong, html_inline, link, image, code, document, paragraph,
      * block_quote, item, list, heading, code_block, html_block, thematic_break.
      */
    val `type`: NodeType = js.native
    
    /**
      *  Remove the Node from the tree, severing its links with siblings and parents, and closing up gaps as needed.
      */
    def unlink(): Unit = js.native
    
    /**
      * Returns a NodeWalker that can be used to iterate through the Node tree rooted in the Node
      */
    def walker(): NodeWalker = js.native
  }
  
  @JSImport("commonmark", "Parser")
  @js.native
  /**
    * Constructs a new Parser
    */
  class Parser () extends StObject {
    def this(options: ParserOptions) = this()
    
    def parse(input: String): Node = js.native
  }
  
  @JSImport("commonmark", "XmlRenderer")
  @js.native
  class XmlRenderer () extends StObject {
    def this(options: XmlRenderingOptions) = this()
    
    def render(root: Node): String = js.native
  }
  
  trait HtmlRenderingOptions
    extends StObject
       with XmlRenderingOptions {
    
    /**
      *  if true, raw HTML will not be passed through to HTML output (it will be replaced by comments), and potentially unsafe URLs in links and images
      *  (those beginning with javascript:, vbscript:, file:, and with a few exceptions data:) will be replaced with empty strings.
      */
    var safe: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  if true, straight quotes will be made curly, -- will be changed to an en dash, --- will be changed to an em dash, and ... will be changed to ellipses.
      */
    var smart: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A raw string to be used for a softbreak.
      * For example, `{ softbreak: "<br/>" }` treats a softbreak as `<br/>`.
      */
    var softbreak: js.UndefOr[String] = js.undefined
  }
  object HtmlRenderingOptions {
    
    @scala.inline
    def apply(): HtmlRenderingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlRenderingOptions]
    }
    
    @scala.inline
    implicit class HtmlRenderingOptionsMutableBuilder[Self <: HtmlRenderingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
      
      @scala.inline
      def setSmart(value: Boolean): Self = StObject.set(x, "smart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmartUndefined: Self = StObject.set(x, "smart", js.undefined)
      
      @scala.inline
      def setSoftbreak(value: String): Self = StObject.set(x, "softbreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoftbreakUndefined: Self = StObject.set(x, "softbreak", js.undefined)
    }
  }
  
  trait ListData extends StObject {
    
    var bulletChar: js.UndefOr[String] = js.undefined
    
    var delimiter: js.UndefOr[String] = js.undefined
    
    var tight: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ListData {
    
    @scala.inline
    def apply(): ListData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListData]
    }
    
    @scala.inline
    implicit class ListDataMutableBuilder[Self <: ListData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBulletChar(value: String): Self = StObject.set(x, "bulletChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBulletCharUndefined: Self = StObject.set(x, "bulletChar", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setTight(value: Boolean): Self = StObject.set(x, "tight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTightUndefined: Self = StObject.set(x, "tight", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.commonmark.commonmarkStrings.text
    - typings.commonmark.commonmarkStrings.softbreak
    - typings.commonmark.commonmarkStrings.linebreak
    - typings.commonmark.commonmarkStrings.emph
    - typings.commonmark.commonmarkStrings.strong
    - typings.commonmark.commonmarkStrings.html_inline
    - typings.commonmark.commonmarkStrings.link
    - typings.commonmark.commonmarkStrings.image
    - typings.commonmark.commonmarkStrings.code
    - typings.commonmark.commonmarkStrings.document
    - typings.commonmark.commonmarkStrings.paragraph
    - typings.commonmark.commonmarkStrings.block_quote
    - typings.commonmark.commonmarkStrings.item
    - typings.commonmark.commonmarkStrings.list
    - typings.commonmark.commonmarkStrings.heading
    - typings.commonmark.commonmarkStrings.code_block
    - typings.commonmark.commonmarkStrings.html_block
    - typings.commonmark.commonmarkStrings.thematic_break
    - typings.commonmark.commonmarkStrings.custom_inline
    - typings.commonmark.commonmarkStrings.custom_block
  */
  trait NodeType extends StObject
  object NodeType {
    
    @scala.inline
    def block_quote: typings.commonmark.commonmarkStrings.block_quote = "block_quote".asInstanceOf[typings.commonmark.commonmarkStrings.block_quote]
    
    @scala.inline
    def code: typings.commonmark.commonmarkStrings.code = "code".asInstanceOf[typings.commonmark.commonmarkStrings.code]
    
    @scala.inline
    def code_block: typings.commonmark.commonmarkStrings.code_block = "code_block".asInstanceOf[typings.commonmark.commonmarkStrings.code_block]
    
    @scala.inline
    def custom_block: typings.commonmark.commonmarkStrings.custom_block = "custom_block".asInstanceOf[typings.commonmark.commonmarkStrings.custom_block]
    
    @scala.inline
    def custom_inline: typings.commonmark.commonmarkStrings.custom_inline = "custom_inline".asInstanceOf[typings.commonmark.commonmarkStrings.custom_inline]
    
    @scala.inline
    def document: typings.commonmark.commonmarkStrings.document = "document".asInstanceOf[typings.commonmark.commonmarkStrings.document]
    
    @scala.inline
    def emph: typings.commonmark.commonmarkStrings.emph = "emph".asInstanceOf[typings.commonmark.commonmarkStrings.emph]
    
    @scala.inline
    def heading: typings.commonmark.commonmarkStrings.heading = "heading".asInstanceOf[typings.commonmark.commonmarkStrings.heading]
    
    @scala.inline
    def html_block: typings.commonmark.commonmarkStrings.html_block = "html_block".asInstanceOf[typings.commonmark.commonmarkStrings.html_block]
    
    @scala.inline
    def html_inline: typings.commonmark.commonmarkStrings.html_inline = "html_inline".asInstanceOf[typings.commonmark.commonmarkStrings.html_inline]
    
    @scala.inline
    def image: typings.commonmark.commonmarkStrings.image = "image".asInstanceOf[typings.commonmark.commonmarkStrings.image]
    
    @scala.inline
    def item: typings.commonmark.commonmarkStrings.item = "item".asInstanceOf[typings.commonmark.commonmarkStrings.item]
    
    @scala.inline
    def linebreak: typings.commonmark.commonmarkStrings.linebreak = "linebreak".asInstanceOf[typings.commonmark.commonmarkStrings.linebreak]
    
    @scala.inline
    def link: typings.commonmark.commonmarkStrings.link = "link".asInstanceOf[typings.commonmark.commonmarkStrings.link]
    
    @scala.inline
    def list: typings.commonmark.commonmarkStrings.list = "list".asInstanceOf[typings.commonmark.commonmarkStrings.list]
    
    @scala.inline
    def paragraph: typings.commonmark.commonmarkStrings.paragraph = "paragraph".asInstanceOf[typings.commonmark.commonmarkStrings.paragraph]
    
    @scala.inline
    def softbreak: typings.commonmark.commonmarkStrings.softbreak = "softbreak".asInstanceOf[typings.commonmark.commonmarkStrings.softbreak]
    
    @scala.inline
    def strong: typings.commonmark.commonmarkStrings.strong = "strong".asInstanceOf[typings.commonmark.commonmarkStrings.strong]
    
    @scala.inline
    def text: typings.commonmark.commonmarkStrings.text = "text".asInstanceOf[typings.commonmark.commonmarkStrings.text]
    
    @scala.inline
    def thematic_break: typings.commonmark.commonmarkStrings.thematic_break = "thematic_break".asInstanceOf[typings.commonmark.commonmarkStrings.thematic_break]
  }
  
  @js.native
  trait NodeWalker extends StObject {
    
    /**
      * Returns an object with properties entering and node. Returns null when we have finished walking the tree.
      */
    def next(): NodeWalkingStep = js.native
    
    /**
      * Resets the iterator to resume at the specified node and setting for entering. (Normally this isn't needed unless you do destructive updates to the Node tree.)
      */
    def resumeAt(node: Node): Unit = js.native
    def resumeAt(node: Node, entering: Boolean): Unit = js.native
  }
  
  trait NodeWalkingStep extends StObject {
    
    /**
      * a boolean, which is true when we enter a Node from a parent or sibling, and false when we reenter it from a child
      */
    var entering: Boolean
    
    /**
      * The node belonging to this step
      */
    var node: Node
  }
  object NodeWalkingStep {
    
    @scala.inline
    def apply(entering: Boolean, node: Node): NodeWalkingStep = {
      val __obj = js.Dynamic.literal(entering = entering.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeWalkingStep]
    }
    
    @scala.inline
    implicit class NodeWalkingStepMutableBuilder[Self <: NodeWalkingStep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntering(value: Boolean): Self = StObject.set(x, "entering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParserOptions extends StObject {
    
    /**
      *  if true, straight quotes will be made curly, -- will be changed to an en dash, --- will be changed to an em dash, and ... will be changed to ellipses.
      */
    var smart: js.UndefOr[Boolean] = js.undefined
    
    var time: js.UndefOr[Boolean] = js.undefined
  }
  object ParserOptions {
    
    @scala.inline
    def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    @scala.inline
    implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSmart(value: Boolean): Self = StObject.set(x, "smart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmartUndefined: Self = StObject.set(x, "smart", js.undefined)
      
      @scala.inline
      def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  type Position = js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]
  
  trait XmlRenderingOptions extends StObject {
    
    var sourcepos: js.UndefOr[Boolean] = js.undefined
    
    var time: js.UndefOr[Boolean] = js.undefined
  }
  object XmlRenderingOptions {
    
    @scala.inline
    def apply(): XmlRenderingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlRenderingOptions]
    }
    
    @scala.inline
    implicit class XmlRenderingOptionsMutableBuilder[Self <: XmlRenderingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourcepos(value: Boolean): Self = StObject.set(x, "sourcepos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceposUndefined: Self = StObject.set(x, "sourcepos", js.undefined)
      
      @scala.inline
      def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
}
