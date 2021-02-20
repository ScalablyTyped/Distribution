package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelingJobInputConfig extends StObject {
  
  /**
    * Attributes of the data specified by the customer.
    */
  var DataAttributes: js.UndefOr[LabelingJobDataAttributes] = js.native
  
  /**
    * The location of the input data.
    */
  var DataSource: LabelingJobDataSource = js.native
}
object LabelingJobInputConfig {
  
  @scala.inline
  def apply(DataSource: LabelingJobDataSource): LabelingJobInputConfig = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobInputConfig]
  }
  
  @scala.inline
  implicit class LabelingJobInputConfigMutableBuilder[Self <: LabelingJobInputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataAttributes(value: LabelingJobDataAttributes): Self = StObject.set(x, "DataAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAttributesUndefined: Self = StObject.set(x, "DataAttributes", js.undefined)
    
    @scala.inline
    def setDataSource(value: LabelingJobDataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
  }
}
