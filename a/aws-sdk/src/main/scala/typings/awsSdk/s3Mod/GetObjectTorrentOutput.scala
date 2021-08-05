package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectTorrentOutput extends StObject {
  
  /**
    * A Bencoded dictionary as defined by the BitTorrent specification
    */
  var Body: js.UndefOr[typings.awsSdk.s3Mod.Body] = js.undefined
  
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.undefined
}
object GetObjectTorrentOutput {
  
  inline def apply(): GetObjectTorrentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectTorrentOutput]
  }
  
  extension [Self <: GetObjectTorrentOutput](x: Self) {
    
    inline def setBody(value: Body): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    inline def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
  }
}
