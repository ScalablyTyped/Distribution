package typings.ckeditor.CKEDITOR

import typings.ckeditor.CKEDITOR.filter.allowedContentRule
import typings.ckeditor.CKEDITOR.filter.allowedContentRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait feature extends js.Object {
  var allowedContent: js.UndefOr[allowedContentRules] = js.native
  var contentForms: js.UndefOr[js.Any] = js.native
  var contentTransformations: js.UndefOr[js.Any] = js.native
  var name: js.UndefOr[String] = js.native
  var requiredContent: js.UndefOr[String | style] = js.native
  var toFeature: js.UndefOr[js.Function0[this.type]] = js.native
}

object feature {
  @scala.inline
  def apply(): feature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[feature]
  }
  @scala.inline
  implicit class featureOps[Self <: feature] (val x: Self) extends AnyVal {
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
    def setAllowedContentVarargs(value: allowedContentRule*): Self = this.set("allowedContent", js.Array(value :_*))
    @scala.inline
    def setAllowedContent(value: allowedContentRules): Self = this.set("allowedContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedContent: Self = this.set("allowedContent", js.undefined)
    @scala.inline
    def setContentForms(value: js.Any): Self = this.set("contentForms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentForms: Self = this.set("contentForms", js.undefined)
    @scala.inline
    def setContentTransformations(value: js.Any): Self = this.set("contentTransformations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentTransformations: Self = this.set("contentTransformations", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRequiredContent(value: String | style): Self = this.set("requiredContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredContent: Self = this.set("requiredContent", js.undefined)
    @scala.inline
    def setToFeature(value: () => feature): Self = this.set("toFeature", js.Any.fromFunction0(value))
    @scala.inline
    def deleteToFeature: Self = this.set("toFeature", js.undefined)
  }
  
}

