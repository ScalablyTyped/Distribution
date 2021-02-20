package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaybackKeyPairSummary extends StObject {
  
  /**
    * Key-pair ARN.
    */
  var arn: js.UndefOr[PlaybackKeyPairArn] = js.native
  
  /**
    * Key-pair name.
    */
  var name: js.UndefOr[PlaybackKeyPairName] = js.native
  
  /**
    * Array of 1-50 maps, each of the form string:string (key:value) 
    */
  var tags: js.UndefOr[Tags] = js.native
}
object PlaybackKeyPairSummary {
  
  @scala.inline
  def apply(): PlaybackKeyPairSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaybackKeyPairSummary]
  }
  
  @scala.inline
  implicit class PlaybackKeyPairSummaryMutableBuilder[Self <: PlaybackKeyPairSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: PlaybackKeyPairArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
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
