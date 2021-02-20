package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackKeyPair extends StObject {
  
  /**
    * Key-pair ARN.
    */
  var arn: js.UndefOr[PlaybackKeyPairArn] = js.native
  
  /**
    * Key-pair identifier.
    */
  var fingerprint: js.UndefOr[PlaybackKeyPairFingerprint] = js.native
  
  /**
    * Key-pair name.
    */
  var name: js.UndefOr[PlaybackKeyPairName] = js.native
  
  /**
    * Array of 1-50 maps, each of the form string:string (key:value).
    */
  var tags: js.UndefOr[Tags] = js.native
}
object PlaybackKeyPair {
  
  @scala.inline
  def apply(): PlaybackKeyPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaybackKeyPair]
  }
  
  @scala.inline
  implicit class PlaybackKeyPairMutableBuilder[Self <: PlaybackKeyPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: PlaybackKeyPairArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setFingerprint(value: PlaybackKeyPairFingerprint): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setName(value: PlaybackKeyPairName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
