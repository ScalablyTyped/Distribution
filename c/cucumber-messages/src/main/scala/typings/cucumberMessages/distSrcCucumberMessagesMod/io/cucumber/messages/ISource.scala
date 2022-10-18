package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Source. */
trait ISource extends StObject {
  
  /** Source data */
  var data: js.UndefOr[String | Null] = js.undefined
  
  /** Source media */
  var media: js.UndefOr[IMedia | Null] = js.undefined
  
  /**
    * The [URI](https://en.wikipedia.org/wiki/Uniform_Resource_Identifier)
    * of the source, typically a file path relative to the root directory
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object ISource {
  
  inline def apply(): ISource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISource]
  }
  
  extension [Self <: ISource](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setMedia(value: IMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaNull: Self = StObject.set(x, "media", null)
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
