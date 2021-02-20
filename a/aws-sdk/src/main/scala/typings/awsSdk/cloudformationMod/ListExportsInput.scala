package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListExportsInput extends StObject {
  
  /**
    * A string (provided by the ListExports response output) that identifies the next page of exported output values that you asked to retrieve.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
}
object ListExportsInput {
  
  @scala.inline
  def apply(): ListExportsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsInput]
  }
  
  @scala.inline
  implicit class ListExportsInputMutableBuilder[Self <: ListExportsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
