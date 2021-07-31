package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioNormalizationSettings extends StObject {
  
  /**
    * Audio normalization algorithm to use. itu17701 conforms to the CALM Act specification, itu17702 conforms to the EBU R-128 specification.
    */
  var Algorithm: js.UndefOr[AudioNormalizationAlgorithm] = js.undefined
  
  /**
    * When set to correctAudio the output audio is corrected using the chosen algorithm. If set to measureOnly, the audio will be measured but not adjusted.
    */
  var AlgorithmControl: js.UndefOr[AudioNormalizationAlgorithmControl] = js.undefined
  
  /**
    * Target LKFS(loudness) to adjust volume to. If no value is entered, a default value will be used according to the chosen algorithm.  The CALM Act (1770-1) recommends a target of -24 LKFS. The EBU R-128 specification (1770-2) recommends a target of -23 LKFS.
    */
  var TargetLkfs: js.UndefOr[doubleMinNegative59Max0] = js.undefined
}
object AudioNormalizationSettings {
  
  @scala.inline
  def apply(): AudioNormalizationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioNormalizationSettings]
  }
  
  @scala.inline
  implicit class AudioNormalizationSettingsMutableBuilder[Self <: AudioNormalizationSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: AudioNormalizationAlgorithm): Self = StObject.set(x, "Algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmControl(value: AudioNormalizationAlgorithmControl): Self = StObject.set(x, "AlgorithmControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmControlUndefined: Self = StObject.set(x, "AlgorithmControl", js.undefined)
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "Algorithm", js.undefined)
    
    @scala.inline
    def setTargetLkfs(value: doubleMinNegative59Max0): Self = StObject.set(x, "TargetLkfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetLkfsUndefined: Self = StObject.set(x, "TargetLkfs", js.undefined)
  }
}
