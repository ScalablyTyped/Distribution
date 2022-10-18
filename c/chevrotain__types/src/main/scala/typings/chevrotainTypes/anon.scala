package typings.chevrotainTypes

import org.scalablytyped.runtime.Instantiable1
import typings.chevrotainTypes.mod.ICstVisitor
import typings.chevrotainTypes.mod.IProduction
import typings.chevrotainTypes.mod.IToken
import typings.chevrotainTypes.mod.Rule
import typings.chevrotainTypes.mod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Actual extends StObject {
    
    var actual: IToken
    
    var expected: TokenType
    
    var previous: IToken
    
    var ruleName: String
  }
  object Actual {
    
    inline def apply(actual: IToken, expected: TokenType, previous: IToken, ruleName: String): Actual = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Actual]
    }
    
    extension [Self <: Actual](x: Self) {
      
      inline def setActual(value: IToken): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setExpected(value: TokenType): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      inline def setPrevious(value: IToken): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomUserDescription extends StObject {
    
    var actual: js.Array[IToken]
    
    var customUserDescription: js.UndefOr[String] = js.undefined
    
    var expectedPathsPerAlt: js.Array[js.Array[js.Array[TokenType]]]
    
    var previous: IToken
    
    var ruleName: String
  }
  object CustomUserDescription {
    
    inline def apply(
      actual: js.Array[IToken],
      expectedPathsPerAlt: js.Array[js.Array[js.Array[TokenType]]],
      previous: IToken,
      ruleName: String
    ): CustomUserDescription = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expectedPathsPerAlt = expectedPathsPerAlt.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomUserDescription]
    }
    
    extension [Self <: CustomUserDescription](x: Self) {
      
      inline def setActual(value: js.Array[IToken]): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setActualVarargs(value: IToken*): Self = StObject.set(x, "actual", js.Array(value*))
      
      inline def setCustomUserDescription(value: String): Self = StObject.set(x, "customUserDescription", value.asInstanceOf[js.Any])
      
      inline def setCustomUserDescriptionUndefined: Self = StObject.set(x, "customUserDescription", js.undefined)
      
      inline def setExpectedPathsPerAlt(value: js.Array[js.Array[js.Array[TokenType]]]): Self = StObject.set(x, "expectedPathsPerAlt", value.asInstanceOf[js.Any])
      
      inline def setExpectedPathsPerAltVarargs(value: js.Array[js.Array[TokenType]]*): Self = StObject.set(x, "expectedPathsPerAlt", js.Array(value*))
      
      inline def setPrevious(value: IToken): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Definition extends StObject {
    
    var definition: js.Array[IProduction]
    
    var idx: js.UndefOr[Double] = js.undefined
  }
  object Definition {
    
    inline def apply(definition: js.Array[IProduction]): Definition = {
      val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
      __obj.asInstanceOf[Definition]
    }
    
    extension [Self <: Definition](x: Self) {
      
      inline def setDefinition(value: js.Array[IProduction]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionVarargs(value: IProduction*): Self = StObject.set(x, "definition", js.Array(value*))
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
    }
  }
  
  trait ExpectedIterationPaths extends StObject {
    
    var actual: js.Array[IToken]
    
    var customUserDescription: js.UndefOr[String] = js.undefined
    
    var expectedIterationPaths: js.Array[js.Array[TokenType]]
    
    var previous: IToken
    
    var ruleName: String
  }
  object ExpectedIterationPaths {
    
    inline def apply(
      actual: js.Array[IToken],
      expectedIterationPaths: js.Array[js.Array[TokenType]],
      previous: IToken,
      ruleName: String
    ): ExpectedIterationPaths = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expectedIterationPaths = expectedIterationPaths.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpectedIterationPaths]
    }
    
    extension [Self <: ExpectedIterationPaths](x: Self) {
      
      inline def setActual(value: js.Array[IToken]): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setActualVarargs(value: IToken*): Self = StObject.set(x, "actual", js.Array(value*))
      
      inline def setCustomUserDescription(value: String): Self = StObject.set(x, "customUserDescription", value.asInstanceOf[js.Any])
      
      inline def setCustomUserDescriptionUndefined: Self = StObject.set(x, "customUserDescription", js.undefined)
      
      inline def setExpectedIterationPaths(value: js.Array[js.Array[TokenType]]): Self = StObject.set(x, "expectedIterationPaths", value.asInstanceOf[js.Any])
      
      inline def setExpectedIterationPathsVarargs(value: js.Array[TokenType]*): Self = StObject.set(x, "expectedIterationPaths", js.Array(value*))
      
      inline def setPrevious(value: IToken): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    }
  }
  
  trait FirstRedundant extends StObject {
    
    var firstRedundant: IToken
    
    var ruleName: String
  }
  object FirstRedundant {
    
    inline def apply(firstRedundant: IToken, ruleName: String): FirstRedundant = {
      val __obj = js.Dynamic.literal(firstRedundant = firstRedundant.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirstRedundant]
    }
    
    extension [Self <: FirstRedundant](x: Self) {
      
      inline def setFirstRedundant(value: IToken): Self = StObject.set(x, "firstRedundant", value.asInstanceOf[js.Any])
      
      inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Idx extends StObject {
    
    var idx: js.UndefOr[Double] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var nonTerminalName: String
    
    var referencedRule: js.UndefOr[Rule] = js.undefined
  }
  object Idx {
    
    inline def apply(nonTerminalName: String): Idx = {
      val __obj = js.Dynamic.literal(nonTerminalName = nonTerminalName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Idx]
    }
    
    extension [Self <: Idx](x: Self) {
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setNonTerminalName(value: String): Self = StObject.set(x, "nonTerminalName", value.asInstanceOf[js.Any])
      
      inline def setReferencedRule(value: Rule): Self = StObject.set(x, "referencedRule", value.asInstanceOf[js.Any])
      
      inline def setReferencedRuleUndefined: Self = StObject.set(x, "referencedRule", js.undefined)
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
    
    extension [Self <: IgnoreAmbiguities](x: Self) {
      
      inline def setDefinition(value: js.Array[IProduction]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionVarargs(value: IProduction*): Self = StObject.set(x, "definition", js.Array(value*))
      
      inline def setIgnoreAmbiguities(value: Boolean): Self = StObject.set(x, "ignoreAmbiguities", value.asInstanceOf[js.Any])
      
      inline def setIgnoreAmbiguitiesUndefined: Self = StObject.set(x, "ignoreAmbiguities", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable[IN, OUT]
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, ICstVisitor[IN, OUT]]
  
  trait Label extends StObject {
    
    var idx: js.UndefOr[Double] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var terminalType: TokenType
  }
  object Label {
    
    inline def apply(terminalType: TokenType): Label = {
      val __obj = js.Dynamic.literal(terminalType = terminalType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setTerminalType(value: TokenType): Self = StObject.set(x, "terminalType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var definition: js.Array[IProduction]
    
    var idx: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    inline def apply(definition: js.Array[IProduction]): Name = {
      val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setDefinition(value: js.Array[IProduction]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionVarargs(value: IProduction*): Self = StObject.set(x, "definition", js.Array(value*))
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait OrgText extends StObject {
    
    var definition: js.Array[IProduction]
    
    var name: String
    
    var orgText: js.UndefOr[String] = js.undefined
  }
  object OrgText {
    
    inline def apply(definition: js.Array[IProduction], name: String): OrgText = {
      val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrgText]
    }
    
    extension [Self <: OrgText](x: Self) {
      
      inline def setDefinition(value: js.Array[IProduction]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionVarargs(value: IProduction*): Self = StObject.set(x, "definition", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOrgText(value: String): Self = StObject.set(x, "orgText", value.asInstanceOf[js.Any])
      
      inline def setOrgTextUndefined: Self = StObject.set(x, "orgText", js.undefined)
    }
  }
  
  trait Payload extends StObject {
    
    var payload: js.UndefOr[Any] = js.undefined
  }
  object Payload {
    
    inline def apply(): Payload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Payload]
    }
    
    extension [Self <: Payload](x: Self) {
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  trait Separator extends StObject {
    
    var definition: js.Array[IProduction]
    
    var idx: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var separator: TokenType
  }
  object Separator {
    
    inline def apply(definition: js.Array[IProduction], separator: TokenType): Separator = {
      val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Separator]
    }
    
    extension [Self <: Separator](x: Self) {
      
      inline def setDefinition(value: js.Array[IProduction]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionVarargs(value: IProduction*): Self = StObject.set(x, "definition", js.Array(value*))
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSeparator(value: TokenType): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    }
  }
}
