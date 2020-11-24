package typings.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICopyright extends js.Object {
  
  /** The copyright URL for the GeoData service. */
  var CopyrightURL: String = js.native
  
  /** A collection of CopyrightSource objects that give information about the sources of the polygon data that is returned. */
  var Sources: js.Array[ICopyrightSource] = js.native
}
object ICopyright {
  
  @scala.inline
  def apply(CopyrightURL: String, Sources: js.Array[ICopyrightSource]): ICopyright = {
    val __obj = js.Dynamic.literal(CopyrightURL = CopyrightURL.asInstanceOf[js.Any], Sources = Sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICopyright]
  }
  
  @scala.inline
  implicit class ICopyrightOps[Self <: ICopyright] (val x: Self) extends AnyVal {
    
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
    def setCopyrightURL(value: String): Self = this.set("CopyrightURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesVarargs(value: ICopyrightSource*): Self = this.set("Sources", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[ICopyrightSource]): Self = this.set("Sources", value.asInstanceOf[js.Any])
  }
}
