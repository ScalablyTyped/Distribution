package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.Extensions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "MetadataEnum")
@js.native
open class MetadataEnum protected () extends StObject {
  def this(options: Extensions) = this()
  
  /**
    * The description of the enum.
    */
  val description: String = js.native
  
  /**
    * An object containing extensions.
    */
  val extensions: Any = js.native
  
  /**
    * Extra user-defined properties.
    */
  val extras: Any = js.native
  
  /**
    * The ID of the enum.
    */
  val id: String = js.native
  
  /**
    * The name of the enum.
    */
  val name: String = js.native
  
  /**
    * The enum value type.
    */
  val valueType: MetadataComponentType = js.native
  
  /**
    * The enum values.
    */
  val values: js.Array[MetadataEnumValue] = js.native
}
