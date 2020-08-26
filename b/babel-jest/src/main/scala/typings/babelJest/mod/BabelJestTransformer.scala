package typings.babelJest.mod

import typings.babelJest.babelJestBooleans.`true`
import typings.std.Transformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BabelJestTransformer
  extends Transformer[js.Any, js.Any] {
  var canInstrument: `true` = js.native
}

object BabelJestTransformer {
  @scala.inline
  def apply(canInstrument: `true`): BabelJestTransformer = {
    val __obj = js.Dynamic.literal(canInstrument = canInstrument.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelJestTransformer]
  }
  @scala.inline
  implicit class BabelJestTransformerOps[Self <: BabelJestTransformer] (val x: Self) extends AnyVal {
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
    def setCanInstrument(value: `true`): Self = this.set("canInstrument", value.asInstanceOf[js.Any])
  }
  
}

