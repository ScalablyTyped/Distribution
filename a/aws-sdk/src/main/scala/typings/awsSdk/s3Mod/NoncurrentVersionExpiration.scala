package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoncurrentVersionExpiration extends StObject {
  
  /**
    * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For information about the noncurrent days calculations, see How Amazon S3 Calculates When an Object Became Noncurrent in the Amazon Simple Storage Service Developer Guide.
    */
  var NoncurrentDays: js.UndefOr[Days] = js.undefined
}
object NoncurrentVersionExpiration {
  
  inline def apply(): NoncurrentVersionExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoncurrentVersionExpiration]
  }
  
  extension [Self <: NoncurrentVersionExpiration](x: Self) {
    
    inline def setNoncurrentDays(value: Days): Self = StObject.set(x, "NoncurrentDays", value.asInstanceOf[js.Any])
    
    inline def setNoncurrentDaysUndefined: Self = StObject.set(x, "NoncurrentDays", js.undefined)
  }
}
