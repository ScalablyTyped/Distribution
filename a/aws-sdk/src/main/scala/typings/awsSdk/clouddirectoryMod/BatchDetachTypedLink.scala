package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDetachTypedLink extends StObject {
  
  /**
    * Used to accept a typed link specifier as input.
    */
  var TypedLinkSpecifier: typings.awsSdk.clouddirectoryMod.TypedLinkSpecifier = js.native
}
object BatchDetachTypedLink {
  
  @scala.inline
  def apply(TypedLinkSpecifier: TypedLinkSpecifier): BatchDetachTypedLink = {
    val __obj = js.Dynamic.literal(TypedLinkSpecifier = TypedLinkSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDetachTypedLink]
  }
  
  @scala.inline
  implicit class BatchDetachTypedLinkMutableBuilder[Self <: BatchDetachTypedLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypedLinkSpecifier(value: TypedLinkSpecifier): Self = StObject.set(x, "TypedLinkSpecifier", value.asInstanceOf[js.Any])
  }
}
