package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAssociationsResult extends StObject {
  
  /**
    * The associations.
    */
  var Associations: js.UndefOr[AssociationList] = js.native
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object ListAssociationsResult {
  
  @scala.inline
  def apply(): ListAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociationsResult]
  }
  
  @scala.inline
  implicit class ListAssociationsResultMutableBuilder[Self <: ListAssociationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociations(value: AssociationList): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
    
    @scala.inline
    def setAssociationsVarargs(value: Association*): Self = StObject.set(x, "Associations", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
