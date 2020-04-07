package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/filesInputStore", JSImport.Namespace)
@js.native
object filesInputStoreMod extends js.Object {
  @js.native
  class FilesInputStore () extends js.Object
  
  /* static members */
  @js.native
  object FilesInputStore extends js.Object {
    /**
      * List of files ready to be loaded
      */
    var FilesToLoad: StringDictionary[File] = js.native
  }
  
}

