package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndeprecateDomainInput extends StObject {
  
  /**
    * The name of the domain of the deprecated workflow type.
    */
  var name: DomainName = js.native
}
object UndeprecateDomainInput {
  
  @scala.inline
  def apply(name: DomainName): UndeprecateDomainInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndeprecateDomainInput]
  }
  
  @scala.inline
  implicit class UndeprecateDomainInputMutableBuilder[Self <: UndeprecateDomainInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: DomainName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
