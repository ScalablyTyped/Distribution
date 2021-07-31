package typings.awsSdkClientS3Node.mod

import typings.awsSdkClientS3Node.typesTaggingMod.Tagging
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectTaggingInput
  extends StObject
     with typings.awsSdkClientS3Node.typesPutObjectTaggingInputMod.PutObjectTaggingInput
object PutObjectTaggingInput {
  
  @scala.inline
  def apply(Bucket: String, Key: String, Tagging: Tagging): PutObjectTaggingInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], Tagging = Tagging.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectTaggingInput]
  }
}
