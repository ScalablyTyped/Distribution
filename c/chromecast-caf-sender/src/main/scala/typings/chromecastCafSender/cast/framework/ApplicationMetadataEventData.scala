package typings.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationMetadataEventData extends EventData {
  
  var metadata: ApplicationMetadata = js.native
}
object ApplicationMetadataEventData {
  
  @scala.inline
  def apply(metadata: ApplicationMetadata, `type`: String): ApplicationMetadataEventData = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationMetadataEventData]
  }
  
  @scala.inline
  implicit class ApplicationMetadataEventDataMutableBuilder[Self <: ApplicationMetadataEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(value: ApplicationMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
