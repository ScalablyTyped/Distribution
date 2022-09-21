package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetExportJobOutput extends StObject {
  
  var s3DataDestination: S3DataConfig
}
object DatasetExportJobOutput {
  
  inline def apply(s3DataDestination: S3DataConfig): DatasetExportJobOutput = {
    val __obj = js.Dynamic.literal(s3DataDestination = s3DataDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetExportJobOutput]
  }
  
  extension [Self <: DatasetExportJobOutput](x: Self) {
    
    inline def setS3DataDestination(value: S3DataConfig): Self = StObject.set(x, "s3DataDestination", value.asInstanceOf[js.Any])
  }
}
