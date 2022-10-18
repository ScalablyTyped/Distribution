package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "StorageBuffer")
@js.native
open class StorageBuffer protected ()
  extends typings.babylonjs.legacyLegacyMod.StorageBuffer {
  /**
    * Creates a new storage buffer instance
    * @param engine The engine the buffer will be created inside
    * @param size The size of the buffer in bytes
    * @param creationFlags flags to use when creating the buffer (see Constants.BUFFER_CREATIONFLAG_XXX). The BUFFER_CREATIONFLAG_STORAGE flag will be automatically added.
    */
  def this(engine: typings.babylonjs.enginesThinEngineMod.ThinEngine, size: Double) = this()
  def this(engine: typings.babylonjs.enginesThinEngineMod.ThinEngine, size: Double, creationFlags: Double) = this()
}
