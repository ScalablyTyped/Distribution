package typings.cheerio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheerioSelector extends js.Object {
  def apply(selector: String): Cheerio_ = js.native
  def apply(selector: String, context: String): Cheerio_ = js.native
  def apply(selector: String, context: String, root: String): Cheerio_ = js.native
  def apply(selector: String, context: js.Array[CheerioElement]): Cheerio_ = js.native
  def apply(selector: String, context: js.Array[CheerioElement], root: String): Cheerio_ = js.native
  def apply(selector: String, context: CheerioElement): Cheerio_ = js.native
  def apply(selector: String, context: CheerioElement, root: String): Cheerio_ = js.native
  def apply(selector: String, context: Cheerio_): Cheerio_ = js.native
  def apply(selector: String, context: Cheerio_, root: String): Cheerio_ = js.native
  def apply(selector: js.Any): Cheerio_ = js.native
}

