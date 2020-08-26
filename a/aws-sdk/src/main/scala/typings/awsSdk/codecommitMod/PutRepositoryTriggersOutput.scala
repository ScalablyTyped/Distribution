package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRepositoryTriggersOutput extends js.Object {
  /**
    * The system-generated unique ID for the create or update operation.
    */
  var configurationId: js.UndefOr[RepositoryTriggersConfigurationId] = js.native
}

object PutRepositoryTriggersOutput {
  @scala.inline
  def apply(): PutRepositoryTriggersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRepositoryTriggersOutput]
  }
  @scala.inline
  implicit class PutRepositoryTriggersOutputOps[Self <: PutRepositoryTriggersOutput] (val x: Self) extends AnyVal {
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
    def setConfigurationId(value: RepositoryTriggersConfigurationId): Self = this.set("configurationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationId: Self = this.set("configurationId", js.undefined)
  }
  
}

