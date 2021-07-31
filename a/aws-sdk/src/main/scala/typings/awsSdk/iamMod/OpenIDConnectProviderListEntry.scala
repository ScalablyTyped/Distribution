package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenIDConnectProviderListEntry extends StObject {
  
  var Arn: js.UndefOr[arnType] = js.undefined
}
object OpenIDConnectProviderListEntry {
  
  @scala.inline
  def apply(): OpenIDConnectProviderListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenIDConnectProviderListEntry]
  }
  
  @scala.inline
  implicit class OpenIDConnectProviderListEntryMutableBuilder[Self <: OpenIDConnectProviderListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
