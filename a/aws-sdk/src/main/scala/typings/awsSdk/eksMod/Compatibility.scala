package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compatibility extends StObject {
  
  /**
    * The supported Kubernetes version of the cluster.
    */
  var clusterVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The supported default version.
    */
  var defaultVersion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The supported compute platform.
    */
  var platformVersions: js.UndefOr[StringList] = js.undefined
}
object Compatibility {
  
  inline def apply(): Compatibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compatibility]
  }
  
  extension [Self <: Compatibility](x: Self) {
    
    inline def setClusterVersion(value: String): Self = StObject.set(x, "clusterVersion", value.asInstanceOf[js.Any])
    
    inline def setClusterVersionUndefined: Self = StObject.set(x, "clusterVersion", js.undefined)
    
    inline def setDefaultVersion(value: Boolean): Self = StObject.set(x, "defaultVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionUndefined: Self = StObject.set(x, "defaultVersion", js.undefined)
    
    inline def setPlatformVersions(value: StringList): Self = StObject.set(x, "platformVersions", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionsUndefined: Self = StObject.set(x, "platformVersions", js.undefined)
    
    inline def setPlatformVersionsVarargs(value: String*): Self = StObject.set(x, "platformVersions", js.Array(value*))
  }
}
