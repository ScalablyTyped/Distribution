package typings.carbonComponentsReact

import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFeatureFlagsMod {
  
  @JSImport("carbon-components-react/lib/components/FeatureFlags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("carbon-components-react/lib/components/FeatureFlags", "FeatureFlagContext")
  @js.native
  val FeatureFlagContext: Context[FeatureFlagScope] = js.native
  
  @JSImport("carbon-components-react/lib/components/FeatureFlags", "FeatureFlagScope")
  @js.native
  open class FeatureFlagScope () extends StObject {
    def this(flags: FeatureFlagRecord) = this()
    
    def add(name: String, enabled: Boolean): Unit = js.native
    
    def checkForFlag(name: String): Unit = js.native
    
    def disable(name: String): Unit = js.native
    
    def enable(name: String): Unit = js.native
    
    def enabled(name: String): Boolean = js.native
    
    def merge(flags: FeatureFlagRecord): Unit = js.native
    
    def mergeWithScope(scope: FeatureFlagScope): Unit = js.native
  }
  
  @JSImport("carbon-components-react/lib/components/FeatureFlags", "FeatureFlags")
  @js.native
  val FeatureFlags: FC[FeatureFlagsProps] = js.native
  
  inline def useFeatureFlag(flag: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useFeatureFlag")(flag.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useFeatureFlags(): FeatureFlagScope = ^.asInstanceOf[js.Dynamic].applyDynamic("useFeatureFlags")().asInstanceOf[FeatureFlagScope]
  
  type FeatureFlagRecord = Record[String, Boolean]
  
  trait FeatureFlagsProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var flags: js.UndefOr[FeatureFlagRecord] = js.undefined
  }
  object FeatureFlagsProps {
    
    inline def apply(): FeatureFlagsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeatureFlagsProps]
    }
    
    extension [Self <: FeatureFlagsProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFlags(value: FeatureFlagRecord): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    }
  }
}
