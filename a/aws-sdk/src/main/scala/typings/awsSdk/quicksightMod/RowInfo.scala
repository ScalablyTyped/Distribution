package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowInfo extends js.Object {
  
  /**
    * The number of rows that were not ingested.
    */
  var RowsDropped: js.UndefOr[long] = js.native
  
  /**
    * The number of rows that were ingested.
    */
  var RowsIngested: js.UndefOr[long] = js.native
}
object RowInfo {
  
  @scala.inline
  def apply(): RowInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowInfo]
  }
  
  @scala.inline
  implicit class RowInfoOps[Self <: RowInfo] (val x: Self) extends AnyVal {
    
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
    def setRowsDropped(value: long): Self = this.set("RowsDropped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowsDropped: Self = this.set("RowsDropped", js.undefined)
    
    @scala.inline
    def setRowsIngested(value: long): Self = this.set("RowsIngested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowsIngested: Self = this.set("RowsIngested", js.undefined)
  }
}
