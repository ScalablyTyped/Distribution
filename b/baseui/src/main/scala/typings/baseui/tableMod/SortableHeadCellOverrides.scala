package typings.baseui.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortableHeadCellOverrides extends js.Object {
  
  var HeadCell: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var SortableLabel: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}
object SortableHeadCellOverrides {
  
  @scala.inline
  def apply(): SortableHeadCellOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableHeadCellOverrides]
  }
  
  @scala.inline
  implicit class SortableHeadCellOverridesOps[Self <: SortableHeadCellOverrides] (val x: Self) extends AnyVal {
    
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
    def setHeadCell(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("HeadCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeadCell: Self = this.set("HeadCell", js.undefined)
    
    @scala.inline
    def setSortableLabel(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("SortableLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortableLabel: Self = this.set("SortableLabel", js.undefined)
  }
}
