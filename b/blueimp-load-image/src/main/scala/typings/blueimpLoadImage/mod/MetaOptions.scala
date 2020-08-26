package typings.blueimpLoadImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.blueimpLoadImage.mod.MetaTrueOptions
  - typings.blueimpLoadImage.mod.MetaFalseOptions
*/
trait MetaOptions extends js.Object

object MetaOptions {
  @scala.inline
  def MetaTrueOptions(orientation: Orientation): MetaOptions = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaOptions]
  }
  @scala.inline
  def MetaFalseOptions(): MetaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetaOptions]
  }
}

