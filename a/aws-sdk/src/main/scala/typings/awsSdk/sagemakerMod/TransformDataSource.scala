package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformDataSource extends StObject {
  
  /**
    * The S3 location of the data source that is associated with a channel.
    */
  var S3DataSource: TransformS3DataSource
}
object TransformDataSource {
  
  @scala.inline
  def apply(S3DataSource: TransformS3DataSource): TransformDataSource = {
    val __obj = js.Dynamic.literal(S3DataSource = S3DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformDataSource]
  }
  
  @scala.inline
  implicit class TransformDataSourceMutableBuilder[Self <: TransformDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3DataSource(value: TransformS3DataSource): Self = StObject.set(x, "S3DataSource", value.asInstanceOf[js.Any])
  }
}
