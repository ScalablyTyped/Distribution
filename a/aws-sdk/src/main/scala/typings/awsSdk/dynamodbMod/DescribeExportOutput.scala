package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExportOutput extends StObject {
  
  /**
    * Represents the properties of the export.
    */
  var ExportDescription: js.UndefOr[typings.awsSdk.dynamodbMod.ExportDescription] = js.native
}
object DescribeExportOutput {
  
  @scala.inline
  def apply(): DescribeExportOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportOutput]
  }
  
  @scala.inline
  implicit class DescribeExportOutputMutableBuilder[Self <: DescribeExportOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportDescription(value: ExportDescription): Self = StObject.set(x, "ExportDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportDescriptionUndefined: Self = StObject.set(x, "ExportDescription", js.undefined)
  }
}
