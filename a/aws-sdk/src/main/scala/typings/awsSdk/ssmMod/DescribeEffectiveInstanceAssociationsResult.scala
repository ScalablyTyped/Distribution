package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEffectiveInstanceAssociationsResult extends StObject {
  
  /**
    * The associations for the requested instance.
    */
  var Associations: js.UndefOr[InstanceAssociationList] = js.undefined
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
}
object DescribeEffectiveInstanceAssociationsResult {
  
  @scala.inline
  def apply(): DescribeEffectiveInstanceAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEffectiveInstanceAssociationsResult]
  }
  
  @scala.inline
  implicit class DescribeEffectiveInstanceAssociationsResultMutableBuilder[Self <: DescribeEffectiveInstanceAssociationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociations(value: InstanceAssociationList): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
    
    @scala.inline
    def setAssociationsVarargs(value: InstanceAssociation*): Self = StObject.set(x, "Associations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
