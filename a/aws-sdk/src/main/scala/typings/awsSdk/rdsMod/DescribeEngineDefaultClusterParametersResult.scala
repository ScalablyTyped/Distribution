package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEngineDefaultClusterParametersResult extends StObject {
  
  var EngineDefaults: js.UndefOr[typings.awsSdk.rdsMod.EngineDefaults] = js.native
}
object DescribeEngineDefaultClusterParametersResult {
  
  @scala.inline
  def apply(): DescribeEngineDefaultClusterParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEngineDefaultClusterParametersResult]
  }
  
  @scala.inline
  implicit class DescribeEngineDefaultClusterParametersResultMutableBuilder[Self <: DescribeEngineDefaultClusterParametersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngineDefaults(value: EngineDefaults): Self = StObject.set(x, "EngineDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineDefaultsUndefined: Self = StObject.set(x, "EngineDefaults", js.undefined)
  }
}
