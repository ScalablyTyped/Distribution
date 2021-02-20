package typings.builderUtilRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Format extends StObject {
    
    var format: String = js.native
    
    var variant: String = js.native
    
    var version: js.UndefOr[scala.Nothing] = js.native
  }
  object Format {
    
    @scala.inline
    def apply(format: String, variant: String): Format = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Variant extends StObject {
    
    var format: String = js.native
    
    var variant: String = js.native
    
    var version: Double = js.native
  }
  object Variant {
    
    @scala.inline
    def apply(format: String, variant: String, version: Double): Variant = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Variant]
    }
    
    @scala.inline
    implicit class VariantMutableBuilder[Self <: Variant] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
