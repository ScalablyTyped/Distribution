package typings.cassandraDashDriver.cassandraDashDriverMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "geometry")
@js.native
object geometry extends js.Object {
  @js.native
  class LineString protected ()
    extends typings.cassandraDashDriver.libGeometryMod.geometry.LineString {
    def this(args: typings.cassandraDashDriver.libGeometryMod.geometry.Point*) = this()
  }
  
  @js.native
  class Point protected ()
    extends typings.cassandraDashDriver.libGeometryMod.geometry.Point {
    def this(x: Double, y: Double) = this()
  }
  
  @js.native
  class Polygon protected ()
    extends typings.cassandraDashDriver.libGeometryMod.geometry.Polygon {
    def this(args: typings.cassandraDashDriver.libGeometryMod.geometry.Point*) = this()
  }
  
  /* static members */
  @js.native
  object LineString extends js.Object {
    def fromBuffer(buffer: Buffer): typings.cassandraDashDriver.libGeometryMod.geometry.LineString = js.native
    def fromString(textValue: String): typings.cassandraDashDriver.libGeometryMod.geometry.LineString = js.native
  }
  
  /* static members */
  @js.native
  object Point extends js.Object {
    def fromBuffer(buffer: Buffer): typings.cassandraDashDriver.libGeometryMod.geometry.Point = js.native
    def fromString(textValue: String): typings.cassandraDashDriver.libGeometryMod.geometry.Point = js.native
  }
  
  /* static members */
  @js.native
  object Polygon extends js.Object {
    def fromBuffer(buffer: Buffer): typings.cassandraDashDriver.libGeometryMod.geometry.Polygon = js.native
    def fromString(textValue: String): typings.cassandraDashDriver.libGeometryMod.geometry.Polygon = js.native
  }
  
}

