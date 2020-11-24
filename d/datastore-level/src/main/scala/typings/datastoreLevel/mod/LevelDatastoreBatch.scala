package typings.datastoreLevel.mod

import typings.abstractLeveldown.mod.AbstractBatch
import typings.interfaceDatastore.mod.Batch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelDatastoreBatch[Value] extends Batch[Value] {
  
  var ops: js.Array[AbstractBatch[String, Value]] = js.native
}
