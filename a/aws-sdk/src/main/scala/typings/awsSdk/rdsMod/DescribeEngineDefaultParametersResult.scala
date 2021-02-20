package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEngineDefaultParametersResult extends StObject {
  
  var EngineDefaults: js.UndefOr[typings.awsSdk.rdsMod.EngineDefaults] = js.native
}
object DescribeEngineDefaultParametersResult {
  
  @scala.inline
  def apply(): DescribeEngineDefaultParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEngineDefaultParametersResult]
  }
  
  @scala.inline
  implicit class DescribeEngineDefaultParametersResultMutableBuilder[Self <: DescribeEngineDefaultParametersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEngineDefaults(value: EngineDefaults): Self = StObject.set(x, "EngineDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineDefaultsUndefined: Self = StObject.set(x, "EngineDefaults", js.undefined)
  }
}
