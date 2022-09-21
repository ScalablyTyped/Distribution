package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchSegmentJobInput extends StObject {
  
  var s3DataSource: S3DataConfig
}
object BatchSegmentJobInput {
  
  inline def apply(s3DataSource: S3DataConfig): BatchSegmentJobInput = {
    val __obj = js.Dynamic.literal(s3DataSource = s3DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchSegmentJobInput]
  }
  
  extension [Self <: BatchSegmentJobInput](x: Self) {
    
    inline def setS3DataSource(value: S3DataConfig): Self = StObject.set(x, "s3DataSource", value.asInstanceOf[js.Any])
  }
}
