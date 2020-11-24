package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FecOutputSettings extends js.Object {
  
  /**
    * Parameter D from SMPTE 2022-1. The height of the FEC protection matrix.  The number of transport stream packets per column error correction packet. Must be between 4 and 20, inclusive.
    */
  var ColumnDepth: js.UndefOr[integerMin4Max20] = js.native
  
  /**
    * Enables column only or column and row based FEC
    */
  var IncludeFec: js.UndefOr[FecOutputIncludeFec] = js.native
  
  /**
    * Parameter L from SMPTE 2022-1. The width of the FEC protection matrix.  Must be between 1 and 20, inclusive. If only Column FEC is used, then larger values increase robustness.  If Row FEC is used, then this is the number of transport stream packets per row error correction packet, and the value must be between 4 and 20, inclusive, if includeFec is columnAndRow. If includeFec is column, this value must be 1 to 20, inclusive.
    */
  var RowLength: js.UndefOr[integerMin1Max20] = js.native
}
object FecOutputSettings {
  
  @scala.inline
  def apply(): FecOutputSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FecOutputSettings]
  }
  
  @scala.inline
  implicit class FecOutputSettingsOps[Self <: FecOutputSettings] (val x: Self) extends AnyVal {
    
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
    def setColumnDepth(value: integerMin4Max20): Self = this.set("ColumnDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnDepth: Self = this.set("ColumnDepth", js.undefined)
    
    @scala.inline
    def setIncludeFec(value: FecOutputIncludeFec): Self = this.set("IncludeFec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeFec: Self = this.set("IncludeFec", js.undefined)
    
    @scala.inline
    def setRowLength(value: integerMin1Max20): Self = this.set("RowLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowLength: Self = this.set("RowLength", js.undefined)
  }
}
