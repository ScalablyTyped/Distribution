package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBuildsForProjectOutput extends StObject {
  
  /**
    * A list of build IDs for the specified build project, with each build ID representing a single build.
    */
  var ids: js.UndefOr[BuildIds] = js.native
  
  /**
    * If there are more than 100 items in the list, only the first 100 items are returned, along with a unique string called a nextToken. To get the next batch of items in the list, call this operation again, adding the next token to the call.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object ListBuildsForProjectOutput {
  
  @scala.inline
  def apply(): ListBuildsForProjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildsForProjectOutput]
  }
  
  @scala.inline
  implicit class ListBuildsForProjectOutputMutableBuilder[Self <: ListBuildsForProjectOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIds(value: BuildIds): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
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
