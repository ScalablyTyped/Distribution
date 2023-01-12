package typings.contentstackUtils

import org.scalablytyped.runtime.StringDictionary
import typings.contentstackUtils.anon.Node
import typings.contentstackUtils.distTypesNodesDocumentMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModelsJsonRteModelMod {
  
  trait EmbeddedConnection extends StObject {
    
    var edges: js.Array[Node]
  }
  object EmbeddedConnection {
    
    inline def apply(edges: js.Array[Node]): EmbeddedConnection = {
      val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmbeddedConnection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmbeddedConnection] (val x: Self) extends AnyVal {
      
      inline def setEdges(value: js.Array[Node]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      inline def setEdgesVarargs(value: Node*): Self = StObject.set(x, "edges", js.Array(value*))
    }
  }
  
  trait EntryNode
    extends StObject
       with /* propName */ StringDictionary[Any] {
    
    var system: SystemField
  }
  object EntryNode {
    
    inline def apply(system: SystemField): EntryNode = {
      val __obj = js.Dynamic.literal(system = system.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntryNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EntryNode] (val x: Self) extends AnyVal {
      
      inline def setSystem(value: SystemField): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsonRTE extends StObject {
    
    var embedded_itemsConnection: js.UndefOr[EmbeddedConnection] = js.undefined
    
    var json: default | js.Array[default]
  }
  object JsonRTE {
    
    inline def apply(json: default | js.Array[default]): JsonRTE = {
      val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonRTE]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonRTE] (val x: Self) extends AnyVal {
      
      inline def setEmbedded_itemsConnection(value: EmbeddedConnection): Self = StObject.set(x, "embedded_itemsConnection", value.asInstanceOf[js.Any])
      
      inline def setEmbedded_itemsConnectionUndefined: Self = StObject.set(x, "embedded_itemsConnection", js.undefined)
      
      inline def setJson(value: default | js.Array[default]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonVarargs(value: default*): Self = StObject.set(x, "json", js.Array(value*))
    }
  }
  
  trait SystemField
    extends StObject
       with /* propName */ StringDictionary[Any] {
    
    var content_type_uid: js.UndefOr[String] = js.undefined
    
    var uid: String
  }
  object SystemField {
    
    inline def apply(uid: String): SystemField = {
      val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SystemField]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SystemField] (val x: Self) extends AnyVal {
      
      inline def setContent_type_uid(value: String): Self = StObject.set(x, "content_type_uid", value.asInstanceOf[js.Any])
      
      inline def setContent_type_uidUndefined: Self = StObject.set(x, "content_type_uid", js.undefined)
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
}
