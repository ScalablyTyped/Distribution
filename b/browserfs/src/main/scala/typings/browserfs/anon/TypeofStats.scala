package typings.browserfs.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.Instantiable6
import typings.browserfs.nodeFsStatsMod.FileType
import typings.browserfs.nodeFsStatsMod.Stats
import typings.browserfs.nodeFsStatsMod.default
import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofStats
  extends StObject
     with Instantiable2[/* itemType */ FileType, /* size */ Double, default]
     with Instantiable3[/* itemType */ FileType, /* size */ Double, /* mode */ Double, default]
     with Instantiable4[
      /* itemType */ FileType, 
      /* size */ Double, 
      (/* mode */ Double) | (/* mode */ Unit), 
      /* atime */ Date, 
      default
    ]
     with Instantiable5[
      /* itemType */ FileType, 
      /* size */ Double, 
      (/* mode */ Double) | (/* mode */ Unit), 
      (/* atime */ Date) | (/* atime */ Unit), 
      /* mtime */ Date, 
      default
    ]
     with Instantiable6[
      /* itemType */ FileType, 
      /* size */ Double, 
      (/* mode */ Double) | (/* mode */ Unit), 
      (/* atime */ Date) | (/* atime */ Unit), 
      (/* mtime */ Date) | (/* mtime */ Unit), 
      /* ctime */ Date, 
      default
    ] {
  
  def fromBuffer(buffer: Buffer): Stats = js.native
}
