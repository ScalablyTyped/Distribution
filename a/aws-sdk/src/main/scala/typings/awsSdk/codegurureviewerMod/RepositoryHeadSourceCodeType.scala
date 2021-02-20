package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryHeadSourceCodeType extends StObject {
  
  /**
    *  The name of the branch in an associated repository. The RepositoryHeadSourceCodeType specifies the tip of this branch. 
    */
  var BranchName: typings.awsSdk.codegurureviewerMod.BranchName = js.native
}
object RepositoryHeadSourceCodeType {
  
  @scala.inline
  def apply(BranchName: BranchName): RepositoryHeadSourceCodeType = {
    val __obj = js.Dynamic.literal(BranchName = BranchName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryHeadSourceCodeType]
  }
  
  @scala.inline
  implicit class RepositoryHeadSourceCodeTypeMutableBuilder[Self <: RepositoryHeadSourceCodeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranchName(value: BranchName): Self = StObject.set(x, "BranchName", value.asInstanceOf[js.Any])
  }
}
