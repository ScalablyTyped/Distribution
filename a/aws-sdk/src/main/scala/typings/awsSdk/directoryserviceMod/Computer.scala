package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Computer extends StObject {
  
  /**
    * An array of Attribute objects containing the LDAP attributes that belong to the computer account.
    */
  var ComputerAttributes: js.UndefOr[Attributes] = js.native
  
  /**
    * The identifier of the computer.
    */
  var ComputerId: js.UndefOr[SID] = js.native
  
  /**
    * The computer name.
    */
  var ComputerName: js.UndefOr[typings.awsSdk.directoryserviceMod.ComputerName] = js.native
}
object Computer {
  
  @scala.inline
  def apply(): Computer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Computer]
  }
  
  @scala.inline
  implicit class ComputerMutableBuilder[Self <: Computer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputerAttributes(value: Attributes): Self = StObject.set(x, "ComputerAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputerAttributesUndefined: Self = StObject.set(x, "ComputerAttributes", js.undefined)
    
    @scala.inline
    def setComputerAttributesVarargs(value: Attribute*): Self = StObject.set(x, "ComputerAttributes", js.Array(value :_*))
    
    @scala.inline
    def setComputerId(value: SID): Self = StObject.set(x, "ComputerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputerIdUndefined: Self = StObject.set(x, "ComputerId", js.undefined)
    
    @scala.inline
    def setComputerName(value: ComputerName): Self = StObject.set(x, "ComputerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputerNameUndefined: Self = StObject.set(x, "ComputerName", js.undefined)
  }
}
