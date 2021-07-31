package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIndexResponse extends StObject {
  
  /**
    * The ObjectIdentifier of the index created by this operation.
    */
  var ObjectIdentifier: js.UndefOr[typings.awsSdk.clouddirectoryMod.ObjectIdentifier] = js.undefined
}
object CreateIndexResponse {
  
  @scala.inline
  def apply(): CreateIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIndexResponse]
  }
  
  @scala.inline
  implicit class CreateIndexResponseMutableBuilder[Self <: CreateIndexResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectIdentifier(value: ObjectIdentifier): Self = StObject.set(x, "ObjectIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdentifierUndefined: Self = StObject.set(x, "ObjectIdentifier", js.undefined)
  }
}
