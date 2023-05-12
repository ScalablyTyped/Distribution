package typings.awsSdkClientSqs.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueueTagsResult extends StObject {
  
  /**
    * <p>The list of all tags added to the specified queue.</p>
    */
  var Tags: js.UndefOr[Record[String, String]] = js.undefined
}
object ListQueueTagsResult {
  
  inline def apply(): ListQueueTagsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListQueueTagsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListQueueTagsResult] (val x: Self) extends AnyVal {
    
    inline def setTags(value: Record[String, String]): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
