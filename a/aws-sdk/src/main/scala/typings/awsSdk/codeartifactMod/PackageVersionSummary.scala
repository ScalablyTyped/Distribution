package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageVersionSummary extends StObject {
  
  /**
    *  The revision associated with a package version. 
    */
  var revision: js.UndefOr[PackageVersionRevision] = js.undefined
  
  /**
    *  A string that contains the status of the package version. It can be one of the following:     Published     Unfinished     Unlisted     Archived     Disposed   
    */
  var status: PackageVersionStatus
  
  /**
    *  Information about a package version. 
    */
  var version: PackageVersion
}
object PackageVersionSummary {
  
  inline def apply(status: PackageVersionStatus, version: PackageVersion): PackageVersionSummary = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageVersionSummary]
  }
  
  extension [Self <: PackageVersionSummary](x: Self) {
    
    inline def setRevision(value: PackageVersionRevision): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
    
    inline def setStatus(value: PackageVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: PackageVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
