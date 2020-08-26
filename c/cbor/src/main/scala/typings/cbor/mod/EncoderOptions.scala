package typings.cbor.mod

import typings.cbor.cborStrings.float
import typings.cbor.cborStrings.int
import typings.cbor.cborStrings.number
import typings.cbor.cborStrings.string
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncoderOptions extends TransformOptions {
  var canonical: js.UndefOr[Boolean] = js.native
  var dateType: js.UndefOr[number | float | int | string] = js.native
  var detectLoops: js.UndefOr[Boolean | js.Symbol] = js.native
  var disallowUndefinedKeys: js.UndefOr[Boolean] = js.native
  var encodeUndefined: js.UndefOr[js.Any] = js.native
  var genTypes: js.UndefOr[js.Array[_]] = js.native
}

object EncoderOptions {
  @scala.inline
  def apply(): EncoderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncoderOptions]
  }
  @scala.inline
  implicit class EncoderOptionsOps[Self <: EncoderOptions] (val x: Self) extends AnyVal {
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
    def setCanonical(value: Boolean): Self = this.set("canonical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanonical: Self = this.set("canonical", js.undefined)
    @scala.inline
    def setDateType(value: number | float | int | string): Self = this.set("dateType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateType: Self = this.set("dateType", js.undefined)
    @scala.inline
    def setDetectLoops(value: Boolean | js.Symbol): Self = this.set("detectLoops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectLoops: Self = this.set("detectLoops", js.undefined)
    @scala.inline
    def setDisallowUndefinedKeys(value: Boolean): Self = this.set("disallowUndefinedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisallowUndefinedKeys: Self = this.set("disallowUndefinedKeys", js.undefined)
    @scala.inline
    def setEncodeUndefined(value: js.Any): Self = this.set("encodeUndefined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncodeUndefined: Self = this.set("encodeUndefined", js.undefined)
    @scala.inline
    def setGenTypesVarargs(value: js.Any*): Self = this.set("genTypes", js.Array(value :_*))
    @scala.inline
    def setGenTypes(value: js.Array[_]): Self = this.set("genTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenTypes: Self = this.set("genTypes", js.undefined)
  }
  
}

