package typings.babylonjs.indexMod

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "LoadFileError")
@js.native
class LoadFileError protected ()
  extends typings.babylonjs.miscIndexMod.LoadFileError {
  /**
    * Creates a new LoadFileError
    * @param message defines the message of the error
    * @param request defines the optional web request
    * @param file defines the optional file
    */
  def this(message: String) = this()
  def this(message: String, `object`: typings.babylonjs.webRequestMod.WebRequest) = this()
  def this(message: String, `object`: File) = this()
}
