package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDirectoryResult extends StObject {
  
  /**
    * The directory identifier.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.undefined
}
object DeleteDirectoryResult {
  
  inline def apply(): DeleteDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDirectoryResult]
  }
  
  extension [Self <: DeleteDirectoryResult](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
  }
}
