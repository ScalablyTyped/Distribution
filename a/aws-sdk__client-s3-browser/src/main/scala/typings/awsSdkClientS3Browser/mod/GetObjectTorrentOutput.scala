package typings.awsSdkClientS3Browser.mod

import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectTorrentOutput[StreamType]
  extends StObject
     with typings.awsSdkClientS3Browser.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput[StreamType]
object GetObjectTorrentOutput {
  
  @scala.inline
  def apply[StreamType]($metadata: ResponseMetadata): GetObjectTorrentOutput[StreamType] = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectTorrentOutput[StreamType]]
  }
}
