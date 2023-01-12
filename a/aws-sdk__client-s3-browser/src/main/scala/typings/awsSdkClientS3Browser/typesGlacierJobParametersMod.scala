package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Bulk
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Expedited
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Standard_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGlacierJobParametersMod {
  
  trait GlacierJobParameters extends StObject {
    
    /**
      * <p>Glacier retrieval tier at which the restore will be processed.</p>
      */
    var Tier: Standard_ | Bulk | Expedited | String
  }
  object GlacierJobParameters {
    
    inline def apply(Tier: Standard_ | Bulk | Expedited | String): GlacierJobParameters = {
      val __obj = js.Dynamic.literal(Tier = Tier.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlacierJobParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlacierJobParameters] (val x: Self) extends AnyVal {
      
      inline def setTier(value: Standard_ | Bulk | Expedited | String): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledGlacierJobParameters = GlacierJobParameters
}
