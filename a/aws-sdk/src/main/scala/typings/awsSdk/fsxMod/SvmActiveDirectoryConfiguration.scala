package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SvmActiveDirectoryConfiguration extends StObject {
  
  /**
    * The NetBIOS name of the Active Directory computer object that is joined to your SVM.
    */
  var NetBiosName: js.UndefOr[NetBiosAlias] = js.undefined
  
  var SelfManagedActiveDirectoryConfiguration: js.UndefOr[SelfManagedActiveDirectoryAttributes] = js.undefined
}
object SvmActiveDirectoryConfiguration {
  
  inline def apply(): SvmActiveDirectoryConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SvmActiveDirectoryConfiguration]
  }
  
  extension [Self <: SvmActiveDirectoryConfiguration](x: Self) {
    
    inline def setNetBiosName(value: NetBiosAlias): Self = StObject.set(x, "NetBiosName", value.asInstanceOf[js.Any])
    
    inline def setNetBiosNameUndefined: Self = StObject.set(x, "NetBiosName", js.undefined)
    
    inline def setSelfManagedActiveDirectoryConfiguration(value: SelfManagedActiveDirectoryAttributes): Self = StObject.set(x, "SelfManagedActiveDirectoryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedActiveDirectoryConfigurationUndefined: Self = StObject.set(x, "SelfManagedActiveDirectoryConfiguration", js.undefined)
  }
}
