package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortSet extends StObject {
  
  /**
    * The set of port ranges. 
    */
  var Definition: js.UndefOr[VariableDefinitionList] = js.native
}
object PortSet {
  
  @scala.inline
  def apply(): PortSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortSet]
  }
  
  @scala.inline
  implicit class PortSetMutableBuilder[Self <: PortSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinition(value: VariableDefinitionList): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    @scala.inline
    def setDefinitionVarargs(value: VariableDefinition*): Self = StObject.set(x, "Definition", js.Array(value :_*))
  }
}
