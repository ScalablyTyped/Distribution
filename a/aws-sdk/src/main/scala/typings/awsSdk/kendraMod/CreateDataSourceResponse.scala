package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDataSourceResponse extends StObject {
  
  /**
    * A unique identifier for the data source.
    */
  var Id: DataSourceId = js.native
}
object CreateDataSourceResponse {
  
  @scala.inline
  def apply(Id: DataSourceId): CreateDataSourceResponse = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceResponse]
  }
  
  @scala.inline
  implicit class CreateDataSourceResponseMutableBuilder[Self <: CreateDataSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: DataSourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
