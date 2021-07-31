package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObjectParentsResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.undefined
  
  /**
    * Returns a list of parent reference and LinkName Tuples.
    */
  var ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList] = js.undefined
  
  /**
    * The parent structure, which is a map with key as the ObjectIdentifier and LinkName as the value.
    */
  var Parents: js.UndefOr[ObjectIdentifierToLinkNameMap] = js.undefined
}
object ListObjectParentsResponse {
  
  @scala.inline
  def apply(): ListObjectParentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListObjectParentsResponse]
  }
  
  @scala.inline
  implicit class ListObjectParentsResponseMutableBuilder[Self <: ListObjectParentsResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setParents(value: ObjectIdentifierToLinkNameMap): Self = StObject.set(x, "Parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentsUndefined: Self = StObject.set(x, "Parents", js.undefined)
  }
}
