package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcceptSharedDirectoryResult extends StObject {
  
  /**
    * The shared directory in the directory consumer account.
    */
  var SharedDirectory: js.UndefOr[typings.awsSdk.directoryserviceMod.SharedDirectory] = js.native
}
object AcceptSharedDirectoryResult {
  
  @scala.inline
  def apply(): AcceptSharedDirectoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptSharedDirectoryResult]
  }
  
  @scala.inline
  implicit class AcceptSharedDirectoryResultMutableBuilder[Self <: AcceptSharedDirectoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSharedDirectory(value: SharedDirectory): Self = StObject.set(x, "SharedDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedDirectoryUndefined: Self = StObject.set(x, "SharedDirectory", js.undefined)
  }
}
