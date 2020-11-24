package typings.blueprintjsTable.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITableSnapshot extends js.Object {
  
  var nextScrollLeft: js.UndefOr[Double] = js.native
  
  var nextScrollTop: js.UndefOr[Double] = js.native
}
object ITableSnapshot {
  
  @scala.inline
  def apply(): ITableSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITableSnapshot]
  }
  
  @scala.inline
  implicit class ITableSnapshotOps[Self <: ITableSnapshot] (val x: Self) extends AnyVal {
    
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
    def setNextScrollLeft(value: Double): Self = this.set("nextScrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextScrollLeft: Self = this.set("nextScrollLeft", js.undefined)
    
    @scala.inline
    def setNextScrollTop(value: Double): Self = this.set("nextScrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextScrollTop: Self = this.set("nextScrollTop", js.undefined)
  }
}
