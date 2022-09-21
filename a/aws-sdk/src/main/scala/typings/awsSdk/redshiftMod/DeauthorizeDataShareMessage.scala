package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeauthorizeDataShareMessage extends StObject {
  
  /**
    * The identifier of the data consumer that is to have authorization removed from the datashare. This identifier is an Amazon Web Services account ID or a keyword, such as ADX.
    */
  var ConsumerIdentifier: String
  
  /**
    * The Amazon Resource Name (ARN) of the datashare to remove authorization from.
    */
  var DataShareArn: String
}
object DeauthorizeDataShareMessage {
  
  inline def apply(ConsumerIdentifier: String, DataShareArn: String): DeauthorizeDataShareMessage = {
    val __obj = js.Dynamic.literal(ConsumerIdentifier = ConsumerIdentifier.asInstanceOf[js.Any], DataShareArn = DataShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeauthorizeDataShareMessage]
  }
  
  extension [Self <: DeauthorizeDataShareMessage](x: Self) {
    
    inline def setConsumerIdentifier(value: String): Self = StObject.set(x, "ConsumerIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDataShareArn(value: String): Self = StObject.set(x, "DataShareArn", value.asInstanceOf[js.Any])
  }
}
