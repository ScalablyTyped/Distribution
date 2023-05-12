package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkArtifactMeta extends StObject {
  
  /**
    * Lists network package overrides.
    */
  var overrides: js.UndefOr[OverrideList] = js.undefined
}
object NetworkArtifactMeta {
  
  inline def apply(): NetworkArtifactMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkArtifactMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkArtifactMeta] (val x: Self) extends AnyVal {
    
    inline def setOverrides(value: OverrideList): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: ToscaOverride*): Self = StObject.set(x, "overrides", js.Array(value*))
  }
}
