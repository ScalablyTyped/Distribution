package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerSideEncryptionRule extends StObject {
  
  /**
    * Specifies the default server-side encryption to apply to new objects in the bucket. If a PUT Object request doesn't specify any server-side encryption, this default encryption will be applied.
    */
  var ApplyServerSideEncryptionByDefault: js.UndefOr[ServerSideEncryptionByDefault] = js.undefined
}
object ServerSideEncryptionRule {
  
  inline def apply(): ServerSideEncryptionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSideEncryptionRule]
  }
  
  extension [Self <: ServerSideEncryptionRule](x: Self) {
    
    inline def setApplyServerSideEncryptionByDefault(value: ServerSideEncryptionByDefault): Self = StObject.set(x, "ApplyServerSideEncryptionByDefault", value.asInstanceOf[js.Any])
    
    inline def setApplyServerSideEncryptionByDefaultUndefined: Self = StObject.set(x, "ApplyServerSideEncryptionByDefault", js.undefined)
  }
}
