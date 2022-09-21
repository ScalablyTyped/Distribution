package typings.cesium

import typings.cesium.mod.ShowGeometryInstanceAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object showGeometryInstanceAttributeMod {
  
  @JSImport("cesium/Source/Core/ShowGeometryInstanceAttribute", JSImport.Default)
  @js.native
  open class default () extends ShowGeometryInstanceAttribute {
    def this(show: Boolean) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/ShowGeometryInstanceAttribute", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts a boolean show to a typed array that can be used to assign a show attribute.
      * @example
      * const attributes = primitive.getGeometryInstanceAttributes('an id');
      * attributes.show = Cesium.ShowGeometryInstanceAttribute.toValue(true, attributes.show);
      * @param show - The show value.
      * @param [result] - The array to store the result in, if undefined a new instance will be created.
      * @returns The modified result parameter or a new instance if result was undefined.
      */
    inline def toValue(show: Boolean): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toValue")(show.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def toValue(show: Boolean, result: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toValue")(show.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  }
}
