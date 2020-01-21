package typings.cheerio

import typings.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheerioStatic extends CheerioSelector {
  def contains(container: CheerioElement, contained: CheerioElement): Boolean = js.native
  def html(): String = js.native
  def html(element: CheerioElement): String = js.native
  def html(element: CheerioElement, options: CheerioOptionsInterface): String = js.native
  def html(element: Cheerio_): String = js.native
  def html(element: Cheerio_, options: CheerioOptionsInterface): String = js.native
  def html(options: CheerioOptionsInterface): String = js.native
  def html(selector: String): String = js.native
  def html(selector: String, options: CheerioOptionsInterface): String = js.native
  def parseHTML(data: String): js.Array[Document_] = js.native
  def parseHTML(data: String, context: Document_): js.Array[Document_] = js.native
  def parseHTML(data: String, context: Document_, keepScripts: Boolean): js.Array[Document_] = js.native
  def root(): Cheerio_ = js.native
  // Document References
  // Cheerio https://github.com/cheeriojs/cheerio
  // JQuery http://api.jquery.com
  def xml(): String = js.native
}

