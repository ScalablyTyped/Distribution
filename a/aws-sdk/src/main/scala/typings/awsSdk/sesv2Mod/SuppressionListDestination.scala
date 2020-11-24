package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuppressionListDestination extends js.Object {
  
  /**
    * The type of action that you want to perform on the address. Acceptable values:   PUT: add the addresses to the suppression list. If the record already exists, it will override it with the new value.   DELETE: remove the addresses from the suppression list.  
    */
  var SuppressionListImportAction: typings.awsSdk.sesv2Mod.SuppressionListImportAction = js.native
}
object SuppressionListDestination {
  
  @scala.inline
  def apply(SuppressionListImportAction: SuppressionListImportAction): SuppressionListDestination = {
    val __obj = js.Dynamic.literal(SuppressionListImportAction = SuppressionListImportAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressionListDestination]
  }
  
  @scala.inline
  implicit class SuppressionListDestinationOps[Self <: SuppressionListDestination] (val x: Self) extends AnyVal {
    
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
    def setSuppressionListImportAction(value: SuppressionListImportAction): Self = this.set("SuppressionListImportAction", value.asInstanceOf[js.Any])
  }
}
