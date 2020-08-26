package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEngineDefaultParametersResult extends js.Object {
  var EngineDefaults: js.UndefOr[typings.awsSdk.neptuneMod.EngineDefaults] = js.native
}

object DescribeEngineDefaultParametersResult {
  @scala.inline
  def apply(): DescribeEngineDefaultParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEngineDefaultParametersResult]
  }
  @scala.inline
  implicit class DescribeEngineDefaultParametersResultOps[Self <: DescribeEngineDefaultParametersResult] (val x: Self) extends AnyVal {
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
    def setEngineDefaults(value: EngineDefaults): Self = this.set("EngineDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineDefaults: Self = this.set("EngineDefaults", js.undefined)
  }
  
}

