package typings.awsSdkMiddlewareSdkSqs

import typings.awsSdkTypes.distTypesChecksumMod.ChecksumConstructor
import typings.awsSdkTypes.distTypesCryptoMod.HashConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConfigurationsMod {
  
  trait PreviouslyResolved extends StObject {
    
    var md5: ChecksumConstructor | HashConstructor
  }
  object PreviouslyResolved {
    
    inline def apply(md5: ChecksumConstructor | HashConstructor): PreviouslyResolved = {
      val __obj = js.Dynamic.literal(md5 = md5.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviouslyResolved]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreviouslyResolved] (val x: Self) extends AnyVal {
      
      inline def setMd5(value: ChecksumConstructor | HashConstructor): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    }
  }
}
