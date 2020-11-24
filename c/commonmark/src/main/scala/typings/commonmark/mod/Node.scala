package typings.commonmark.mod

import typings.commonmark.commonmarkStrings.Dot
import typings.commonmark.commonmarkStrings.Rightparenthesis
import typings.commonmark.commonmarkStrings.bullet
import typings.commonmark.commonmarkStrings.ordered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("commonmark", "Node")
@js.native
class Node protected () extends js.Object {
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
