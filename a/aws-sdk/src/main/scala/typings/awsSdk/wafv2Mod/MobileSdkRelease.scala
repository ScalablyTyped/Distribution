package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileSdkRelease extends StObject {
  
  /**
    * Notes describing the release.
    */
  var ReleaseNotes: js.UndefOr[typings.awsSdk.wafv2Mod.ReleaseNotes] = js.undefined
  
  /**
    * The release version. 
    */
  var ReleaseVersion: js.UndefOr[VersionKeyString] = js.undefined
  
  /**
    * Tags that are associated with the release. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The timestamp of the release. 
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
}
object MobileSdkRelease {
  
  inline def apply(): MobileSdkRelease = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileSdkRelease]
  }
  
  extension [Self <: MobileSdkRelease](x: Self) {
    
    inline def setReleaseNotes(value: ReleaseNotes): Self = StObject.set(x, "ReleaseNotes", value.asInstanceOf[js.Any])
    
    inline def setReleaseNotesUndefined: Self = StObject.set(x, "ReleaseNotes", js.undefined)
    
    inline def setReleaseVersion(value: VersionKeyString): Self = StObject.set(x, "ReleaseVersion", value.asInstanceOf[js.Any])
    
    inline def setReleaseVersionUndefined: Self = StObject.set(x, "ReleaseVersion", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
