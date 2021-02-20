package typings.awsSdk.mobileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBundleResult extends StObject {
  
  /**
    *  The details of the bundle. 
    */
  var details: js.UndefOr[BundleDetails] = js.native
}
object DescribeBundleResult {
  
  @scala.inline
  def apply(): DescribeBundleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBundleResult]
  }
  
  @scala.inline
  implicit class DescribeBundleResultMutableBuilder[Self <: DescribeBundleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: BundleDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
