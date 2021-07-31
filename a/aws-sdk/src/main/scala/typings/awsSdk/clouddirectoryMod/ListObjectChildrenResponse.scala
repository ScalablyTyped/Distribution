package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObjectChildrenResponse extends StObject {
  
  /**
    * Children structure, which is a map with key as the LinkName and ObjectIdentifier as the value.
    */
  var Children: js.UndefOr[LinkNameToObjectIdentifierMap] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.undefined
}
object ListObjectChildrenResponse {
  
  @scala.inline
  def apply(): ListObjectChildrenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListObjectChildrenResponse]
  }
  
  @scala.inline
  implicit class ListObjectChildrenResponseMutableBuilder[Self <: ListObjectChildrenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: LinkNameToObjectIdentifierMap): Self = StObject.set(x, "Children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "Children", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
