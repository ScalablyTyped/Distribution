package typings.babylonjs.mod

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "LoadFileError")
@js.native
open class LoadFileError protected ()
  extends typings.babylonjs.legacyLegacyMod.LoadFileError {
  /**
    * Creates a new LoadFileError
    * @param message defines the message of the error
    * @param object defines the optional web request
    */
  def this(message: String) = this()
  def this(message: String, `object`: typings.babylonjs.miscWebRequestMod.WebRequest) = this()
  def this(message: String, `object`: File) = this()
}
