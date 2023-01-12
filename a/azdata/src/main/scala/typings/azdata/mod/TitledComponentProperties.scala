package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitledComponentProperties
  extends StObject
     with ComponentProperties {
  
  /**
    * The title for the component. This title will show when hovered over
    */
  var title: js.UndefOr[String] = js.undefined
}
object TitledComponentProperties {
  
  inline def apply(): TitledComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitledComponentProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TitledComponentProperties] (val x: Self) extends AnyVal {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
