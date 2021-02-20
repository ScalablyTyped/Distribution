package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsId3SegmentTaggingScheduleActionSettings extends StObject {
  
  /**
    * ID3 tag to insert into each segment. Supports special keyword identifiers to substitute in segment-related values.\nSupported keyword identifiers: https://docs.aws.amazon.com/medialive/latest/ug/variable-data-identifiers.html
    */
  var Tag: string = js.native
}
object HlsId3SegmentTaggingScheduleActionSettings {
  
  @scala.inline
  def apply(Tag: string): HlsId3SegmentTaggingScheduleActionSettings = {
    val __obj = js.Dynamic.literal(Tag = Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsId3SegmentTaggingScheduleActionSettings]
  }
  
  @scala.inline
  implicit class HlsId3SegmentTaggingScheduleActionSettingsMutableBuilder[Self <: HlsId3SegmentTaggingScheduleActionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag(value: string): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
  }
}
