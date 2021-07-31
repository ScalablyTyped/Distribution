package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchListObjectChildrenResponse extends StObject {
  
  /**
    * The children structure, which is a map with the key as the LinkName and ObjectIdentifier as the value.
    */
  var Children: js.UndefOr[LinkNameToObjectIdentifierMap] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.undefined
}
object BatchListObjectChildrenResponse {
  
  @scala.inline
  def apply(): BatchListObjectChildrenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListObjectChildrenResponse]
  }
  
  @scala.inline
  implicit class BatchListObjectChildrenResponseMutableBuilder[Self <: BatchListObjectChildrenResponse] (val x: Self) extends AnyVal {
    
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
