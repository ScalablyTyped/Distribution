package typings.cassandraDriver.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometry {
  
  @JSImport("cassandra-driver", "geometry.LineString")
  @js.native
  open class LineString protected ()
    extends typings.cassandraDriver.libGeometryMod.geometry.LineString {
    def this(args: typings.cassandraDriver.libGeometryMod.geometry.Point*) = this()
  }
  object LineString {
    
    @JSImport("cassandra-driver", "geometry.LineString")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromBuffer(buffer: Buffer): typings.cassandraDriver.libGeometryMod.geometry.LineString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.libGeometryMod.geometry.LineString]
    
    /* static member */
    inline def fromString(textValue: String): typings.cassandraDriver.libGeometryMod.geometry.LineString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(textValue.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.libGeometryMod.geometry.LineString]
  }
  
  @JSImport("cassandra-driver", "geometry.Point")
  @js.native
  open class Point protected ()
    extends typings.cassandraDriver.libGeometryMod.geometry.Point {
    def this(x: Double, y: Double) = this()
  }
  object Point {
    
    @JSImport("cassandra-driver", "geometry.Point")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromBuffer(buffer: Buffer): typings.cassandraDriver.libGeometryMod.geometry.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.libGeometryMod.geometry.Point]
    
    /* static member */
    inline def fromString(textValue: String): typings.cassandraDriver.libGeometryMod.geometry.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(textValue.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.libGeometryMod.geometry.Point]
  }
  
  @JSImport("cassandra-driver", "geometry.Polygon")
  @js.native
  open class Polygon protected ()
    extends typings.cassandraDriver.libGeometryMod.geometry.Polygon {
    def this(args: typings.cassandraDriver.libGeometryMod.geometry.Point*) = this()
  }
  object Polygon {
    
    @JSImport("cassandra-driver", "geometry.Polygon")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromBuffer(buffer: Buffer): typings.cassandraDriver.libGeometryMod.geometry.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.libGeometryMod.geometry.Polygon]
    
    /* static member */
    inline def fromString(textValue: String): typings.cassandraDriver.libGeometryMod.geometry.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(textValue.asInstanceOf[js.Any]).asInstanceOf[typings.cassandraDriver.libGeometryMod.geometry.Polygon]
  }
}
