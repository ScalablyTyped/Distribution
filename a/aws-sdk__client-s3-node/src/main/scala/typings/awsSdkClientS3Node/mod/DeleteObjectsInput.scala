package typings.awsSdkClientS3Node.mod

import typings.awsSdkClientS3Node.typesDeleteMod.Delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteObjectsInput
  extends StObject
     with typings.awsSdkClientS3Node.typesDeleteObjectsInputMod.DeleteObjectsInput
object DeleteObjectsInput {
  
  inline def apply(Bucket: String, Delete: Delete): DeleteObjectsInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Delete = Delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectsInput]
  }
}
