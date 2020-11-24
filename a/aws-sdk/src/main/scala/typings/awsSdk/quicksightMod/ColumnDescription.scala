package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnDescription extends js.Object {
  
  /**
    * The text of a description for a column.
    */
  var Text: js.UndefOr[ColumnDescriptiveText] = js.native
}
object ColumnDescription {
  
  @scala.inline
  def apply(): ColumnDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnDescription]
  }
  
  @scala.inline
  implicit class ColumnDescriptionOps[Self <: ColumnDescription] (val x: Self) extends AnyVal {
    
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
    def setText(value: ColumnDescriptiveText): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("Text", js.undefined)
  }
}
