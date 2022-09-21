package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompressedData extends StObject {
  
  var compressionKind: String
  
  var data: Any
  
  var length: Double
}
object CompressedData {
  
  inline def apply(compressionKind: String, data: Any, length: Double): CompressedData = {
    val __obj = js.Dynamic.literal(compressionKind = compressionKind.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressedData]
  }
  
  extension [Self <: CompressedData](x: Self) {
    
    inline def setCompressionKind(value: String): Self = StObject.set(x, "compressionKind", value.asInstanceOf[js.Any])
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
