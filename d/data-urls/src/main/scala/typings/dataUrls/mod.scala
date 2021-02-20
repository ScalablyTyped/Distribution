package typings.dataUrls

import typings.node.Buffer
import typings.whatwgMimetype.mod.^
import typings.whatwgUrl.mod.URLRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("data-urls", JSImport.Namespace)
  @js.native
  def apply(stringInput: String): DataURL | Null = js.native
  
  @JSImport("data-urls", "fromURLRecord")
  @js.native
  def fromURLRecord(urlRecord: URLRecord): DataURL | Null = js.native
  
  @js.native
  trait DataURL extends StObject {
    
    var body: Buffer = js.native
    
    var mimeType: ^ = js.native
  }
  object DataURL {
    
    @scala.inline
    def apply(body: Buffer, mimeType: ^): DataURL = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataURL]
    }
    
    @scala.inline
    implicit class DataURLMutableBuilder[Self <: DataURL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeType(value: ^): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    }
  }
}
