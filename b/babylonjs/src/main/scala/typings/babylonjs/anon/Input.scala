package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  var input: js.UndefOr[String] = js.undefined
  var output: js.UndefOr[String] = js.undefined
  var outputSwizzle: js.UndefOr[String] = js.undefined
}

object Input {
  @scala.inline
  def apply(input: String = null, output: String = null, outputSwizzle: String = null): Input = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (outputSwizzle != null) __obj.updateDynamic("outputSwizzle")(outputSwizzle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
}

