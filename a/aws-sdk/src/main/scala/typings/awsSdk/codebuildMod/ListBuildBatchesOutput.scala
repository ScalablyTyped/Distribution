package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBuildBatchesOutput extends StObject {
  
  /**
    * An array of strings that contains the batch build identifiers.
    */
  var ids: js.UndefOr[BuildBatchIds] = js.native
  
  /**
    * If there are more items to return, this contains a token that is passed to a subsequent call to ListBuildBatches to retrieve the next set of items.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object ListBuildBatchesOutput {
  
  @scala.inline
  def apply(): ListBuildBatchesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildBatchesOutput]
  }
  
  @scala.inline
  implicit class ListBuildBatchesOutputMutableBuilder[Self <: ListBuildBatchesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIds(value: BuildBatchIds): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    @scala.inline
    def setIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
