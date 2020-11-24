package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChefConfiguration extends js.Object {
  
  /**
    * The Berkshelf version.
    */
  var BerkshelfVersion: js.UndefOr[String] = js.native
  
  /**
    * Whether to enable Berkshelf.
    */
  var ManageBerkshelf: js.UndefOr[Boolean] = js.native
}
object ChefConfiguration {
  
  @scala.inline
  def apply(): ChefConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChefConfiguration]
  }
  
  @scala.inline
  implicit class ChefConfigurationOps[Self <: ChefConfiguration] (val x: Self) extends AnyVal {
    
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
    def setBerkshelfVersion(value: String): Self = this.set("BerkshelfVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBerkshelfVersion: Self = this.set("BerkshelfVersion", js.undefined)
    
    @scala.inline
    def setManageBerkshelf(value: Boolean): Self = this.set("ManageBerkshelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManageBerkshelf: Self = this.set("ManageBerkshelf", js.undefined)
  }
}
