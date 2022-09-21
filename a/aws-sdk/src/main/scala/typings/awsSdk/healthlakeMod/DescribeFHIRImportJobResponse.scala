package typings.awsSdk.healthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFHIRImportJobResponse extends StObject {
  
  /**
    * The properties of the Import job request, including the ID, ARN, name, and the status of the job.
    */
  var ImportJobProperties: typings.awsSdk.healthlakeMod.ImportJobProperties
}
object DescribeFHIRImportJobResponse {
  
  inline def apply(ImportJobProperties: ImportJobProperties): DescribeFHIRImportJobResponse = {
    val __obj = js.Dynamic.literal(ImportJobProperties = ImportJobProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFHIRImportJobResponse]
  }
  
  extension [Self <: DescribeFHIRImportJobResponse](x: Self) {
    
    inline def setImportJobProperties(value: ImportJobProperties): Self = StObject.set(x, "ImportJobProperties", value.asInstanceOf[js.Any])
  }
}
