package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageFilter extends StObject {
  
  /**
    * An object that contains details on the package architecture type to filter on.
    */
  var architecture: js.UndefOr[StringFilter] = js.undefined
  
  /**
    * An object that contains details on the package epoch to filter on.
    */
  var epoch: js.UndefOr[NumberFilter] = js.undefined
  
  /**
    * An object that contains details on the name of the package to filter on.
    */
  var name: js.UndefOr[StringFilter] = js.undefined
  
  /**
    * An object that contains details on the package release to filter on.
    */
  var release: js.UndefOr[StringFilter] = js.undefined
  
  /**
    * An object that contains details on the source layer hash to filter on.
    */
  var sourceLayerHash: js.UndefOr[StringFilter] = js.undefined
  
  /**
    * The package version to filter on.
    */
  var version: js.UndefOr[StringFilter] = js.undefined
}
object PackageFilter {
  
  inline def apply(): PackageFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageFilter]
  }
  
  extension [Self <: PackageFilter](x: Self) {
    
    inline def setArchitecture(value: StringFilter): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setEpoch(value: NumberFilter): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
    
    inline def setEpochUndefined: Self = StObject.set(x, "epoch", js.undefined)
    
    inline def setName(value: StringFilter): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRelease(value: StringFilter): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setSourceLayerHash(value: StringFilter): Self = StObject.set(x, "sourceLayerHash", value.asInstanceOf[js.Any])
    
    inline def setSourceLayerHashUndefined: Self = StObject.set(x, "sourceLayerHash", js.undefined)
    
    inline def setVersion(value: StringFilter): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
