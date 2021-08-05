package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceUri extends StObject {
  
  var sourceUri: js.UndefOr[String] = js.undefined
}
object SourceUri {
  
  inline def apply(): SourceUri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceUri]
  }
  
  extension [Self <: SourceUri](x: Self) {
    
    inline def setSourceUri(value: String): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
    
    inline def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
  }
}
