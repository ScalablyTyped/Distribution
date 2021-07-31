package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessfulPackageVersionInfo extends StObject {
  
  /**
    *  The revision of a package version. 
    */
  var revision: js.UndefOr[String] = js.undefined
  
  /**
    *  The status of a package version. Valid statuses are:     Published     Unfinished     Unlisted     Archived     Disposed   
    */
  var status: js.UndefOr[PackageVersionStatus] = js.undefined
}
object SuccessfulPackageVersionInfo {
  
  @scala.inline
  def apply(): SuccessfulPackageVersionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessfulPackageVersionInfo]
  }
  
  @scala.inline
  implicit class SuccessfulPackageVersionInfoMutableBuilder[Self <: SuccessfulPackageVersionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    @scala.inline
    def setStatus(value: PackageVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
