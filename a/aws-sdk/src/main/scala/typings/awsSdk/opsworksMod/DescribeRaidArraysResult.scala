package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRaidArraysResult extends StObject {
  
  /**
    * A RaidArrays object that describes the specified RAID arrays.
    */
  var RaidArrays: js.UndefOr[typings.awsSdk.opsworksMod.RaidArrays] = js.undefined
}
object DescribeRaidArraysResult {
  
  inline def apply(): DescribeRaidArraysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRaidArraysResult]
  }
  
  extension [Self <: DescribeRaidArraysResult](x: Self) {
    
    inline def setRaidArrays(value: RaidArrays): Self = StObject.set(x, "RaidArrays", value.asInstanceOf[js.Any])
    
    inline def setRaidArraysUndefined: Self = StObject.set(x, "RaidArrays", js.undefined)
    
    inline def setRaidArraysVarargs(value: RaidArray*): Self = StObject.set(x, "RaidArrays", js.Array(value*))
  }
}
