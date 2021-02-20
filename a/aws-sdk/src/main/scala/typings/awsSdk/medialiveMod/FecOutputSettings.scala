package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FecOutputSettings extends StObject {
  
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
  implicit class FecOutputSettingsMutableBuilder[Self <: FecOutputSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnDepth(value: integerMin4Max20): Self = StObject.set(x, "ColumnDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnDepthUndefined: Self = StObject.set(x, "ColumnDepth", js.undefined)
    
    @scala.inline
    def setIncludeFec(value: FecOutputIncludeFec): Self = StObject.set(x, "IncludeFec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeFecUndefined: Self = StObject.set(x, "IncludeFec", js.undefined)
    
    @scala.inline
    def setRowLength(value: integerMin1Max20): Self = StObject.set(x, "RowLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowLengthUndefined: Self = StObject.set(x, "RowLength", js.undefined)
  }
}
