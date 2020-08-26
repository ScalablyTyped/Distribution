package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExclusionPreview extends js.Object {
  /**
    * The system-defined attributes for the exclusion preview.
    */
  var attributes: js.UndefOr[AttributeList] = js.native
  /**
    * The description of the exclusion preview.
    */
  var description: Text = js.native
  /**
    * The recommendation for the exclusion preview.
    */
  var recommendation: Text = js.native
  /**
    * The AWS resources for which the exclusion preview pertains.
    */
  var scopes: ScopeList = js.native
  /**
    * The name of the exclusion preview.
    */
  var title: Text = js.native
}

object ExclusionPreview {
  @scala.inline
  def apply(description: Text, recommendation: Text, scopes: ScopeList, title: Text): ExclusionPreview = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExclusionPreview]
  }
  @scala.inline
  implicit class ExclusionPreviewOps[Self <: ExclusionPreview] (val x: Self) extends AnyVal {
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
    def setDescription(value: Text): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecommendation(value: Text): Self = this.set("recommendation", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopesVarargs(value: Scope*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: ScopeList): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: Text): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributesVarargs(value: Attribute*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: AttributeList): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
  }
  
}

