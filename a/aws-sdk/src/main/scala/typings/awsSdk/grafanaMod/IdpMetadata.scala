package typings.awsSdk.grafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdpMetadata extends StObject {
  
  /**
    * The URL of the location containing the metadata.
    */
  var url: js.UndefOr[IdpMetadataUrl] = js.undefined
  
  /**
    * The actual full metadata file, in XML format.
    */
  var xml: js.UndefOr[String] = js.undefined
}
object IdpMetadata {
  
  inline def apply(): IdpMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdpMetadata]
  }
  
  extension [Self <: IdpMetadata](x: Self) {
    
    inline def setUrl(value: IdpMetadataUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setXml(value: String): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    inline def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
  }
}
