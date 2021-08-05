package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLogSubscriptionRequest extends StObject {
  
  /**
    * Identifier of the directory whose log subscription you want to delete.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
}
object DeleteLogSubscriptionRequest {
  
  inline def apply(DirectoryId: DirectoryId): DeleteLogSubscriptionRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLogSubscriptionRequest]
  }
  
  extension [Self <: DeleteLogSubscriptionRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
  }
}
