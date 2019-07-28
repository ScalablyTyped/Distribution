package typings.atBabelCore.atBabelCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformCaller extends js.Object {
  // the only required property
  var name: String
  // e.g. set to true by `babel-loader` and false by `babel-jest`
  var supportsStaticESM: js.UndefOr[Boolean] = js.undefined
}

object TransformCaller {
  @scala.inline
  def apply(name: String, supportsStaticESM: js.UndefOr[Boolean] = js.undefined): TransformCaller = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(supportsStaticESM)) __obj.updateDynamic("supportsStaticESM")(supportsStaticESM)
    __obj.asInstanceOf[TransformCaller]
  }
}

