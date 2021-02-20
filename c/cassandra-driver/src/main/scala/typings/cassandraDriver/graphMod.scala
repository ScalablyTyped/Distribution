package typings.cassandraDriver

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.typesMod.types.ResultSet
import typings.std.Date
import typings.std.Iterator
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphMod {
  
  object graph {
    
    @JSImport("cassandra-driver/lib/datastax/graph", "graph.GraphResultSet")
    @js.native
    class GraphResultSet protected ()
      extends Iterator[js.Any, js.Any, js.UndefOr[scala.Nothing]] {
      def this(rs: ResultSet) = this()
      
      def first(): js.Any = js.native
      
      def next(): IteratorResult[_, _] = js.native
      def next(value: js.Any): IteratorResult[_, _] = js.native
      
      def toArray(): js.Array[_] = js.native
      
      def values(): Iterator[_, _, js.UndefOr[scala.Nothing]] = js.native
    }
    
    @JSImport("cassandra-driver/lib/datastax/graph", "graph.asDouble")
    @js.native
    def asDouble(value: Double): js.Object = js.native
    
    @JSImport("cassandra-driver/lib/datastax/graph", "graph.asFloat")
    @js.native
    def asFloat(value: Double): js.Object = js.native
    
    @JSImport("cassandra-driver/lib/datastax/graph", "graph.asInt")
    @js.native
    def asInt(value: Double): js.Object = js.native
    
    @JSImport("cassandra-driver/lib/datastax/graph", "graph.asTimestamp")
    @js.native
    def asTimestamp(value: Date): js.Object = js.native
    
    @JSImport("cassandra-driver/lib/datastax/graph", "graph.asUdt")
    @js.native
    def asUdt(value: js.Object): js.Object = js.native
    
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
    
    @js.native
    trait Edge extends Element {
      
      var inV: js.UndefOr[Vertex] = js.native
      
      var inVLabel: js.UndefOr[String] = js.native
      
      var outV: js.UndefOr[Vertex] = js.native
      
      var outVLabel: js.UndefOr[String] = js.native
      
      var properties: js.UndefOr[js.Object] = js.native
    }
    object Edge {
      
      @scala.inline
      def apply(id: js.Any, label: String): Edge = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[Edge]
      }
      
      @scala.inline
      implicit class EdgeMutableBuilder[Self <: Edge] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInV(value: Vertex): Self = StObject.set(x, "inV", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInVLabel(value: String): Self = StObject.set(x, "inVLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInVLabelUndefined: Self = StObject.set(x, "inVLabel", js.undefined)
        
        @scala.inline
        def setInVUndefined: Self = StObject.set(x, "inV", js.undefined)
        
        @scala.inline
        def setOutV(value: Vertex): Self = StObject.set(x, "outV", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutVLabel(value: String): Self = StObject.set(x, "outVLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutVLabelUndefined: Self = StObject.set(x, "outVLabel", js.undefined)
        
        @scala.inline
        def setOutVUndefined: Self = StObject.set(x, "outV", js.undefined)
        
        @scala.inline
        def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      }
    }
    
    @js.native
    trait Element extends StObject {
      
      var id: js.Any = js.native
      
      var label: String = js.native
    }
    object Element {
      
      @scala.inline
      def apply(id: js.Any, label: String): Element = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[Element]
      }
      
      @scala.inline
      implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait EnumValue extends StObject
    
    @js.native
    trait Path extends StObject {
      
      var labels: js.Array[_] = js.native
      
      var objects: js.Array[_] = js.native
    }
    object Path {
      
      @scala.inline
      def apply(labels: js.Array[_], objects: js.Array[_]): Path = {
        val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
        __obj.asInstanceOf[Path]
      }
      
      @scala.inline
      implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLabels(value: js.Array[_]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelsVarargs(value: js.Any*): Self = StObject.set(x, "labels", js.Array(value :_*))
        
        @scala.inline
        def setObjects(value: js.Array[_]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObjectsVarargs(value: js.Any*): Self = StObject.set(x, "objects", js.Array(value :_*))
      }
    }
    
    @js.native
    trait Property extends StObject {
      
      var key: js.Any = js.native
      
      var value: js.Any = js.native
    }
    object Property {
      
      @scala.inline
      def apply(key: js.Any, value: js.Any): Property = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Property]
      }
      
      @scala.inline
      implicit class PropertyMutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Vertex extends Element {
      
      var properties: js.UndefOr[StringDictionary[js.Array[_]]] = js.native
    }
    object Vertex {
      
      @scala.inline
      def apply(id: js.Any, label: String): Vertex = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[Vertex]
      }
      
      @scala.inline
      implicit class VertexMutableBuilder[Self <: Vertex] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProperties(value: StringDictionary[js.Array[_]]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      }
    }
    
    @js.native
    trait VertexProperty extends Element {
      
      var key: String = js.native
      
      var properties: js.UndefOr[js.Any] = js.native
      
      var value: js.Any = js.native
    }
    object VertexProperty {
      
      @scala.inline
      def apply(id: js.Any, key: String, label: String, value: js.Any): VertexProperty = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[VertexProperty]
      }
      
      @scala.inline
      implicit class VertexPropertyMutableBuilder[Self <: VertexProperty] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
        
        @scala.inline
        def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
}
