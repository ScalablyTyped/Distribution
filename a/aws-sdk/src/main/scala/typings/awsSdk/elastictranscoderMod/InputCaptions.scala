package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputCaptions extends StObject {
  
  /**
    * Source files for the input sidecar captions used during the transcoding process. To omit all sidecar captions, leave CaptionSources blank.
    */
  var CaptionSources: js.UndefOr[typings.awsSdk.elastictranscoderMod.CaptionSources] = js.undefined
  
  /**
    * A policy that determines how Elastic Transcoder handles the existence of multiple captions.    MergeOverride: Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the sidecar captions and ignores the embedded captions for that language.    MergeRetain: Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the embedded captions and ignores the sidecar captions for that language. If CaptionSources is empty, Elastic Transcoder omits all sidecar captions from the output files.    Override: Elastic Transcoder transcodes only the sidecar captions that you specify in CaptionSources.    MergePolicy cannot be null.
    */
  var MergePolicy: js.UndefOr[CaptionMergePolicy] = js.undefined
}
object InputCaptions {
  
  inline def apply(): InputCaptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputCaptions]
  }
  
  extension [Self <: InputCaptions](x: Self) {
    
    inline def setCaptionSources(value: CaptionSources): Self = StObject.set(x, "CaptionSources", value.asInstanceOf[js.Any])
    
    inline def setCaptionSourcesUndefined: Self = StObject.set(x, "CaptionSources", js.undefined)
    
    inline def setCaptionSourcesVarargs(value: CaptionSource*): Self = StObject.set(x, "CaptionSources", js.Array(value :_*))
    
    inline def setMergePolicy(value: CaptionMergePolicy): Self = StObject.set(x, "MergePolicy", value.asInstanceOf[js.Any])
    
    inline def setMergePolicyUndefined: Self = StObject.set(x, "MergePolicy", js.undefined)
  }
}
