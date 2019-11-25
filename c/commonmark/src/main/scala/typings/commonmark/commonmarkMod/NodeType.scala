package typings.commonmark.commonmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait NodeType extends js.Object

object NodeType {
  @scala.inline
  def block_quote: typings.commonmark.commonmarkStrings.block_quote = this.cast("block_quote")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typings.commonmark.commonmarkStrings.code = this.cast("code")
  @scala.inline
  def code_block: typings.commonmark.commonmarkStrings.code_block = this.cast("code_block")
  @scala.inline
  def custom_block: typings.commonmark.commonmarkStrings.custom_block = this.cast("custom_block")
  @scala.inline
  def custom_inline: typings.commonmark.commonmarkStrings.custom_inline = this.cast("custom_inline")
  @scala.inline
  def document: typings.commonmark.commonmarkStrings.document = this.cast("document")
  @scala.inline
  def emph: typings.commonmark.commonmarkStrings.emph = this.cast("emph")
  @scala.inline
  def heading: typings.commonmark.commonmarkStrings.heading = this.cast("heading")
  @scala.inline
  def html_block: typings.commonmark.commonmarkStrings.html_block = this.cast("html_block")
  @scala.inline
  def html_inline: typings.commonmark.commonmarkStrings.html_inline = this.cast("html_inline")
  @scala.inline
  def image: typings.commonmark.commonmarkStrings.image = this.cast("image")
  @scala.inline
  def item: typings.commonmark.commonmarkStrings.item = this.cast("item")
  @scala.inline
  def linebreak: typings.commonmark.commonmarkStrings.linebreak = this.cast("linebreak")
  @scala.inline
  def link: typings.commonmark.commonmarkStrings.link = this.cast("link")
  @scala.inline
  def list: typings.commonmark.commonmarkStrings.list = this.cast("list")
  @scala.inline
  def paragraph: typings.commonmark.commonmarkStrings.paragraph = this.cast("paragraph")
  @scala.inline
  def softbreak: typings.commonmark.commonmarkStrings.softbreak = this.cast("softbreak")
  @scala.inline
  def strong: typings.commonmark.commonmarkStrings.strong = this.cast("strong")
  @scala.inline
  def text: typings.commonmark.commonmarkStrings.text = this.cast("text")
  @scala.inline
  def thematic_break: typings.commonmark.commonmarkStrings.thematic_break = this.cast("thematic_break")
}

