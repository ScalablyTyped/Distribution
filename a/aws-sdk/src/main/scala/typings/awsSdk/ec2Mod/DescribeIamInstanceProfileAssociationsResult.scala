package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeIamInstanceProfileAssociationsResult extends StObject {
  
  /**
    * Information about the IAM instance profile associations.
    */
  var IamInstanceProfileAssociations: js.UndefOr[IamInstanceProfileAssociationSet] = js.native
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}
object DescribeIamInstanceProfileAssociationsResult {
  
  @scala.inline
  def apply(): DescribeIamInstanceProfileAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIamInstanceProfileAssociationsResult]
  }
  
  @scala.inline
  implicit class DescribeIamInstanceProfileAssociationsResultMutableBuilder[Self <: DescribeIamInstanceProfileAssociationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIamInstanceProfileAssociations(value: IamInstanceProfileAssociationSet): Self = StObject.set(x, "IamInstanceProfileAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamInstanceProfileAssociationsUndefined: Self = StObject.set(x, "IamInstanceProfileAssociations", js.undefined)
    
    @scala.inline
    def setIamInstanceProfileAssociationsVarargs(value: IamInstanceProfileAssociation*): Self = StObject.set(x, "IamInstanceProfileAssociations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
