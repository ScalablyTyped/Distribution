package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaEncodingConfiguration
  extends StObject
     with MediaConfiguration {
  
  var `type`: MediaEncodingType
}
object MediaEncodingConfiguration {
  
  inline def apply(`type`: MediaEncodingType): MediaEncodingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaEncodingConfiguration]
  }
  
  extension [Self <: MediaEncodingConfiguration](x: Self) {
    
    inline def setType(value: MediaEncodingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
