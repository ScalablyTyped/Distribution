package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceAssociationsStatusResult extends StObject {
  
  /**
    * Status information about the association.
    */
  var InstanceAssociationStatusInfos: js.UndefOr[typings.awsSdk.ssmMod.InstanceAssociationStatusInfos] = js.undefined
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
}
object DescribeInstanceAssociationsStatusResult {
  
  @scala.inline
  def apply(): DescribeInstanceAssociationsStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceAssociationsStatusResult]
  }
  
  @scala.inline
  implicit class DescribeInstanceAssociationsStatusResultMutableBuilder[Self <: DescribeInstanceAssociationsStatusResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceAssociationStatusInfos(value: InstanceAssociationStatusInfos): Self = StObject.set(x, "InstanceAssociationStatusInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceAssociationStatusInfosUndefined: Self = StObject.set(x, "InstanceAssociationStatusInfos", js.undefined)
    
    @scala.inline
    def setInstanceAssociationStatusInfosVarargs(value: InstanceAssociationStatusInfo*): Self = StObject.set(x, "InstanceAssociationStatusInfos", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
