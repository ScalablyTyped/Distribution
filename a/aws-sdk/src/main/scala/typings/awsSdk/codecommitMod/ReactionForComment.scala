package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactionForComment extends StObject {
  
  /**
    * The reaction for a specified comment.
    */
  var reaction: js.UndefOr[ReactionValueFormats] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of users who have provided reactions to the comment.
    */
  var reactionUsers: js.UndefOr[ReactionUsersList] = js.undefined
  
  /**
    * A numerical count of users who reacted with the specified emoji whose identities have been subsequently deleted from IAM. While these IAM users or roles no longer exist, the reactions might still appear in total reaction counts.
    */
  var reactionsFromDeletedUsersCount: js.UndefOr[Count] = js.undefined
}
object ReactionForComment {
  
  inline def apply(): ReactionForComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactionForComment]
  }
  
  extension [Self <: ReactionForComment](x: Self) {
    
    inline def setReaction(value: ReactionValueFormats): Self = StObject.set(x, "reaction", value.asInstanceOf[js.Any])
    
    inline def setReactionUndefined: Self = StObject.set(x, "reaction", js.undefined)
    
    inline def setReactionUsers(value: ReactionUsersList): Self = StObject.set(x, "reactionUsers", value.asInstanceOf[js.Any])
    
    inline def setReactionUsersUndefined: Self = StObject.set(x, "reactionUsers", js.undefined)
    
    inline def setReactionUsersVarargs(value: Arn*): Self = StObject.set(x, "reactionUsers", js.Array(value*))
    
    inline def setReactionsFromDeletedUsersCount(value: Count): Self = StObject.set(x, "reactionsFromDeletedUsersCount", value.asInstanceOf[js.Any])
    
    inline def setReactionsFromDeletedUsersCountUndefined: Self = StObject.set(x, "reactionsFromDeletedUsersCount", js.undefined)
  }
}
