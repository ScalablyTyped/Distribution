package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailsMap extends StObject {
  
  /**
    * A share resource ARN for a catalog resource shared through AWS Resource Access Manager (AWS RAM).
    */
  var ResourceShare: js.UndefOr[ResourceShareList] = js.native
}
object DetailsMap {
  
  @scala.inline
  def apply(): DetailsMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailsMap]
  }
  
  @scala.inline
  implicit class DetailsMapMutableBuilder[Self <: DetailsMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceShare(value: ResourceShareList): Self = StObject.set(x, "ResourceShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareUndefined: Self = StObject.set(x, "ResourceShare", js.undefined)
    
    @scala.inline
    def setResourceShareVarargs(value: RAMResourceShareArn*): Self = StObject.set(x, "ResourceShare", js.Array(value :_*))
  }
}
