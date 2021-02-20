package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDirectoryResult extends StObject {
  
  /**
    * The identifier of the directory that was created.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
}
object CreateDirectoryResult {
  
  @scala.inline
  def apply(): CreateDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDirectoryResult]
  }
  
  @scala.inline
  implicit class CreateDirectoryResultMutableBuilder[Self <: CreateDirectoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
  }
}
