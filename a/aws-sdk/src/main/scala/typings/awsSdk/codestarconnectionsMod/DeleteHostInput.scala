package typings.awsSdk.codestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHostInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the host to be deleted.
    */
  var HostArn: typings.awsSdk.codestarconnectionsMod.HostArn
}
object DeleteHostInput {
  
  inline def apply(HostArn: HostArn): DeleteHostInput = {
    val __obj = js.Dynamic.literal(HostArn = HostArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHostInput]
  }
  
  extension [Self <: DeleteHostInput](x: Self) {
    
    inline def setHostArn(value: HostArn): Self = StObject.set(x, "HostArn", value.asInstanceOf[js.Any])
  }
}
