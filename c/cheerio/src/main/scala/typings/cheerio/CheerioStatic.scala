package typings.cheerio

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheerioStatic extends CheerioSelector {
  def contains(container: CheerioElement, contained: CheerioElement): Boolean = js.native
  def html(): String = js.native
  def html(element: Cheerio): String = js.native
  def html(element: CheerioElement): String = js.native
  def html(element: CheerioElement, options: CheerioOptionsInterface): String = js.native
  def html(element: Cheerio, options: CheerioOptionsInterface): String = js.native
  def html(options: CheerioOptionsInterface): String = js.native
  def html(selector: String): String = js.native
  def html(selector: String, options: CheerioOptionsInterface): String = js.native
  def parseHTML(data: String): js.Array[Document] = js.native
  def parseHTML(data: String, context: Document): js.Array[Document] = js.native
  def parseHTML(data: String, context: Document, keepScripts: Boolean): js.Array[Document] = js.native
  def root(): Cheerio = js.native
  // Document References
  // Cheerio https://github.com/cheeriojs/cheerio
  // JQuery http://api.jquery.com
  def xml(): String = js.native
}

