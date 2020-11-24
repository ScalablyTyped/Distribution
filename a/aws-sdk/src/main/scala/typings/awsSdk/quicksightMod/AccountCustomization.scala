package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountCustomization extends js.Object {
  
  /**
    * The default theme for this QuickSight subscription.
    */
  var DefaultTheme: js.UndefOr[Arn] = js.native
}
object AccountCustomization {
  
  @scala.inline
  def apply(): AccountCustomization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountCustomization]
  }
  
  @scala.inline
  implicit class AccountCustomizationOps[Self <: AccountCustomization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultTheme(value: Arn): Self = this.set("DefaultTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTheme: Self = this.set("DefaultTheme", js.undefined)
  }
}
