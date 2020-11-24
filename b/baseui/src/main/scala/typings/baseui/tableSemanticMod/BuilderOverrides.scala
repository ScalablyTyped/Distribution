package typings.baseui.tableSemanticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuilderOverrides extends TableOverrides {
  
  var SortAscIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var SortDescIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var SortNoneIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var TableHeadCellSortable: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}
object BuilderOverrides {
  
  @scala.inline
  def apply(): BuilderOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuilderOverrides]
  }
  
  @scala.inline
  implicit class BuilderOverridesOps[Self <: BuilderOverrides] (val x: Self) extends AnyVal {
    
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
    def setSortAscIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("SortAscIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortAscIcon: Self = this.set("SortAscIcon", js.undefined)
    
    @scala.inline
    def setSortDescIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("SortDescIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortDescIcon: Self = this.set("SortDescIcon", js.undefined)
    
    @scala.inline
    def setSortNoneIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("SortNoneIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortNoneIcon: Self = this.set("SortNoneIcon", js.undefined)
    
    @scala.inline
    def setTableHeadCellSortable(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("TableHeadCellSortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeadCellSortable: Self = this.set("TableHeadCellSortable", js.undefined)
  }
}
