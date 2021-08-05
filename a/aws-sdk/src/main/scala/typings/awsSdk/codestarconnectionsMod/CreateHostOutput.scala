package typings.awsSdk.codestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHostOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the host to be created.
    */
  var HostArn: js.UndefOr[typings.awsSdk.codestarconnectionsMod.HostArn] = js.undefined
}
object CreateHostOutput {
  
  inline def apply(): CreateHostOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHostOutput]
  }
  
  extension [Self <: CreateHostOutput](x: Self) {
    
    inline def setHostArn(value: HostArn): Self = StObject.set(x, "HostArn", value.asInstanceOf[js.Any])
    
    inline def setHostArnUndefined: Self = StObject.set(x, "HostArn", js.undefined)
  }
}
