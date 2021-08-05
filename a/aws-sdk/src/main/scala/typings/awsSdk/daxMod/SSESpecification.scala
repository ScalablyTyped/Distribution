package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSESpecification extends StObject {
  
  /**
    * Indicates whether server-side encryption is enabled (true) or disabled (false) on the cluster.
    */
  var Enabled: SSEEnabled
}
object SSESpecification {
  
  inline def apply(Enabled: SSEEnabled): SSESpecification = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSESpecification]
  }
  
  extension [Self <: SSESpecification](x: Self) {
    
    inline def setEnabled(value: SSEEnabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
