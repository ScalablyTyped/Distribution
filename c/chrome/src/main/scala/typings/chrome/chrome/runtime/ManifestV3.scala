package typings.chrome.chrome.runtime

import typings.chrome.anon.Extensionpages
import typings.chrome.anon.Resources
import typings.chrome.anon.Serviceworker
import typings.chrome.chromeNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestV3
  extends StObject
     with ManifestBase
     with Manifest {
  
  // Optional
  var action: js.UndefOr[ManifestAction] = js.undefined
  
  var background: js.UndefOr[Serviceworker] = js.undefined
  
  var content_security_policy: js.UndefOr[Extensionpages] = js.undefined
  
  var host_permissions: js.UndefOr[js.Array[String]] = js.undefined
  
  // Required
  @JSName("manifest_version")
  var manifest_version_ManifestV3: `3`
  
  var optional_permissions: js.UndefOr[js.Array[ManifestPermissions]] = js.undefined
  
  var permissions: js.UndefOr[js.Array[ManifestPermissions]] = js.undefined
  
  var web_accessible_resources: js.UndefOr[js.Array[Resources]] = js.undefined
}
object ManifestV3 {
  
  inline def apply(name: String, version: String): ManifestV3 = {
    val __obj = js.Dynamic.literal(manifest_version = 3, name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestV3]
  }
  
  extension [Self <: ManifestV3](x: Self) {
    
    inline def setAction(value: ManifestAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setBackground(value: Serviceworker): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setContent_security_policy(value: Extensionpages): Self = StObject.set(x, "content_security_policy", value.asInstanceOf[js.Any])
    
    inline def setContent_security_policyUndefined: Self = StObject.set(x, "content_security_policy", js.undefined)
    
    inline def setHost_permissions(value: js.Array[String]): Self = StObject.set(x, "host_permissions", value.asInstanceOf[js.Any])
    
    inline def setHost_permissionsUndefined: Self = StObject.set(x, "host_permissions", js.undefined)
    
    inline def setHost_permissionsVarargs(value: String*): Self = StObject.set(x, "host_permissions", js.Array(value*))
    
    inline def setManifest_version(value: `3`): Self = StObject.set(x, "manifest_version", value.asInstanceOf[js.Any])
    
    inline def setOptional_permissions(value: js.Array[ManifestPermissions]): Self = StObject.set(x, "optional_permissions", value.asInstanceOf[js.Any])
    
    inline def setOptional_permissionsUndefined: Self = StObject.set(x, "optional_permissions", js.undefined)
    
    inline def setOptional_permissionsVarargs(value: ManifestPermissions*): Self = StObject.set(x, "optional_permissions", js.Array(value*))
    
    inline def setPermissions(value: js.Array[ManifestPermissions]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: ManifestPermissions*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setWeb_accessible_resources(value: js.Array[Resources]): Self = StObject.set(x, "web_accessible_resources", value.asInstanceOf[js.Any])
    
    inline def setWeb_accessible_resourcesUndefined: Self = StObject.set(x, "web_accessible_resources", js.undefined)
    
    inline def setWeb_accessible_resourcesVarargs(value: Resources*): Self = StObject.set(x, "web_accessible_resources", js.Array(value*))
  }
}
