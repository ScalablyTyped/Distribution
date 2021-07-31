package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectInput
  extends StObject
     with typings.awsSdkClientS3Node.typesGetObjectInputMod.GetObjectInput
object GetObjectInput {
  
  @scala.inline
  def apply(Bucket: String, Key: String): GetObjectInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectInput]
  }
}
