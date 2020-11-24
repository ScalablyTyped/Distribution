package typings.clusterizeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var blocks_in_cluster: js.UndefOr[Double] = js.native
  
  var callbacks: js.UndefOr[Callbacks] = js.native
  
  var contentId: String = js.native
  
  var keep_parity: js.UndefOr[Boolean] = js.native
  
  var no_data_class: js.UndefOr[String] = js.native
  
  var no_data_text: js.UndefOr[String] = js.native
  
  var rows: js.UndefOr[js.Array[String]] = js.native
  
  var rows_in_block: js.UndefOr[Double] = js.native
  
  var scrollId: String = js.native
  
  var show_no_data_row: js.UndefOr[Boolean] = js.native
  
  var tag: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(contentId: String, scrollId: String): Options = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], scrollId = scrollId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setContentId(value: String): Self = this.set("contentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollId(value: String): Self = this.set("scrollId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocks_in_cluster(value: Double): Self = this.set("blocks_in_cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlocks_in_cluster: Self = this.set("blocks_in_cluster", js.undefined)
    
    @scala.inline
    def setCallbacks(value: Callbacks): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbacks: Self = this.set("callbacks", js.undefined)
    
    @scala.inline
    def setKeep_parity(value: Boolean): Self = this.set("keep_parity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeep_parity: Self = this.set("keep_parity", js.undefined)
    
    @scala.inline
    def setNo_data_class(value: String): Self = this.set("no_data_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNo_data_class: Self = this.set("no_data_class", js.undefined)
    
    @scala.inline
    def setNo_data_text(value: String): Self = this.set("no_data_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNo_data_text: Self = this.set("no_data_text", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: String*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[String]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setRows_in_block(value: Double): Self = this.set("rows_in_block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows_in_block: Self = this.set("rows_in_block", js.undefined)
    
    @scala.inline
    def setShow_no_data_row(value: Boolean): Self = this.set("show_no_data_row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow_no_data_row: Self = this.set("show_no_data_row", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
