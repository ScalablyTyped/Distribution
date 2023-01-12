package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeProperties
  extends StObject
     with ComponentProperties {
  
  var withCheckbox: js.UndefOr[Boolean] = js.undefined
}
object TreeProperties {
  
  inline def apply(): TreeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeProperties] (val x: Self) extends AnyVal {
    
    inline def setWithCheckbox(value: Boolean): Self = StObject.set(x, "withCheckbox", value.asInstanceOf[js.Any])
    
    inline def setWithCheckboxUndefined: Self = StObject.set(x, "withCheckbox", js.undefined)
  }
}
