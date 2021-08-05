package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExportsInput extends StObject {
  
  /**
    * A string (provided by the ListExports response output) that identifies the next page of exported output values that you asked to retrieve.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.undefined
}
object ListExportsInput {
  
  inline def apply(): ListExportsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsInput]
  }
  
  extension [Self <: ListExportsInput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
