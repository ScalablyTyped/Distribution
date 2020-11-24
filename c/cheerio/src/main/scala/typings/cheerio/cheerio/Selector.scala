package typings.cheerio.cheerio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Selector extends js.Object {
  
  def apply(selector: String): Cheerio = js.native
  def apply(selector: String, context: String): Cheerio = js.native
  def apply(selector: String, context: String, root: String): Cheerio = js.native
  def apply(selector: String, context: js.Array[Element]): Cheerio = js.native
  def apply(selector: String, context: js.Array[Element], root: String): Cheerio = js.native
  def apply(selector: String, context: Cheerio): Cheerio = js.native
  def apply(selector: String, context: Cheerio, root: String): Cheerio = js.native
  def apply(selector: String, context: Element): Cheerio = js.native
  def apply(selector: String, context: Element, root: String): Cheerio = js.native
  def apply(selector: js.Any): Cheerio = js.native
}
