package typings.babylonjs.legacyLegacyMod

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "ContainerAssetTask")
@js.native
open class ContainerAssetTask protected ()
  extends typings.babylonjs.indexMod.ContainerAssetTask {
  /**
    * Creates a new ContainerAssetTask
    * @param name defines the name of the task
    * @param meshesNames defines the list of mesh's names you want to load
    * @param rootUrl defines the root url to use as a base to load your meshes and associated resources
    * @param sceneFilename defines the filename or File of the scene to load from
    */
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the list of mesh's names you want to load
    */
  meshesNames: Any,
    /**
    * Defines the root url to use as a base to load your meshes and associated resources
    */
  rootUrl: String,
    /**
    * Defines the filename or File of the scene to load from
    */
  sceneFilename: String
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the list of mesh's names you want to load
    */
  meshesNames: Any,
    /**
    * Defines the root url to use as a base to load your meshes and associated resources
    */
  rootUrl: String,
    /**
    * Defines the filename or File of the scene to load from
    */
  sceneFilename: File
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the list of mesh's names you want to load
    */
  meshesNames: Any,
    /**
    * Defines the root url to use as a base to load your meshes and associated resources
    */
  rootUrl: String,
    /**
    * Defines the filename or File of the scene to load from
    */
  sceneFilename: String,
    /**
    * Defines the extension to use to load the scene (if not defined, ".babylon" will be used)
    */
  `extension`: String
  ) = this()
  def this(
    /**
    * Defines the name of the task
    */
  name: String,
    /**
    * Defines the list of mesh's names you want to load
    */
  meshesNames: Any,
    /**
    * Defines the root url to use as a base to load your meshes and associated resources
    */
  rootUrl: String,
    /**
    * Defines the filename or File of the scene to load from
    */
  sceneFilename: File,
    /**
    * Defines the extension to use to load the scene (if not defined, ".babylon" will be used)
    */
  `extension`: String
  ) = this()
}
