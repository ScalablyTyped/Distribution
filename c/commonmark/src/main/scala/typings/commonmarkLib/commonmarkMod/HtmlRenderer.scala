package typings
package commonmarkLib.commonmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("commonmark", "HtmlRenderer")
@js.native
class HtmlRenderer () extends js.Object {
  def this(options: HtmlRenderingOptions) = this()
  /**
    * Let's you override the softbreak properties of a renderer. So, to make soft breaks render as hard breaks in HTML:
    * writer.softbreak = "<br />";
    */
  var softbreak: java.lang.String = js.native
  /**
    * Override the function that will be used to escape (sanitize) the html output. Return value is used to add to the html output
    * @param input the input to escape
    * @param isAttributeValue indicates wheter or not the input value will be used as value of an html attribute.
    */
  def escape(input: java.lang.String, isAttributeValue: scala.Boolean): java.lang.String = js.native
  def render(root: Node): java.lang.String = js.native
}

