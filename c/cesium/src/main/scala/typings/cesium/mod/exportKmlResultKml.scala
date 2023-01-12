package typings.cesium.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait exportKmlResultKml extends StObject {
  
  var externalFiles: StringDictionary[Blob]
  
  var kml: String
}
object exportKmlResultKml {
  
  inline def apply(externalFiles: StringDictionary[Blob], kml: String): exportKmlResultKml = {
    val __obj = js.Dynamic.literal(externalFiles = externalFiles.asInstanceOf[js.Any], kml = kml.asInstanceOf[js.Any])
    __obj.asInstanceOf[exportKmlResultKml]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: exportKmlResultKml] (val x: Self) extends AnyVal {
    
    inline def setExternalFiles(value: StringDictionary[Blob]): Self = StObject.set(x, "externalFiles", value.asInstanceOf[js.Any])
    
    inline def setKml(value: String): Self = StObject.set(x, "kml", value.asInstanceOf[js.Any])
  }
}
