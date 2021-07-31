package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectInput[StreamType]
  extends StObject
     with typings.awsSdkClientS3Node.typesPutObjectInputMod.PutObjectInput[StreamType]
object PutObjectInput {
  
  @scala.inline
  def apply[StreamType](Bucket: String, Key: String): PutObjectInput[StreamType] = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectInput[StreamType]]
  }
}
