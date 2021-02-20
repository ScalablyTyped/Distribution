package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDirectoryLimitsResult extends StObject {
  
  /**
    * A DirectoryLimits object that contains the directory limits for the current rRegion.
    */
  var DirectoryLimits: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryLimits] = js.native
}
object GetDirectoryLimitsResult {
  
  @scala.inline
  def apply(): GetDirectoryLimitsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDirectoryLimitsResult]
  }
  
  @scala.inline
  implicit class GetDirectoryLimitsResultMutableBuilder[Self <: GetDirectoryLimitsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryLimits(value: DirectoryLimits): Self = StObject.set(x, "DirectoryLimits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryLimitsUndefined: Self = StObject.set(x, "DirectoryLimits", js.undefined)
  }
}
