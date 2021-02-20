package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainInfo extends StObject {
  
  /**
    *  Specifies the DomainName.
    */
  var DomainName: js.UndefOr[typings.awsSdk.esMod.DomainName] = js.native
}
object DomainInfo {
  
  @scala.inline
  def apply(): DomainInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainInfo]
  }
  
  @scala.inline
  implicit class DomainInfoMutableBuilder[Self <: DomainInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
  }
}
