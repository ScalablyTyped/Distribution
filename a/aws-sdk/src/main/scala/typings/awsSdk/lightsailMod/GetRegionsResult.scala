package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRegionsResult extends StObject {
  
  /**
    * An array of key-value pairs containing information about your get regions request.
    */
  var regions: js.UndefOr[RegionList] = js.undefined
}
object GetRegionsResult {
  
  @scala.inline
  def apply(): GetRegionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegionsResult]
  }
  
  @scala.inline
  implicit class GetRegionsResultMutableBuilder[Self <: GetRegionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegions(value: RegionList): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: Region*): Self = StObject.set(x, "regions", js.Array(value :_*))
  }
}
