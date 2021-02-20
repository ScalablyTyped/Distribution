package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRaidArraysResult extends StObject {
  
  /**
    * A RaidArrays object that describes the specified RAID arrays.
    */
  var RaidArrays: js.UndefOr[typings.awsSdk.opsworksMod.RaidArrays] = js.native
}
object DescribeRaidArraysResult {
  
  @scala.inline
  def apply(): DescribeRaidArraysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRaidArraysResult]
  }
  
  @scala.inline
  implicit class DescribeRaidArraysResultMutableBuilder[Self <: DescribeRaidArraysResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaidArrays(value: RaidArrays): Self = StObject.set(x, "RaidArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaidArraysUndefined: Self = StObject.set(x, "RaidArrays", js.undefined)
    
    @scala.inline
    def setRaidArraysVarargs(value: RaidArray*): Self = StObject.set(x, "RaidArrays", js.Array(value :_*))
  }
}
