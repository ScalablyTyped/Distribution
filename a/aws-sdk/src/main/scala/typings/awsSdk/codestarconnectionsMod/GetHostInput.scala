package typings.awsSdk.codestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHostInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the requested host.
    */
  var HostArn: typings.awsSdk.codestarconnectionsMod.HostArn
}
object GetHostInput {
  
  inline def apply(HostArn: HostArn): GetHostInput = {
    val __obj = js.Dynamic.literal(HostArn = HostArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostInput]
  }
  
  extension [Self <: GetHostInput](x: Self) {
    
    inline def setHostArn(value: HostArn): Self = StObject.set(x, "HostArn", value.asInstanceOf[js.Any])
  }
}
