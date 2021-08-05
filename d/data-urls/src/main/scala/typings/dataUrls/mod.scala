package typings.dataUrls

import typings.node.Buffer
import typings.whatwgUrl.mod.URLRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(stringInput: String): DataURL | Null = ^.asInstanceOf[js.Dynamic].apply(stringInput.asInstanceOf[js.Any]).asInstanceOf[DataURL | Null]
  
  @JSImport("data-urls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromURLRecord(urlRecord: URLRecord): DataURL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURLRecord")(urlRecord.asInstanceOf[js.Any]).asInstanceOf[DataURL | Null]
  
  trait DataURL extends StObject {
    
    var body: Buffer
    
    var mimeType: typings.whatwgMimetype.mod.^
  }
  object DataURL {
    
    inline def apply(body: Buffer, mimeType: typings.whatwgMimetype.mod.^): DataURL = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataURL]
    }
    
    extension [Self <: DataURL](x: Self) {
      
      inline def setBody(value: Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setMimeType(value: typings.whatwgMimetype.mod.^): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    }
  }
}
