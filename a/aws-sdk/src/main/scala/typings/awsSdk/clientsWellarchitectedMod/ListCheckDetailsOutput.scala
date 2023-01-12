package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCheckDetailsOutput extends StObject {
  
  /**
    * The details about the Trusted Advisor checks related to the Well-Architected best practice.
    */
  var CheckDetails: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.CheckDetails] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
}
object ListCheckDetailsOutput {
  
  inline def apply(): ListCheckDetailsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCheckDetailsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCheckDetailsOutput] (val x: Self) extends AnyVal {
    
    inline def setCheckDetails(value: CheckDetails): Self = StObject.set(x, "CheckDetails", value.asInstanceOf[js.Any])
    
    inline def setCheckDetailsUndefined: Self = StObject.set(x, "CheckDetails", js.undefined)
    
    inline def setCheckDetailsVarargs(value: CheckDetail*): Self = StObject.set(x, "CheckDetails", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
