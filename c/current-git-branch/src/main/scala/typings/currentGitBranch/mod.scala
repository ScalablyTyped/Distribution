package typings.currentGitBranch

import typings.currentGitBranch.currentGitBranchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): CurrentGitBranchResult = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[CurrentGitBranchResult]
  inline def apply(args: CurrentGitBranchOptions): CurrentGitBranchResult = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[CurrentGitBranchResult]
  
  @JSImport("current-git-branch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CurrentGitBranchOptions = CurrentGitBranchOptionsObject | js.Array[String] | String
  
  trait CurrentGitBranchOptionsObject extends StObject {
    
    var altPath: js.UndefOr[String] = js.undefined
    
    var branchOptions: js.UndefOr[String] = js.undefined
  }
  object CurrentGitBranchOptionsObject {
    
    inline def apply(): CurrentGitBranchOptionsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CurrentGitBranchOptionsObject]
    }
    
    extension [Self <: CurrentGitBranchOptionsObject](x: Self) {
      
      inline def setAltPath(value: String): Self = StObject.set(x, "altPath", value.asInstanceOf[js.Any])
      
      inline def setAltPathUndefined: Self = StObject.set(x, "altPath", js.undefined)
      
      inline def setBranchOptions(value: String): Self = StObject.set(x, "branchOptions", value.asInstanceOf[js.Any])
      
      inline def setBranchOptionsUndefined: Self = StObject.set(x, "branchOptions", js.undefined)
    }
  }
  
  type CurrentGitBranchResult = String | `false`
}
