package typings.credential

import typings.credential.anon.Expired
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("credential", JSImport.Namespace)
  @js.native
  def apply(): Expired = js.native
  @JSImport("credential", JSImport.Namespace)
  @js.native
  def apply(defaultOptions: defaultOptions): Expired = js.native
  
  type HashCallback = js.Function2[/* err */ Error, /* hash */ String, Unit]
  
  type VerifyCallback = js.Function2[/* err */ Error, /* isValid */ Boolean, Unit]
  
  @js.native
  trait defaultOptions extends StObject {
    
    var hashMethod: String = js.native
    
    var keyLength: Double = js.native
    
    var work: Double = js.native
  }
  object defaultOptions {
    
    @scala.inline
    def apply(hashMethod: String, keyLength: Double, work: Double): defaultOptions = {
      val __obj = js.Dynamic.literal(hashMethod = hashMethod.asInstanceOf[js.Any], keyLength = keyLength.asInstanceOf[js.Any], work = work.asInstanceOf[js.Any])
      __obj.asInstanceOf[defaultOptions]
    }
    
    @scala.inline
    implicit class defaultOptionsMutableBuilder[Self <: defaultOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHashMethod(value: String): Self = StObject.set(x, "hashMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWork(value: Double): Self = StObject.set(x, "work", value.asInstanceOf[js.Any])
    }
  }
}
