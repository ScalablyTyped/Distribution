package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Computer extends StObject {
  
  /**
    * An array of Attribute objects containing the LDAP attributes that belong to the computer account.
    */
  var ComputerAttributes: js.UndefOr[Attributes] = js.undefined
  
  /**
    * The identifier of the computer.
    */
  var ComputerId: js.UndefOr[SID] = js.undefined
  
  /**
    * The computer name.
    */
  var ComputerName: js.UndefOr[typings.awsSdk.directoryserviceMod.ComputerName] = js.undefined
}
object Computer {
  
  inline def apply(): Computer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Computer]
  }
  
  extension [Self <: Computer](x: Self) {
    
    inline def setComputerAttributes(value: Attributes): Self = StObject.set(x, "ComputerAttributes", value.asInstanceOf[js.Any])
    
    inline def setComputerAttributesUndefined: Self = StObject.set(x, "ComputerAttributes", js.undefined)
    
    inline def setComputerAttributesVarargs(value: Attribute*): Self = StObject.set(x, "ComputerAttributes", js.Array(value :_*))
    
    inline def setComputerId(value: SID): Self = StObject.set(x, "ComputerId", value.asInstanceOf[js.Any])
    
    inline def setComputerIdUndefined: Self = StObject.set(x, "ComputerId", js.undefined)
    
    inline def setComputerName(value: ComputerName): Self = StObject.set(x, "ComputerName", value.asInstanceOf[js.Any])
    
    inline def setComputerNameUndefined: Self = StObject.set(x, "ComputerName", js.undefined)
  }
}
