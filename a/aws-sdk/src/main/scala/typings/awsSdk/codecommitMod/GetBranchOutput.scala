package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBranchOutput extends StObject {
  
  /**
    * The name of the branch.
    */
  var branch: js.UndefOr[BranchInfo] = js.native
}
object GetBranchOutput {
  
  @scala.inline
  def apply(): GetBranchOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBranchOutput]
  }
  
  @scala.inline
  implicit class GetBranchOutputMutableBuilder[Self <: GetBranchOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: BranchInfo): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
  }
}
