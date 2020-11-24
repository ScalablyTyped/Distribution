package typings.cheerio.cheerio

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheerioAPI extends Root {
  
  def load(element: Element): Root = js.native
  def load(element: Element, options: CheerioParserOptions): Root = js.native
  def load(html: String): Root = js.native
  def load(html: String, options: CheerioParserOptions): Root = js.native
  def load(html: Buffer): Root = js.native
  def load(html: Buffer, options: CheerioParserOptions): Root = js.native
  
  var version: String = js.native
}
