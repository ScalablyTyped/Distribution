package typings.cassandraDriver

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/geometry", JSImport.Namespace)
@js.native
object geometryMod extends js.Object {
  @js.native
  object geometry extends js.Object {
    @js.native
    class LineString protected () extends js.Object {
      def this(args: Point*) = this()
      def equals(other: LineString): Boolean = js.native
      def toBuffer(): Buffer = js.native
      def toJSON(): String = js.native
    }
    
    @js.native
    class Point protected () extends js.Object {
      def this(x: Double, y: Double) = this()
      def equals(other: Point): Boolean = js.native
      def toBuffer(): Buffer = js.native
      def toJSON(): String = js.native
    }
    
    @js.native
    class Polygon protected () extends js.Object {
      def this(args: Point*) = this()
      def equals(other: Polygon): Boolean = js.native
      def toBuffer(): Buffer = js.native
      def toJSON(): String = js.native
    }
    
    /* static members */
    @js.native
    object LineString extends js.Object {
      def fromBuffer(buffer: Buffer): LineString = js.native
      def fromString(textValue: String): LineString = js.native
    }
    
    /* static members */
    @js.native
    object Point extends js.Object {
      def fromBuffer(buffer: Buffer): Point = js.native
      def fromString(textValue: String): Point = js.native
    }
    
    /* static members */
    @js.native
    object Polygon extends js.Object {
      def fromBuffer(buffer: Buffer): Polygon = js.native
      def fromString(textValue: String): Polygon = js.native
    }
    
  }
  
}

