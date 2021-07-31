package typings.currentGitBranch

import typings.currentGitBranch.currentGitBranchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): CurrentGitBranchResult = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[CurrentGitBranchResult]
  @scala.inline
  def apply(args: CurrentGitBranchOptions): CurrentGitBranchResult = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[CurrentGitBranchResult]
  
  @JSImport("current-git-branch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CurrentGitBranchOptions = CurrentGitBranchOptionsObject | js.Array[String] | String
  
  trait CurrentGitBranchOptionsObject extends StObject {
    
    var altPath: js.UndefOr[String] = js.undefined
    
    var branchOptions: js.UndefOr[String] = js.undefined
  }
  object CurrentGitBranchOptionsObject {
    
    @scala.inline
    def apply(): CurrentGitBranchOptionsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CurrentGitBranchOptionsObject]
    }
    
    @scala.inline
    implicit class CurrentGitBranchOptionsObjectMutableBuilder[Self <: CurrentGitBranchOptionsObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltPath(value: String): Self = StObject.set(x, "altPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltPathUndefined: Self = StObject.set(x, "altPath", js.undefined)
      
      @scala.inline
      def setBranchOptions(value: String): Self = StObject.set(x, "branchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchOptionsUndefined: Self = StObject.set(x, "branchOptions", js.undefined)
    }
  }
  
  type CurrentGitBranchResult = String | `false`
}
