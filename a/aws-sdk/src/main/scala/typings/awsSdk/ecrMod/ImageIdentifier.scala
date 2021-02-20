package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageIdentifier extends StObject {
  
  /**
    * The sha256 digest of the image manifest.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.native
  
  /**
    * The tag used for the image.
    */
  var imageTag: js.UndefOr[ImageTag] = js.native
}
object ImageIdentifier {
  
  @scala.inline
  def apply(): ImageIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageIdentifier]
  }
  
  @scala.inline
  implicit class ImageIdentifierMutableBuilder[Self <: ImageIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageDigest(value: ImageDigest): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
    
    @scala.inline
    def setImageTag(value: ImageTag): Self = StObject.set(x, "imageTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageTagUndefined: Self = StObject.set(x, "imageTag", js.undefined)
  }
}
