package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSvmActiveDirectoryConfiguration extends StObject {
  
  /**
    * The NetBIOS name of the Active Directory computer object that will be created for your SVM.
    */
  var NetBiosName: NetBiosAlias
  
  var SelfManagedActiveDirectoryConfiguration: js.UndefOr[typings.awsSdk.fsxMod.SelfManagedActiveDirectoryConfiguration] = js.undefined
}
object CreateSvmActiveDirectoryConfiguration {
  
  inline def apply(NetBiosName: NetBiosAlias): CreateSvmActiveDirectoryConfiguration = {
    val __obj = js.Dynamic.literal(NetBiosName = NetBiosName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSvmActiveDirectoryConfiguration]
  }
  
  extension [Self <: CreateSvmActiveDirectoryConfiguration](x: Self) {
    
    inline def setNetBiosName(value: NetBiosAlias): Self = StObject.set(x, "NetBiosName", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedActiveDirectoryConfiguration(value: SelfManagedActiveDirectoryConfiguration): Self = StObject.set(x, "SelfManagedActiveDirectoryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedActiveDirectoryConfigurationUndefined: Self = StObject.set(x, "SelfManagedActiveDirectoryConfiguration", js.undefined)
  }
}
