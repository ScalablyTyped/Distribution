package typings.dateFns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Zero extends js.Object {
  var delimiter: js.UndefOr[String] = js.native
  var format: js.UndefOr[js.Array[String]] = js.native
  var zero: js.UndefOr[Boolean] = js.native
}

object Zero {
  @scala.inline
  def apply(): Zero = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Zero]
  }
  @scala.inline
  implicit class ZeroOps[Self <: Zero] (val x: Self) extends AnyVal {
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
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setFormatVarargs(value: String*): Self = this.set("format", js.Array(value :_*))
    @scala.inline
    def setFormat(value: js.Array[String]): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setZero(value: Boolean): Self = this.set("zero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZero: Self = this.set("zero", js.undefined)
  }
  
}

