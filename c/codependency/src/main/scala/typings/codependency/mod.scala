package typings.codependency

import typings.codependency.anon.Index
import typings.node.NodeModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("codependency", "get")
  @js.native
  def get(middlewareName: String): RequirePeerFunction = js.native
  
  @JSImport("codependency", "register")
  @js.native
  def register(baseModule: NodeModule): RequirePeerFunction = js.native
  @JSImport("codependency", "register")
  @js.native
  def register(baseModule: NodeModule, options: Index): RequirePeerFunction = js.native
  
  @js.native
  trait DependencyInfo extends StObject {
    
    var installedVersion: String | Null = js.native
    
    var isInstalled: Boolean | Null = js.native
    
    var isValid: Boolean | Null = js.native
    
    var pkgPath: String = js.native
    
    var supportedRange: String | Null = js.native
  }
  object DependencyInfo {
    
    @scala.inline
    def apply(pkgPath: String): DependencyInfo = {
      val __obj = js.Dynamic.literal(pkgPath = pkgPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[DependencyInfo]
    }
    
    @scala.inline
    implicit class DependencyInfoMutableBuilder[Self <: DependencyInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstalledVersion(value: String): Self = StObject.set(x, "installedVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstalledVersionNull: Self = StObject.set(x, "installedVersion", null)
      
      @scala.inline
      def setIsInstalled(value: Boolean): Self = StObject.set(x, "isInstalled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInstalledNull: Self = StObject.set(x, "isInstalled", null)
      
      @scala.inline
      def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsValidNull: Self = StObject.set(x, "isValid", null)
      
      @scala.inline
      def setPkgPath(value: String): Self = StObject.set(x, "pkgPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedRange(value: String): Self = StObject.set(x, "supportedRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedRangeNull: Self = StObject.set(x, "supportedRange", null)
    }
  }
  
  @js.native
  trait RequirePeerFunction extends StObject {
    
    def apply(name: String): js.Any = js.native
    def apply(name: String, options: RequirePeerFunctionOptions): js.Any = js.native
    
    def resolve(name: String): DependencyInfo = js.native
  }
  
  @js.native
  trait RequirePeerFunctionOptions extends StObject {
    
    var dontThrow: js.UndefOr[Boolean] = js.native
    
    var optional: js.UndefOr[Boolean] = js.native
  }
  object RequirePeerFunctionOptions {
    
    @scala.inline
    def apply(): RequirePeerFunctionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequirePeerFunctionOptions]
    }
    
    @scala.inline
    implicit class RequirePeerFunctionOptionsMutableBuilder[Self <: RequirePeerFunctionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDontThrow(value: Boolean): Self = StObject.set(x, "dontThrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDontThrowUndefined: Self = StObject.set(x, "dontThrow", js.undefined)
      
      @scala.inline
      def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    }
  }
}
