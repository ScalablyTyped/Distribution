package typings
package cheerioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheerioStatic extends CheerioSelector {
  def contains(container: CheerioElement, contained: CheerioElement): scala.Boolean = js.native
  def html(): java.lang.String = js.native
  def html(element: Cheerio): java.lang.String = js.native
  def html(element: CheerioElement): java.lang.String = js.native
  def html(element: CheerioElement, options: CheerioOptionsInterface): java.lang.String = js.native
  def html(element: Cheerio, options: CheerioOptionsInterface): java.lang.String = js.native
  def html(options: CheerioOptionsInterface): java.lang.String = js.native
  def html(selector: java.lang.String): java.lang.String = js.native
  def html(selector: java.lang.String, options: CheerioOptionsInterface): java.lang.String = js.native
  def parseHTML(data: java.lang.String): js.Array[Document] = js.native
  def parseHTML(data: java.lang.String, context: Document): js.Array[Document] = js.native
  def parseHTML(data: java.lang.String, context: Document, keepScripts: scala.Boolean): js.Array[Document] = js.native
  def root(): Cheerio = js.native
  // Document References
  // Cheerio https://github.com/cheeriojs/cheerio
  // JQuery http://api.jquery.com
  def xml(): java.lang.String = js.native
}

