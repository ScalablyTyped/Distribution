package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildSuggestersRequest extends StObject {
  
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName
}
object BuildSuggestersRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): BuildSuggestersRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildSuggestersRequest]
  }
  
  @scala.inline
  implicit class BuildSuggestersRequestMutableBuilder[Self <: BuildSuggestersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
