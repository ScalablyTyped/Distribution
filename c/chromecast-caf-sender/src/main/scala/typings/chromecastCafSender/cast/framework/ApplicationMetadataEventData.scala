package typings.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationMetadataEventData
  extends StObject
     with EventData {
  
  var metadata: ApplicationMetadata
}
object ApplicationMetadataEventData {
  
  inline def apply(metadata: ApplicationMetadata, `type`: String): ApplicationMetadataEventData = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationMetadataEventData]
  }
  
  extension [Self <: ApplicationMetadataEventData](x: Self) {
    
    inline def setMetadata(value: ApplicationMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
