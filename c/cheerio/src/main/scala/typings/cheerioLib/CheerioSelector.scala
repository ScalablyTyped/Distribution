package typings
package cheerioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheerioSelector extends js.Object {
  def apply(selector: java.lang.String): Cheerio = js.native
  def apply(selector: java.lang.String, context: Cheerio): Cheerio = js.native
  def apply(selector: java.lang.String, context: CheerioElement): Cheerio = js.native
  def apply(selector: java.lang.String, context: CheerioElement, root: java.lang.String): Cheerio = js.native
  def apply(selector: java.lang.String, context: Cheerio, root: java.lang.String): Cheerio = js.native
  def apply(selector: java.lang.String, context: java.lang.String): Cheerio = js.native
  def apply(selector: java.lang.String, context: java.lang.String, root: java.lang.String): Cheerio = js.native
  def apply(selector: java.lang.String, context: js.Array[CheerioElement]): Cheerio = js.native
  def apply(selector: java.lang.String, context: js.Array[CheerioElement], root: java.lang.String): Cheerio = js.native
  def apply(selector: js.Any): Cheerio = js.native
}

