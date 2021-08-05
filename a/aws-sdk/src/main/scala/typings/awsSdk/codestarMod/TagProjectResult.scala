package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagProjectResult extends StObject {
  
  /**
    * The tags for the project.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object TagProjectResult {
  
  inline def apply(): TagProjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagProjectResult]
  }
  
  extension [Self <: TagProjectResult](x: Self) {
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
