package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBranchInfoMod {
  
  @js.native
  trait BranchInfo extends StObject {
    
    /**
      * <p>The name of the branch.</p>
      */
    var branchName: js.UndefOr[String] = js.native
    
    /**
      * <p>The ID of the last commit made to the branch.</p>
      */
    var commitId: js.UndefOr[String] = js.native
  }
  object BranchInfo {
    
    @scala.inline
    def apply(): BranchInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BranchInfo]
    }
    
    @scala.inline
    implicit class BranchInfoMutableBuilder[Self <: BranchInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranchName(value: String): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchNameUndefined: Self = StObject.set(x, "branchName", js.undefined)
      
      @scala.inline
      def setCommitId(value: String): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitIdUndefined: Self = StObject.set(x, "commitId", js.undefined)
    }
  }
  
  type UnmarshalledBranchInfo = BranchInfo
}
