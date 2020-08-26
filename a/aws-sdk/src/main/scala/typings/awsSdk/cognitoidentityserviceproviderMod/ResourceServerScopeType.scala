package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceServerScopeType extends js.Object {
  /**
    * A description of the scope.
    */
  var ScopeDescription: ResourceServerScopeDescriptionType = js.native
  /**
    * The name of the scope.
    */
  var ScopeName: ResourceServerScopeNameType = js.native
}

object ResourceServerScopeType {
  @scala.inline
  def apply(ScopeDescription: ResourceServerScopeDescriptionType, ScopeName: ResourceServerScopeNameType): ResourceServerScopeType = {
    val __obj = js.Dynamic.literal(ScopeDescription = ScopeDescription.asInstanceOf[js.Any], ScopeName = ScopeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceServerScopeType]
  }
  @scala.inline
  implicit class ResourceServerScopeTypeOps[Self <: ResourceServerScopeType] (val x: Self) extends AnyVal {
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
    def setScopeDescription(value: ResourceServerScopeDescriptionType): Self = this.set("ScopeDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeName(value: ResourceServerScopeNameType): Self = this.set("ScopeName", value.asInstanceOf[js.Any])
  }
  
}

