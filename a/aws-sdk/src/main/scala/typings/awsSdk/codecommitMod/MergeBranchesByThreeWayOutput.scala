package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeBranchesByThreeWayOutput extends StObject {
  
  /**
    * The commit ID of the merge in the destination or target branch.
    */
  var commitId: js.UndefOr[ObjectId] = js.undefined
  
  /**
    * The tree ID of the merge in the destination or target branch.
    */
  var treeId: js.UndefOr[ObjectId] = js.undefined
}
object MergeBranchesByThreeWayOutput {
  
  @scala.inline
  def apply(): MergeBranchesByThreeWayOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeBranchesByThreeWayOutput]
  }
  
  @scala.inline
  implicit class MergeBranchesByThreeWayOutputMutableBuilder[Self <: MergeBranchesByThreeWayOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitId(value: ObjectId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitIdUndefined: Self = StObject.set(x, "commitId", js.undefined)
    
    @scala.inline
    def setTreeId(value: ObjectId): Self = StObject.set(x, "treeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeIdUndefined: Self = StObject.set(x, "treeId", js.undefined)
  }
}
