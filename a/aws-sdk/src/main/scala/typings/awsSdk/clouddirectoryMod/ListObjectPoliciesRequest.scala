package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObjectPoliciesRequest extends StObject {
  
  /**
    * Represents the manner and timing in which the successful write or update of an object is reflected in a subsequent read operation of that same object.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsSdk.clouddirectoryMod.ConsistencyLevel] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where objects reside. For more information, see arns.
    */
  var DirectoryArn: Arn
  
  /**
    * The maximum number of items to be retrieved in a single call. This is an approximate number.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.undefined
  
  /**
    * Reference that identifies the object for which policies will be listed.
    */
  var ObjectReference: typings.awsSdk.clouddirectoryMod.ObjectReference
}
object ListObjectPoliciesRequest {
  
  @scala.inline
  def apply(DirectoryArn: Arn, ObjectReference: ObjectReference): ListObjectPoliciesRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectPoliciesRequest]
  }
  
  @scala.inline
  implicit class ListObjectPoliciesRequestMutableBuilder[Self <: ListObjectPoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsistencyLevel(value: ConsistencyLevel): Self = StObject.set(x, "ConsistencyLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsistencyLevelUndefined: Self = StObject.set(x, "ConsistencyLevel", js.undefined)
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: NumberResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
  }
}
