package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRelationalDatabaseLogStreamsRequest extends StObject {
  
  /**
    * The name of your database for which to get log streams.
    */
  var relationalDatabaseName: ResourceName = js.native
}
object GetRelationalDatabaseLogStreamsRequest {
  
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): GetRelationalDatabaseLogStreamsRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseLogStreamsRequest]
  }
  
  @scala.inline
  implicit class GetRelationalDatabaseLogStreamsRequestMutableBuilder[Self <: GetRelationalDatabaseLogStreamsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelationalDatabaseName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseName", value.asInstanceOf[js.Any])
  }
}
