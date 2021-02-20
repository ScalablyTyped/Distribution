package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetContentVersionValue extends StObject {
  
  /**
    * The name of the dataset whose latest contents are used as input to the notebook or application.
    */
  var datasetName: DatasetName = js.native
}
object DatasetContentVersionValue {
  
  @scala.inline
  def apply(datasetName: DatasetName): DatasetContentVersionValue = {
    val __obj = js.Dynamic.literal(datasetName = datasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetContentVersionValue]
  }
  
  @scala.inline
  implicit class DatasetContentVersionValueMutableBuilder[Self <: DatasetContentVersionValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetName(value: DatasetName): Self = StObject.set(x, "datasetName", value.asInstanceOf[js.Any])
  }
}
