package typings.awsSdkCredentialProviderWebIdentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Arn extends StObject {
    
    var arn: js.UndefOr[String] = js.undefined
  }
  object Arn {
    
    inline def apply(): Arn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Arn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Arn] (val x: Self) extends AnyVal {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    }
  }
}
