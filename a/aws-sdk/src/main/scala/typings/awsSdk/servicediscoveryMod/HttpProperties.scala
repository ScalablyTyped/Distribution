package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpProperties extends StObject {
  
  /**
    * The name of an HTTP namespace.
    */
  var HttpName: js.UndefOr[NamespaceName] = js.native
}
object HttpProperties {
  
  @scala.inline
  def apply(): HttpProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpProperties]
  }
  
  @scala.inline
  implicit class HttpPropertiesMutableBuilder[Self <: HttpProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpName(value: NamespaceName): Self = StObject.set(x, "HttpName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpNameUndefined: Self = StObject.set(x, "HttpName", js.undefined)
  }
}
