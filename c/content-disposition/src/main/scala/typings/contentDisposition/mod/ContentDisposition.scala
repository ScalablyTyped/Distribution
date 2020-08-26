package typings.contentDisposition.mod

import typings.contentDisposition.contentDispositionStrings.`inline`
import typings.contentDisposition.contentDispositionStrings.attachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for parsed Content-Disposition header for v8 optimization
  */
@js.native
trait ContentDisposition extends js.Object {
  /**
    * An object of the parameters in the disposition
    * (name of parameter always lower case and extended versions replace non-extended versions)
    */
  var parameters: js.Any = js.native
  /**
    * The disposition type (always lower case)
    */
  var `type`: attachment | `inline` | String = js.native
}

object ContentDisposition {
  @scala.inline
  def apply(parameters: js.Any, `type`: attachment | `inline` | String): ContentDisposition = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentDisposition]
  }
  @scala.inline
  implicit class ContentDispositionOps[Self <: ContentDisposition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameters(value: js.Any): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: attachment | `inline` | String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

