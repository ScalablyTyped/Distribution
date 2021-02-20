package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoXmlWriteOptions extends StObject {
  
  /** The characters to use to create an indent in the XML data. Default: \t */
  var indentChars: js.UndefOr[String] = js.native
  
  /** The characters to use to create a new line in the XML data. Default: \r\n */
  var newLineChars: js.UndefOr[String] = js.native
  
  /** A boolean indicating if the generated XML should be use new lines and indents to make the generated nicely formatted. Default: true */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** A boolean indicating if Location and LocationRect values should be rounded off to 6 decimals. Default: false */
  var roundLocations: js.UndefOr[Boolean] = js.native
  
  /**
    * A boolean indicating if the shapes should be made valid before writing. If set to true, will use the
    * Geometry.makeValid function of the SpatialMath module. Default: false
    */
  var validate: js.UndefOr[Boolean] = js.native
  
  /** The XML format to write the shapes to. Default: Kml */
  var xmlFormat: js.UndefOr[GeoXmlFormat] = js.native
}
object IGeoXmlWriteOptions {
  
  @scala.inline
  def apply(): IGeoXmlWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoXmlWriteOptions]
  }
  
  @scala.inline
  implicit class IGeoXmlWriteOptionsMutableBuilder[Self <: IGeoXmlWriteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndentChars(value: String): Self = StObject.set(x, "indentChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentCharsUndefined: Self = StObject.set(x, "indentChars", js.undefined)
    
    @scala.inline
    def setNewLineChars(value: String): Self = StObject.set(x, "newLineChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewLineCharsUndefined: Self = StObject.set(x, "newLineChars", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setRoundLocations(value: Boolean): Self = StObject.set(x, "roundLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundLocationsUndefined: Self = StObject.set(x, "roundLocations", js.undefined)
    
    @scala.inline
    def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    @scala.inline
    def setXmlFormat(value: GeoXmlFormat): Self = StObject.set(x, "xmlFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlFormatUndefined: Self = StObject.set(x, "xmlFormat", js.undefined)
  }
}
