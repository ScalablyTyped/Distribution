package typings.dashjs.mod

import typings.dashjs.dashjsStrings.audio
import typings.dashjs.dashjsStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dashjs", "BitrateInfo")
@js.native
class BitrateInfo () extends js.Object {
  
  var bitrate: Double = js.native
  
  var height: Double = js.native
  
  var mediaType: video | audio = js.native
  
  var qualityIndex: Double = js.native
  
  var scanType: String = js.native
  
  var width: Double = js.native
}
