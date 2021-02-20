package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource extends StObject {
  
  /**
    * The path to the Amazon S3 bucket where the data that you want to upload to your dataset is stored. For example:   s3://bucket-name/training-data.csv 
    */
  var dataLocation: js.UndefOr[S3Location] = js.native
}
object DataSource {
  
  @scala.inline
  def apply(): DataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit class DataSourceMutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataLocation(value: S3Location): Self = StObject.set(x, "dataLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLocationUndefined: Self = StObject.set(x, "dataLocation", js.undefined)
  }
}
