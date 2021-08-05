package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectAclInput
  extends StObject
     with typings.awsSdkClientS3Node.typesPutObjectAclInputMod.PutObjectAclInput
object PutObjectAclInput {
  
  inline def apply(Bucket: String, Key: String): PutObjectAclInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectAclInput]
  }
}
