package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDomainResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the created domain.
    */
  var DomainArn: js.UndefOr[typings.awsSdk.sagemakerMod.DomainArn] = js.native
  
  /**
    * The URL to the created domain.
    */
  var Url: js.UndefOr[String1024] = js.native
}
object CreateDomainResponse {
  
  @scala.inline
  def apply(): CreateDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDomainResponse]
  }
  
  @scala.inline
  implicit class CreateDomainResponseMutableBuilder[Self <: CreateDomainResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainArn(value: DomainArn): Self = StObject.set(x, "DomainArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainArnUndefined: Self = StObject.set(x, "DomainArn", js.undefined)
    
    @scala.inline
    def setUrl(value: String1024): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
