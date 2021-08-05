package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLinkAttributesRequest extends StObject {
  
  /**
    * The attributes update structure.
    */
  var AttributeUpdates: LinkAttributeUpdateList
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the updated typed link resides. For more information, see arns or Typed Links.
    */
  var DirectoryArn: Arn
  
  /**
    * Allows a typed link specifier to be accepted as input.
    */
  var TypedLinkSpecifier: typings.awsSdk.clouddirectoryMod.TypedLinkSpecifier
}
object UpdateLinkAttributesRequest {
  
  inline def apply(
    AttributeUpdates: LinkAttributeUpdateList,
    DirectoryArn: Arn,
    TypedLinkSpecifier: TypedLinkSpecifier
  ): UpdateLinkAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates.asInstanceOf[js.Any], DirectoryArn = DirectoryArn.asInstanceOf[js.Any], TypedLinkSpecifier = TypedLinkSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLinkAttributesRequest]
  }
  
  extension [Self <: UpdateLinkAttributesRequest](x: Self) {
    
    inline def setAttributeUpdates(value: LinkAttributeUpdateList): Self = StObject.set(x, "AttributeUpdates", value.asInstanceOf[js.Any])
    
    inline def setAttributeUpdatesVarargs(value: LinkAttributeUpdate*): Self = StObject.set(x, "AttributeUpdates", js.Array(value :_*))
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    inline def setTypedLinkSpecifier(value: TypedLinkSpecifier): Self = StObject.set(x, "TypedLinkSpecifier", value.asInstanceOf[js.Any])
  }
}
