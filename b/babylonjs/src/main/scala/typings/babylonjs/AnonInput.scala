package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInput extends js.Object {
  var input: js.UndefOr[String] = js.undefined
  var output: js.UndefOr[String] = js.undefined
  var outputSwizzle: js.UndefOr[String] = js.undefined
}

object AnonInput {
  @scala.inline
  def apply(input: String = null, output: String = null, outputSwizzle: String = null): AnonInput = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (outputSwizzle != null) __obj.updateDynamic("outputSwizzle")(outputSwizzle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInput]
  }
}

