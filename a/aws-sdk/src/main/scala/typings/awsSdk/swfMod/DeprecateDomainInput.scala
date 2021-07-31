package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecateDomainInput extends StObject {
  
  /**
    * The name of the domain to deprecate.
    */
  var name: DomainName
}
object DeprecateDomainInput {
  
  @scala.inline
  def apply(name: DomainName): DeprecateDomainInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecateDomainInput]
  }
  
  @scala.inline
  implicit class DeprecateDomainInputMutableBuilder[Self <: DeprecateDomainInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: DomainName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
