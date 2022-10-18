package typings.cassandraDriver

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.libTypesMod.types.ResultSet
import typings.std.Iterator
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatastaxGraphMod {
  
  object graph {
    
    @JSImport("cassandra-driver/lib/datastax/graph", "graph")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cassandra-driver/lib/datastax/graph", "graph.GraphResultSet")
    @js.native
    open class GraphResultSet protected ()
      extends StObject
         with Iterator[Any, Any, Unit] {
      def this(rs: ResultSet) = this()
      
      def first(): Any = js.native
      
      def next(): IteratorResult[Any, Any] = js.native
      def next(value: Any): IteratorResult[Any, Any] = js.native
      
      def toArray(): js.Array[Any] = js.native
      
      def values(): js.Iterator[Any] = js.native
    }
    
    inline def asDouble(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("asDouble")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def asFloat(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("asFloat")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def asInt(value: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("asInt")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def asTimestamp(value: js.Date): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("asTimestamp")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def asUdt(value: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("asUdt")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    object direction {
      
      @JSImport("cassandra-driver/lib/datastax/graph", "graph.direction.both")
      @js.native
      val both: EnumValue = js.native
      
      // `in` is a reserved word
      @JSImport("cassandra-driver/lib/datastax/graph", "graph.direction.in_")
      @js.native
      val in: EnumValue = js.native
      
      @JSImport("cassandra-driver/lib/datastax/graph", "graph.direction.out")
      @js.native
      val out: EnumValue = js.native
    }
    
    object t {
      
      @JSImport("cassandra-driver/lib/datastax/graph", "graph.t.id")
      @js.native
      val id: EnumValue = js.native
      
      @JSImport("cassandra-driver/lib/datastax/graph", "graph.t.key")
      @js.native
      val key: EnumValue = js.native
      
      @JSImport("cassandra-driver/lib/datastax/graph", "graph.t.label")
      @js.native
      val label: EnumValue = js.native
      
      @JSImport("cassandra-driver/lib/datastax/graph", "graph.t.value")
      @js.native
      val value: EnumValue = js.native
    }
    
    trait Edge
      extends StObject
         with Element {
      
      var inV: js.UndefOr[Vertex] = js.undefined
      
      var inVLabel: js.UndefOr[String] = js.undefined
      
      var outV: js.UndefOr[Vertex] = js.undefined
      
      var outVLabel: js.UndefOr[String] = js.undefined
      
      var properties: js.UndefOr[js.Object] = js.undefined
    }
    object Edge {
      
      inline def apply(id: Any, label: String): Edge = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[Edge]
      }
      
      extension [Self <: Edge](x: Self) {
        
        inline def setInV(value: Vertex): Self = StObject.set(x, "inV", value.asInstanceOf[js.Any])
        
        inline def setInVLabel(value: String): Self = StObject.set(x, "inVLabel", value.asInstanceOf[js.Any])
        
        inline def setInVLabelUndefined: Self = StObject.set(x, "inVLabel", js.undefined)
        
        inline def setInVUndefined: Self = StObject.set(x, "inV", js.undefined)
        
        inline def setOutV(value: Vertex): Self = StObject.set(x, "outV", value.asInstanceOf[js.Any])
        
        inline def setOutVLabel(value: String): Self = StObject.set(x, "outVLabel", value.asInstanceOf[js.Any])
        
        inline def setOutVLabelUndefined: Self = StObject.set(x, "outVLabel", js.undefined)
        
        inline def setOutVUndefined: Self = StObject.set(x, "outV", js.undefined)
        
        inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      }
    }
    
    trait Element extends StObject {
      
      var id: Any
      
      var label: String
    }
    object Element {
      
      inline def apply(id: Any, label: String): Element = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[Element]
      }
      
      extension [Self <: Element](x: Self) {
        
        inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      }
    }
    
    trait EnumValue extends StObject
    
    trait Path extends StObject {
      
      var labels: js.Array[Any]
      
      var objects: js.Array[Any]
    }
    object Path {
      
      inline def apply(labels: js.Array[Any], objects: js.Array[Any]): Path = {
        val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
        __obj.asInstanceOf[Path]
      }
      
      extension [Self <: Path](x: Self) {
        
        inline def setLabels(value: js.Array[Any]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        inline def setLabelsVarargs(value: Any*): Self = StObject.set(x, "labels", js.Array(value*))
        
        inline def setObjects(value: js.Array[Any]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
        
        inline def setObjectsVarargs(value: Any*): Self = StObject.set(x, "objects", js.Array(value*))
      }
    }
    
    trait Property extends StObject {
      
      var key: Any
      
      var value: Any
    }
    object Property {
      
      inline def apply(key: Any, value: Any): Property = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Property]
      }
      
      extension [Self <: Property](x: Self) {
        
        inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    trait Vertex
      extends StObject
         with Element {
      
      var properties: js.UndefOr[StringDictionary[js.Array[Any]]] = js.undefined
    }
    object Vertex {
      
      inline def apply(id: Any, label: String): Vertex = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[Vertex]
      }
      
      extension [Self <: Vertex](x: Self) {
        
        inline def setProperties(value: StringDictionary[js.Array[Any]]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      }
    }
    
    trait VertexProperty
      extends StObject
         with Element {
      
      var key: String
      
      var properties: js.UndefOr[Any] = js.undefined
      
      var value: Any
    }
    object VertexProperty {
      
      inline def apply(id: Any, key: String, label: String, value: Any): VertexProperty = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[VertexProperty]
      }
      
      extension [Self <: VertexProperty](x: Self) {
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
        
        inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
}
