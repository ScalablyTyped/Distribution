package typings.cssWhat

import typings.cssWhat.cssWhatStrings.`pseudo-element`
import typings.cssWhat.cssWhatStrings.attribute
import typings.cssWhat.cssWhatStrings.pseudo
import typings.cssWhat.cssWhatStrings.tag
import typings.cssWhat.cssWhatStrings.universal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @JSImport("css-what/lib/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(selector: String): js.Array[js.Array[Selector]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Selector]]]
  @scala.inline
  def default(selector: String, options: Options): js.Array[js.Array[Selector]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Selector]]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.cssWhat.cssWhatStrings.any
    - typings.cssWhat.cssWhatStrings.element
    - typings.cssWhat.cssWhatStrings.end
    - typings.cssWhat.cssWhatStrings.equals
    - typings.cssWhat.cssWhatStrings.exists
    - typings.cssWhat.cssWhatStrings.hyphen
    - typings.cssWhat.cssWhatStrings.not
    - typings.cssWhat.cssWhatStrings.start
  */
  trait AttributeAction extends StObject
  object AttributeAction {
    
    @scala.inline
    def any: typings.cssWhat.cssWhatStrings.any = "any".asInstanceOf[typings.cssWhat.cssWhatStrings.any]
    
    @scala.inline
    def element: typings.cssWhat.cssWhatStrings.element = "element".asInstanceOf[typings.cssWhat.cssWhatStrings.element]
    
    @scala.inline
    def end: typings.cssWhat.cssWhatStrings.end = "end".asInstanceOf[typings.cssWhat.cssWhatStrings.end]
    
    @scala.inline
    def equals: typings.cssWhat.cssWhatStrings.equals = "equals".asInstanceOf[typings.cssWhat.cssWhatStrings.equals]
    
    @scala.inline
    def exists: typings.cssWhat.cssWhatStrings.exists = "exists".asInstanceOf[typings.cssWhat.cssWhatStrings.exists]
    
    @scala.inline
    def hyphen: typings.cssWhat.cssWhatStrings.hyphen = "hyphen".asInstanceOf[typings.cssWhat.cssWhatStrings.hyphen]
    
    @scala.inline
    def not: typings.cssWhat.cssWhatStrings.not = "not".asInstanceOf[typings.cssWhat.cssWhatStrings.not]
    
    @scala.inline
    def start: typings.cssWhat.cssWhatStrings.start = "start".asInstanceOf[typings.cssWhat.cssWhatStrings.start]
  }
  
  trait AttributeSelector
    extends StObject
       with Selector {
    
    var action: AttributeAction
    
    var ignoreCase: Boolean
    
    var name: String
    
    var `type`: attribute
    
    var value: String
  }
  object AttributeSelector {
    
    @scala.inline
    def apply(action: AttributeAction, ignoreCase: Boolean, name: String, value: String): AttributeSelector = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], ignoreCase = ignoreCase.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("attribute")
      __obj.asInstanceOf[AttributeSelector]
    }
    
    @scala.inline
    implicit class AttributeSelectorMutableBuilder[Self <: AttributeSelector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: AttributeAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: attribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type DataType = js.Array[js.Array[Selector]] | Null | String
  
  trait Options extends StObject {
    
    var lowerCaseAttributeNames: js.UndefOr[Boolean] = js.undefined
    
    var lowerCaseTags: js.UndefOr[Boolean] = js.undefined
    
    var xmlMode: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLowerCaseAttributeNames(value: Boolean): Self = StObject.set(x, "lowerCaseAttributeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowerCaseAttributeNamesUndefined: Self = StObject.set(x, "lowerCaseAttributeNames", js.undefined)
      
      @scala.inline
      def setLowerCaseTags(value: Boolean): Self = StObject.set(x, "lowerCaseTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowerCaseTagsUndefined: Self = StObject.set(x, "lowerCaseTags", js.undefined)
      
      @scala.inline
      def setXmlMode(value: Boolean): Self = StObject.set(x, "xmlMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlModeUndefined: Self = StObject.set(x, "xmlMode", js.undefined)
    }
  }
  
  trait PseudoElement
    extends StObject
       with Selector {
    
    var name: String
    
    var `type`: `pseudo-element`
  }
  object PseudoElement {
    
    @scala.inline
    def apply(name: String): PseudoElement = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("pseudo-element")
      __obj.asInstanceOf[PseudoElement]
    }
    
    @scala.inline
    implicit class PseudoElementMutableBuilder[Self <: PseudoElement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: `pseudo-element`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PseudoSelector
    extends StObject
       with Selector {
    
    var data: DataType
    
    var name: String
    
    var `type`: pseudo
  }
  object PseudoSelector {
    
    @scala.inline
    def apply(name: String): PseudoSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], data = null)
      __obj.updateDynamic("type")("pseudo")
      __obj.asInstanceOf[PseudoSelector]
    }
    
    @scala.inline
    implicit class PseudoSelectorMutableBuilder[Self <: PseudoSelector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: DataType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataNull: Self = StObject.set(x, "data", null)
      
      @scala.inline
      def setDataVarargs(value: js.Array[Selector]*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: pseudo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cssWhat.parseMod.PseudoSelector
    - typings.cssWhat.parseMod.PseudoElement
    - typings.cssWhat.parseMod.AttributeSelector
    - typings.cssWhat.parseMod.TagSelector
    - typings.cssWhat.parseMod.UniversalSelector
    - typings.cssWhat.parseMod.Traversal
  */
  trait Selector extends StObject
  object Selector {
    
    @scala.inline
    def AttributeSelector(action: AttributeAction, ignoreCase: Boolean, name: String, value: String): typings.cssWhat.parseMod.AttributeSelector = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], ignoreCase = ignoreCase.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("attribute")
      __obj.asInstanceOf[typings.cssWhat.parseMod.AttributeSelector]
    }
    
    @scala.inline
    def PseudoElement(name: String): typings.cssWhat.parseMod.PseudoElement = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("pseudo-element")
      __obj.asInstanceOf[typings.cssWhat.parseMod.PseudoElement]
    }
    
    @scala.inline
    def PseudoSelector(name: String): typings.cssWhat.parseMod.PseudoSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], data = null)
      __obj.updateDynamic("type")("pseudo")
      __obj.asInstanceOf[typings.cssWhat.parseMod.PseudoSelector]
    }
    
    @scala.inline
    def TagSelector(name: String): typings.cssWhat.parseMod.TagSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("tag")
      __obj.asInstanceOf[typings.cssWhat.parseMod.TagSelector]
    }
    
    @scala.inline
    def Traversal(`type`: TraversalType): typings.cssWhat.parseMod.Traversal = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cssWhat.parseMod.Traversal]
    }
    
    @scala.inline
    def UniversalSelector(): typings.cssWhat.parseMod.UniversalSelector = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("universal")
      __obj.asInstanceOf[typings.cssWhat.parseMod.UniversalSelector]
    }
  }
  
  trait TagSelector
    extends StObject
       with Selector {
    
    var name: String
    
    var `type`: tag
  }
  object TagSelector {
    
    @scala.inline
    def apply(name: String): TagSelector = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("tag")
      __obj.asInstanceOf[TagSelector]
    }
    
    @scala.inline
    implicit class TagSelectorMutableBuilder[Self <: TagSelector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: tag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Traversal
    extends StObject
       with Selector {
    
    var `type`: TraversalType
  }
  object Traversal {
    
    @scala.inline
    def apply(`type`: TraversalType): Traversal = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Traversal]
    }
    
    @scala.inline
    implicit class TraversalMutableBuilder[Self <: Traversal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: TraversalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cssWhat.cssWhatStrings.adjacent
    - typings.cssWhat.cssWhatStrings.child
    - typings.cssWhat.cssWhatStrings.descendant
    - typings.cssWhat.cssWhatStrings.parent
    - typings.cssWhat.cssWhatStrings.sibling
  */
  trait TraversalType extends StObject
  object TraversalType {
    
    @scala.inline
    def adjacent: typings.cssWhat.cssWhatStrings.adjacent = "adjacent".asInstanceOf[typings.cssWhat.cssWhatStrings.adjacent]
    
    @scala.inline
    def child: typings.cssWhat.cssWhatStrings.child = "child".asInstanceOf[typings.cssWhat.cssWhatStrings.child]
    
    @scala.inline
    def descendant: typings.cssWhat.cssWhatStrings.descendant = "descendant".asInstanceOf[typings.cssWhat.cssWhatStrings.descendant]
    
    @scala.inline
    def parent: typings.cssWhat.cssWhatStrings.parent = "parent".asInstanceOf[typings.cssWhat.cssWhatStrings.parent]
    
    @scala.inline
    def sibling: typings.cssWhat.cssWhatStrings.sibling = "sibling".asInstanceOf[typings.cssWhat.cssWhatStrings.sibling]
  }
  
  trait UniversalSelector
    extends StObject
       with Selector {
    
    var `type`: universal
  }
  object UniversalSelector {
    
    @scala.inline
    def apply(): UniversalSelector = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("universal")
      __obj.asInstanceOf[UniversalSelector]
    }
    
    @scala.inline
    implicit class UniversalSelectorMutableBuilder[Self <: UniversalSelector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: universal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
