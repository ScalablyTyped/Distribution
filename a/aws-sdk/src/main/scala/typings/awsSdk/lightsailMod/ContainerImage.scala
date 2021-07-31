package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerImage extends StObject {
  
  /**
    * The timestamp when the container image was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  
  /**
    * The digest of the container image.
    */
  var digest: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the container image.
    */
  var image: js.UndefOr[String] = js.undefined
}
object ContainerImage {
  
  @scala.inline
  def apply(): ContainerImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerImage]
  }
  
  @scala.inline
  implicit class ContainerImageMutableBuilder[Self <: ContainerImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
