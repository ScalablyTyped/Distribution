package typings.braintreeWeb.modulesHostedFieldsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedFieldsBinPayload extends StObject {
  
  var bin: String
}
object HostedFieldsBinPayload {
  
  inline def apply(bin: String): HostedFieldsBinPayload = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsBinPayload]
  }
  
  extension [Self <: HostedFieldsBinPayload](x: Self) {
    
    inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
  }
}
