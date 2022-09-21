package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourcePolicyResponse extends StObject {
  
  /**
    * The JSON structure that contains the resource policy. For more information about the contents of a JSON policy document, see  IAM JSON policy reference .
    */
  var policy: js.UndefOr[Policy] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
    */
  var resourceArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The current revision of the resource policy. Use the revision ID to make sure that you are updating the most current version of a resource policy when you add a policy statement to a resource, delete a resource, or update a resource.
    */
  var revisionId: js.UndefOr[RevisionId] = js.undefined
}
object DescribeResourcePolicyResponse {
  
  inline def apply(): DescribeResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeResourcePolicyResponse]
  }
  
  extension [Self <: DescribeResourcePolicyResponse](x: Self) {
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    
    inline def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
