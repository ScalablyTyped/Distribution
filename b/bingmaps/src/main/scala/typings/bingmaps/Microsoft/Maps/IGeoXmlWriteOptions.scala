package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoXmlWriteOptions extends js.Object {
  
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
  implicit class IGeoXmlWriteOptionsOps[Self <: IGeoXmlWriteOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIndentChars(value: String): Self = this.set("indentChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentChars: Self = this.set("indentChars", js.undefined)
    
    @scala.inline
    def setNewLineChars(value: String): Self = this.set("newLineChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewLineChars: Self = this.set("newLineChars", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setRoundLocations(value: Boolean): Self = this.set("roundLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundLocations: Self = this.set("roundLocations", js.undefined)
    
    @scala.inline
    def setValidate(value: Boolean): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    
    @scala.inline
    def setXmlFormat(value: GeoXmlFormat): Self = this.set("xmlFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlFormat: Self = this.set("xmlFormat", js.undefined)
  }
}
