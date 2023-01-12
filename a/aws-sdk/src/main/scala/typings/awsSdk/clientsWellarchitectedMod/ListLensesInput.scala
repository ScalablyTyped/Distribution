package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLensesInput extends StObject {
  
  var LensName: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensName] = js.undefined
  
  /**
    * The status of lenses to be returned.
    */
  var LensStatus: js.UndefOr[LensStatusType] = js.undefined
  
  /**
    * The type of lenses to be returned.
    */
  var LensType: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.LensType] = js.undefined
  
  var MaxResults: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.MaxResults] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
}
object ListLensesInput {
  
  inline def apply(): ListLensesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLensesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLensesInput] (val x: Self) extends AnyVal {
    
    inline def setLensName(value: LensName): Self = StObject.set(x, "LensName", value.asInstanceOf[js.Any])
    
    inline def setLensNameUndefined: Self = StObject.set(x, "LensName", js.undefined)
    
    inline def setLensStatus(value: LensStatusType): Self = StObject.set(x, "LensStatus", value.asInstanceOf[js.Any])
    
    inline def setLensStatusUndefined: Self = StObject.set(x, "LensStatus", js.undefined)
    
    inline def setLensType(value: LensType): Self = StObject.set(x, "LensType", value.asInstanceOf[js.Any])
    
    inline def setLensTypeUndefined: Self = StObject.set(x, "LensType", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
