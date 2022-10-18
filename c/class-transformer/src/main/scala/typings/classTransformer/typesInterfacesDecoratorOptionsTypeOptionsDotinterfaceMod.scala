package typings.classTransformer

import typings.classTransformer.typesInterfacesDecoratorOptionsTypeDiscriminatorDescriptorDotinterfaceMod.DiscriminatorDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInterfacesDecoratorOptionsTypeOptionsDotinterfaceMod {
  
  trait TypeOptions extends StObject {
    
    /**
      * Optional discriminator object, when provided the property value will be
      * initialized according to the specified object.
      */
    var discriminator: js.UndefOr[DiscriminatorDescriptor] = js.undefined
    
    /**
      * Indicates whether to keep the discriminator property on the
      * transformed object or not. Disabled by default.
      *
      * @default false
      */
    var keepDiscriminatorProperty: js.UndefOr[Boolean] = js.undefined
  }
  object TypeOptions {
    
    inline def apply(): TypeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeOptions]
    }
    
    extension [Self <: TypeOptions](x: Self) {
      
      inline def setDiscriminator(value: DiscriminatorDescriptor): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
      
      inline def setDiscriminatorUndefined: Self = StObject.set(x, "discriminator", js.undefined)
      
      inline def setKeepDiscriminatorProperty(value: Boolean): Self = StObject.set(x, "keepDiscriminatorProperty", value.asInstanceOf[js.Any])
      
      inline def setKeepDiscriminatorPropertyUndefined: Self = StObject.set(x, "keepDiscriminatorProperty", js.undefined)
    }
  }
}
