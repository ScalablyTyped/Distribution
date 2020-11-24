package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FolderConfiguration extends js.Object {
  
  /**
    * The action to take on the folder contents at the end of the folder configuration period.
    */
  var Action: RetentionAction = js.native
  
  /**
    * The folder name.
    */
  var Name: FolderName = js.native
  
  /**
    * The period of time at which the folder configuration action is applied.
    */
  var Period: js.UndefOr[RetentionPeriod] = js.native
}
object FolderConfiguration {
  
  @scala.inline
  def apply(Action: RetentionAction, Name: FolderName): FolderConfiguration = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderConfiguration]
  }
  
  @scala.inline
  implicit class FolderConfigurationOps[Self <: FolderConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAction(value: RetentionAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: FolderName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: RetentionPeriod): Self = this.set("Period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("Period", js.undefined)
  }
}
