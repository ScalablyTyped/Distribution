package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDomainInput extends StObject {
  
  /**
    * The name of the domain to describe.
    */
  var name: DomainName = js.native
}
object DescribeDomainInput {
  
  @scala.inline
  def apply(name: DomainName): DescribeDomainInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainInput]
  }
  
  @scala.inline
  implicit class DescribeDomainInputMutableBuilder[Self <: DescribeDomainInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: DomainName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
