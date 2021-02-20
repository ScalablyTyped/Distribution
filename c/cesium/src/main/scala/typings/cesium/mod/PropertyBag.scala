package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PropertyBag")
@js.native
class PropertyBag () extends StObject {
  def this(value: js.Object) = this()
  def this(
    value: js.UndefOr[scala.Nothing],
    createPropertyCallback: js.Function1[/* value */ js.UndefOr[js.Any], Unit]
  ) = this()
  def this(value: js.Object, createPropertyCallback: js.Function1[/* value */ js.UndefOr[js.Any], Unit]) = this()
  
  def addProperty(propertyName: String): Unit = js.native
  def addProperty(
    propertyName: String,
    value: js.UndefOr[scala.Nothing],
    createPropertyCallback: js.Function1[/* value */ js.Any, Unit]
  ): Unit = js.native
  def addProperty(propertyName: String, value: js.Any): Unit = js.native
  def addProperty(
    propertyName: String,
    value: js.Any,
    createPropertyCallback: js.Function1[/* value */ js.Any, Unit]
  ): Unit = js.native
  
  val definitionChanged: Event[js.Array[_]] = js.native
  
  def equals(): Boolean = js.native
  def equals(other: Property): Boolean = js.native
  
  def getValue(time: JulianDate): js.Object = js.native
  def getValue(time: JulianDate, result: js.Object): js.Object = js.native
  
  def hasProperty(propertyName: String): Boolean = js.native
  
  val isConstant: Boolean = js.native
  
  def merge(source: js.Object): Unit = js.native
  def merge(source: js.Object, createPropertyCallback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  
  var propertyNames: js.Array[String] = js.native
  
  def removeProperty(propertyName: String): Unit = js.native
}
