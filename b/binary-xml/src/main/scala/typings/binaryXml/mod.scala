package typings.binaryXml

import typings.binaryXml.anon.RawType
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* was `typeof BinaryXmlParser` */
  @JSImport("binary-xml", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with BinaryXmlParser {
    def this(buffer: Buffer) = this()
    def this(buffer: Buffer, options: Options) = this()
    
    /* CompleteClass */
    override def parse(): Document = js.native
  }
  
  trait Attribute extends StObject {
    
    var name: String
    
    var namespaceURI: String
    
    var nodeName: String
    
    var nodeType: Double
    
    var typedValue: RawType
    
    var value: Any
  }
  object Attribute {
    
    inline def apply(
      name: String,
      namespaceURI: String,
      nodeName: String,
      nodeType: Double,
      typedValue: RawType,
      value: Any
    ): Attribute = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], typedValue = typedValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attribute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: Double): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setTypedValue(value: RawType): Self = StObject.set(x, "typedValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* was `typeof BinaryXmlParser` */
  type BinaryXML = BinaryXmlParser
  
  trait BinaryXmlParser extends StObject {
    
    def parse(): Document
  }
  object BinaryXmlParser {
    
    inline def apply(parse: () => Document): BinaryXmlParser = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction0(parse))
      __obj.asInstanceOf[BinaryXmlParser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BinaryXmlParser] (val x: Self) extends AnyVal {
      
      inline def setParse(value: () => Document): Self = StObject.set(x, "parse", js.Any.fromFunction0(value))
    }
  }
  
  trait ChildNode extends StObject {
    
    var attributes: js.Array[Attribute]
    
    var childNodes: js.Array[ChildNode]
    
    var namespaceURI: String
    
    var nodeName: String
    
    var nodeType: Double
  }
  object ChildNode {
    
    inline def apply(
      attributes: js.Array[Attribute],
      childNodes: js.Array[ChildNode],
      namespaceURI: String,
      nodeName: String,
      nodeType: Double
    ): ChildNode = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], namespaceURI = namespaceURI.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChildNode] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setChildNodes(value: js.Array[ChildNode]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      inline def setChildNodesVarargs(value: ChildNode*): Self = StObject.set(x, "childNodes", js.Array(value*))
      
      inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: Double): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Document extends StObject {
    
    var attributes: js.Array[Attribute]
    
    var childNodes: js.Array[ChildNode]
    
    var namespaceURI: String | Null
    
    var nodeName: String | Null
    
    var nodeType: Double
  }
  object Document {
    
    inline def apply(attributes: js.Array[Attribute], childNodes: js.Array[ChildNode], nodeType: Double): Document = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], namespaceURI = null, nodeName = null)
      __obj.asInstanceOf[Document]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setChildNodes(value: js.Array[ChildNode]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
      
      inline def setChildNodesVarargs(value: ChildNode*): Self = StObject.set(x, "childNodes", js.Array(value*))
      
      inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
      
      inline def setNamespaceURINull: Self = StObject.set(x, "namespaceURI", null)
      
      inline def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
      
      inline def setNodeNameNull: Self = StObject.set(x, "nodeName", null)
      
      inline def setNodeType(value: Double): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
}
