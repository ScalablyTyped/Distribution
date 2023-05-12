package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExportsOutput extends StObject {
  
  /**
    * <p>A list of <code>ExportSummary</code> objects.</p>
    */
  var ExportSummaries: js.UndefOr[js.Array[ExportSummary]] = js.undefined
  
  /**
    * <p>If this value is returned, there are additional results to be displayed. To retrieve
    *             them, call <code>ListExports</code> again, with <code>NextToken</code> set to this
    *             value.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListExportsOutput {
  
  inline def apply(): ListExportsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListExportsOutput] (val x: Self) extends AnyVal {
    
    inline def setExportSummaries(value: js.Array[ExportSummary]): Self = StObject.set(x, "ExportSummaries", value.asInstanceOf[js.Any])
    
    inline def setExportSummariesUndefined: Self = StObject.set(x, "ExportSummaries", js.undefined)
    
    inline def setExportSummariesVarargs(value: ExportSummary*): Self = StObject.set(x, "ExportSummaries", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
