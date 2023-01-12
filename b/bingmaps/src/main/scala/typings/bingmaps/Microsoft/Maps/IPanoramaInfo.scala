package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanoramaInfo extends StObject {
  
  /** The capture date of the streetside scene. */
  var cd: js.UndefOr[String] = js.undefined
}
object IPanoramaInfo {
  
  inline def apply(): IPanoramaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanoramaInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPanoramaInfo] (val x: Self) extends AnyVal {
    
    inline def setCd(value: String): Self = StObject.set(x, "cd", value.asInstanceOf[js.Any])
    
    inline def setCdUndefined: Self = StObject.set(x, "cd", js.undefined)
  }
}
