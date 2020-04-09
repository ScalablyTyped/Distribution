package typings.contentDisposition.mod

import typings.contentDisposition.contentDispositionStrings.`inline`
import typings.contentDisposition.contentDispositionStrings.attachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for parsed Content-Disposition header for v8 optimization
  */
trait ContentDisposition extends js.Object {
  /**
    * An object of the parameters in the disposition
    * (name of parameter always lower case and extended versions replace non-extended versions)
    */
  var parameters: js.Any
  /**
    * The disposition type (always lower case)
    */
  var `type`: attachment | `inline` | String
}

object ContentDisposition {
  @scala.inline
  def apply(parameters: js.Any, `type`: attachment | `inline` | String): ContentDisposition = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentDisposition]
  }
}

