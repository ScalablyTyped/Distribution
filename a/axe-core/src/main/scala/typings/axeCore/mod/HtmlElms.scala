package typings.axeCore.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlElms extends HtmlElmsVariant {
  
  var variant: js.UndefOr[StringDictionary[HtmlElmsVariant]] = js.native
}
object HtmlElms {
  
  @scala.inline
  def apply(allowedRoles: Boolean | js.Array[String]): HtmlElms = {
    val __obj = js.Dynamic.literal(allowedRoles = allowedRoles.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlElms]
  }
  
  @scala.inline
  implicit class HtmlElmsOps[Self <: HtmlElms] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVariant(value: StringDictionary[HtmlElmsVariant]): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
}
