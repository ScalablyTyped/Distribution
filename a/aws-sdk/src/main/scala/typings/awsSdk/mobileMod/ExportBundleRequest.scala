package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportBundleRequest extends StObject {
  
  /**
    *  Unique bundle identifier. 
    */
  var bundleId: BundleId = js.native
  
  /**
    *  Developer desktop or target application platform. 
    */
  var platform: js.UndefOr[Platform] = js.native
  
  /**
    *  Unique project identifier. 
    */
  var projectId: js.UndefOr[ProjectId] = js.native
}
object ExportBundleRequest {
  
  @scala.inline
  def apply(bundleId: BundleId): ExportBundleRequest = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportBundleRequest]
  }
  
  @scala.inline
  implicit class ExportBundleRequestMutableBuilder[Self <: ExportBundleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleId(value: BundleId): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setProjectId(value: ProjectId): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
