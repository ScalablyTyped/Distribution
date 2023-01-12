package typings.codependency

import typings.codependency.anon.Index
import typings.node.NodeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("codependency", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(middlewareName: String): RequirePeerFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(middlewareName.asInstanceOf[js.Any]).asInstanceOf[RequirePeerFunction]
  
  inline def register(baseModule: NodeModule): RequirePeerFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(baseModule.asInstanceOf[js.Any]).asInstanceOf[RequirePeerFunction]
  inline def register(baseModule: NodeModule, options: Index): RequirePeerFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(baseModule.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RequirePeerFunction]
  
  trait DependencyInfo extends StObject {
    
    var installedVersion: String | Null
    
    var isInstalled: Boolean | Null
    
    var isValid: Boolean | Null
    
    var pkgPath: String
    
    var supportedRange: String | Null
  }
  object DependencyInfo {
    
    inline def apply(pkgPath: String): DependencyInfo = {
      val __obj = js.Dynamic.literal(pkgPath = pkgPath.asInstanceOf[js.Any], installedVersion = null, isInstalled = null, isValid = null, supportedRange = null)
      __obj.asInstanceOf[DependencyInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DependencyInfo] (val x: Self) extends AnyVal {
      
      inline def setInstalledVersion(value: String): Self = StObject.set(x, "installedVersion", value.asInstanceOf[js.Any])
      
      inline def setInstalledVersionNull: Self = StObject.set(x, "installedVersion", null)
      
      inline def setIsInstalled(value: Boolean): Self = StObject.set(x, "isInstalled", value.asInstanceOf[js.Any])
      
      inline def setIsInstalledNull: Self = StObject.set(x, "isInstalled", null)
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setIsValidNull: Self = StObject.set(x, "isValid", null)
      
      inline def setPkgPath(value: String): Self = StObject.set(x, "pkgPath", value.asInstanceOf[js.Any])
      
      inline def setSupportedRange(value: String): Self = StObject.set(x, "supportedRange", value.asInstanceOf[js.Any])
      
      inline def setSupportedRangeNull: Self = StObject.set(x, "supportedRange", null)
    }
  }
  
  @js.native
  trait RequirePeerFunction extends StObject {
    
    def apply(name: String): Any = js.native
    def apply(name: String, options: RequirePeerFunctionOptions): Any = js.native
    
    def resolve(name: String): DependencyInfo = js.native
  }
  
  trait RequirePeerFunctionOptions extends StObject {
    
    var dontThrow: js.UndefOr[Boolean] = js.undefined
    
    var optional: js.UndefOr[Boolean] = js.undefined
  }
  object RequirePeerFunctionOptions {
    
    inline def apply(): RequirePeerFunctionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequirePeerFunctionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequirePeerFunctionOptions] (val x: Self) extends AnyVal {
      
      inline def setDontThrow(value: Boolean): Self = StObject.set(x, "dontThrow", value.asInstanceOf[js.Any])
      
      inline def setDontThrowUndefined: Self = StObject.set(x, "dontThrow", js.undefined)
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    }
  }
}
