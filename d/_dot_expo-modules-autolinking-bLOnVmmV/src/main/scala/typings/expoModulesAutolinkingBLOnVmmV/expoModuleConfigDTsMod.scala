package typings.expoModulesAutolinkingBLOnVmmV

import typings.expoModulesAutolinkingBLOnVmmV.typesDTsMod.RawExpoModuleConfig
import typings.expoModulesAutolinkingBLOnVmmV.typesDTsMod.SupportedPlatform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expoModuleConfigDTsMod {
  
  @JSImport(".expo-modules-autolinking-bLOnVmmV/build/ExpoModuleConfig.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".expo-modules-autolinking-bLOnVmmV/build/ExpoModuleConfig.d.ts", "ExpoModuleConfig")
  @js.native
  open class ExpoModuleConfig protected () extends StObject {
    def this(rawConfig: RawExpoModuleConfig) = this()
    
    /**
      * Returns build.gradle file paths defined by the module author.
      */
    def androidGradlePaths(): js.Array[String] = js.native
    
    /**
      * Returns a list of names of Kotlin native modules classes to put to the generated package provider file.
      */
    def androidModules(): js.Array[String] = js.native
    
    /**
      * Returns a list of names of Swift classes that receives AppDelegate life-cycle events.
      */
    def iosAppDelegateSubscribers(): js.Array[String] = js.native
    
    /**
      * Returns whether this module will be added only to the debug configuration
      */
    def iosDebugOnly(): Boolean = js.native
    
    /**
      * Returns a list of names of Swift native modules classes to put to the generated modules provider file.
      */
    def iosModules(): js.Array[String] = js.native
    
    /**
      * Returns podspec paths defined by the module author.
      */
    def iosPodspecPaths(): js.Array[String] = js.native
    
    /**
      * Returns a list of names of Swift classes that implement `ExpoReactDelegateHandler`.
      */
    def iosReactDelegateHandlers(): js.Array[String] = js.native
    
    /**
      * Returns the product module names, if defined by the module author.
      */
    def iosSwiftModuleNames(): js.Array[String] = js.native
    
    val rawConfig: RawExpoModuleConfig = js.native
    
    /**
      * Whether the module supports given platform.
      */
    def supportsPlatform(platform: SupportedPlatform): Boolean = js.native
    
    /**
      * Returns serializable raw config.
      */
    def toJSON(): RawExpoModuleConfig = js.native
  }
  
  inline def requireAndResolveExpoModuleConfig(path: String): ExpoModuleConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("requireAndResolveExpoModuleConfig")(path.asInstanceOf[js.Any]).asInstanceOf[ExpoModuleConfig]
}
