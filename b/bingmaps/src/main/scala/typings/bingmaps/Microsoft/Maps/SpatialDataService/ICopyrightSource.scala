package typings.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICopyrightSource extends js.Object {
  
  /** The copyright string from the source. */
  var Copyright: String = js.native
  
  /** An ID identifying the data provider that supplied the data. */
  var SourceID: String = js.native
  
  /** The name of the data provider represented by this Source element. */
  var SourceName: String = js.native
}
object ICopyrightSource {
  
  @scala.inline
  def apply(Copyright: String, SourceID: String, SourceName: String): ICopyrightSource = {
    val __obj = js.Dynamic.literal(Copyright = Copyright.asInstanceOf[js.Any], SourceID = SourceID.asInstanceOf[js.Any], SourceName = SourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICopyrightSource]
  }
  
  @scala.inline
  implicit class ICopyrightSourceOps[Self <: ICopyrightSource] (val x: Self) extends AnyVal {
    
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
    def setCopyright(value: String): Self = this.set("Copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceID(value: String): Self = this.set("SourceID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceName(value: String): Self = this.set("SourceName", value.asInstanceOf[js.Any])
  }
}
