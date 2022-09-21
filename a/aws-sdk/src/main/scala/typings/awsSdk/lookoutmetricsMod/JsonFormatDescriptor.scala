package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonFormatDescriptor extends StObject {
  
  /**
    * The character set in which the source JSON file is written.
    */
  var Charset: js.UndefOr[typings.awsSdk.lookoutmetricsMod.Charset] = js.undefined
  
  /**
    * The level of compression of the source CSV file.
    */
  var FileCompression: js.UndefOr[JsonFileCompression] = js.undefined
}
object JsonFormatDescriptor {
  
  inline def apply(): JsonFormatDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonFormatDescriptor]
  }
  
  extension [Self <: JsonFormatDescriptor](x: Self) {
    
    inline def setCharset(value: Charset): Self = StObject.set(x, "Charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "Charset", js.undefined)
    
    inline def setFileCompression(value: JsonFileCompression): Self = StObject.set(x, "FileCompression", value.asInstanceOf[js.Any])
    
    inline def setFileCompressionUndefined: Self = StObject.set(x, "FileCompression", js.undefined)
  }
}
