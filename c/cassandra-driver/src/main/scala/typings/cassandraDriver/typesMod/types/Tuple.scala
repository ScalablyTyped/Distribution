package typings.cassandraDriver.typesMod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver/lib/types", "types.Tuple")
@js.native
class Tuple protected () extends StObject {
  def this(args: js.Any*) = this()
  
  var elements: js.Array[_] = js.native
  
  def get(index: Double): js.Any = js.native
  
  var length: Double = js.native
  
  def toJSON(): String = js.native
  
  def values(): js.Array[_] = js.native
}
object Tuple {
  
  /* static member */
  @JSImport("cassandra-driver/lib/types", "types.Tuple.fromArray")
  @js.native
  def fromArray(elements: js.Array[_]): Tuple = js.native
}
