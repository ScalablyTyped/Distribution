package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeywordFilter extends js.Object {
  /**
    * A value for the keyword.
    */
  var Value: js.UndefOr[NonEmptyString] = js.native
}

object KeywordFilter {
  @scala.inline
  def apply(): KeywordFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeywordFilter]
  }
  @scala.inline
  implicit class KeywordFilterOps[Self <: KeywordFilter] (val x: Self) extends AnyVal {
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
    def setValue(value: NonEmptyString): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

