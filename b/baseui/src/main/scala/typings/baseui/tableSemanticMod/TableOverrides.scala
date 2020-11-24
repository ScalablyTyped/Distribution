package typings.baseui.tableSemanticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableOverrides extends js.Object {
  
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var Table: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var TableBody: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var TableBodyCell: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var TableBodyRow: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var TableEmptyMessage: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var TableHead: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var TableHeadCell: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var TableHeadRow: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var TableLoadingMessage: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}
object TableOverrides {
  
  @scala.inline
  def apply(): TableOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOverrides]
  }
  
  @scala.inline
  implicit class TableOverridesOps[Self <: TableOverrides] (val x: Self) extends AnyVal {
    
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
    def setRoot(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("Root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("Root", js.undefined)
    
    @scala.inline
    def setTable(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("Table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("Table", js.undefined)
    
    @scala.inline
    def setTableBody(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("TableBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBody: Self = this.set("TableBody", js.undefined)
    
    @scala.inline
    def setTableBodyCell(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("TableBodyCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBodyCell: Self = this.set("TableBodyCell", js.undefined)
    
    @scala.inline
    def setTableBodyRow(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("TableBodyRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBodyRow: Self = this.set("TableBodyRow", js.undefined)
    
    @scala.inline
    def setTableEmptyMessage(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("TableEmptyMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableEmptyMessage: Self = this.set("TableEmptyMessage", js.undefined)
    
    @scala.inline
    def setTableHead(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("TableHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHead: Self = this.set("TableHead", js.undefined)
    
    @scala.inline
    def setTableHeadCell(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("TableHeadCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeadCell: Self = this.set("TableHeadCell", js.undefined)
    
    @scala.inline
    def setTableHeadRow(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("TableHeadRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableHeadRow: Self = this.set("TableHeadRow", js.undefined)
    
    @scala.inline
    def setTableLoadingMessage(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("TableLoadingMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableLoadingMessage: Self = this.set("TableLoadingMessage", js.undefined)
  }
}
