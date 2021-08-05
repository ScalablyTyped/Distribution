package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObjectsInput
  extends StObject
     with typings.awsSdkClientS3Node.typesListObjectsInputMod.ListObjectsInput
object ListObjectsInput {
  
  inline def apply(Bucket: String): ListObjectsInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectsInput]
  }
}
