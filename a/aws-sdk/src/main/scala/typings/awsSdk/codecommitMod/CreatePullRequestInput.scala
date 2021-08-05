package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePullRequestInput extends StObject {
  
  /**
    * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request returns information about the initial request that used that token.  The AWS SDKs prepopulate client request tokens. If you are using an AWS SDK, an idempotency token is created for you. 
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * A description of the pull request.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The targets for the pull request, including the source of the code to be reviewed (the source branch) and the destination where the creator of the pull request intends the code to be merged after the pull request is closed (the destination branch).
    */
  var targets: TargetList
  
  /**
    * The title of the pull request. This title is used to identify the pull request to other users in the repository.
    */
  var title: Title
}
object CreatePullRequestInput {
  
  inline def apply(targets: TargetList, title: Title): CreatePullRequestInput = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePullRequestInput]
  }
  
  extension [Self <: CreatePullRequestInput](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTargets(value: TargetList): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "targets", js.Array(value :_*))
    
    inline def setTitle(value: Title): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
