package typings.awsSdk.simpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainMetadataRequest extends StObject {
  
  /**
    * The name of the domain for which to display the metadata of.
    */
  var DomainName: String = js.native
}
object DomainMetadataRequest {
  
  @scala.inline
  def apply(DomainName: String): DomainMetadataRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainMetadataRequest]
  }
  
  @scala.inline
  implicit class DomainMetadataRequestMutableBuilder[Self <: DomainMetadataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
