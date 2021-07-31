package typings.bingmaps.Microsoft.Maps.SpatialDataService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICopyright extends StObject {
  
  /** The copyright URL for the GeoData service. */
  var CopyrightURL: String
  
  /** A collection of CopyrightSource objects that give information about the sources of the polygon data that is returned. */
  var Sources: js.Array[ICopyrightSource]
}
object ICopyright {
  
  @scala.inline
  def apply(CopyrightURL: String, Sources: js.Array[ICopyrightSource]): ICopyright = {
    val __obj = js.Dynamic.literal(CopyrightURL = CopyrightURL.asInstanceOf[js.Any], Sources = Sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICopyright]
  }
  
  @scala.inline
  implicit class ICopyrightMutableBuilder[Self <: ICopyright] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyrightURL(value: String): Self = StObject.set(x, "CopyrightURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSources(value: js.Array[ICopyrightSource]): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesVarargs(value: ICopyrightSource*): Self = StObject.set(x, "Sources", js.Array(value :_*))
  }
}
