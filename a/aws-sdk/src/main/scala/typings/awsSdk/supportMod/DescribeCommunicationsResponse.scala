package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCommunicationsResponse extends StObject {
  
  /**
    * The communications for the case.
    */
  var communications: js.UndefOr[CommunicationList] = js.undefined
  
  /**
    * A resumption point for pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeCommunicationsResponse {
  
  inline def apply(): DescribeCommunicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCommunicationsResponse]
  }
  
  extension [Self <: DescribeCommunicationsResponse](x: Self) {
    
    inline def setCommunications(value: CommunicationList): Self = StObject.set(x, "communications", value.asInstanceOf[js.Any])
    
    inline def setCommunicationsUndefined: Self = StObject.set(x, "communications", js.undefined)
    
    inline def setCommunicationsVarargs(value: Communication*): Self = StObject.set(x, "communications", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
