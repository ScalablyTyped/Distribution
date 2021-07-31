package typings.axeCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlElms
  extends StObject
     with HtmlElmsVariant {
  
  var variant: js.UndefOr[StringDictionary[HtmlElmsVariant]] = js.undefined
}
object HtmlElms {
  
  @scala.inline
  def apply(allowedRoles: Boolean | js.Array[String]): HtmlElms = {
    val __obj = js.Dynamic.literal(allowedRoles = allowedRoles.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlElms]
  }
  
  @scala.inline
  implicit class HtmlElmsMutableBuilder[Self <: HtmlElms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVariant(value: StringDictionary[HtmlElmsVariant]): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
