package typings.awsSdkClientS3Browser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListObjectsV2Input
  extends StObject
     with typings.awsSdkClientS3Browser.typesListObjectsV2InputMod.ListObjectsV2Input
object ListObjectsV2Input {
  
  @scala.inline
  def apply(Bucket: String): ListObjectsV2Input = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectsV2Input]
  }
}
