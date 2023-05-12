package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExportsOutput extends StObject {
  
  /**
    * A list of ExportSummary objects.
    */
  var ExportSummaries: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.ExportSummaries] = js.undefined
  
  /**
    * If this value is returned, there are additional results to be displayed. To retrieve them, call ListExports again, with NextToken set to this value.
    */
  var NextToken: js.UndefOr[ExportNextToken] = js.undefined
}
object ListExportsOutput {
  
  inline def apply(): ListExportsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListExportsOutput] (val x: Self) extends AnyVal {
    
    inline def setExportSummaries(value: ExportSummaries): Self = StObject.set(x, "ExportSummaries", value.asInstanceOf[js.Any])
    
    inline def setExportSummariesUndefined: Self = StObject.set(x, "ExportSummaries", js.undefined)
    
    inline def setExportSummariesVarargs(value: ExportSummary*): Self = StObject.set(x, "ExportSummaries", js.Array(value*))
    
    inline def setNextToken(value: ExportNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
