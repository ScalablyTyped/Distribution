package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.Extras
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "MetadataEnumValue")
@js.native
open class MetadataEnumValue protected () extends StObject {
  def this(options: Extras) = this()
  
  /**
    * The description of the enum value.
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
    * The name of the enum value.
    */
  val name: String = js.native
  
  /**
    * The integer value.
    */
  val value: Double = js.native
}
