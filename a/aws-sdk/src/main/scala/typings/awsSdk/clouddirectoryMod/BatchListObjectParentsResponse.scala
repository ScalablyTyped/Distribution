package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchListObjectParentsResponse extends StObject {
  
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.undefined
  
  var ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList] = js.undefined
}
object BatchListObjectParentsResponse {
  
  @scala.inline
  def apply(): BatchListObjectParentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListObjectParentsResponse]
  }
  
  @scala.inline
  implicit class BatchListObjectParentsResponseMutableBuilder[Self <: BatchListObjectParentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setParentLinks(value: ObjectIdentifierAndLinkNameList): Self = StObject.set(x, "ParentLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLinksUndefined: Self = StObject.set(x, "ParentLinks", js.undefined)
    
    @scala.inline
    def setParentLinksVarargs(value: ObjectIdentifierAndLinkNameTuple*): Self = StObject.set(x, "ParentLinks", js.Array(value :_*))
  }
}
