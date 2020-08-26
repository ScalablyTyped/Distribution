package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTriggersResponse extends js.Object {
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * The names of all triggers in the account, or the triggers with the specified tags.
    */
  var TriggerNames: js.UndefOr[TriggerNameList] = js.native
}

object ListTriggersResponse {
  @scala.inline
  def apply(): ListTriggersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTriggersResponse]
  }
  @scala.inline
  implicit class ListTriggersResponseOps[Self <: ListTriggersResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTriggerNamesVarargs(value: NameString*): Self = this.set("TriggerNames", js.Array(value :_*))
    @scala.inline
    def setTriggerNames(value: TriggerNameList): Self = this.set("TriggerNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerNames: Self = this.set("TriggerNames", js.undefined)
  }
  
}

