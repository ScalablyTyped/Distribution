package typings.depcheck

import typings.depcheck.mod.PackageDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dependencies extends StObject {
    
    var dependencies: js.UndefOr[PackageDependencies] = js.undefined
    
    var devDependencies: js.UndefOr[PackageDependencies] = js.undefined
    
    var optionalDependencies: js.UndefOr[PackageDependencies] = js.undefined
    
    var peerDependencies: js.UndefOr[PackageDependencies] = js.undefined
  }
  object Dependencies {
    
    inline def apply(): Dependencies = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dependencies]
    }
    
    extension [Self <: Dependencies](x: Self) {
      
      inline def setDependencies(value: PackageDependencies): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDevDependencies(value: PackageDependencies): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      inline def setOptionalDependencies(value: PackageDependencies): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
      
      inline def setOptionalDependenciesUndefined: Self = StObject.set(x, "optionalDependencies", js.undefined)
      
      inline def setPeerDependencies(value: PackageDependencies): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
      
      inline def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
    }
  }
}
