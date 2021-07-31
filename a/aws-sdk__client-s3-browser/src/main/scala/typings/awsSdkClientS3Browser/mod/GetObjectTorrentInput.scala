package typings.awsSdkClientS3Browser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectTorrentInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesGetObjectTorrentInputMod.GetObjectTorrentInput
object GetObjectTorrentInput {
  
  @scala.inline
  def apply(Bucket: String, Key: String): GetObjectTorrentInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectTorrentInput]
  }
}
