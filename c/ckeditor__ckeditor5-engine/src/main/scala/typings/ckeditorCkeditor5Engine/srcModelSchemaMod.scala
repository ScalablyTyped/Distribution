package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.both
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward
import typings.ckeditorCkeditor5Engine.srcModelItemMod.Item
import typings.std.Generator
import typings.std.Iterable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelSchemaMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/schema", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Schema
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/schema", "SchemaContext")
  @js.native
  open class SchemaContext protected ()
    extends StObject
       with Iterable[SchemaContextItem]
       with _SchemaContextDefinition {
    def this(context: SchemaContextDefinition) = this()
    
    def endsWith(query: String): Boolean = js.native
    
    def getItem(): SchemaContextItem = js.native
    
    def getNames(): Generator[String, Any, Any] = js.native
    
    var last: SchemaContextItem = js.native
    
    var length: Double = js.native
    
    def push(item: String): SchemaContext = js.native
    def push(item: js.Array[String | typings.ckeditorCkeditor5Engine.srcModelNodeMod.default]): SchemaContext = js.native
    def push(item: typings.ckeditorCkeditor5Engine.srcModelNodeMod.default): SchemaContext = js.native
    
    def startsWith(query: String): Boolean = js.native
  }
  
  trait AttributeProperties extends StObject {
    
    var copyOnEnter: js.UndefOr[Boolean] = js.undefined
    
    var isFormatting: js.UndefOr[Boolean] = js.undefined
  }
  object AttributeProperties {
    
    inline def apply(): AttributeProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributeProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttributeProperties] (val x: Self) extends AnyVal {
      
      inline def setCopyOnEnter(value: Boolean): Self = StObject.set(x, "copyOnEnter", value.asInstanceOf[js.Any])
      
      inline def setCopyOnEnterUndefined: Self = StObject.set(x, "copyOnEnter", js.undefined)
      
      inline def setIsFormatting(value: Boolean): Self = StObject.set(x, "isFormatting", value.asInstanceOf[js.Any])
      
      inline def setIsFormattingUndefined: Self = StObject.set(x, "isFormatting", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable * / any */ @js.native
  trait Schema extends StObject {
    
    def addAttributeCheck(callback: js.Function2[/* context */ SchemaContext, /* name */ String, Any]): Unit = js.native
    
    def addChildCheck(
      callback: js.Function2[/* context */ SchemaContext, /* item */ SchemaCompiledItemDefinition, Boolean]
    ): Unit = js.native
    
    def checkAttribute(context: SchemaContextDefinition, attributeName: String): Boolean = js.native
    
    def checkAttributeInSelection(selection: typings.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default, attribute: String): Boolean = js.native
    def checkAttributeInSelection(selection: typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default, attribute: String): Boolean = js.native
    
    def checkChild(context: SchemaContextDefinition, `def`: String): Boolean = js.native
    def checkChild(context: SchemaContextDefinition, `def`: typings.ckeditorCkeditor5Engine.srcModelNodeMod.default): Boolean = js.native
    
    def checkMerge(
      positionOrBaseElement: typings.ckeditorCkeditor5Engine.srcModelElementMod.default,
      elementToMerge: typings.ckeditorCkeditor5Engine.srcModelElementMod.default
    ): Boolean = js.native
    def checkMerge(
      positionOrBaseElement: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      elementToMerge: typings.ckeditorCkeditor5Engine.srcModelElementMod.default
    ): Boolean = js.native
    
    def createContext(context: SchemaContextDefinition): SchemaContext = js.native
    
    def extend(itemName: String, definition: SchemaItemDefinition): Unit = js.native
    
    def findAllowedParent(position: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default, node: String): typings.ckeditorCkeditor5Engine.srcModelElementMod.default | Null = js.native
    def findAllowedParent(
      position: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      node: typings.ckeditorCkeditor5Engine.srcModelNodeMod.default
    ): typings.ckeditorCkeditor5Engine.srcModelElementMod.default | Null = js.native
    
    def getAttributeProperties(attributeName: String): AttributeProperties = js.native
    
    def getDefinition(item: String): SchemaCompiledItemDefinition = js.native
    def getDefinition(item: Item): SchemaCompiledItemDefinition = js.native
    def getDefinition(item: SchemaContextItem): SchemaCompiledItemDefinition = js.native
    
    def getDefinitions(): Record[String, SchemaCompiledItemDefinition] = js.native
    
    def getLimitElement(selectionOrRangeOrPosition: typings.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default): typings.ckeditorCkeditor5Engine.srcModelElementMod.default = js.native
    def getLimitElement(selectionOrRangeOrPosition: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default): typings.ckeditorCkeditor5Engine.srcModelElementMod.default = js.native
    def getLimitElement(selectionOrRangeOrPosition: typings.ckeditorCkeditor5Engine.srcModelRangeMod.default): typings.ckeditorCkeditor5Engine.srcModelElementMod.default = js.native
    def getLimitElement(selectionOrRangeOrPosition: typings.ckeditorCkeditor5Engine.srcModelSelectionMod.default): typings.ckeditorCkeditor5Engine.srcModelElementMod.default = js.native
    
    def getNearestSelectionRange(position: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default | Null = js.native
    def getNearestSelectionRange(
      position: typings.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      direction: both | forward | backward
    ): typings.ckeditorCkeditor5Engine.srcModelRangeMod.default | Null = js.native
    
    def getValidRanges(ranges: js.Array[typings.ckeditorCkeditor5Engine.srcModelRangeMod.default], attribute: String): Generator[typings.ckeditorCkeditor5Engine.srcModelRangeMod.default, Any, Any] = js.native
    
    def isBlock(item: String): Boolean = js.native
    def isBlock(item: Item): Boolean = js.native
    def isBlock(item: SchemaContextItem): Boolean = js.native
    
    def isContent(item: String): Boolean = js.native
    def isContent(item: Item): Boolean = js.native
    def isContent(item: SchemaContextItem): Boolean = js.native
    
    def isInline(item: String): Boolean = js.native
    def isInline(item: Item): Boolean = js.native
    def isInline(item: SchemaContextItem): Boolean = js.native
    
    def isLimit(item: String): Boolean = js.native
    def isLimit(item: Item): Boolean = js.native
    def isLimit(item: SchemaContextItem): Boolean = js.native
    
    def isObject(item: String): Boolean = js.native
    def isObject(item: Item): Boolean = js.native
    def isObject(item: SchemaContextItem): Boolean = js.native
    
    def isRegistered(item: String): Boolean = js.native
    def isRegistered(item: Item): Boolean = js.native
    def isRegistered(item: SchemaContextItem): Boolean = js.native
    
    def isSelectable(item: String): Boolean = js.native
    def isSelectable(item: Item): Boolean = js.native
    def isSelectable(item: SchemaContextItem): Boolean = js.native
    
    def register(itemName: String, definition: SchemaItemDefinition): Unit = js.native
    
    def removeDisallowedAttributes(
      nodes: js.Iterable[typings.ckeditorCkeditor5Engine.srcModelNodeMod.default],
      writer: typings.ckeditorCkeditor5Engine.srcModelWriterMod.default
    ): Unit = js.native
    
    def setAttributeProperties(attributeName: String, properties: AttributeProperties): Unit = js.native
  }
  
  trait SchemaCompiledItemDefinition extends StObject {
    
    var allowAttributes: js.Array[String]
    
    var allowIn: js.Array[String]
    
    var isBlock: Boolean
    
    var isContent: Boolean
    
    var isInline: Boolean
    
    var isLimit: Boolean
    
    var isObject: Boolean
    
    var isSelectable: Boolean
    
    var name: String
  }
  object SchemaCompiledItemDefinition {
    
    inline def apply(
      allowAttributes: js.Array[String],
      allowIn: js.Array[String],
      isBlock: Boolean,
      isContent: Boolean,
      isInline: Boolean,
      isLimit: Boolean,
      isObject: Boolean,
      isSelectable: Boolean,
      name: String
    ): SchemaCompiledItemDefinition = {
      val __obj = js.Dynamic.literal(allowAttributes = allowAttributes.asInstanceOf[js.Any], allowIn = allowIn.asInstanceOf[js.Any], isBlock = isBlock.asInstanceOf[js.Any], isContent = isContent.asInstanceOf[js.Any], isInline = isInline.asInstanceOf[js.Any], isLimit = isLimit.asInstanceOf[js.Any], isObject = isObject.asInstanceOf[js.Any], isSelectable = isSelectable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaCompiledItemDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SchemaCompiledItemDefinition] (val x: Self) extends AnyVal {
      
      inline def setAllowAttributes(value: js.Array[String]): Self = StObject.set(x, "allowAttributes", value.asInstanceOf[js.Any])
      
      inline def setAllowAttributesVarargs(value: String*): Self = StObject.set(x, "allowAttributes", js.Array(value*))
      
      inline def setAllowIn(value: js.Array[String]): Self = StObject.set(x, "allowIn", value.asInstanceOf[js.Any])
      
      inline def setAllowInVarargs(value: String*): Self = StObject.set(x, "allowIn", js.Array(value*))
      
      inline def setIsBlock(value: Boolean): Self = StObject.set(x, "isBlock", value.asInstanceOf[js.Any])
      
      inline def setIsContent(value: Boolean): Self = StObject.set(x, "isContent", value.asInstanceOf[js.Any])
      
      inline def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
      
      inline def setIsLimit(value: Boolean): Self = StObject.set(x, "isLimit", value.asInstanceOf[js.Any])
      
      inline def setIsObject(value: Boolean): Self = StObject.set(x, "isObject", value.asInstanceOf[js.Any])
      
      inline def setIsSelectable(value: Boolean): Self = StObject.set(x, "isSelectable", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Engine.srcModelItemMod.Item
    - typings.ckeditorCkeditor5Engine.srcModelPositionMod.default
    - typings.ckeditorCkeditor5Engine.srcModelSchemaMod.SchemaContext
    - java.lang.String
    - js.Array[java.lang.String | typings.ckeditorCkeditor5Engine.srcModelItemMod.Item]
  */
  type SchemaContextDefinition = _SchemaContextDefinition | (js.Array[String | Item]) | String
  
  trait SchemaContextItem extends StObject {
    
    def getAttribute(keyName: String): Boolean | String | Double
    
    def getAttributeKeys(): Generator[String, Any, Any]
    
    var name: String
  }
  object SchemaContextItem {
    
    inline def apply(
      getAttribute: String => Boolean | String | Double,
      getAttributeKeys: () => Generator[String, Any, Any],
      name: String
    ): SchemaContextItem = {
      val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction1(getAttribute), getAttributeKeys = js.Any.fromFunction0(getAttributeKeys), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaContextItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SchemaContextItem] (val x: Self) extends AnyVal {
      
      inline def setGetAttribute(value: String => Boolean | String | Double): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
      
      inline def setGetAttributeKeys(value: () => Generator[String, Any, Any]): Self = StObject.set(x, "getAttributeKeys", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait SchemaItemDefinition extends StObject {
    
    var allowAttributes: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var allowAttributesOf: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var allowChildren: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var allowContentOf: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var allowIn: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var allowWhere: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var inheritAllFrom: js.UndefOr[String] = js.undefined
    
    var inheritTypesFrom: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var isBlock: js.UndefOr[Boolean] = js.undefined
    
    var isContent: js.UndefOr[Boolean] = js.undefined
    
    var isInline: js.UndefOr[Boolean] = js.undefined
    
    var isLimit: js.UndefOr[Boolean] = js.undefined
    
    var isObject: js.UndefOr[Boolean] = js.undefined
    
    var isSelectable: js.UndefOr[Boolean] = js.undefined
  }
  object SchemaItemDefinition {
    
    inline def apply(): SchemaItemDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaItemDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SchemaItemDefinition] (val x: Self) extends AnyVal {
      
      inline def setAllowAttributes(value: String | js.Array[String]): Self = StObject.set(x, "allowAttributes", value.asInstanceOf[js.Any])
      
      inline def setAllowAttributesOf(value: String | js.Array[String]): Self = StObject.set(x, "allowAttributesOf", value.asInstanceOf[js.Any])
      
      inline def setAllowAttributesOfUndefined: Self = StObject.set(x, "allowAttributesOf", js.undefined)
      
      inline def setAllowAttributesOfVarargs(value: String*): Self = StObject.set(x, "allowAttributesOf", js.Array(value*))
      
      inline def setAllowAttributesUndefined: Self = StObject.set(x, "allowAttributes", js.undefined)
      
      inline def setAllowAttributesVarargs(value: String*): Self = StObject.set(x, "allowAttributes", js.Array(value*))
      
      inline def setAllowChildren(value: String | js.Array[String]): Self = StObject.set(x, "allowChildren", value.asInstanceOf[js.Any])
      
      inline def setAllowChildrenUndefined: Self = StObject.set(x, "allowChildren", js.undefined)
      
      inline def setAllowChildrenVarargs(value: String*): Self = StObject.set(x, "allowChildren", js.Array(value*))
      
      inline def setAllowContentOf(value: String | js.Array[String]): Self = StObject.set(x, "allowContentOf", value.asInstanceOf[js.Any])
      
      inline def setAllowContentOfUndefined: Self = StObject.set(x, "allowContentOf", js.undefined)
      
      inline def setAllowContentOfVarargs(value: String*): Self = StObject.set(x, "allowContentOf", js.Array(value*))
      
      inline def setAllowIn(value: String | js.Array[String]): Self = StObject.set(x, "allowIn", value.asInstanceOf[js.Any])
      
      inline def setAllowInUndefined: Self = StObject.set(x, "allowIn", js.undefined)
      
      inline def setAllowInVarargs(value: String*): Self = StObject.set(x, "allowIn", js.Array(value*))
      
      inline def setAllowWhere(value: String | js.Array[String]): Self = StObject.set(x, "allowWhere", value.asInstanceOf[js.Any])
      
      inline def setAllowWhereUndefined: Self = StObject.set(x, "allowWhere", js.undefined)
      
      inline def setAllowWhereVarargs(value: String*): Self = StObject.set(x, "allowWhere", js.Array(value*))
      
      inline def setInheritAllFrom(value: String): Self = StObject.set(x, "inheritAllFrom", value.asInstanceOf[js.Any])
      
      inline def setInheritAllFromUndefined: Self = StObject.set(x, "inheritAllFrom", js.undefined)
      
      inline def setInheritTypesFrom(value: String | js.Array[String]): Self = StObject.set(x, "inheritTypesFrom", value.asInstanceOf[js.Any])
      
      inline def setInheritTypesFromUndefined: Self = StObject.set(x, "inheritTypesFrom", js.undefined)
      
      inline def setInheritTypesFromVarargs(value: String*): Self = StObject.set(x, "inheritTypesFrom", js.Array(value*))
      
      inline def setIsBlock(value: Boolean): Self = StObject.set(x, "isBlock", value.asInstanceOf[js.Any])
      
      inline def setIsBlockUndefined: Self = StObject.set(x, "isBlock", js.undefined)
      
      inline def setIsContent(value: Boolean): Self = StObject.set(x, "isContent", value.asInstanceOf[js.Any])
      
      inline def setIsContentUndefined: Self = StObject.set(x, "isContent", js.undefined)
      
      inline def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
      
      inline def setIsInlineUndefined: Self = StObject.set(x, "isInline", js.undefined)
      
      inline def setIsLimit(value: Boolean): Self = StObject.set(x, "isLimit", value.asInstanceOf[js.Any])
      
      inline def setIsLimitUndefined: Self = StObject.set(x, "isLimit", js.undefined)
      
      inline def setIsObject(value: Boolean): Self = StObject.set(x, "isObject", value.asInstanceOf[js.Any])
      
      inline def setIsObjectUndefined: Self = StObject.set(x, "isObject", js.undefined)
      
      inline def setIsSelectable(value: Boolean): Self = StObject.set(x, "isSelectable", value.asInstanceOf[js.Any])
      
      inline def setIsSelectableUndefined: Self = StObject.set(x, "isSelectable", js.undefined)
    }
  }
  
  trait _SchemaContextDefinition extends StObject
}
