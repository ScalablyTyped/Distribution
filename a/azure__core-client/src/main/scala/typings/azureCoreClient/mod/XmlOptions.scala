package typings.azureCoreClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XmlOptions extends StObject {
  
  /**
    * indicates whether the root element is to be included or not in the output when parsing XML.
    */
  var includeRoot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * indicates the name of the root element in the resulting XML when building XML.
    */
  var rootName: js.UndefOr[String] = js.undefined
  
  /**
    * key used to access the XML value content when parsing XML.
    */
  var xmlCharKey: js.UndefOr[String] = js.undefined
}
object XmlOptions {
  
  inline def apply(): XmlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlOptions]
  }
  
  extension [Self <: XmlOptions](x: Self) {
    
    inline def setIncludeRoot(value: Boolean): Self = StObject.set(x, "includeRoot", value.asInstanceOf[js.Any])
    
    inline def setIncludeRootUndefined: Self = StObject.set(x, "includeRoot", js.undefined)
    
    inline def setRootName(value: String): Self = StObject.set(x, "rootName", value.asInstanceOf[js.Any])
    
    inline def setRootNameUndefined: Self = StObject.set(x, "rootName", js.undefined)
    
    inline def setXmlCharKey(value: String): Self = StObject.set(x, "xmlCharKey", value.asInstanceOf[js.Any])
    
    inline def setXmlCharKeyUndefined: Self = StObject.set(x, "xmlCharKey", js.undefined)
  }
}
