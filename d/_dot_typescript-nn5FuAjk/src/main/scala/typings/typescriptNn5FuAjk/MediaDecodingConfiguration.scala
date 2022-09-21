package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaDecodingConfiguration
  extends StObject
     with MediaConfiguration {
  
  var `type`: MediaDecodingType
}
object MediaDecodingConfiguration {
  
  inline def apply(`type`: MediaDecodingType): MediaDecodingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDecodingConfiguration]
  }
  
  extension [Self <: MediaDecodingConfiguration](x: Self) {
    
    inline def setType(value: MediaDecodingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
