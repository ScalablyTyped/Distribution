package typings.awsSdk.ecrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageIdentifier extends StObject {
  
  /**
    * The sha256 digest of the image manifest.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.undefined
  
  /**
    * The tag used for the image.
    */
  var imageTag: js.UndefOr[ImageTag] = js.undefined
}
object ImageIdentifier {
  
  inline def apply(): ImageIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageIdentifier]
  }
  
  extension [Self <: ImageIdentifier](x: Self) {
    
    inline def setImageDigest(value: ImageDigest): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
    
    inline def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
    
    inline def setImageTag(value: ImageTag): Self = StObject.set(x, "imageTag", value.asInstanceOf[js.Any])
    
    inline def setImageTagUndefined: Self = StObject.set(x, "imageTag", js.undefined)
  }
}
