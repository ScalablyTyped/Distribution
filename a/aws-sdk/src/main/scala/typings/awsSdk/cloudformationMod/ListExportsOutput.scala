package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExportsOutput extends StObject {
  
  /**
    * The output for the ListExports action.
    */
  var Exports: js.UndefOr[typings.awsSdk.cloudformationMod.Exports] = js.undefined
  
  /**
    * If the output exceeds 100 exported output values, a string that identifies the next page of exports. If there is no additional page, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.undefined
}
object ListExportsOutput {
  
  @scala.inline
  def apply(): ListExportsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsOutput]
  }
  
  @scala.inline
  implicit class ListExportsOutputMutableBuilder[Self <: ListExportsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExports(value: Exports): Self = StObject.set(x, "Exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportsUndefined: Self = StObject.set(x, "Exports", js.undefined)
    
    @scala.inline
    def setExportsVarargs(value: Export*): Self = StObject.set(x, "Exports", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
