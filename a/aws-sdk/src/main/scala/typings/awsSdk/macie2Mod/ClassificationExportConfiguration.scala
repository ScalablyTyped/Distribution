package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassificationExportConfiguration extends StObject {
  
  /**
    * The S3 bucket to store data classification results in, and the encryption settings to use when storing results in that bucket.
    */
  var s3Destination: js.UndefOr[S3Destination] = js.native
}
object ClassificationExportConfiguration {
  
  @scala.inline
  def apply(): ClassificationExportConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationExportConfiguration]
  }
  
  @scala.inline
  implicit class ClassificationExportConfigurationMutableBuilder[Self <: ClassificationExportConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Destination(value: S3Destination): Self = StObject.set(x, "s3Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DestinationUndefined: Self = StObject.set(x, "s3Destination", js.undefined)
  }
}
