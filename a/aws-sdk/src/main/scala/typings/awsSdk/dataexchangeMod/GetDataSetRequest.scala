package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDataSetRequest extends StObject {
  
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: string = js.native
}
object GetDataSetRequest {
  
  @scala.inline
  def apply(DataSetId: string): GetDataSetRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataSetRequest]
  }
  
  @scala.inline
  implicit class GetDataSetRequestMutableBuilder[Self <: GetDataSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSetId(value: string): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
  }
}
