package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainResult extends StObject {
  
  var domain: js.UndefOr[DomainDescription] = js.undefined
}
object DescribeDomainResult {
  
  @scala.inline
  def apply(): DescribeDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainResult]
  }
  
  @scala.inline
  implicit class DescribeDomainResultMutableBuilder[Self <: DescribeDomainResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainDescription): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
  }
}
