package typings.tslintXANLscI2

import typings.tslintXANLscI2.mod.Rules.TypedRule
import typings.tslintXANLscI2.ruleDTsMod.IOptions
import typings.tslintXANLscI2.ruleDTsMod.IRuleMetadata
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`0`
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`1`
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`2`
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`3`
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`4`
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`5`
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`6`
import typings.tslintXANLscI2.tslintXANLscI2Numbers.`7`
import typings.typescript.mod.BaseType
import typings.typescript.mod.BinaryExpression
import typings.typescript.mod.ConditionalExpression
import typings.typescript.mod.DoStatement
import typings.typescript.mod.ForStatement
import typings.typescript.mod.IfStatement
import typings.typescript.mod.PrefixUnaryExpression
import typings.typescript.mod.Signature
import typings.typescript.mod.Symbol
import typings.typescript.mod.Type
import typings.typescript.mod.TypeFlags
import typings.typescript.mod.WhileStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strictBooleanExpressionsRuleDTsMod {
  
  @JSImport(".tslint-xANLscI2/lib/rules/strictBooleanExpressionsRule.d.ts", "Rule")
  @js.native
  open class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport(".tslint-xANLscI2/lib/rules/strictBooleanExpressionsRule.d.ts", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".tslint-xANLscI2/lib/rules/strictBooleanExpressionsRule.d.ts", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  type Location = PrefixUnaryExpression | IfStatement | WhileStatement | DoStatement | ForStatement | ConditionalExpression | BinaryExpression
  
  /* Rewritten from type alias, can be one of: 
    - typings.tslintXANLscI2.tslintXANLscI2Numbers.`0`
    - typings.tslintXANLscI2.tslintXANLscI2Numbers.`1`
    - typings.tslintXANLscI2.tslintXANLscI2Numbers.`2`
    - typings.tslintXANLscI2.tslintXANLscI2Numbers.`3`
    - typings.tslintXANLscI2.tslintXANLscI2Numbers.`4`
    - typings.tslintXANLscI2.tslintXANLscI2Numbers.`5`
    - typings.tslintXANLscI2.tslintXANLscI2Numbers.`6`
    - typings.tslintXANLscI2.tslintXANLscI2Numbers.`7`
  */
  trait TypeFailure extends StObject
  object TypeFailure {
    
    inline def AlwaysFalsy: `1` = 1.asInstanceOf[`1`]
    
    inline def AlwaysTruthy: `0` = 0.asInstanceOf[`0`]
    
    inline def Enum: `6` = 6.asInstanceOf[`6`]
    
    inline def Mixes: `7` = 7.asInstanceOf[`7`]
    
    inline def Null: `4` = 4.asInstanceOf[`4`]
    
    inline def Number: `3` = 3.asInstanceOf[`3`]
    
    inline def String: `2` = 2.asInstanceOf[`2`]
    
    inline def Undefined: `5` = 5.asInstanceOf[`5`]
  }
  
  /* augmented module */
  object typescriptAugmentingMod {
    
    trait IntrinsicType
      extends StObject
         with Type {
      
      var intrinsicName: String
    }
    object IntrinsicType {
      
      inline def apply(
        flags: TypeFlags,
        getApparentProperties: () => js.Array[Symbol],
        getBaseTypes: () => js.UndefOr[js.Array[BaseType]],
        getCallSignatures: () => js.Array[Signature],
        getConstraint: () => js.UndefOr[Type],
        getConstructSignatures: () => js.Array[Signature],
        getDefault: () => js.UndefOr[Type],
        getFlags: () => TypeFlags,
        getNonNullableType: () => Type,
        getNumberIndexType: () => js.UndefOr[Type],
        getProperties: () => js.Array[Symbol],
        getProperty: String => js.UndefOr[Symbol],
        getStringIndexType: () => js.UndefOr[Type],
        getSymbol: () => js.UndefOr[Symbol],
        intrinsicName: String,
        isClass: () => /* is typescript.typescript.InterfaceType */ Boolean,
        isClassOrInterface: () => /* is typescript.typescript.InterfaceType */ Boolean,
        isIndexType: () => /* is typescript.typescript.IndexType */ Boolean,
        isIntersection: () => /* is typescript.typescript.IntersectionType */ Boolean,
        isLiteral: () => /* is typescript.typescript.LiteralType */ Boolean,
        isNumberLiteral: () => /* is typescript.typescript.NumberLiteralType */ Boolean,
        isStringLiteral: () => /* is typescript.typescript.StringLiteralType */ Boolean,
        isTypeParameter: () => /* is typescript.typescript.TypeParameter */ Boolean,
        isUnion: () => /* is typescript.typescript.UnionType */ Boolean,
        isUnionOrIntersection: () => /* is typescript.typescript.UnionOrIntersectionType */ Boolean,
        symbol: Symbol
      ): IntrinsicType = {
        val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), intrinsicName = intrinsicName.asInstanceOf[js.Any], isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIndexType = js.Any.fromFunction0(isIndexType), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), symbol = symbol.asInstanceOf[js.Any])
        __obj.asInstanceOf[IntrinsicType]
      }
      
      extension [Self <: IntrinsicType](x: Self) {
        
        inline def setIntrinsicName(value: String): Self = StObject.set(x, "intrinsicName", value.asInstanceOf[js.Any])
      }
    }
  }
}
