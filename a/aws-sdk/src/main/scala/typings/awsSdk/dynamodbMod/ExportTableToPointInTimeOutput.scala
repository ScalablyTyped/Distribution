package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportTableToPointInTimeOutput extends StObject {
  
  /**
    * Contains a description of the table export.
    */
  var ExportDescription: js.UndefOr[typings.awsSdk.dynamodbMod.ExportDescription] = js.native
}
object ExportTableToPointInTimeOutput {
  
  @scala.inline
  def apply(): ExportTableToPointInTimeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTableToPointInTimeOutput]
  }
  
  @scala.inline
  implicit class ExportTableToPointInTimeOutputMutableBuilder[Self <: ExportTableToPointInTimeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportDescription(value: ExportDescription): Self = StObject.set(x, "ExportDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportDescriptionUndefined: Self = StObject.set(x, "ExportDescription", js.undefined)
  }
}
