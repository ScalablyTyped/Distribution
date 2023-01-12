package typings.chevrotainGast

import typings.chevrotainGast.libSrcModelMod.Alternative
import typings.chevrotainGast.libSrcModelMod.Rule
import typings.chevrotainTypes.mod.IGASTVisitor
import typings.chevrotainTypes.mod.IProduction
import typings.chevrotainTypes.mod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Definition extends StObject {
    
    var definition: js.Array[IProduction]
    
    var name: String
    
    var orgText: js.UndefOr[String] = js.undefined
  }
  object Definition {
    
    inline def apply(definition: js.Array[IProduction], name: String): Definition = {
      val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Definition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
      
      inline def setDefinition(value: js.Array[IProduction]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionVarargs(value: IProduction*): Self = StObject.set(x, "definition", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOrgText(value: String): Self = StObject.set(x, "orgText", value.asInstanceOf[js.Any])
      
      inline def setOrgTextUndefined: Self = StObject.set(x, "orgText", js.undefined)
    }
  }
  
  trait HasPredicates extends StObject {
    
    var definition: js.Array[Alternative]
    
    var hasPredicates: js.UndefOr[Boolean] = js.undefined
    
    var idx: js.UndefOr[Double] = js.undefined
    
    var ignoreAmbiguities: js.UndefOr[Boolean] = js.undefined
    
    var maxLookahead: js.UndefOr[Double] = js.undefined
  }
  object HasPredicates {
    
    inline def apply(definition: js.Array[Alternative]): HasPredicates = {
      val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasPredicates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HasPredicates] (val x: Self) extends AnyVal {
      
      inline def setDefinition(value: js.Array[Alternative]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionVarargs(value: Alternative*): Self = StObject.set(x, "definition", js.Array(value*))
      
      inline def setHasPredicates(value: Boolean): Self = StObject.set(x, "hasPredicates", value.asInstanceOf[js.Any])
      
      inline def setHasPredicatesUndefined: Self = StObject.set(x, "hasPredicates", js.undefined)
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
      
      inline def setIgnoreAmbiguities(value: Boolean): Self = StObject.set(x, "ignoreAmbiguities", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAmbiguitiesUndefined: Self = StObject.set(x, "ignoreAmbiguities", js.undefined)
      
      inline def setMaxLookahead(value: Double): Self = StObject.set(x, "maxLookahead", value.asInstanceOf[js.Any])
      
      inline def setMaxLookaheadUndefined: Self = StObject.set(x, "maxLookahead", js.undefined)
    }
  }
  
  trait Idx extends StObject {
    
    var idx: js.UndefOr[Double] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var terminalType: TokenType
  }
  object Idx {
    
    inline def apply(terminalType: TokenType): Idx = {
      val __obj = js.Dynamic.literal(terminalType = terminalType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Idx]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Idx] (val x: Self) extends AnyVal {
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setTerminalType(value: TokenType): Self = StObject.set(x, "terminalType", value.asInstanceOf[js.Any])
    }
  }
  
  trait IgnoreAmbiguities extends StObject {
    
    var definition: js.Array[IProduction]
    
    var ignoreAmbiguities: js.UndefOr[Boolean] = js.undefined
  }
  object IgnoreAmbiguities {
    
    inline def apply(definition: js.Array[IProduction]): IgnoreAmbiguities = {
      val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
      __obj.asInstanceOf[IgnoreAmbiguities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IgnoreAmbiguities] (val x: Self) extends AnyVal {
      
      inline def setDefinition(value: js.Array[IProduction]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionVarargs(value: IProduction*): Self = StObject.set(x, "definition", js.Array(value*))
      
      inline def setIgnoreAmbiguities(value: Boolean): Self = StObject.set(x, "ignoreAmbiguities", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAmbiguitiesUndefined: Self = StObject.set(x, "ignoreAmbiguities", js.undefined)
    }
  }
  
  trait Label extends StObject {
    
    var idx: js.UndefOr[Double] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var nonTerminalName: String
    
    var referencedRule: js.UndefOr[Rule] = js.undefined
  }
  object Label {
    
    inline def apply(nonTerminalName: String): Label = {
      val __obj = js.Dynamic.literal(nonTerminalName = nonTerminalName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setNonTerminalName(value: String): Self = StObject.set(x, "nonTerminalName", value.asInstanceOf[js.Any])
      
      inline def setReferencedRule(value: Rule): Self = StObject.set(x, "referencedRule", value.asInstanceOf[js.Any])
      
      inline def setReferencedRuleUndefined: Self = StObject.set(x, "referencedRule", js.undefined)
    }
  }
  
  trait MaxLookahead extends StObject {
    
    var definition: js.Array[IProduction]
    
    var idx: js.UndefOr[Double] = js.undefined
    
    var maxLookahead: js.UndefOr[Double] = js.undefined
  }
  object MaxLookahead {
    
    inline def apply(definition: js.Array[IProduction]): MaxLookahead = {
      val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxLookahead]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxLookahead] (val x: Self) extends AnyVal {
      
      inline def setDefinition(value: js.Array[IProduction]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionVarargs(value: IProduction*): Self = StObject.set(x, "definition", js.Array(value*))
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
      
      inline def setMaxLookahead(value: Double): Self = StObject.set(x, "maxLookahead", value.asInstanceOf[js.Any])
      
      inline def setMaxLookaheadUndefined: Self = StObject.set(x, "maxLookahead", js.undefined)
    }
  }
  
  trait Separator extends StObject {
    
    var definition: js.Array[IProduction]
    
    var idx: js.UndefOr[Double] = js.undefined
    
    var separator: TokenType
  }
  object Separator {
    
    inline def apply(definition: js.Array[IProduction], separator: TokenType): Separator = {
      val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Separator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Separator] (val x: Self) extends AnyVal {
      
      inline def setDefinition(value: js.Array[IProduction]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionVarargs(value: IProduction*): Self = StObject.set(x, "definition", js.Array(value*))
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
      
      inline def setSeparator(value: TokenType): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  definition :std.Array<@chevrotain/types.@chevrotain/types.IProduction>} & @chevrotain/types.@chevrotain/types.IProduction */
  trait definitionArrayIProductio extends StObject {
    
    def accept(visitor: IGASTVisitor): Unit
    
    var definition: js.Array[IProduction]
  }
  object definitionArrayIProductio {
    
    inline def apply(accept: IGASTVisitor => Unit, definition: js.Array[IProduction]): definitionArrayIProductio = {
      val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), definition = definition.asInstanceOf[js.Any])
      __obj.asInstanceOf[definitionArrayIProductio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: definitionArrayIProductio] (val x: Self) extends AnyVal {
      
      inline def setAccept(value: IGASTVisitor => Unit): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
      
      inline def setDefinition(value: js.Array[IProduction]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionVarargs(value: IProduction*): Self = StObject.set(x, "definition", js.Array(value*))
    }
  }
}
