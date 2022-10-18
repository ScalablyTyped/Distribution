package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceIdDetail extends StObject {
  
  /**
    * The ID of a corresponding EC2 instance.
    */
  var Id: js.UndefOr[String] = js.undefined
}
object InstanceIdDetail {
  
  inline def apply(): InstanceIdDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceIdDetail]
  }
  
  extension [Self <: InstanceIdDetail](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
