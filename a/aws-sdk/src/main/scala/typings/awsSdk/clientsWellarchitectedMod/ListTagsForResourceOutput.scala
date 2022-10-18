package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceOutput extends StObject {
  
  /**
    * The tags for the resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object ListTagsForResourceOutput {
  
  inline def apply(): ListTagsForResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceOutput]
  }
  
  extension [Self <: ListTagsForResourceOutput](x: Self) {
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
