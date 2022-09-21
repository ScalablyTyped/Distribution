package typings.awsSdk.ecrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageTagDetail extends StObject {
  
  /**
    * The time stamp indicating when the image tag was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An object that describes the details of an image.
    */
  var imageDetail: js.UndefOr[ReferencedImageDetail] = js.undefined
  
  /**
    * The tag associated with the image.
    */
  var imageTag: js.UndefOr[ImageTag] = js.undefined
}
object ImageTagDetail {
  
  inline def apply(): ImageTagDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageTagDetail]
  }
  
  extension [Self <: ImageTagDetail](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setImageDetail(value: ReferencedImageDetail): Self = StObject.set(x, "imageDetail", value.asInstanceOf[js.Any])
    
    inline def setImageDetailUndefined: Self = StObject.set(x, "imageDetail", js.undefined)
    
    inline def setImageTag(value: ImageTag): Self = StObject.set(x, "imageTag", value.asInstanceOf[js.Any])
    
    inline def setImageTagUndefined: Self = StObject.set(x, "imageTag", js.undefined)
  }
}
