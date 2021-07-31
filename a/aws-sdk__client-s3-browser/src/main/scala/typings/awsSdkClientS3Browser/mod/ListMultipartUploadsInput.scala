package typings.awsSdkClientS3Browser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMultipartUploadsInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
object ListMultipartUploadsInput {
  
  @scala.inline
  def apply(Bucket: String): ListMultipartUploadsInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMultipartUploadsInput]
  }
}
