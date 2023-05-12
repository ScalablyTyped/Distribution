package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConsolidatedReportInput extends StObject {
  
  /**
    * The format of the consolidated report. For PDF, Base64String is returned. For JSON, Metrics is returned.
    */
  var Format: ReportFormat
  
  /**
    * Set to true to have shared resources included in the report.
    */
  var IncludeSharedResources: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.IncludeSharedResources] = js.undefined
  
  /**
    * The maximum number of results to return for this request.
    */
  var MaxResults: js.UndefOr[GetConsolidatedReportMaxResults] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
}
object GetConsolidatedReportInput {
  
  inline def apply(Format: ReportFormat): GetConsolidatedReportInput = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConsolidatedReportInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConsolidatedReportInput] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: ReportFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setIncludeSharedResources(value: IncludeSharedResources): Self = StObject.set(x, "IncludeSharedResources", value.asInstanceOf[js.Any])
    
    inline def setIncludeSharedResourcesUndefined: Self = StObject.set(x, "IncludeSharedResources", js.undefined)
    
    inline def setMaxResults(value: GetConsolidatedReportMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
