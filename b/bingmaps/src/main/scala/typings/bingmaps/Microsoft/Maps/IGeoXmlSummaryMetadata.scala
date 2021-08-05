package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoXmlSummaryMetadata extends StObject {
  
  /** The bounds of all the shapes and layers in the XML document. */
  var bounds: js.UndefOr[LocationRect] = js.undefined
  
  /** The description of the content of the XML document. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Any additional metadata that the XML document may have. i.e. atom:author */
  var metadata: js.UndefOr[IDictionary[js.Any]] = js.undefined
  
  /** The title or name of the content of the XML document. */
  var title: js.UndefOr[String] = js.undefined
}
object IGeoXmlSummaryMetadata {
  
  inline def apply(): IGeoXmlSummaryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoXmlSummaryMetadata]
  }
  
  extension [Self <: IGeoXmlSummaryMetadata](x: Self) {
    
    inline def setBounds(value: LocationRect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMetadata(value: IDictionary[js.Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
