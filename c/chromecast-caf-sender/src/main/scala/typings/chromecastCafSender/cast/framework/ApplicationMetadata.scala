package typings.chromecastCafSender.cast.framework

import typings.chrome.chrome.cast.Image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationMetadata extends StObject {
  
  var applicationId: String
  
  var images: js.Array[Image]
  
  var name: String
  
  var namespaces: js.Array[String]
}
object ApplicationMetadata {
  
  @scala.inline
  def apply(applicationId: String, images: js.Array[Image], name: String, namespaces: js.Array[String]): ApplicationMetadata = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespaces = namespaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationMetadata]
  }
  
  @scala.inline
  implicit class ApplicationMetadataMutableBuilder[Self <: ApplicationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: String): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: js.Array[Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: Image*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaces(value: js.Array[String]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespacesVarargs(value: String*): Self = StObject.set(x, "namespaces", js.Array(value :_*))
  }
}
