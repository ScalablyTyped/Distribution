package typings.cesium.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cesium.anon.Classes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "MetadataSchema")
@js.native
open class MetadataSchema protected () extends StObject {
  def this(options: Classes) = this()
  
  /**
    * Classes defined in the schema.
    */
  val classes: StringDictionary[MetadataClass] = js.native
  
  /**
    * The description of the schema.
    */
  val description: String = js.native
  
  /**
    * Enums defined in the schema.
    */
  val enums: StringDictionary[MetadataEnum] = js.native
  
  /**
    * An object containing extensions.
    */
  val extensions: Any = js.native
  
  /**
    * Extra user-defined properties.
    */
  val extras: Any = js.native
  
  /**
    * The ID of the schema.
    */
  val id: String = js.native
  
  /**
    * The name of the schema.
    */
  val name: String = js.native
  
  /**
    * The application-specific version of the schema.
    */
  val version: String = js.native
}
