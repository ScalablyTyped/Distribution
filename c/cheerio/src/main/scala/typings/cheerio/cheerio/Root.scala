package typings.cheerio.cheerio

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Root extends Selector {
  
  def contains(container: Element, contained: Element): Boolean = js.native
  
  def html(): String = js.native
  def html(dom: String): String = js.native
  def html(dom: String, options: CheerioParserOptions): String = js.native
  def html(dom: Cheerio): String = js.native
  def html(dom: Cheerio, options: CheerioParserOptions): String = js.native
  def html(dom: Element): String = js.native
  def html(dom: Element, options: CheerioParserOptions): String = js.native
  def html(options: CheerioParserOptions): String = js.native
  
  def parseHTML(data: String): js.Array[Document] = js.native
  def parseHTML(data: String, context: js.UndefOr[scala.Nothing], keepScripts: Boolean): js.Array[Document] = js.native
  def parseHTML(data: String, context: Document): js.Array[Document] = js.native
  def parseHTML(data: String, context: Document, keepScripts: Boolean): js.Array[Document] = js.native
  
  // Document References
  // Cheerio https://github.com/cheeriojs/cheerio
  // JQuery http://api.jquery.com
  def root(): Cheerio = js.native
  
  def xml(): String = js.native
  def xml(dom: String): String = js.native
  def xml(dom: Cheerio): String = js.native
  def xml(dom: Element): String = js.native
}
