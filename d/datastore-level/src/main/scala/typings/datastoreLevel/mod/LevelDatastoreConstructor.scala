package typings.datastoreLevel.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelDatastoreConstructor
  extends Instantiable1[/* path */ String, LevelDatastore[Buffer]]
     with Instantiable2[/* path */ String, /* options */ LevelDatastoreOptions, LevelDatastore[Buffer]] {
  
  def apply(path: String): LevelDatastore[Buffer] = js.native
  def apply(path: String, options: LevelDatastoreOptions): LevelDatastore[Buffer] = js.native
}
