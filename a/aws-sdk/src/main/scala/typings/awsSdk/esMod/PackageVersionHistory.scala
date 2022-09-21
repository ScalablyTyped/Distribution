package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageVersionHistory extends StObject {
  
  /**
    * A message associated with the version.
    */
  var CommitMessage: js.UndefOr[typings.awsSdk.esMod.CommitMessage] = js.undefined
  
  /**
    * Timestamp which tells creation time of the package version.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Version of the package.
    */
  var PackageVersion: js.UndefOr[typings.awsSdk.esMod.PackageVersion] = js.undefined
}
object PackageVersionHistory {
  
  inline def apply(): PackageVersionHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageVersionHistory]
  }
  
  extension [Self <: PackageVersionHistory](x: Self) {
    
    inline def setCommitMessage(value: CommitMessage): Self = StObject.set(x, "CommitMessage", value.asInstanceOf[js.Any])
    
    inline def setCommitMessageUndefined: Self = StObject.set(x, "CommitMessage", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setPackageVersion(value: PackageVersion): Self = StObject.set(x, "PackageVersion", value.asInstanceOf[js.Any])
    
    inline def setPackageVersionUndefined: Self = StObject.set(x, "PackageVersion", js.undefined)
  }
}
