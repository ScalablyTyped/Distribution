package typings.dashjs.mod

import typings.dashjs.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDVRInfo extends StObject {
  
  var manifestInfo: IManifestInfo = js.native
  
  var range: End = js.native
  
  var time: Double = js.native
}
object IDVRInfo {
  
  @scala.inline
  def apply(manifestInfo: IManifestInfo, range: End, time: Double): IDVRInfo = {
    val __obj = js.Dynamic.literal(manifestInfo = manifestInfo.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDVRInfo]
  }
  
  @scala.inline
  implicit class IDVRInfoMutableBuilder[Self <: IDVRInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManifestInfo(value: IManifestInfo): Self = StObject.set(x, "manifestInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: End): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
