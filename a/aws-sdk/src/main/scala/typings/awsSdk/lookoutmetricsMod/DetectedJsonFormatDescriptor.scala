package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedJsonFormatDescriptor extends StObject {
  
  /**
    * The format's character set.
    */
  var Charset: js.UndefOr[DetectedField] = js.undefined
  
  /**
    * The format's file compression.
    */
  var FileCompression: js.UndefOr[DetectedField] = js.undefined
}
object DetectedJsonFormatDescriptor {
  
  inline def apply(): DetectedJsonFormatDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedJsonFormatDescriptor]
  }
  
  extension [Self <: DetectedJsonFormatDescriptor](x: Self) {
    
    inline def setCharset(value: DetectedField): Self = StObject.set(x, "Charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "Charset", js.undefined)
    
    inline def setFileCompression(value: DetectedField): Self = StObject.set(x, "FileCompression", value.asInstanceOf[js.Any])
    
    inline def setFileCompressionUndefined: Self = StObject.set(x, "FileCompression", js.undefined)
  }
}
