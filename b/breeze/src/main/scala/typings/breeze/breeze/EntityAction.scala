package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityAction extends IEnum {
  
  var AcceptChanges: EntityActionSymbol = js.native
  
  var Attach: EntityActionSymbol = js.native
  
  var AttachOnImport: EntityActionSymbol = js.native
  
  var AttachOnQuery: EntityActionSymbol = js.native
  
  var Clear: EntityActionSymbol = js.native
  
  var Detach: EntityActionSymbol = js.native
  
  var EntityStateChange: EntityActionSymbol = js.native
  
  var MergeOnImport: EntityActionSymbol = js.native
  
  var MergeOnQuery: EntityActionSymbol = js.native
  
  var MergeOnSave: EntityActionSymbol = js.native
  
  var PropertyChange: EntityActionSymbol = js.native
  
  var RejectChanges: EntityActionSymbol = js.native
}
object EntityAction {
  
  @scala.inline
  def apply(
    AcceptChanges: EntityActionSymbol,
    Attach: EntityActionSymbol,
    AttachOnImport: EntityActionSymbol,
    AttachOnQuery: EntityActionSymbol,
    Clear: EntityActionSymbol,
    Detach: EntityActionSymbol,
    EntityStateChange: EntityActionSymbol,
    MergeOnImport: EntityActionSymbol,
    MergeOnQuery: EntityActionSymbol,
    MergeOnSave: EntityActionSymbol,
    PropertyChange: EntityActionSymbol,
    RejectChanges: EntityActionSymbol,
    contains: js.Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): EntityAction = {
    val __obj = js.Dynamic.literal(AcceptChanges = AcceptChanges.asInstanceOf[js.Any], Attach = Attach.asInstanceOf[js.Any], AttachOnImport = AttachOnImport.asInstanceOf[js.Any], AttachOnQuery = AttachOnQuery.asInstanceOf[js.Any], Clear = Clear.asInstanceOf[js.Any], Detach = Detach.asInstanceOf[js.Any], EntityStateChange = EntityStateChange.asInstanceOf[js.Any], MergeOnImport = MergeOnImport.asInstanceOf[js.Any], MergeOnQuery = MergeOnQuery.asInstanceOf[js.Any], MergeOnSave = MergeOnSave.asInstanceOf[js.Any], PropertyChange = PropertyChange.asInstanceOf[js.Any], RejectChanges = RejectChanges.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
    __obj.asInstanceOf[EntityAction]
  }
  
  @scala.inline
  implicit class EntityActionOps[Self <: EntityAction] (val x: Self) extends AnyVal {
    
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
    def setAcceptChanges(value: EntityActionSymbol): Self = this.set("AcceptChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttach(value: EntityActionSymbol): Self = this.set("Attach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachOnImport(value: EntityActionSymbol): Self = this.set("AttachOnImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachOnQuery(value: EntityActionSymbol): Self = this.set("AttachOnQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: EntityActionSymbol): Self = this.set("Clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetach(value: EntityActionSymbol): Self = this.set("Detach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityStateChange(value: EntityActionSymbol): Self = this.set("EntityStateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeOnImport(value: EntityActionSymbol): Self = this.set("MergeOnImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeOnQuery(value: EntityActionSymbol): Self = this.set("MergeOnQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeOnSave(value: EntityActionSymbol): Self = this.set("MergeOnSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyChange(value: EntityActionSymbol): Self = this.set("PropertyChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectChanges(value: EntityActionSymbol): Self = this.set("RejectChanges", value.asInstanceOf[js.Any])
  }
}
