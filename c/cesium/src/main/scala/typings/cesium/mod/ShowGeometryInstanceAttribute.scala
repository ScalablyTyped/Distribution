package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ShowGeometryInstanceAttribute")
@js.native
open class ShowGeometryInstanceAttribute () extends StObject {
  def this(show: Boolean) = this()
  
  /**
    * The datatype of each component in the attribute, e.g., individual elements in
    * {@link ColorGeometryInstanceAttribute#value}.
    */
  val componentDatatype: ComponentDatatype = js.native
  
  /**
    * The number of components in the attributes, i.e., {@link ColorGeometryInstanceAttribute#value}.
    */
  val componentsPerAttribute: Double = js.native
  
  /**
    * When <code>true</code> and <code>componentDatatype</code> is an integer format,
    * indicate that the components should be mapped to the range [0, 1] (unsigned)
    * or [-1, 1] (signed) when they are accessed as floating-point for rendering.
    */
  val normalize: Boolean = js.native
  
  /**
    * The values for the attributes stored in a typed array.
    */
  var value: js.typedarray.Uint8Array = js.native
}
/* static members */
object ShowGeometryInstanceAttribute {
  
  @JSImport("cesium", "ShowGeometryInstanceAttribute")
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
