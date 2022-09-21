package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStyleUrl extends StObject {
  
  /** List of style css urls o be downloaded */
  var styleURLs: js.Array[String]
}
object IStyleUrl {
  
  inline def apply(styleURLs: js.Array[String]): IStyleUrl = {
    val __obj = js.Dynamic.literal(styleURLs = styleURLs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStyleUrl]
  }
  
  extension [Self <: IStyleUrl](x: Self) {
    
    inline def setStyleURLs(value: js.Array[String]): Self = StObject.set(x, "styleURLs", value.asInstanceOf[js.Any])
    
    inline def setStyleURLsVarargs(value: String*): Self = StObject.set(x, "styleURLs", js.Array(value*))
  }
}
