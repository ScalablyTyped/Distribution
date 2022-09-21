package typings.browserfsH4gEcI12.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.browserfsH4gEcI12.fileSystemDTsMod.BFSCallback
import typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystemOptions
import typings.browserfsH4gEcI12.html5fsDTsMod.HTML5FS
import typings.browserfsH4gEcI12.html5fsDTsMod.HTML5FSOptions
import typings.browserfsH4gEcI12.html5fsDTsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHTML5FS
  extends StObject
     with Instantiable0[default]
     with Instantiable1[/* size */ Double, default]
     with Instantiable2[(/* size */ Double) | (/* size */ Unit), /* type */ Double, default]
     with Instantiable3[
      (/* size */ Double) | (/* size */ Unit), 
      (/* type */ Double) | (/* type */ Unit), 
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
