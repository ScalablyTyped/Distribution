package typings.awsSdkClientS3Browser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObjectVersionsInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesListObjectVersionsInputMod.ListObjectVersionsInput
object ListObjectVersionsInput {
  
  inline def apply(Bucket: String): ListObjectVersionsInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectVersionsInput]
  }
}
