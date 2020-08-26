package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exclusion extends js.Object {
  /**
    * The ARN that specifies the exclusion.
    */
  var arn: Arn = js.native
  /**
    * The system-defined attributes for the exclusion.
    */
  var attributes: js.UndefOr[AttributeList] = js.native
  /**
    * The description of the exclusion.
    */
  var description: Text = js.native
  /**
    * The recommendation for the exclusion.
    */
  var recommendation: Text = js.native
  /**
    * The AWS resources for which the exclusion pertains.
    */
  var scopes: ScopeList = js.native
  /**
    * The name of the exclusion.
    */
  var title: Text = js.native
}

object Exclusion {
  @scala.inline
  def apply(arn: Arn, description: Text, recommendation: Text, scopes: ScopeList, title: Text): Exclusion = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exclusion]
  }
  @scala.inline
  implicit class ExclusionOps[Self <: Exclusion] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
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

