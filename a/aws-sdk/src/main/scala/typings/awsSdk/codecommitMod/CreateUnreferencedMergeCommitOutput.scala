package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUnreferencedMergeCommitOutput extends StObject {
  
  /**
    * The full commit ID of the commit that contains your merge results.
    */
  var commitId: js.UndefOr[ObjectId] = js.undefined
  
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the merge results.
    */
  var treeId: js.UndefOr[ObjectId] = js.undefined
}
object CreateUnreferencedMergeCommitOutput {
  
  inline def apply(): CreateUnreferencedMergeCommitOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUnreferencedMergeCommitOutput]
  }
  
  extension [Self <: CreateUnreferencedMergeCommitOutput](x: Self) {
    
    inline def setCommitId(value: ObjectId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    inline def setCommitIdUndefined: Self = StObject.set(x, "commitId", js.undefined)
    
    inline def setTreeId(value: ObjectId): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
    
    inline def setTreeIdUndefined: Self = StObject.set(x, "treeId", js.undefined)
  }
}
