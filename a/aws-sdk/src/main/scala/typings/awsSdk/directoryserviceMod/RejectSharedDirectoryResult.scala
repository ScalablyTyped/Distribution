package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectSharedDirectoryResult extends StObject {
  
  /**
    * Identifier of the shared directory in the directory consumer account.
    */
  var SharedDirectoryId: js.UndefOr[DirectoryId] = js.undefined
}
object RejectSharedDirectoryResult {
  
  inline def apply(): RejectSharedDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectSharedDirectoryResult]
  }
  
  extension [Self <: RejectSharedDirectoryResult](x: Self) {
    
    inline def setSharedDirectoryId(value: DirectoryId): Self = StObject.set(x, "SharedDirectoryId", value.asInstanceOf[js.Any])
    
    inline def setSharedDirectoryIdUndefined: Self = StObject.set(x, "SharedDirectoryId", js.undefined)
  }
}
