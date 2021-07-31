package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadSettings extends StObject {
  
  /**
    * Whether the file has a header row, or the files each have a header row.
    */
  var ContainsHeader: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The delimiter between values in the file.
    */
  var Delimiter: js.UndefOr[typings.awsSdk.quicksightMod.Delimiter] = js.undefined
  
  /**
    * File format.
    */
  var Format: js.UndefOr[FileFormat] = js.undefined
  
  /**
    * A row number to start reading data from.
    */
  var StartFromRow: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * Text qualifier.
    */
  var TextQualifier: js.UndefOr[typings.awsSdk.quicksightMod.TextQualifier] = js.undefined
}
object UploadSettings {
  
  @scala.inline
  def apply(): UploadSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSettings]
  }
  
  @scala.inline
  implicit class UploadSettingsMutableBuilder[Self <: UploadSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainsHeader(value: Boolean): Self = StObject.set(x, "ContainsHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsHeaderUndefined: Self = StObject.set(x, "ContainsHeader", js.undefined)
    
    @scala.inline
    def setDelimiter(value: Delimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    @scala.inline
    def setFormat(value: FileFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    @scala.inline
    def setStartFromRow(value: PositiveInteger): Self = StObject.set(x, "StartFromRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartFromRowUndefined: Self = StObject.set(x, "StartFromRow", js.undefined)
    
    @scala.inline
    def setTextQualifier(value: TextQualifier): Self = StObject.set(x, "TextQualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextQualifierUndefined: Self = StObject.set(x, "TextQualifier", js.undefined)
  }
}
