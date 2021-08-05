package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeBranchesBySquashOutput extends StObject {
  
  /**
    * The commit ID of the merge in the destination or target branch.
    */
  var commitId: js.UndefOr[ObjectId] = js.undefined
  
  /**
    * The tree ID of the merge in the destination or target branch.
    */
  var treeId: js.UndefOr[ObjectId] = js.undefined
}
object MergeBranchesBySquashOutput {
  
  inline def apply(): MergeBranchesBySquashOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeBranchesBySquashOutput]
  }
  
  extension [Self <: MergeBranchesBySquashOutput](x: Self) {
    
    inline def setCommitId(value: ObjectId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    inline def setCommitIdUndefined: Self = StObject.set(x, "commitId", js.undefined)
    
    inline def setTreeId(value: ObjectId): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
    
    inline def setTreeIdUndefined: Self = StObject.set(x, "treeId", js.undefined)
  }
}
