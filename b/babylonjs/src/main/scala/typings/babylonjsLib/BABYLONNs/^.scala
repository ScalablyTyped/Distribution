package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON")
@js.native
object ^ extends js.Object {
  /** @hidden */
  var CollisionWorker: java.lang.String = js.native
  /**
    * Constant used to define the minimal number value in Babylon.js
    * @ignorenaming
    */
  val Epsilon: /* 0.001 */ scala.Double = js.native
  /**
    * Constant used to convert a value to gamma space
    * @ignorenaming
    */
  val ToGammaSpace: scala.Double = js.native
  /**
    * Constant used to convert a value to linear space
    * @ignorenaming
    */
  val ToLinearSpace: /* 2.2 */ scala.Double = js.native
  /** @hidden */
  var WorkerIncluded: scala.Boolean = js.native
  /**
    * Use this className as a decorator on a given class definition to add it a name and optionally its module.
    * You can then use the Tools.getClassName(obj) on an instance to retrieve its class name.
    * This method is the only way to get it done in all cases, even if the .js file declaring the class is minified
    * @param name The name of the class, case should be preserved
    * @param module The name of the Module hosting the class, optional, but strongly recommended to specify if possible. Case should be preserved.
    */
  def className(name: java.lang.String): js.Function1[/* target */ js.Object, scala.Unit] = js.native
  def className(name: java.lang.String, module: java.lang.String): js.Function1[/* target */ js.Object, scala.Unit] = js.native
  def expandToProperty(callback: java.lang.String): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String, scala.Unit] = js.native
  def expandToProperty(callback: java.lang.String, targetKey: Nullable[java.lang.String]): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String, scala.Unit] = js.native
  def serialize(): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serialize(sourceName: java.lang.String): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  /**
    * Decorator used to define property that can be serialized as reference to a camera
    * @param sourceName defines the name of the property to decorate
    */
  def serializeAsCameraReference(): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsCameraReference(sourceName: java.lang.String): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsColor3(): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsColor3(sourceName: java.lang.String): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsColor4(): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsColor4(sourceName: java.lang.String): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsColorCurves(): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsColorCurves(sourceName: java.lang.String): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsFresnelParameters(): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsFresnelParameters(sourceName: java.lang.String): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsImageProcessingConfiguration(): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsImageProcessingConfiguration(sourceName: java.lang.String): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsMeshReference(): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsMeshReference(sourceName: java.lang.String): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsQuaternion(): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsQuaternion(sourceName: java.lang.String): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsTexture(): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsTexture(sourceName: java.lang.String): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsVector2(): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsVector2(sourceName: java.lang.String): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsVector3(): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
  def serializeAsVector3(sourceName: java.lang.String): js.Function2[/* target */ js.Any, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit] = js.native
}

