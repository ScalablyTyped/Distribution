package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDefaultClusterParametersResult extends StObject {
  
  var DefaultClusterParameters: js.UndefOr[typings.awsSdk.redshiftMod.DefaultClusterParameters] = js.native
}
object DescribeDefaultClusterParametersResult {
  
  @scala.inline
  def apply(): DescribeDefaultClusterParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDefaultClusterParametersResult]
  }
  
  @scala.inline
  implicit class DescribeDefaultClusterParametersResultMutableBuilder[Self <: DescribeDefaultClusterParametersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultClusterParameters(value: DefaultClusterParameters): Self = StObject.set(x, "DefaultClusterParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultClusterParametersUndefined: Self = StObject.set(x, "DefaultClusterParameters", js.undefined)
  }
}
