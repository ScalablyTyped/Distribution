package typings
package commonDashTagsLib.commonDashTagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateTag extends js.Object {
  def apply(literals: stdLib.TemplateStringsArray, placeholders: js.Any*): java.lang.String = js.native
  def apply(str: java.lang.String): java.lang.String = js.native
  def apply(tag: JSTag): TemplateTag = js.native
}

@JSImport("common-tags", "TemplateTag")
@js.native
/**
  * New Tag Constructor
  * @deprecated
  */
class TemplateTagCls () extends TemplateTag {
  def this(transformers: (PluginFunction | TemplateTransformer[_])*) = this()
  def this(transformers: js.Array[TemplateTransformer[_]]) = this()
}

