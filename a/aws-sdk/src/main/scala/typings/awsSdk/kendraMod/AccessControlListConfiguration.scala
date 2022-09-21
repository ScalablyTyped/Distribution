package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessControlListConfiguration extends StObject {
  
  /**
    * Path to the Amazon S3 bucket that contains the ACL files.
    */
  var KeyPath: js.UndefOr[S3ObjectKey] = js.undefined
}
object AccessControlListConfiguration {
  
  inline def apply(): AccessControlListConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessControlListConfiguration]
  }
  
  extension [Self <: AccessControlListConfiguration](x: Self) {
    
    inline def setKeyPath(value: S3ObjectKey): Self = StObject.set(x, "KeyPath", value.asInstanceOf[js.Any])
    
    inline def setKeyPathUndefined: Self = StObject.set(x, "KeyPath", js.undefined)
  }
}
