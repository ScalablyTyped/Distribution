package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportPlaybackKeyPairResponse extends StObject {
  
  var keyPair: js.UndefOr[PlaybackKeyPair] = js.undefined
}
object ImportPlaybackKeyPairResponse {
  
  inline def apply(): ImportPlaybackKeyPairResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportPlaybackKeyPairResponse]
  }
  
  extension [Self <: ImportPlaybackKeyPairResponse](x: Self) {
    
    inline def setKeyPair(value: PlaybackKeyPair): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
    
    inline def setKeyPairUndefined: Self = StObject.set(x, "keyPair", js.undefined)
  }
}
