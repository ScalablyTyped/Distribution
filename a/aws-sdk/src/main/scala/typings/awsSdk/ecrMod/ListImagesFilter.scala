package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImagesFilter extends StObject {
  
  /**
    * The tag status with which to filter your ListImages results. You can filter results based on whether they are TAGGED or UNTAGGED.
    */
  var tagStatus: js.UndefOr[TagStatus] = js.undefined
}
object ListImagesFilter {
  
  inline def apply(): ListImagesFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImagesFilter]
  }
  
  extension [Self <: ListImagesFilter](x: Self) {
    
    inline def setTagStatus(value: TagStatus): Self = StObject.set(x, "tagStatus", value.asInstanceOf[js.Any])
    
    inline def setTagStatusUndefined: Self = StObject.set(x, "tagStatus", js.undefined)
  }
}
