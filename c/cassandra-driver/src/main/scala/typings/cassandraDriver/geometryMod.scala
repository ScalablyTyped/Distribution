package typings.cassandraDriver

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryMod {
  
  object geometry {
    
    @JSImport("cassandra-driver/lib/geometry", "geometry.LineString")
    @js.native
    class LineString protected () extends StObject {
      def this(args: Point*) = this()
      
      def equals(other: LineString): Boolean = js.native
      
      def toBuffer(): Buffer = js.native
      
      def toJSON(): String = js.native
    }
    object LineString {
      
      /* static member */
      @JSImport("cassandra-driver/lib/geometry", "geometry.LineString.fromBuffer")
      @js.native
      def fromBuffer(buffer: Buffer): LineString = js.native
      
      /* static member */
      @JSImport("cassandra-driver/lib/geometry", "geometry.LineString.fromString")
      @js.native
      def fromString(textValue: String): LineString = js.native
    }
    
    @JSImport("cassandra-driver/lib/geometry", "geometry.Point")
    @js.native
    class Point protected () extends StObject {
      def this(x: Double, y: Double) = this()
      
      def equals(other: Point): Boolean = js.native
      
      def toBuffer(): Buffer = js.native
      
      def toJSON(): String = js.native
    }
    object Point {
      
      /* static member */
      @JSImport("cassandra-driver/lib/geometry", "geometry.Point.fromBuffer")
      @js.native
      def fromBuffer(buffer: Buffer): Point = js.native
      
      /* static member */
      @JSImport("cassandra-driver/lib/geometry", "geometry.Point.fromString")
      @js.native
      def fromString(textValue: String): Point = js.native
    }
    
    @JSImport("cassandra-driver/lib/geometry", "geometry.Polygon")
    @js.native
    class Polygon protected () extends StObject {
      def this(args: Point*) = this()
      
      def equals(other: Polygon): Boolean = js.native
      
      def toBuffer(): Buffer = js.native
      
      def toJSON(): String = js.native
    }
    object Polygon {
      
      /* static member */
      @JSImport("cassandra-driver/lib/geometry", "geometry.Polygon.fromBuffer")
      @js.native
      def fromBuffer(buffer: Buffer): Polygon = js.native
      
      /* static member */
      @JSImport("cassandra-driver/lib/geometry", "geometry.Polygon.fromString")
      @js.native
      def fromString(textValue: String): Polygon = js.native
    }
  }
}
