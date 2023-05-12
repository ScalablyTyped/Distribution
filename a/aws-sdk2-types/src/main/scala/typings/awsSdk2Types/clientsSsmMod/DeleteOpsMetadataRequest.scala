package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOpsMetadataRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an OpsMetadata Object to delete.
    */
  var OpsMetadataArn: typings.awsSdk2Types.clientsSsmMod.OpsMetadataArn
}
object DeleteOpsMetadataRequest {
  
  inline def apply(OpsMetadataArn: OpsMetadataArn): DeleteOpsMetadataRequest = {
    val __obj = js.Dynamic.literal(OpsMetadataArn = OpsMetadataArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOpsMetadataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteOpsMetadataRequest] (val x: Self) extends AnyVal {
    
    inline def setOpsMetadataArn(value: OpsMetadataArn): Self = StObject.set(x, "OpsMetadataArn", value.asInstanceOf[js.Any])
  }
}
