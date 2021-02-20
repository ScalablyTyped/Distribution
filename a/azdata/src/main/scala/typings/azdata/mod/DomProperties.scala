package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomProperties extends ComponentProperties {
  
  /**
    * Contents of the DOM component.
    */
  var html: js.UndefOr[String] = js.native
}
object DomProperties {
  
  @scala.inline
  def apply(): DomProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomProperties]
  }
  
  @scala.inline
  implicit class DomPropertiesMutableBuilder[Self <: DomProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
  }
}
