package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListQueueTagsResult extends StObject {
  
  /**
    * The list of all tags added to the specified queue.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object ListQueueTagsResult {
  
  @scala.inline
  def apply(): ListQueueTagsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueueTagsResult]
  }
  
  @scala.inline
  implicit class ListQueueTagsResultMutableBuilder[Self <: ListQueueTagsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
