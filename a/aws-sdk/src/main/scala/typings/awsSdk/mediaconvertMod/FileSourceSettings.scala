package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSourceSettings extends StObject {
  
  /**
    * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
    */
  var Convert608To708: js.UndefOr[FileSourceConvert608To708] = js.undefined
  
  /**
    * Ignore this setting unless your input captions format is SCC. To have the service compensate for differing frame rates between your input captions and input video, specify the frame rate of the captions file. Specify this value as a fraction, using the settings Framerate numerator (framerateNumerator) and Framerate denominator (framerateDenominator). For example, you might specify 24 / 1 for 24 fps, 25 / 1 for 25 fps, 24000 / 1001 for 23.976 fps, or 30000 / 1001 for 29.97 fps.
    */
  var Framerate: js.UndefOr[CaptionSourceFramerate] = js.undefined
  
  /**
    * External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp', 'stl', 'srt', 'xml', and 'smi'.
    */
  var SourceFile: js.UndefOr[
    stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIHttpsSccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMI
  ] = js.undefined
  
  /**
    * Specifies a time delta in seconds to offset the captions from the source file.
    */
  var TimeDelta: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.undefined
}
object FileSourceSettings {
  
  @scala.inline
  def apply(): FileSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSourceSettings]
  }
  
  @scala.inline
  implicit class FileSourceSettingsMutableBuilder[Self <: FileSourceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConvert608To708(value: FileSourceConvert608To708): Self = StObject.set(x, "Convert608To708", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvert608To708Undefined: Self = StObject.set(x, "Convert608To708", js.undefined)
    
    @scala.inline
    def setFramerate(value: CaptionSourceFramerate): Self = StObject.set(x, "Framerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateUndefined: Self = StObject.set(x, "Framerate", js.undefined)
    
    @scala.inline
    def setSourceFile(
      value: stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIHttpsSccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMI
    ): Self = StObject.set(x, "SourceFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFileUndefined: Self = StObject.set(x, "SourceFile", js.undefined)
    
    @scala.inline
    def setTimeDelta(value: integerMinNegative2147483648Max2147483647): Self = StObject.set(x, "TimeDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeDeltaUndefined: Self = StObject.set(x, "TimeDelta", js.undefined)
  }
}
