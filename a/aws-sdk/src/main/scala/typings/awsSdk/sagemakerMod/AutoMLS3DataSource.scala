package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoMLS3DataSource extends StObject {
  
  /**
    * The data type.
    */
  var S3DataType: AutoMLS3DataType = js.native
  
  /**
    * The URL to the Amazon S3 data source.
    */
  var S3Uri: typings.awsSdk.sagemakerMod.S3Uri = js.native
}
object AutoMLS3DataSource {
  
  @scala.inline
  def apply(S3DataType: AutoMLS3DataType, S3Uri: S3Uri): AutoMLS3DataSource = {
    val __obj = js.Dynamic.literal(S3DataType = S3DataType.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLS3DataSource]
  }
  
  @scala.inline
  implicit class AutoMLS3DataSourceMutableBuilder[Self <: AutoMLS3DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3DataType(value: AutoMLS3DataType): Self = StObject.set(x, "S3DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
