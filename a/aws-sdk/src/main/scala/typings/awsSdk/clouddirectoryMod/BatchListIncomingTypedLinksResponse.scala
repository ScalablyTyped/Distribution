package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchListIncomingTypedLinksResponse extends StObject {
  
  /**
    * Returns one or more typed link specifiers as output.
    */
  var LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.native
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
}
object BatchListIncomingTypedLinksResponse {
  
  @scala.inline
  def apply(): BatchListIncomingTypedLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListIncomingTypedLinksResponse]
  }
  
  @scala.inline
  implicit class BatchListIncomingTypedLinksResponseMutableBuilder[Self <: BatchListIncomingTypedLinksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinkSpecifiers(value: TypedLinkSpecifierList): Self = StObject.set(x, "LinkSpecifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkSpecifiersUndefined: Self = StObject.set(x, "LinkSpecifiers", js.undefined)
    
    @scala.inline
    def setLinkSpecifiersVarargs(value: TypedLinkSpecifier*): Self = StObject.set(x, "LinkSpecifiers", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
