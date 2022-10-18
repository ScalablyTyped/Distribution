package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainInput extends StObject {
  
  /**
    * The name of the domain to describe.
    */
  var name: DomainName
}
object DescribeDomainInput {
  
  inline def apply(name: DomainName): DescribeDomainInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainInput]
  }
  
  extension [Self <: DescribeDomainInput](x: Self) {
    
    inline def setName(value: DomainName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
