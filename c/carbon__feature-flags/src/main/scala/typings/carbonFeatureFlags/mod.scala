package typings.carbonFeatureFlags

import typings.carbonFeatureFlags.anon.PartialRecordFeatureFlagN
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@carbon/feature-flags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@carbon/feature-flags", "FeatureFlagScope")
  @js.native
  open class FeatureFlagScope () extends StObject {
    def this(flags: FeatureFlags) = this()
    
    def add(name: String, enabled: Boolean): Unit = js.native
    @JSName("add")
    var add_Original: js.Function2[/* name */ String, /* enabled */ Boolean, Unit] = js.native
    
    def checkForFlag(name: String): Unit = js.native
    
    def disable(name: String): Unit = js.native
    @JSName("disable")
    var disable_Original: js.Function1[/* name */ String, Unit] = js.native
    
    def enable(name: String): Unit = js.native
    @JSName("enable")
    var enable_Original: js.Function1[/* name */ String, Unit] = js.native
    
    def enabled(name: String): Boolean = js.native
    @JSName("enabled")
    var enabled_Original: js.Function1[/* name */ String, Boolean] = js.native
    
    var flags: Map[FeatureFlagName, Boolean] = js.native
    
    def merge(flags: FeatureFlags): Unit = js.native
    
    def mergeWithScope(scope: this.type): Unit = js.native
    
    @JSName("merge")
    var merge_Original: js.Function1[/* flags */ FeatureFlags, Unit] = js.native
  }
  
  inline def add(name: String, enabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(name.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createScope(): FeatureFlagScope = ^.asInstanceOf[js.Dynamic].applyDynamic("createScope")().asInstanceOf[FeatureFlagScope]
  inline def createScope(flags: FeatureFlags): FeatureFlagScope = ^.asInstanceOf[js.Dynamic].applyDynamic("createScope")(flags.asInstanceOf[js.Any]).asInstanceOf[FeatureFlagScope]
  
  inline def disable(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enable(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def enabled(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def merge(flags: FeatureFlags): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(flags.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonFeatureFlags.carbonFeatureFlagsStrings.`enable-css-custom-properties`
    - typings.carbonFeatureFlags.carbonFeatureFlagsStrings.`enable-use-controlled-state-with-value`
    - typings.carbonFeatureFlags.carbonFeatureFlagsStrings.`enable-css-grid`
    - typings.carbonFeatureFlags.carbonFeatureFlagsStrings.`enable-v11-release`
  */
  trait FeatureFlagName extends StObject
  object FeatureFlagName {
    
    inline def `enable-css-custom-properties`: typings.carbonFeatureFlags.carbonFeatureFlagsStrings.`enable-css-custom-properties` = "enable-css-custom-properties".asInstanceOf[typings.carbonFeatureFlags.carbonFeatureFlagsStrings.`enable-css-custom-properties`]
    
    inline def `enable-css-grid`: typings.carbonFeatureFlags.carbonFeatureFlagsStrings.`enable-css-grid` = "enable-css-grid".asInstanceOf[typings.carbonFeatureFlags.carbonFeatureFlagsStrings.`enable-css-grid`]
    
    inline def `enable-use-controlled-state-with-value`: typings.carbonFeatureFlags.carbonFeatureFlagsStrings.`enable-use-controlled-state-with-value` = "enable-use-controlled-state-with-value".asInstanceOf[typings.carbonFeatureFlags.carbonFeatureFlagsStrings.`enable-use-controlled-state-with-value`]
    
    inline def `enable-v11-release`: typings.carbonFeatureFlags.carbonFeatureFlagsStrings.`enable-v11-release` = "enable-v11-release".asInstanceOf[typings.carbonFeatureFlags.carbonFeatureFlagsStrings.`enable-v11-release`]
  }
  
  type FeatureFlags = PartialRecordFeatureFlagN | (Record[String, Boolean])
}
