package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataValidationMetrics extends StObject {
  
  /**
    * The field-specific model training validation messages.
    */
  var fieldLevelMessages: js.UndefOr[fieldValidationMessageList] = js.native
  
  /**
    * The file-specific model training validation messages.
    */
  var fileLevelMessages: js.UndefOr[fileValidationMessageList] = js.native
}
object DataValidationMetrics {
  
  @scala.inline
  def apply(): DataValidationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataValidationMetrics]
  }
  
  @scala.inline
  implicit class DataValidationMetricsMutableBuilder[Self <: DataValidationMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldLevelMessages(value: fieldValidationMessageList): Self = StObject.set(x, "fieldLevelMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldLevelMessagesUndefined: Self = StObject.set(x, "fieldLevelMessages", js.undefined)
    
    @scala.inline
    def setFieldLevelMessagesVarargs(value: FieldValidationMessage*): Self = StObject.set(x, "fieldLevelMessages", js.Array(value :_*))
    
    @scala.inline
    def setFileLevelMessages(value: fileValidationMessageList): Self = StObject.set(x, "fileLevelMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileLevelMessagesUndefined: Self = StObject.set(x, "fileLevelMessages", js.undefined)
    
    @scala.inline
    def setFileLevelMessagesVarargs(value: FileValidationMessage*): Self = StObject.set(x, "fileLevelMessages", js.Array(value :_*))
  }
}
