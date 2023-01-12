package typings.baiduApp.swan.ai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait textToAudioResponse extends StObject {
  
  var filePath: String
}
object textToAudioResponse {
  
  inline def apply(filePath: String): textToAudioResponse = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[textToAudioResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: textToAudioResponse] (val x: Self) extends AnyVal {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
