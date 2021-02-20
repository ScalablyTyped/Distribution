package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoXmlSummaryMetadata extends StObject {
  
  /** The bounds of all the shapes and layers in the XML document. */
  var bounds: js.UndefOr[LocationRect] = js.native
  
  /** The description of the content of the XML document. */
  var description: js.UndefOr[String] = js.native
  
  /** Any additional metadata that the XML document may have. i.e. atom:author */
  var metadata: js.UndefOr[IDictionary[_]] = js.native
  
  /** The title or name of the content of the XML document. */
  var title: js.UndefOr[String] = js.native
}
object IGeoXmlSummaryMetadata {
  
  @scala.inline
  def apply(): IGeoXmlSummaryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoXmlSummaryMetadata]
  }
  
  @scala.inline
  implicit class IGeoXmlSummaryMetadataMutableBuilder[Self <: IGeoXmlSummaryMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: LocationRect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setMetadata(value: IDictionary[_]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
