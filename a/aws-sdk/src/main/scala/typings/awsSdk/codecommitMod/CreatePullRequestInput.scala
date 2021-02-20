package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePullRequestInput extends StObject {
  
  /**
    * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request returns information about the initial request that used that token.  The AWS SDKs prepopulate client request tokens. If you are using an AWS SDK, an idempotency token is created for you. 
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * A description of the pull request.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * The targets for the pull request, including the source of the code to be reviewed (the source branch) and the destination where the creator of the pull request intends the code to be merged after the pull request is closed (the destination branch).
    */
  var targets: TargetList = js.native
  
  /**
    * The title of the pull request. This title is used to identify the pull request to other users in the repository.
    */
  var title: Title = js.native
}
object CreatePullRequestInput {
  
  @scala.inline
  def apply(targets: TargetList, title: Title): CreatePullRequestInput = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePullRequestInput]
  }
  
  @scala.inline
  implicit class CreatePullRequestInputMutableBuilder[Self <: CreatePullRequestInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setTargets(value: TargetList): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "targets", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: Title): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
