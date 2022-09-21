package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOpsMetadataResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the OpsMetadata Object or blob created by the call.
    */
  var OpsMetadataArn: js.UndefOr[typings.awsSdk.ssmMod.OpsMetadataArn] = js.undefined
}
object CreateOpsMetadataResult {
  
  inline def apply(): CreateOpsMetadataResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOpsMetadataResult]
  }
  
  extension [Self <: CreateOpsMetadataResult](x: Self) {
    
    inline def setOpsMetadataArn(value: OpsMetadataArn): Self = StObject.set(x, "OpsMetadataArn", value.asInstanceOf[js.Any])
    
    inline def setOpsMetadataArnUndefined: Self = StObject.set(x, "OpsMetadataArn", js.undefined)
  }
}
