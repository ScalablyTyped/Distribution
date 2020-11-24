package typings.datatablesNetFixedcolumns.DataTables

import typings.datatablesNetFixedcolumns.datatablesNetFixedcolumnsStrings.auto
import typings.datatablesNetFixedcolumns.datatablesNetFixedcolumnsStrings.none
import typings.datatablesNetFixedcolumns.datatablesNetFixedcolumnsStrings.semiauto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixedColumnsSettings extends js.Object {
  
  /**
    * Row height matching algorithm to use
    *
    * FixedColumns has three different algorithms that it can use: 'none', 'semiauto', 'auto'
    * @see {@link https://datatables.net/reference/option/fixedColumns.heightMatch}
    */
  var heightMatch: js.UndefOr[none | semiauto | auto] = js.native
  
  /**
    * @description The number of columns on the left hand side of the table to fix in place.
    * @see {@link https://datatables.net/reference/option/fixedColumns.leftColumns}
    */
  var leftColumns: js.UndefOr[Double] = js.native
  
  /**
    * @description The number of columns on the right hand side of the table to fix in place.
    * @see {@link https://datatables.net/reference/option/fixedColumns.rightColumns}
    */
  var rightColumns: js.UndefOr[Double] = js.native
}
object FixedColumnsSettings {
  
  @scala.inline
  def apply(): FixedColumnsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedColumnsSettings]
  }
  
  @scala.inline
  implicit class FixedColumnsSettingsOps[Self <: FixedColumnsSettings] (val x: Self) extends AnyVal {
    
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
    def setHeightMatch(value: none | semiauto | auto): Self = this.set("heightMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightMatch: Self = this.set("heightMatch", js.undefined)
    
    @scala.inline
    def setLeftColumns(value: Double): Self = this.set("leftColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftColumns: Self = this.set("leftColumns", js.undefined)
    
    @scala.inline
    def setRightColumns(value: Double): Self = this.set("rightColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightColumns: Self = this.set("rightColumns", js.undefined)
  }
}
