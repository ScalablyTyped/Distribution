package typings.credential

import typings.credential.anon.Expired
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Expired = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Expired]
  @scala.inline
  def apply(defaultOptions: defaultOptions): Expired = ^.asInstanceOf[js.Dynamic].apply(defaultOptions.asInstanceOf[js.Any]).asInstanceOf[Expired]
  
  @JSImport("credential", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type HashCallback = js.Function2[/* err */ Error, /* hash */ String, Unit]
  
  type VerifyCallback = js.Function2[/* err */ Error, /* isValid */ Boolean, Unit]
  
  trait defaultOptions extends StObject {
    
    var hashMethod: String
    
    var keyLength: Double
    
    var work: Double
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
