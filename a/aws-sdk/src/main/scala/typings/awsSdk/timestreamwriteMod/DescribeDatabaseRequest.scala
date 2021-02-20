package typings.awsSdk.timestreamwriteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDatabaseRequest extends StObject {
  
  /**
    * The name of the Timestream database.
    */
  var DatabaseName: ResourceName = js.native
}
object DescribeDatabaseRequest {
  
  @scala.inline
  def apply(DatabaseName: ResourceName): DescribeDatabaseRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDatabaseRequest]
  }
  
  @scala.inline
  implicit class DescribeDatabaseRequestMutableBuilder[Self <: DescribeDatabaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: ResourceName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
  }
}
