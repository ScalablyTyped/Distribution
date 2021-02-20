package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeProperties extends ComponentProperties {
  
  var withCheckbox: js.UndefOr[Boolean] = js.native
}
object TreeProperties {
  
  @scala.inline
  def apply(): TreeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeProperties]
  }
  
  @scala.inline
  implicit class TreePropertiesMutableBuilder[Self <: TreeProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWithCheckbox(value: Boolean): Self = StObject.set(x, "withCheckbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCheckboxUndefined: Self = StObject.set(x, "withCheckbox", js.undefined)
  }
}
