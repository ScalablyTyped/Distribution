package typings.dashjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dashjs", "TextTrackInfo")
@js.native
open class TextTrackInfo () extends MediaInfo {
  
  var captionData: js.Array[CaptionData] | Null = js.native
  
  var defaultTrack: Boolean = js.native
  
  var isEmbedded: Boolean = js.native
  
  var isFragmented: Boolean = js.native
  
  var isTTML: Boolean = js.native
  
  var kind: String = js.native
  
  var label: String | Null = js.native
}
