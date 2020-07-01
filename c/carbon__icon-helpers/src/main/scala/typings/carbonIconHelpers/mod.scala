package typings.carbonIconHelpers

import typings.carbonIconHelpers.anon.Focusable
import typings.carbonIconHelpers.anon.Height
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@carbon/icon-helpers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def formatAttributes(attrs: js.Any): String = js.native
  def getAttributes(): Focusable = js.native
  def getAttributes(hasWidthHeightViewBoxAttributes: Height): Focusable = js.native
  def toSVG(descriptor: js.Any): SVGSVGElement = js.native
  def toString(descriptor: js.Any): String = js.native
  @js.native
  object defaultAttributes extends js.Object {
    var focusable: String = js.native
    var preserveAspectRatio: String = js.native
  }
  
}

