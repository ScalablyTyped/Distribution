package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateObjectResponse extends StObject {
  
  /**
    * The identifier that is associated with the object.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.native
}
object CreateObjectResponse {
  
  @scala.inline
  def apply(): CreateObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateObjectResponse]
  }
  
  @scala.inline
  implicit class CreateObjectResponseMutableBuilder[Self <: CreateObjectResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdentifierUndefined: Self = StObject.set(x, "ObjectIdentifier", js.undefined)
  }
}
