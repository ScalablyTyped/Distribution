package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportPlaybackKeyPairResponse extends StObject {
  
  var keyPair: js.UndefOr[PlaybackKeyPair] = js.native
}
object ImportPlaybackKeyPairResponse {
  
  @scala.inline
  def apply(): ImportPlaybackKeyPairResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportPlaybackKeyPairResponse]
  }
  
  @scala.inline
  implicit class ImportPlaybackKeyPairResponseMutableBuilder[Self <: ImportPlaybackKeyPairResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyPair(value: PlaybackKeyPair): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairUndefined: Self = StObject.set(x, "keyPair", js.undefined)
  }
}
