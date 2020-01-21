package typings.cassandraDriver.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "geometry")
@js.native
object geometry extends js.Object {
  @js.native
  class LineString protected ()
    extends typings.cassandraDriver.geometryMod.geometry.LineString {
    def this(args: typings.cassandraDriver.geometryMod.geometry.Point*) = this()
  }
  
  @js.native
  class Point protected ()
    extends typings.cassandraDriver.geometryMod.geometry.Point {
    def this(x: Double, y: Double) = this()
  }
  
  @js.native
  class Polygon protected ()
    extends typings.cassandraDriver.geometryMod.geometry.Polygon {
    def this(args: typings.cassandraDriver.geometryMod.geometry.Point*) = this()
  }
  
  /* static members */
  @js.native
  object LineString extends js.Object {
    def fromBuffer(buffer: Buffer): typings.cassandraDriver.geometryMod.geometry.LineString = js.native
    def fromString(textValue: String): typings.cassandraDriver.geometryMod.geometry.LineString = js.native
  }
  
  /* static members */
  @js.native
  object Point extends js.Object {
    def fromBuffer(buffer: Buffer): typings.cassandraDriver.geometryMod.geometry.Point = js.native
    def fromString(textValue: String): typings.cassandraDriver.geometryMod.geometry.Point = js.native
  }
  
  /* static members */
  @js.native
  object Polygon extends js.Object {
    def fromBuffer(buffer: Buffer): typings.cassandraDriver.geometryMod.geometry.Polygon = js.native
    def fromString(textValue: String): typings.cassandraDriver.geometryMod.geometry.Polygon = js.native
  }
  
}

