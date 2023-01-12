package typings.awsSdk.clientsSwfMod

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
  
  inline def apply(name: DomainName): DeprecateDomainInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecateDomainInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeprecateDomainInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: DomainName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
