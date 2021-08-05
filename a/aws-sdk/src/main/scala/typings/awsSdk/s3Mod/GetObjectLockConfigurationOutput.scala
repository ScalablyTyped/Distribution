package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectLockConfigurationOutput extends StObject {
  
  /**
    * The specified bucket's Object Lock configuration.
    */
  var ObjectLockConfiguration: js.UndefOr[typings.awsSdk.s3Mod.ObjectLockConfiguration] = js.undefined
}
object GetObjectLockConfigurationOutput {
  
  inline def apply(): GetObjectLockConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectLockConfigurationOutput]
  }
  
  extension [Self <: GetObjectLockConfigurationOutput](x: Self) {
    
    inline def setObjectLockConfiguration(value: ObjectLockConfiguration): Self = StObject.set(x, "ObjectLockConfiguration", value.asInstanceOf[js.Any])
    
    inline def setObjectLockConfigurationUndefined: Self = StObject.set(x, "ObjectLockConfiguration", js.undefined)
  }
}
