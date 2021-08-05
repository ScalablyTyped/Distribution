package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectAclInput
  extends StObject
     with typings.awsSdkClientS3Node.typesGetObjectAclInputMod.GetObjectAclInput
object GetObjectAclInput {
  
  inline def apply(Bucket: String, Key: String): GetObjectAclInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectAclInput]
  }
}
