package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Replica extends StObject {
  
  /**
    * The Region where the replica needs to be created.
    */
  var RegionName: js.UndefOr[typings.awsSdk.dynamodbMod.RegionName] = js.native
}
object Replica {
  
  @scala.inline
  def apply(): Replica = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Replica]
  }
  
  @scala.inline
  implicit class ReplicaMutableBuilder[Self <: Replica] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
  }
}
