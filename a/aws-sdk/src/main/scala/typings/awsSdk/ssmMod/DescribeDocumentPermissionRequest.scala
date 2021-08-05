package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDocumentPermissionRequest extends StObject {
  
  /**
    * The name of the document for which you are the owner.
    */
  var Name: DocumentName
  
  /**
    * The permission type for the document. The permission type can be Share.
    */
  var PermissionType: DocumentPermissionType
}
object DescribeDocumentPermissionRequest {
  
  inline def apply(Name: DocumentName, PermissionType: DocumentPermissionType): DescribeDocumentPermissionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PermissionType = PermissionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDocumentPermissionRequest]
  }
  
  extension [Self <: DescribeDocumentPermissionRequest](x: Self) {
    
    inline def setName(value: DocumentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPermissionType(value: DocumentPermissionType): Self = StObject.set(x, "PermissionType", value.asInstanceOf[js.Any])
  }
}
