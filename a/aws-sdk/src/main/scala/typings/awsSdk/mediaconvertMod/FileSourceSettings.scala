package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSourceSettings extends js.Object {
  /**
    * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
    */
  var Convert608To708: js.UndefOr[FileSourceConvert608To708] = js.native
  /**
    * External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp', 'stl', 'srt', 'xml', and 'smi'.
    */
  var SourceFile: js.UndefOr[
    stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIHttpsSccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMI
  ] = js.native
  /**
    * Specifies a time delta in seconds to offset the captions from the source file.
    */
  var TimeDelta: js.UndefOr[integerMinNegative2147483648Max2147483647] = js.native
}

object FileSourceSettings {
  @scala.inline
  def apply(
    Convert608To708: FileSourceConvert608To708 = null,
    SourceFile: stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMIHttpsSccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTXmlXMLSmiSMI = null,
    TimeDelta: Int | Double = null
  ): FileSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (Convert608To708 != null) __obj.updateDynamic("Convert608To708")(Convert608To708.asInstanceOf[js.Any])
    if (SourceFile != null) __obj.updateDynamic("SourceFile")(SourceFile.asInstanceOf[js.Any])
    if (TimeDelta != null) __obj.updateDynamic("TimeDelta")(TimeDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSourceSettings]
  }
}

