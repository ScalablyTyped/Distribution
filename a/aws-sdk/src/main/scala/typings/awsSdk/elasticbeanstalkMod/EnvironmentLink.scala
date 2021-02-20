package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentLink extends StObject {
  
  /**
    * The name of the linked environment (the dependency).
    */
  var EnvironmentName: js.UndefOr[String] = js.native
  
  /**
    * The name of the link.
    */
  var LinkName: js.UndefOr[String] = js.native
}
object EnvironmentLink {
  
  @scala.inline
  def apply(): EnvironmentLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentLink]
  }
  
  @scala.inline
  implicit class EnvironmentLinkMutableBuilder[Self <: EnvironmentLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentName(value: String): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    @scala.inline
    def setLinkName(value: String): Self = StObject.set(x, "LinkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkNameUndefined: Self = StObject.set(x, "LinkName", js.undefined)
  }
}
