package typings.commonDashTags.commonDashTagsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateTag extends js.Object {
  def apply(literals: TemplateStringsArray, placeholders: js.Any*): String = js.native
  def apply(str: String): String = js.native
  def apply(tag: JSTag): TemplateTag = js.native
}

@JSImport("common-tags", "TemplateTag")
@js.native
object TemplateTag
  extends /**
  * New Tag Constructor
  * @deprecated
  */
Instantiable0[TemplateTag]
     with Instantiable1[
      (/* transformers */ js.Array[TemplateTransformer[js.Any]]) | (/* pluginFunctions (repeated) */ PluginFunction) | (/* transformers (repeated) */ TemplateTransformer[js.Any]), 
      TemplateTag
    ]

