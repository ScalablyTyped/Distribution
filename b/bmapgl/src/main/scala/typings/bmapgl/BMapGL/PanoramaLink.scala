package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PanoramaLink extends StObject {
  
  var description: String = js.native
  
  var heading: String = js.native
  
  var id: String = js.native
}
object PanoramaLink {
  
  @scala.inline
  def apply(description: String, heading: String, id: String): PanoramaLink = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaLink]
  }
  
  @scala.inline
  implicit class PanoramaLinkMutableBuilder[Self <: PanoramaLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
