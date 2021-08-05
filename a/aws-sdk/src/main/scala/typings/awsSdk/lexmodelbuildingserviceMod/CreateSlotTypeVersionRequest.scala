package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSlotTypeVersionRequest extends StObject {
  
  /**
    * Checksum for the $LATEST version of the slot type that you want to publish. If you specify a checksum and the $LATEST version of the slot type has a different checksum, Amazon Lex returns a PreconditionFailedException exception and doesn't publish the new version. If you don't specify a checksum, Amazon Lex publishes the $LATEST version.
    */
  var checksum: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the slot type that you want to create a new version for. The name is case sensitive. 
    */
  var name: SlotTypeName
}
object CreateSlotTypeVersionRequest {
  
  inline def apply(name: SlotTypeName): CreateSlotTypeVersionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSlotTypeVersionRequest]
  }
  
  extension [Self <: CreateSlotTypeVersionRequest](x: Self) {
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setName(value: SlotTypeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
