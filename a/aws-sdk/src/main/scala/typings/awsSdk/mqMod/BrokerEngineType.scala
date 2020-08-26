package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerEngineType extends js.Object {
  /**
    * The type of broker engine.
    */
  var EngineType: js.UndefOr[typings.awsSdk.mqMod.EngineType] = js.native
  /**
    * The list of engine versions.
    */
  var EngineVersions: js.UndefOr[listOfEngineVersion] = js.native
}

object BrokerEngineType {
  @scala.inline
  def apply(): BrokerEngineType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerEngineType]
  }
  @scala.inline
  implicit class BrokerEngineTypeOps[Self <: BrokerEngineType] (val x: Self) extends AnyVal {
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
    def setEngineType(value: EngineType): Self = this.set("EngineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineType: Self = this.set("EngineType", js.undefined)
    @scala.inline
    def setEngineVersionsVarargs(value: EngineVersion*): Self = this.set("EngineVersions", js.Array(value :_*))
    @scala.inline
    def setEngineVersions(value: listOfEngineVersion): Self = this.set("EngineVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersions: Self = this.set("EngineVersions", js.undefined)
  }
  
}

