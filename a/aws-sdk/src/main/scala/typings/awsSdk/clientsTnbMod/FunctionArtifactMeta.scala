package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionArtifactMeta extends StObject {
  
  /**
    * Lists of function package overrides.
    */
  var overrides: js.UndefOr[OverrideList] = js.undefined
}
object FunctionArtifactMeta {
  
  inline def apply(): FunctionArtifactMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionArtifactMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionArtifactMeta] (val x: Self) extends AnyVal {
    
    inline def setOverrides(value: OverrideList): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: ToscaOverride*): Self = StObject.set(x, "overrides", js.Array(value*))
  }
}
