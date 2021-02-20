package typings.bingmaps.Microsoft.Maps.SpatialDataService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICopyrightSource extends StObject {
  
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
  implicit class ICopyrightSourceMutableBuilder[Self <: ICopyrightSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyright(value: String): Self = StObject.set(x, "Copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceID(value: String): Self = StObject.set(x, "SourceID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceName(value: String): Self = StObject.set(x, "SourceName", value.asInstanceOf[js.Any])
  }
}
