package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePolicyStatementRequest extends StObject {
  
  /**
    * The identifier of the revision of the policy to delete the statement from. If this revision ID doesn't match the current revision ID, Amazon Lex throws an exception. If you don't specify a revision, Amazon Lex removes the current contents of the statement. 
    */
  var expectedRevisionId: js.UndefOr[RevisionId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
    */
  var resourceArn: AmazonResourceName
  
  /**
    * The name of the statement (SID) to delete from the policy.
    */
  var statementId: Name
}
object DeleteResourcePolicyStatementRequest {
  
  inline def apply(resourceArn: AmazonResourceName, statementId: Name): DeleteResourcePolicyStatementRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], statementId = statementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcePolicyStatementRequest]
  }
  
  extension [Self <: DeleteResourcePolicyStatementRequest](x: Self) {
    
    inline def setExpectedRevisionId(value: RevisionId): Self = StObject.set(x, "expectedRevisionId", value.asInstanceOf[js.Any])
    
    inline def setExpectedRevisionIdUndefined: Self = StObject.set(x, "expectedRevisionId", js.undefined)
    
    inline def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setStatementId(value: Name): Self = StObject.set(x, "statementId", value.asInstanceOf[js.Any])
  }
}
