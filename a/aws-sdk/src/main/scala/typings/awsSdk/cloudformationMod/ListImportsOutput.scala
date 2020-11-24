package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListImportsOutput extends js.Object {
  
  /**
    * A list of stack names that are importing the specified exported output value. 
    */
  var Imports: js.UndefOr[typings.awsSdk.cloudformationMod.Imports] = js.native
  
  /**
    * A string that identifies the next page of exports. If there is no additional page, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.native
}
object ListImportsOutput {
  
  @scala.inline
  def apply(): ListImportsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportsOutput]
  }
  
  @scala.inline
  implicit class ListImportsOutputOps[Self <: ListImportsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImportsVarargs(value: StackName*): Self = this.set("Imports", js.Array(value :_*))
    
    @scala.inline
    def setImports(value: Imports): Self = this.set("Imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImports: Self = this.set("Imports", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
