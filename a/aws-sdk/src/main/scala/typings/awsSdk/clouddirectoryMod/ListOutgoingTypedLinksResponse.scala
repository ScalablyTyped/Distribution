package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOutgoingTypedLinksResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.undefined
  
  /**
    * Returns a typed link specifier as output.
    */
  var TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined
}
object ListOutgoingTypedLinksResponse {
  
  @scala.inline
  def apply(): ListOutgoingTypedLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOutgoingTypedLinksResponse]
  }
  
  @scala.inline
  implicit class ListOutgoingTypedLinksResponseMutableBuilder[Self <: ListOutgoingTypedLinksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTypedLinkSpecifiers(value: TypedLinkSpecifierList): Self = StObject.set(x, "TypedLinkSpecifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypedLinkSpecifiersUndefined: Self = StObject.set(x, "TypedLinkSpecifiers", js.undefined)
    
    @scala.inline
    def setTypedLinkSpecifiersVarargs(value: TypedLinkSpecifier*): Self = StObject.set(x, "TypedLinkSpecifiers", js.Array(value :_*))
  }
}
