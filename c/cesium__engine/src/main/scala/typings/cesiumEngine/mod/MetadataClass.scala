package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cesiumEngine.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "MetadataClass")
@js.native
open class MetadataClass protected () extends StObject {
  def this(options: Description) = this()
  
  /**
    * The description of the class.
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
    * The ID of the class.
    */
  val id: String = js.native
  
  /**
    * The name of the class.
    */
  val name: String = js.native
  
  /**
    * The class properties.
    */
  val properties: StringDictionary[MetadataClassProperty] = js.native
}
