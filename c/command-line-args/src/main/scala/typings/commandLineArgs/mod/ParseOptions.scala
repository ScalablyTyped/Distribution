package typings.commandLineArgs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptions extends js.Object {
  /**
    * An array of strings which if present will be parsed instead of `process.argv`.
    */
  var argv: js.UndefOr[js.Array[String]] = js.native
  /**
    * If `true`, options with hypenated names (e.g. `move-to`) will be returned in camel-case (e.g. `moveTo`).
    */
  var camelCase: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, `commandLineArgs` will not throw on unknown options or values, instead returning them in the `_unknown` property of the output.
    */
  var partial: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, `commandLineArgs` will not throw on unknown options or values. Instead, parsing will stop at the first unknown argument
    * and the remaining arguments returned in the `_unknown` property of the output. If set, `partial: true` is implied.
    */
  var stopAtFirstUnknown: js.UndefOr[Boolean] = js.native
}

object ParseOptions {
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
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
    def setArgvVarargs(value: String*): Self = this.set("argv", js.Array(value :_*))
    @scala.inline
    def setArgv(value: js.Array[String]): Self = this.set("argv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgv: Self = this.set("argv", js.undefined)
    @scala.inline
    def setCamelCase(value: Boolean): Self = this.set("camelCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCamelCase: Self = this.set("camelCase", js.undefined)
    @scala.inline
    def setPartial(value: Boolean): Self = this.set("partial", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartial: Self = this.set("partial", js.undefined)
    @scala.inline
    def setStopAtFirstUnknown(value: Boolean): Self = this.set("stopAtFirstUnknown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopAtFirstUnknown: Self = this.set("stopAtFirstUnknown", js.undefined)
  }
  
}

