package typings.commonTags.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("common-tags", "createTag")
@js.native
object createTag extends js.Object {
  
  def apply(): TemplateTag = js.native
  def apply(transformers: (PluginFunction | TemplateTransformer[_])*): TemplateTag = js.native
  def apply(transformers: js.Array[TemplateTransformer[_]]): TemplateTag = js.native
}
