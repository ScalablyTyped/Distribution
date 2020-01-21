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
}

