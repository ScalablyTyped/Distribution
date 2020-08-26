package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParameterResult extends js.Object {
  /**
    * Information about a parameter.
    */
  var Parameter: js.UndefOr[typings.awsSdk.ssmMod.Parameter] = js.native
}

object GetParameterResult {
  @scala.inline
  def apply(): GetParameterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParameterResult]
  }
  @scala.inline
  implicit class GetParameterResultOps[Self <: GetParameterResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParameter(value: Parameter): Self = this.set("Parameter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameter: Self = this.set("Parameter", js.undefined)
  }
  
}

