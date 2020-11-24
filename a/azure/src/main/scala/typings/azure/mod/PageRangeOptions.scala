package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageRangeOptions extends LeaseIdOptions {
  
  var rangeEnd: js.UndefOr[Double] = js.native
  
  var rangeStart: js.UndefOr[Double] = js.native
  
  var snapshotId: js.UndefOr[String] = js.native
}
object PageRangeOptions {
  
  @scala.inline
  def apply(): PageRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageRangeOptions]
  }
  
  @scala.inline
  implicit class PageRangeOptionsOps[Self <: PageRangeOptions] (val x: Self) extends AnyVal {
    
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
    def setRangeEnd(value: Double): Self = this.set("rangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeEnd: Self = this.set("rangeEnd", js.undefined)
    
    @scala.inline
    def setRangeStart(value: Double): Self = this.set("rangeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeStart: Self = this.set("rangeStart", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: String): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotId: Self = this.set("snapshotId", js.undefined)
  }
}
