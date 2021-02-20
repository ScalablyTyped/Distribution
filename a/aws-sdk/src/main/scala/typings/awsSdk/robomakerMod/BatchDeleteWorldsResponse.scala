package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteWorldsResponse extends StObject {
  
  /**
    * A list of unprocessed worlds associated with the call. These worlds were not deleted.
    */
  var unprocessedWorlds: js.UndefOr[Arns] = js.native
}
object BatchDeleteWorldsResponse {
  
  @scala.inline
  def apply(): BatchDeleteWorldsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteWorldsResponse]
  }
  
  @scala.inline
  implicit class BatchDeleteWorldsResponseMutableBuilder[Self <: BatchDeleteWorldsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnprocessedWorlds(value: Arns): Self = StObject.set(x, "unprocessedWorlds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedWorldsUndefined: Self = StObject.set(x, "unprocessedWorlds", js.undefined)
    
    @scala.inline
    def setUnprocessedWorldsVarargs(value: Arn*): Self = StObject.set(x, "unprocessedWorlds", js.Array(value :_*))
  }
}
