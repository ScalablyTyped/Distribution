package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationVersionDescriptionsMessage extends StObject {
  
  /**
    * List of ApplicationVersionDescription objects sorted in order of creation.
    */
  var ApplicationVersions: js.UndefOr[ApplicationVersionDescriptionList] = js.native
  
  /**
    * In a paginated request, the token that you can pass in a subsequent request to get the next response page.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ApplicationVersionDescriptionsMessage {
  
  @scala.inline
  def apply(): ApplicationVersionDescriptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationVersionDescriptionsMessage]
  }
  
  @scala.inline
  implicit class ApplicationVersionDescriptionsMessageMutableBuilder[Self <: ApplicationVersionDescriptionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationVersions(value: ApplicationVersionDescriptionList): Self = StObject.set(x, "ApplicationVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionsUndefined: Self = StObject.set(x, "ApplicationVersions", js.undefined)
    
    @scala.inline
    def setApplicationVersionsVarargs(value: ApplicationVersionDescription*): Self = StObject.set(x, "ApplicationVersions", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
