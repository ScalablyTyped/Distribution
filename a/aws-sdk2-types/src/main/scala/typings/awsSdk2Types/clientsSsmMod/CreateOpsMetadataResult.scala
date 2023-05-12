package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOpsMetadataResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the OpsMetadata Object or blob created by the call.
    */
  var OpsMetadataArn: js.UndefOr[typings.awsSdk2Types.clientsSsmMod.OpsMetadataArn] = js.undefined
}
object CreateOpsMetadataResult {
  
  inline def apply(): CreateOpsMetadataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOpsMetadataResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateOpsMetadataResult] (val x: Self) extends AnyVal {
    
    inline def setOpsMetadataArn(value: OpsMetadataArn): Self = StObject.set(x, "OpsMetadataArn", value.asInstanceOf[js.Any])
    
    inline def setOpsMetadataArnUndefined: Self = StObject.set(x, "OpsMetadataArn", js.undefined)
  }
}
