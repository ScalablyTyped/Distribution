package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootRelationalDatabaseRequest extends StObject {
  
  /**
    * The name of your database to reboot.
    */
  var relationalDatabaseName: ResourceName
}
object RebootRelationalDatabaseRequest {
  
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): RebootRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootRelationalDatabaseRequest]
  }
  
  @scala.inline
  implicit class RebootRelationalDatabaseRequestMutableBuilder[Self <: RebootRelationalDatabaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelationalDatabaseName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseName", value.asInstanceOf[js.Any])
  }
}
