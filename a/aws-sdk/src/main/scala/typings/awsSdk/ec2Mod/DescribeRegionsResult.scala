package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRegionsResult extends StObject {
  
  /**
    * Information about the Regions.
    */
  var Regions: js.UndefOr[RegionList] = js.undefined
}
object DescribeRegionsResult {
  
  @scala.inline
  def apply(): DescribeRegionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRegionsResult]
  }
  
  @scala.inline
  implicit class DescribeRegionsResultMutableBuilder[Self <: DescribeRegionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegions(value: RegionList): Self = StObject.set(x, "Regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "Regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: Region*): Self = StObject.set(x, "Regions", js.Array(value :_*))
  }
}
