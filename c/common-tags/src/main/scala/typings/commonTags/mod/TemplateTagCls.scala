package typings.commonTags.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
