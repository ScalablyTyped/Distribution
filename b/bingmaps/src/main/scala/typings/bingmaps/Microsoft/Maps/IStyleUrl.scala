package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStyleUrl extends StObject {
  
  /** List of style css urls o be downloaded */
  var styleURLs: js.Array[String] = js.native
}
object IStyleUrl {
  
  @scala.inline
  def apply(styleURLs: js.Array[String]): IStyleUrl = {
    val __obj = js.Dynamic.literal(styleURLs = styleURLs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStyleUrl]
  }
  
  @scala.inline
  implicit class IStyleUrlMutableBuilder[Self <: IStyleUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyleURLs(value: js.Array[String]): Self = StObject.set(x, "styleURLs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleURLsVarargs(value: String*): Self = StObject.set(x, "styleURLs", js.Array(value :_*))
  }
}
