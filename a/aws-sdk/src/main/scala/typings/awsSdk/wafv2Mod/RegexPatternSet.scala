package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexPatternSet extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the entity.
    */
  var ARN: js.UndefOr[ResourceArn] = js.native
  /**
    * A description of the set that helps with identification. You cannot change the description of a set after you create it.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  /**
    * A unique identifier for the set. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var Id: js.UndefOr[EntityId] = js.native
  /**
    * The name of the set. You cannot change the name after you create the set.
    */
  var Name: js.UndefOr[EntityName] = js.native
  /**
    * The regular expression patterns in the set.
    */
  var RegularExpressionList: js.UndefOr[typings.awsSdk.wafv2Mod.RegularExpressionList] = js.native
}

object RegexPatternSet {
  @scala.inline
  def apply(): RegexPatternSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexPatternSet]
  }
  @scala.inline
  implicit class RegexPatternSetOps[Self <: RegexPatternSet] (val x: Self) extends AnyVal {
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
    def setARN(value: ResourceArn): Self = this.set("ARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    @scala.inline
    def setDescription(value: EntityDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setId(value: EntityId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: EntityName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setRegularExpressionListVarargs(value: Regex*): Self = this.set("RegularExpressionList", js.Array(value :_*))
    @scala.inline
    def setRegularExpressionList(value: RegularExpressionList): Self = this.set("RegularExpressionList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegularExpressionList: Self = this.set("RegularExpressionList", js.undefined)
  }
  
}

