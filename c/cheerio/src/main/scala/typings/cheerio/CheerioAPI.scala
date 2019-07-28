package typings.cheerio

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheerioAPI extends CheerioStatic {
  def load(element: CheerioElement): CheerioStatic = js.native
  def load(element: CheerioElement, options: CheerioOptionsInterface): CheerioStatic = js.native
  def load(html: String): CheerioStatic = js.native
  def load(html: String, options: CheerioOptionsInterface): CheerioStatic = js.native
  def load(html: Buffer): CheerioStatic = js.native
  def load(html: Buffer, options: CheerioOptionsInterface): CheerioStatic = js.native
}

