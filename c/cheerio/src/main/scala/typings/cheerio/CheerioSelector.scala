package typings.cheerio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheerioSelector extends js.Object {
  def apply(selector: String): Cheerio = js.native
  def apply(selector: String, context: String): Cheerio = js.native
  def apply(selector: String, context: String, root: String): Cheerio = js.native
  def apply(selector: String, context: js.Array[CheerioElement]): Cheerio = js.native
  def apply(selector: String, context: js.Array[CheerioElement], root: String): Cheerio = js.native
  def apply(selector: String, context: Cheerio): Cheerio = js.native
  def apply(selector: String, context: CheerioElement): Cheerio = js.native
  def apply(selector: String, context: CheerioElement, root: String): Cheerio = js.native
  def apply(selector: String, context: Cheerio, root: String): Cheerio = js.native
  def apply(selector: js.Any): Cheerio = js.native
}

