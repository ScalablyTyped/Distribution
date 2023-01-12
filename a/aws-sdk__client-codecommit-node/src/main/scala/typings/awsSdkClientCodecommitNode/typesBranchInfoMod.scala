package typings.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBranchInfoMod {
  
  trait BranchInfo extends StObject {
    
    /**
      * <p>The name of the branch.</p>
      */
    var branchName: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The ID of the last commit made to the branch.</p>
      */
    var commitId: js.UndefOr[String] = js.undefined
  }
  object BranchInfo {
    
    inline def apply(): BranchInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BranchInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BranchInfo] (val x: Self) extends AnyVal {
      
      inline def setBranchName(value: String): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
      
      inline def setBranchNameUndefined: Self = StObject.set(x, "branchName", js.undefined)
      
      inline def setCommitId(value: String): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
      
      inline def setCommitIdUndefined: Self = StObject.set(x, "commitId", js.undefined)
    }
  }
  
  type UnmarshalledBranchInfo = BranchInfo
}
