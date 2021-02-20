package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mp4Settings extends StObject {
  
  /**
    * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
    */
  var CslgAtom: js.UndefOr[Mp4CslgAtom] = js.native
  
  /**
    * Ignore this setting unless compliance to the CTTS box version specification matters in your workflow. Specify a value of 1 to set your CTTS box version to 1 and make your output compliant with the specification. When you specify a value of 1, you must also set CSLG atom (cslgAtom) to the value INCLUDE. Keep the default value 0 to set your CTTS box version to 0. This can provide backward compatibility for some players and packagers.
    */
  var CttsVersion: js.UndefOr[integerMin0Max1] = js.native
  
  /**
    * Inserts a free-space box immediately after the moov box.
    */
  var FreeSpaceBox: js.UndefOr[Mp4FreeSpaceBox] = js.native
  
  /**
    * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
    */
  var MoovPlacement: js.UndefOr[Mp4MoovPlacement] = js.native
  
  /**
    * Overrides the "Major Brand" field in the output file. Usually not necessary to specify.
    */
  var Mp4MajorBrand: js.UndefOr[string] = js.native
}
object Mp4Settings {
  
  @scala.inline
  def apply(): Mp4Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mp4Settings]
  }
  
  @scala.inline
  implicit class Mp4SettingsMutableBuilder[Self <: Mp4Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCslgAtom(value: Mp4CslgAtom): Self = StObject.set(x, "CslgAtom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCslgAtomUndefined: Self = StObject.set(x, "CslgAtom", js.undefined)
    
    @scala.inline
    def setCttsVersion(value: integerMin0Max1): Self = StObject.set(x, "CttsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCttsVersionUndefined: Self = StObject.set(x, "CttsVersion", js.undefined)
    
    @scala.inline
    def setFreeSpaceBox(value: Mp4FreeSpaceBox): Self = StObject.set(x, "FreeSpaceBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeSpaceBoxUndefined: Self = StObject.set(x, "FreeSpaceBox", js.undefined)
    
    @scala.inline
    def setMoovPlacement(value: Mp4MoovPlacement): Self = StObject.set(x, "MoovPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoovPlacementUndefined: Self = StObject.set(x, "MoovPlacement", js.undefined)
    
    @scala.inline
    def setMp4MajorBrand(value: string): Self = StObject.set(x, "Mp4MajorBrand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMp4MajorBrandUndefined: Self = StObject.set(x, "Mp4MajorBrand", js.undefined)
  }
}
