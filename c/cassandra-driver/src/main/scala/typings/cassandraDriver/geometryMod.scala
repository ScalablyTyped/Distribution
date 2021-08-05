package typings.cassandraDriver

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
      
      @JSImport("cassandra-driver/lib/geometry", "geometry.LineString")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def fromBuffer(buffer: Buffer): LineString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[LineString]
      
      /* static member */
      inline def fromString(textValue: String): LineString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(textValue.asInstanceOf[js.Any]).asInstanceOf[LineString]
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
      
      @JSImport("cassandra-driver/lib/geometry", "geometry.Point")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def fromBuffer(buffer: Buffer): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Point]
      
      /* static member */
      inline def fromString(textValue: String): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(textValue.asInstanceOf[js.Any]).asInstanceOf[Point]
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
      
      @JSImport("cassandra-driver/lib/geometry", "geometry.Polygon")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def fromBuffer(buffer: Buffer): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Polygon]
      
      /* static member */
      inline def fromString(textValue: String): Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(textValue.asInstanceOf[js.Any]).asInstanceOf[Polygon]
    }
  }
}
