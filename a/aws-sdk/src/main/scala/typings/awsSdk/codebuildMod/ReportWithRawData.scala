package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportWithRawData extends StObject {
  
  /**
    * The value of the requested data field from the report.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the report.
    */
  var reportArn: js.UndefOr[NonEmptyString] = js.undefined
}
object ReportWithRawData {
  
  inline def apply(): ReportWithRawData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportWithRawData]
  }
  
  extension [Self <: ReportWithRawData](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setReportArn(value: NonEmptyString): Self = StObject.set(x, "reportArn", value.asInstanceOf[js.Any])
    
    inline def setReportArnUndefined: Self = StObject.set(x, "reportArn", js.undefined)
  }
}
