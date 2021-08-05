package typings.awsSdkClientS3Browser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyObjectInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesCopyObjectInputMod.CopyObjectInput
object CopyObjectInput {
  
  inline def apply(Bucket: String, CopySource: String, Key: String): CopyObjectInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyObjectInput]
  }
}
