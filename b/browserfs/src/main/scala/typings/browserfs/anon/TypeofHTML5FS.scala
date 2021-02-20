package typings.browserfs.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.browserfs.html5fsMod.HTML5FS
import typings.browserfs.html5fsMod.HTML5FSOptions
import typings.browserfs.html5fsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHTML5FS
  extends Instantiable0[default]
     with Instantiable1[/* size */ Double, default]
     with Instantiable2[js.UndefOr[/* size */ Double], /* type */ Double, default]
     with Instantiable3[
      js.UndefOr[/* size */ Double], 
      js.UndefOr[/* type */ Double], 
      /* deprecateMsg */ Boolean, 
      default
    ] {
  
  /**
    * Creates an HTML5FS instance with the given options.
    */
  def Create(opts: HTML5FSOptions, cb: BFSCallback[HTML5FS]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
