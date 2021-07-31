package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportsOutput extends StObject {
  
  /**
    * A list of stack names that are importing the specified exported output value. 
    */
  var Imports: js.UndefOr[typings.awsSdk.cloudformationMod.Imports] = js.undefined
  
  /**
    * A string that identifies the next page of exports. If there is no additional page, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.undefined
}
object ListImportsOutput {
  
  @scala.inline
  def apply(): ListImportsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportsOutput]
  }
  
  @scala.inline
  implicit class ListImportsOutputMutableBuilder[Self <: ListImportsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImports(value: Imports): Self = StObject.set(x, "Imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsUndefined: Self = StObject.set(x, "Imports", js.undefined)
    
    @scala.inline
    def setImportsVarargs(value: StackName*): Self = StObject.set(x, "Imports", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
