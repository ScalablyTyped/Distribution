package typings.depcheck

import typings.depcheck.mod.PackageDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dependencies extends StObject {
    
    var dependencies: js.UndefOr[PackageDependencies] = js.native
    
    var devDependencies: js.UndefOr[PackageDependencies] = js.native
    
    var optionalDependencies: js.UndefOr[PackageDependencies] = js.native
    
    var peerDependencies: js.UndefOr[PackageDependencies] = js.native
  }
  object Dependencies {
    
    @scala.inline
    def apply(): Dependencies = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dependencies]
    }
    
    @scala.inline
    implicit class DependenciesMutableBuilder[Self <: Dependencies] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependencies(value: PackageDependencies): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDevDependencies(value: PackageDependencies): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      @scala.inline
      def setOptionalDependencies(value: PackageDependencies): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalDependenciesUndefined: Self = StObject.set(x, "optionalDependencies", js.undefined)
      
      @scala.inline
      def setPeerDependencies(value: PackageDependencies): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
    }
  }
}
