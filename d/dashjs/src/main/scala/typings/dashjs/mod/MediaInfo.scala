package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dashjs", "MediaInfo")
@js.native
open class MediaInfo () extends StObject {
  
  var KID: Any | Null = js.native
  
  var accessibility: js.Array[Any] | Null = js.native
  
  var audioChannelConfiguration: js.Array[Any] | Null = js.native
  
  var bitrateList: js.Array[Bitrate] = js.native
  
  var codec: String | Null = js.native
  
  var contentProtection: Any | Null = js.native
  
  var id: String | Null = js.native
  
  var index: Double | Null = js.native
  
  var isText: Boolean = js.native
  
  var labels: js.Array[String] = js.native
  
  var lang: String | Null = js.native
  
  var mimeType: String | Null = js.native
  
  var representationCount: Double = js.native
  
  var roles: js.Array[String] | Null = js.native
  
  var streamInfo: StreamInfo | Null = js.native
  
  var `type`: MediaType | Null = js.native
  
  var viewpoint: js.UndefOr[Any | Null] = js.native
}
