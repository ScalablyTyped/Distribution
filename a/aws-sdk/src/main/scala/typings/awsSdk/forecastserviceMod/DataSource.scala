package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource extends StObject {
  
  /**
    * The path to the training data stored in an Amazon Simple Storage Service (Amazon S3) bucket along with the credentials to access the data.
    */
  var S3Config: typings.awsSdk.forecastserviceMod.S3Config = js.native
}
object DataSource {
  
  @scala.inline
  def apply(S3Config: S3Config): DataSource = {
    val __obj = js.Dynamic.literal(S3Config = S3Config.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit class DataSourceMutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Config(value: S3Config): Self = StObject.set(x, "S3Config", value.asInstanceOf[js.Any])
  }
}
