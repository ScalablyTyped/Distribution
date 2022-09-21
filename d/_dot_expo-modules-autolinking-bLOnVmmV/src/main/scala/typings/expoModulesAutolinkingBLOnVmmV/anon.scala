package typings.expoModulesAutolinkingBLOnVmmV

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AppDelegateSubscribers extends StObject {
    
    /**
      * Names of Swift classes that hooks into `ExpoAppDelegate` to receive AppDelegate life-cycle events.
      */
    var appDelegateSubscribers: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether this module will be added only to the debug configuration.
      * Defaults to false.
      */
    var debugOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Names of Swift native modules classes to put to the generated modules provider file.
      */
    var modules: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Names of Swift native modules classes to put to the generated modules provider file.
      * @deprecated Deprecated in favor of `modules`. Might be removed in the future releases.
      */
    var modulesClassNames: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Podspec relative path.
      * To have multiple podspecs, string array type is also supported.
      */
    var podspecPath: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Names of Swift classes that implement `ExpoReactDelegateHandler` to hook React instance creation.
      */
    var reactDelegateHandlers: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Swift product module name. If empty, the pod name is used for Swift imports.
      * To have multiple modules, string array is also supported.
      */
    var swiftModuleName: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object AppDelegateSubscribers {
    
    inline def apply(): AppDelegateSubscribers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppDelegateSubscribers]
    }
    
    extension [Self <: AppDelegateSubscribers](x: Self) {
      
      inline def setAppDelegateSubscribers(value: js.Array[String]): Self = StObject.set(x, "appDelegateSubscribers", value.asInstanceOf[js.Any])
      
      inline def setAppDelegateSubscribersUndefined: Self = StObject.set(x, "appDelegateSubscribers", js.undefined)
      
      inline def setAppDelegateSubscribersVarargs(value: String*): Self = StObject.set(x, "appDelegateSubscribers", js.Array(value*))
      
      inline def setDebugOnly(value: Boolean): Self = StObject.set(x, "debugOnly", value.asInstanceOf[js.Any])
      
      inline def setDebugOnlyUndefined: Self = StObject.set(x, "debugOnly", js.undefined)
      
      inline def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesClassNames(value: js.Array[String]): Self = StObject.set(x, "modulesClassNames", value.asInstanceOf[js.Any])
      
      inline def setModulesClassNamesUndefined: Self = StObject.set(x, "modulesClassNames", js.undefined)
      
      inline def setModulesClassNamesVarargs(value: String*): Self = StObject.set(x, "modulesClassNames", js.Array(value*))
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value*))
      
      inline def setPodspecPath(value: String | js.Array[String]): Self = StObject.set(x, "podspecPath", value.asInstanceOf[js.Any])
      
      inline def setPodspecPathUndefined: Self = StObject.set(x, "podspecPath", js.undefined)
      
      inline def setPodspecPathVarargs(value: String*): Self = StObject.set(x, "podspecPath", js.Array(value*))
      
      inline def setReactDelegateHandlers(value: js.Array[String]): Self = StObject.set(x, "reactDelegateHandlers", value.asInstanceOf[js.Any])
      
      inline def setReactDelegateHandlersUndefined: Self = StObject.set(x, "reactDelegateHandlers", js.undefined)
      
      inline def setReactDelegateHandlersVarargs(value: String*): Self = StObject.set(x, "reactDelegateHandlers", js.Array(value*))
      
      inline def setSwiftModuleName(value: String | js.Array[String]): Self = StObject.set(x, "swiftModuleName", value.asInstanceOf[js.Any])
      
      inline def setSwiftModuleNameUndefined: Self = StObject.set(x, "swiftModuleName", js.undefined)
      
      inline def setSwiftModuleNameVarargs(value: String*): Self = StObject.set(x, "swiftModuleName", js.Array(value*))
    }
  }
  
  trait GradlePath extends StObject {
    
    /**
      * build.gradle relative path.
      * To have multiple build.gradle projects, string array type is also supported.
      */
    var gradlePath: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Full names (package + class name) of Kotlin native modules classes to put to the generated package provider file.
      */
    var modules: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Full names (package + class name) of Kotlin native modules classes to put to the generated package provider file.
      * @deprecated Deprecated in favor of `modules`. Might be removed in the future releases.
      */
    var modulesClassNames: js.UndefOr[js.Array[String]] = js.undefined
  }
  object GradlePath {
    
    inline def apply(): GradlePath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GradlePath]
    }
    
    extension [Self <: GradlePath](x: Self) {
      
      inline def setGradlePath(value: String | js.Array[String]): Self = StObject.set(x, "gradlePath", value.asInstanceOf[js.Any])
      
      inline def setGradlePathUndefined: Self = StObject.set(x, "gradlePath", js.undefined)
      
      inline def setGradlePathVarargs(value: String*): Self = StObject.set(x, "gradlePath", js.Array(value*))
      
      inline def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesClassNames(value: js.Array[String]): Self = StObject.set(x, "modulesClassNames", value.asInstanceOf[js.Any])
      
      inline def setModulesClassNamesUndefined: Self = StObject.set(x, "modulesClassNames", js.undefined)
      
      inline def setModulesClassNamesVarargs(value: String*): Self = StObject.set(x, "modulesClassNames", js.Array(value*))
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value*))
    }
  }
}
