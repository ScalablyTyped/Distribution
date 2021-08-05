package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomProperties
  extends StObject
     with ComponentProperties {
  
  /**
    * Contents of the DOM component.
    */
  var html: js.UndefOr[String] = js.undefined
}
object DomProperties {
  
  inline def apply(): DomProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomProperties]
  }
  
  extension [Self <: DomProperties](x: Self) {
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
  }
}
