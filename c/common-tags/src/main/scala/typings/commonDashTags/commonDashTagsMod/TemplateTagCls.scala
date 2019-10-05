package typings.commonDashTags.commonDashTagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

