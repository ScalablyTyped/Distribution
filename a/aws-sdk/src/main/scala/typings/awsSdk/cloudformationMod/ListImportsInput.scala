package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListImportsInput extends StObject {
  
  /**
    * The name of the exported output value. AWS CloudFormation returns the stack names that are importing this value. 
    */
  var ExportName: typings.awsSdk.cloudformationMod.ExportName = js.native
  
  /**
    * A string (provided by the ListImports response output) that identifies the next page of stacks that are importing the specified exported output value. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
}
object ListImportsInput {
  
  @scala.inline
  def apply(ExportName: ExportName): ListImportsInput = {
    val __obj = js.Dynamic.literal(ExportName = ExportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImportsInput]
  }
  
  @scala.inline
  implicit class ListImportsInputMutableBuilder[Self <: ListImportsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportName(value: ExportName): Self = StObject.set(x, "ExportName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
